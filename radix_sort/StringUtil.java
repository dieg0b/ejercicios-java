package meli.ejerc;

import java.util.ArrayList;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	public static String replicate(char c, int n)
	{
		StringBuilder temp = new StringBuilder();
		for(int i = 0; i < n; i++){
			temp.append(c);
		}
		return temp.toString();
	}
	
	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	public static String lpad(String s, int n, char c)
	{
		StringBuilder sb = new StringBuilder(s);
		if(sb.length() < n){
			int rest = n - sb.length();
			String relleno = replicate(c, rest);
			sb.insert(0, relleno);
		}
		return sb.toString();
	}
	
	// Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		ArrayList<String> result = new ArrayList<>();
		for (int e: arr) {
			result.add(String.valueOf(e));
		}
		String[] sResults = new String[result.size()];
		return result.toArray(sResults);
	}
	
	// Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] result = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			result[i] = Integer.parseInt(arr[i]);
		}
		return result;
	}
	
	
	// Retorna la longitud del elemento con mayor cantidad 
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int currentMax = 0;
		for (String strNum : arr) {
			int currentLength = strNum.length();
			if (currentLength > currentMax) {
				currentMax = currentLength;
			}
		}
		return currentMax;
	}
	
	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int longMayor = maxLength(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < longMayor) {
				arr[i] = lpad(arr[i], longMayor, c);
			}
		}
	}
}
