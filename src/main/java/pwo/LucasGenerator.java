/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

/**
 *
 * @author student
 */

import java.math.BigDecimal;

public class LucasGenerator {
    private int lastIndex = 0;
    private BigDecimal current = new BigDecimal(0);

    private BigDecimal f_1 = new BigDecimal(1),
            f_2 = new BigDecimal(2);
    
    
    public void reset() {
        lastIndex = 0;
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(2);
    }

    public BigDecimal nextTerm() {
        //last index is the index ready to be generated now
        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(2);
        }
        lastIndex++;
        
        
        return current;
    }

    public BigDecimal getTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset();
        }
        while (lastIndex <= i) {
            nextTerm();
        }
        return current;
    }
    
}
