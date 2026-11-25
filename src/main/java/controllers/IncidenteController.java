package controllers;

import java.util.List;
import java.util.Objects;
import models.Incidente;

public class IncidenteController {

    public List<Incidente> sort(List<Incidente> incidentes) {
        incidentes.sort(null);
        return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        Objects.requireNonNull(incidentes, "incidentes");
        Objects.requireNonNull(objetivo, "objetivo");

        int bajo = 0;
        int alto = incidentes.size() - 1;

        while (bajo <= alto) {
            int medio = (bajo + alto) >>> 1;
            int cmp = incidentes.get(medio).compareTo(objetivo);

            if (cmp == 0) {
                return medio;
            } else if (cmp < 0) {
                bajo = medio + 1;
            } else {
                alto = medio - 1;
            }
        }
        return -1;
    }
}