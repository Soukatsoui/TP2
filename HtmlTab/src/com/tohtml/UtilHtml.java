package com.tohtml;

public class UtilHtml {

	/**
	 * 
	 * @param Tab
	 * 			le tableau
	 * @param maxRows
	 * 			le nombre maximum de lignes souhaité (doit être >= 0)
	 * @return Si le tableau est vide, la méthode retourne la chaine "(vide)"
	 * 			si le tableau contient moins de maxRows lignes, le deuxième 
	 * 			paramètre). Il y a autant de <tr>
	 * 			que d'éléments dans le tableau à concurrence de maxRows lignes,
	 * 			si le nombre d'éléments dans le tableau est supérieur à maxRows,
	 * 			la dernière ligne sera définie par "..."
	 */

	public String toHtmlTab(Object[] Tab, int maxRows){
		maxRows = (int)maxRows;
		String chaineRetour = null;
		if (Tab.length == 0)
		{
			chaineRetour = "(vide)";
		}
		
		else
		{
			chaineRetour = "<table>";

			for (int i = 0; i < Tab.length && i < maxRows; i++)
				chaineRetour += "<tr><td>" + Tab[i] + "</td></tr>";

			if (Tab.length > maxRows)
				chaineRetour += "<tr><td>...</td></tr>";

			chaineRetour += "</table>";
		}
		
		return chaineRetour;
		
	}
}
