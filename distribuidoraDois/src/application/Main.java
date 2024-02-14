package application;

import java.util.Locale;

import entities.InvoicingMensal;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		InvoicingMensal fat = new InvoicingMensal();

		fat.addInvoicing("Estado de SP", 67836.43);
		fat.addInvoicing("Estado do RJ", 36678.66);
		fat.addInvoicing("Estado de MG", 29229.88);
		fat.addInvoicing("Estado de ES", 27165.48);
		fat.addInvoicing("Outros", 19849.53);

		fat.calcPercentual();
	}
}
