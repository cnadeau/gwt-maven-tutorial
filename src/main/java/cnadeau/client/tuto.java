package cnadeau.client;

import com.google.gwt.core.client.EntryPoint;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Label;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class tuto implements EntryPoint
{
	/**
	 * The message displayed to the user when the server cannot be reached or returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while " + "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{

		// Component test = null;
		// FormsRepository formsRepository = new FormsRepository();
		// formsRepository.lookupForms();
		// formsRepository.lookupSearchForms();
		//
		// Document formDocument = formsRepository.getFormDocument("user");
		//
		// FormsCustomTranslation formsCustomTranslation = new FormsCustomTranslation();
		// Document transformedDocument = formsCustomTranslation.transformDocument(formDocument, null, FormCustomActionEnum.NONE);

		// FormXmlParser formXmlParser = new FormXmlParser(new ComponentFactoryImpl());
		// Widget formWidget = formXmlParser.parseFormDocument("");
		//
		// RootPanel.get().add(formWidget);
		// System.out.println("TEST!!!!!");

		Label label = new Label();
		label.setHeight(30);
		label.setPadding(10);
		label.setAlign(Alignment.CENTER);
		label.setValign(VerticalAlignment.CENTER);
		label.setWrap(false);
		label.setIcon("icons/16/approved.png");
		label.setShowEdges(true);
		label.setContents("<i>Approved</i> for release");
		label.draw();

	}
}
