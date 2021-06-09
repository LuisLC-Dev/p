package uaslp.objetos.escuela;

public class EvaluadorDePromediosAdapter
{
    private EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios)
    {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones)
    {
        List<String> calificacionesString = Arrays.asList(listaDeCalificaciones.split(","));
        List<Double> calificaciones = new ArrayList<>();
        for (String calificacion : calificacionesString)
        {
            calificaciones.add(Double.parseDouble(calificacion));
        }
        return evaluadorDePromedios.evalua(calificaciones);
    }
}
