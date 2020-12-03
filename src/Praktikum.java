import java.util.Set;

public class Praktikum {
private int nummer;
private Veranstaltung zugVeranst;
private Set<Student> teilnehmer;
public Praktikum(Veranstaltung v,Student ... teilnehmer){
    zugVeranst=v;
    this.teilnehmer = Set.of(teilnehmer);
}
}
