 
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListExample extends JPanel {
    
           private BookEntry books[] = {
           new BookEntry("Ant: The Definitive Guide", "/listexample/covers/1.gif"),
           new BookEntry("Database Programming with JDBC and Java", 
                         "covers/1.gif"),
           new BookEntry("Developing Java Beans", "./covers/1.gif"),
           new BookEntry("Developing JSP Custom Tag Libraries", "covers/1.gif"),
           new BookEntry("Java 2D Graphics", "covers/1.gif"),
           new BookEntry("Java and XML", "covers/1.gif"),
           new BookEntry("Java and XSLT", "covers/1.gif"),
           new BookEntry("Java and SOAP", "covers/1.gif"),
           new BookEntry("Java and XML Data Binding", "covers/1.gif"),
           new BookEntry("Java Cookbook", "covers/1.gif"),
           new BookEntry("Java Cryptography", "covers/1.gif"),
           new BookEntry("Java Distributed Computing", "covers/1.gif"),
           new BookEntry("Java I/O", "covers/1.gif"),
           new BookEntry("Java in a Nutshell", "covers/1.gif"),
           new BookEntry("Java Management Extensions", "covers/1.gif"),
           new BookEntry("Java Message Service", "covers/1.gif"),
           new BookEntry("Java Network Programming", "covers/1.gif"),
           new BookEntry("Java Performance Tuning", "covers/1.gif"),
           new BookEntry("Java RMI", "covers/1.gif"),
           new BookEntry("Java Security", "covers/1.gif"),
           new BookEntry("JavaServer Pages", "covers/1.gif"),
           new BookEntry("Java Servlet Programming", "covers/1.gif"),
           new BookEntry("Java Swing", "covers/1.gif"),
           new BookEntry("Java Threads", "covers/1.gif"),
           new BookEntry("Java Web Services", "covers/1.gif"),
           new BookEntry("Learning Java", "covers/1.gif")
       };

    private JList booklist = new JList(books);

    public ListExample( ) {
        setLayout(new BorderLayout( ));
        JButton button = new JButton("Print");
        button.addActionListener(new PrintListener( ));

        booklist = new JList(books);
        booklist.setCellRenderer(new BookCellRenderer( ));
        booklist.setVisibleRowCount(4);
        JScrollPane pane = new JScrollPane(booklist);

        add(pane, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("List Example");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new ListExample( ));
         frame.pack( );
         frame.setVisible(true);
    }

    class PrintListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int selected[] = booklist.getSelectedIndices( );
            System.out.println("Selected Elements:  ");

            for (int i=0; i < selected.length; i++) {
                BookEntry element =
                  (BookEntry)booklist.getModel( ).getElementAt(selected[i]);
                System.out.println("  " + element.getTitle( ));
            }
        }
    }
}
