package materialien;

public class BuchungImpl implements Buchung
{
    private Buchungsinfos _infos;
    
    public BuchungImpl(Buchungsinfos neueInfo)
    {
        _infos = neueInfo;
        
    }

    @Override
    public void gibAlleInfos()
    {
        // TODO Auto-generated method stub
        System.out.println(_infos._buchungsnummer);
        System.out.println(_infos._name + "   " + _infos._anzahlPersonen + " Personen");
        System.out.println("Anreisedatum: " + _infos._anreisetag.gibDatum());
        System.out.println("Abreisedatum: " + _infos._abreisetag.gibDatum());
//        System.out.println("Wohnung: " + _infos._wohnung.gibAdresse());
//        System.out.println("Hund: " + _infos._hund);
//        System.out.println("Reservierung: " + _infos._reservierung);
//        System.out.println("Telefonnummer: " + _infos._telefonnummer);
//        System.out.println("Kommentar " + _infos._kommentar);
    }

    @Override
    public Buchungsinfos gibInfo()
    {
        // TODO Auto-generated method stub
        return _infos;
    }

    @Override
    public void aktualisiereBuchung(Buchungsinfos neueInfo)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void stornieren()
    {
        // TODO Auto-generated method stub

    }

}
