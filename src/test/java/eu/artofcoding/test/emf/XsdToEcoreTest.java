package eu.artofcoding.test.emf;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class XsdToEcoreTest {

    @Test
    public void xsdToEcore() {
        Path xsd = Paths.get("src/main/resources/request.xsd");
        Path ecore = Paths.get("request.ecore");
        EModelHelper emh = EModelHelper.eINSTANCE();
        emh.xsdToEcore(xsd, ecore);
    }

}
