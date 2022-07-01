import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class SnackMachineTest {

//check if the inserted cash is positive
    @Test
    public void positiveCashInserted(){
        
        assertTrue("Cash Inserted must be a positive value", SnackMachine.getInsertedCashNumber(5)>0);
    }

//check if the returned change is positive
    @Test
    public void positiveChange(){
        
        assertTrue("Change must be positive", SnackMachine.calculateChange(2,0) >= 0);
    }
    
//check if the item price, cost, and quantity are all positive for the method dispense
    @Test
    public void dispenseCheckPositiveValues(){
        
        double a=2;
        double b=2;
        int c=2;
        SnackMachine.dispense( a, b ,c);
        assertTrue("parameters should all be positive", SnackMachine.dispense( a, b ,c));
        
    }

    //check if the inserted cash is valid or not(supported by the vending machine or not)
    @Test 
    public void validateNotes(){
        double insertedCash = SnackMachine.getInsertedCashNumber(20);
        assertTrue("Inserted cash should be one of the following values 0.1,0.2,0.5,1,20,50 ",insertedCash == 0.1 
        ||insertedCash == 0.2 
        ||insertedCash == 0.5 
        ||insertedCash == 1 
        ||insertedCash == 20 
        ||insertedCash == 50 );
    
    }
}
