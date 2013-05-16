package exesoft;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * 
 *  JSerializeReader � Klasa odpowiedzialna za odwzorowanie obiektu
 *  na podstawie informacji uzyskanych z obiektu klasy JModel, kt�ra w procesie dekodowania
 *  (metoda decode) wytworzy obiekt klasy String o strukturze jak wy�ej w przyk�adzie.
 *  (Nie wiem jeszcze jak to b�dzie ale na 90% b�dzie zwracany przez funkcj� statyczn� albo
 *  i nie? obiekt klasy Object do wyrzutowania sobie przez kogo� kto b�dzie uzywa� tych klas)
 *     
 *  String do przetworzenia w JModel : java.lang.Osoba{imie(java.lang.String):x;nazwisko(java.lang.String):y;}
 * 
 * @author Micha� Krakiewicz
 *
 */
public class JSerializeReaderImpl implements JSerializeReader{

	@Override
	public Object fromMap(Map<String, List<Map<String, Object>>> map) {
		return null;
	}

	@Override
	public Boolean readObject(InputStream input) {
		return null;
	}
	
	
}
