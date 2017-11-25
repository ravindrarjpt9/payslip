package payslip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VariableComponentTest {

	VariableComponent messageUtil = new VariableComponent();

   @Test
   public void testPrintMessage() {
      double message = 3951.8;
      assertEquals(message,messageUtil.printVariable(),0.01);
   }
   
   @Test
   public void testTrue(){
	  assertTrue(false);
   }
}
