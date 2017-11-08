
package widget;

import java.awt.Color;
import usu.widget.glass.TextBoxGlass;

/**
 *
 * @author usu
 */
public class TextBox extends TextBoxGlass {
    public TextBox() {
        super();
        setFont(new java.awt.Font("Tahoma", 0, 11));        
        setSelectionColor(new Color(50,51,0));
        setSelectedTextColor(new Color(255,255,0));
        setForeground(new Color(60,80,50));
        setBackground(new Color(255,255,250));
        setHorizontalAlignment(LEFT);
        setSize(WIDTH,23);
    }
}
