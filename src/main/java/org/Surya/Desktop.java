package org.Surya;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public Desktop()
    {
        System.out.println("Desktop Constructor");
    }
    public void compile()
    {
        System.out.println("Compiling in Desktop");
    }

}

