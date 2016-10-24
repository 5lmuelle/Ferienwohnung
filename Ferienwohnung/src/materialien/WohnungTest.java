package materialien;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * Die ist die Testklasse zur Klasse Wohnung.
 */


public class WohnungTest
{

    Wohnung _bspWohnung;
    
    final String _bspName = "Hafen Haus";
    final String _bspAdresse = "Alte Koppel 1";
    final int _bspPreis = 60;
    final int _bspStockwerk = 1;
    final boolean _bspHund = false;
    final int _bspPersAnzahl = 4;
    
    /*
     * Hier wird eine bspWohnung initialisiert, an der die Tests ausgeführt werden.
     */
    void befülleBspWohnung()
    {
        _bspWohnung = new Wohnung(_bspName, _bspAdresse, _bspPreis, _bspPersAnzahl,
                _bspStockwerk, _bspHund);
    }
    
    @Test
    public void testGibName()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.gibName(), _bspName);
    }


    @Test
    public void testGibAdresse()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.gibAdresse(), _bspAdresse);
    }

    @Test
    public void testGibPreis()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.gibPreis(), _bspPreis);
    }

    @Test
    public void testGibStockwerk()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.gibStockwerk(), _bspStockwerk);
    }

    @Test
    public void testIstHund()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.istHund(), _bspHund);
    }

    @Test
    public void testGibPersAnzahl()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.gibPersAnzahl(), _bspPersAnzahl);
    }

}
