package meli.ejerc;

import java.util.ArrayList;
import java.util.HashMap;

public class RadixSort
{
	public static int[] radixSort(int []arr)
	{
		HashMap<Character, ArrayList<String>> dataset;
		// Convierte un array de enteros en array de strings
		String[] sArr = StringUtil.toStringArray(arr);
		// Completa con 0´s a la izquierda
		StringUtil.lNormalize(sArr, '0');
		int maxLongitud = StringUtil.maxLength(sArr);
		for (int i = maxLongitud - 1; i > -1 ; i--) {
			// Creando contenedores
			dataset = new HashMap<>();
			for (String sNumber: sArr) {
				Character numActual = sNumber.charAt(i);
				if(!dataset.containsKey(numActual)){
					dataset.put(numActual, new ArrayList<>());
				}
				dataset.get(numActual).add(sNumber);
			}
			// Rearmando el array
			Character[] numberKeys = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

			ArrayList<String> tmpValues = new ArrayList<>();
			for (Character j: numberKeys) {
				// TODO: break for when arr is ready
				if(dataset.containsKey(j)){
					tmpValues.addAll(dataset.get(j));
				}
			}
			//String[] newArr = new String[arr.length];
			sArr = tmpValues.toArray(sArr);
			}
		return StringUtil.toIntArray(sArr);
		}


	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		// TODO: No se como dejar solo radixSort(arr) y que funcione
		arr = radixSort(arr);
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
