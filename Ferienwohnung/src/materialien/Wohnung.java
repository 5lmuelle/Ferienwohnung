package materialien;
/**
 * Eine Wohnung ist eine FeWo, in welcher Felder festgelegt und abgefragt werden können. 
 * Objekte dieser Klasse repräsentieren Ferienwohnungen.
 * 
 */
public class Wohnung
{
    String _name; 
    String _adresse;
    int _preis;
    int _stockwerk;
    boolean _hund;
    int _persAnzahl;

    /**
     * Initialisiert ein neues Exemplar der Klasse Wohnung.
     * 
     * @param name          Gibt den Namen der FeWo an.
     * @param adresse       Fordert einen String "Straße Hausnummer, PLZ Ort"
     *                      er gibt die Adresse der Wohnung an.
     * @param preis         Gibt den Preis der Wohnung pro Nacht an. 
     *                      \\TODO unterschiedliche Preise für unterschiedliche Zeiträume?
     * @param persAnzahl    Gibt die Anzahl der Personen an, für die die FeWo platz bietet.
     * @param stockwerk     Gibt das Stockwerk an, in dem sich die Wohnung befindet.    
     * @param hund          Gibt an, ob Hunde in der Wohnung erlaubt sind.
     * 
     * 
     * @require _name != null
     * @require _adresse != null
     * @require _preis != null
     * @require _persAnzahl != null
     * 
     * 
     * @ensure _name == gibName()
     * @ensure _adresse == gibAdresse()
     * @ensure _preis == gibtPreis()
     * @ensure _persAnzahl == gibtPersAnzahl()
     * @ensure _stockwerk == gibStockwerk()
     * @ensure _hund == istHund()
     */
    public Wohnung(String name, String adresse, int preis, int persAnzahl, int stockwerk,
            boolean hund)
    {
        
        assert name != null : "Vorbedingung verletzt: _name == null";
        assert adresse != null : "Vorbedingung verletzt: _adresse == null";
        assert preis != 0 : "Vorbedingung verletzt: _preis == 0";
        assert persAnzahl != 0 : "Vorbedingung verletzt: _perAnzahl == 0";
        
        _name = name;
        _adresse = adresse;
        _preis = preis;
        _stockwerk = stockwerk;
        _hund = hund;
        _persAnzahl = persAnzahl;
    }

    /*
     * Gibt den Namen der Ferienwohnung zurück.
     * 
     * @return Den Namen der Wohnung 
     * 
     * @ensure result != null
     */
    public String gibName()
    {
        return _name;
    }

    /*
     * Gibt die Adresse der Ferienwohnung zurück.
     * 
     * @return Die Adresse der Wohnung 
     * 
     * @ensure result != null
     */
    public String gibAdresse()
    {
        return _adresse;
    }

    /*
     * Gibt den Preis der Ferienwohnung zurück.
     * 
     * @return Den Preis der Wohnung 
     * 
     * @ensure result != null
     */
    public int gibPreis()
    {
        return _preis;
    }

    /*
     * Gibt das Stockwerk der Ferienwohnung zurück.
     * 
     * @return Das Stockwerk der Wohnung 
     * 
     * @ensure result != null
     */
    public int gibStockwerk()
    {
        return _stockwerk;
    }

    
    /*
     * Gibt an, ob Hunde in der Wohnung erlaubt sind.
     * 
     * @return Ist Hund Erlaubt? 
     * 
     * @ensure result != null
     */
    public boolean istHund()
    {
        return _hund;
    }

    /*
     * Gibt die Anzahl an Personen zurück, die in der Ferienwohnung platz haben.
     * 
     * @return Anzahl Plätze in Ferienwohnung.
     * 
     * @ensure result != null
     */
    public int gibPersAnzahl()
    {
        return _persAnzahl;
    }
}
