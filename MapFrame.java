import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.management.Notification;
import javax.swing.*;
import javax.swing.JTextField;
public class MapFrame extends JFrame {
    public static void main(String[] args) throws IOException {
        MapFrame mapFrame = new MapFrame();
    }
    public static int Modus = 0; //Bestimmt die Funktion der einzelne LänderButtons


    public static String[] Laender = {"Alaska", "NordwestTerritorium", "Alberta", "Ontario", "Weststaaten", "Mittelamerika", "Oststaaten", "Ostkanada", "Groenland", "Island", "Grossbritannien", "Westeuropa", "Nordeuropa", "Suedeuropa", "Skandinavien", "Russland", "NaherOsten", "Afghanistan", "Ural", "Sibirien", "Jakutien", "Kamtschatka", "Irkutsk", "Mongolei", "Japan", "China", "Indien", "Suedostasien", "Venezuela", "Peru", "Argentinien", "Brasilien", "Nordafrika", "Zentralafrika", "Suedafrika", "Madagasgar", "Ostafrika", "Aegypten", "Indonesien", "Westaustralien", "Ostaustralien", "Neuguinea"};
    private static Map<String, Double> peContainer = new HashMap<>();

    private static final long serialVersionUID = 1L;
    private JPanel picPanel = new PicPanel("Karte.jpg");

    public JTextField Notification = new JTextField();

    private JButton plus = new JButton("hinzufügen");
    private JButton minus = new JButton("abnehmen");
    private JButton attack = new JButton("Angriffsland");
    private JButton defend = new JButton("Verteidigungsland");
    private JButton rechnen = new JButton("Berechnen");
    public JButton alaska = new JButton("1");
    public JButton nordwestTerritorium = new JButton("1");
    public JButton alberta = new JButton("1");
    public JButton ontario = new JButton("1");
    public JButton weststaaten = new JButton("1");
    public JButton mittelamerika = new JButton("1");
    public JButton oststaaten = new JButton("1");
    public JButton ostkanada = new JButton("1");
    public JButton groenland = new JButton("1");
    public JButton island = new JButton("1");
    public JButton grossbritannien = new JButton("1");
    public JButton westeuropa = new JButton("1");
    public JButton nordeuropa = new JButton("1");
    public JButton suedeuropa = new JButton("1");
    public JButton skandinavien = new JButton("1");
    public JButton russland = new JButton("1");
    public JButton naherOsten = new JButton("1");
    public JButton afghanistan = new JButton("1");
    public JButton ural = new JButton("1");
    public JButton sibirien = new JButton("1");
    public JButton jakutien = new JButton("1");
    public JButton kamtschatka = new JButton("1");
    public JButton irkutsk = new JButton("1");
    public JButton mongolei = new JButton("1");
    public JButton japan = new JButton("1");
    public JButton china = new JButton("1");
    public JButton indien = new JButton("1");
    public JButton suedostasien = new JButton("1");
    public JButton venezuela = new JButton("1");
    public JButton peru = new JButton("1");
    public JButton argentinien = new JButton("1");
    public JButton brasilien = new JButton("1");
    public JButton nordafrika = new JButton("1");
    public JButton zentralafrika = new JButton("1");
    public JButton suedafrika = new JButton("1");
    public JButton madagasgar = new JButton("1");
    public JButton ostafrika = new JButton("1");
    public JButton aegypten = new JButton("1");
    public JButton indonesien = new JButton("1");
    public JButton westaustralien = new JButton("1");
    public JButton ostaustralien = new JButton("1");
    public JButton neuguinea = new JButton("1");

    public static HashMap<String, JButton> buttonMap = new HashMap<String, JButton>();

    public MapFrame() throws IOException {
        alaska.setName("Alaska");
        nordwestTerritorium.setName("NordwestTerritorium");
        alberta.setName("Alberta");
        ontario.setName("Ontario");
        weststaaten.setName("Weststaaten");
        mittelamerika.setName("Mittelamerika");
        oststaaten.setName("Oststaaten");
        ostkanada.setName("Ostkanada");
        groenland.setName("Groenland");
        island.setName("Island");
        grossbritannien.setName("Grossbritannien");
        westeuropa.setName("Westeuropa");
        nordeuropa.setName("Nordeuropa");
        suedeuropa.setName("Suedeuropa");
        skandinavien.setName("Skandinavien");
        russland.setName("Russland");
        naherOsten.setName("NaherOsten");
        afghanistan.setName("Afghanistan");
        ural.setName("Ural");
        sibirien.setName("Sibirien");
        jakutien.setName("Jakutien");
        kamtschatka.setName("Kamtschatka");
        irkutsk.setName("Irkutsk");
        mongolei.setName("Mongolei");
        japan.setName("Japan");
        china.setName("China");
        indien.setName("Indien");
        suedostasien.setName("Suedostasien");
        venezuela.setName("Venezuela");
        peru.setName("Peru");
        argentinien.setName("Argentinien");
        brasilien.setName("Brasilien");
        nordafrika.setName("Nordafrika");
        zentralafrika.setName("Zentralafrika");
        suedafrika.setName("Suedafrika");
        madagasgar.setName("Madagasgar");
        ostafrika.setName("Ostafrika");
        aegypten.setName("Aegypten");
        indonesien.setName("Indonesien");
        westaustralien.setName("Westaustralien");
        ostaustralien.setName("Ostaustralien");
        neuguinea.setName("Neuguinea");

        buttonMap.put("Alaska", alaska);
        buttonMap.put("NordwestTerritorium", nordwestTerritorium);
        buttonMap.put("Alberta", alberta);
        buttonMap.put("Ontario", ontario);
        buttonMap.put("Weststaaten", weststaaten);
        buttonMap.put("Mittelamerika", mittelamerika);
        buttonMap.put("Oststaaten", oststaaten);
        buttonMap.put("Ostkanada", ostkanada);
        buttonMap.put("Groenland", groenland);
        buttonMap.put("Island", island);
        buttonMap.put("Grossbritannien", grossbritannien);
        buttonMap.put("Westeuropa", westeuropa);
        buttonMap.put("Nordeuropa", nordeuropa);
        buttonMap.put("Suedeuropa", suedeuropa);
        buttonMap.put("Skandinavien", skandinavien);
        buttonMap.put("Russland", russland);
        buttonMap.put("NaherOsten", naherOsten);
        buttonMap.put("Afghanistan", afghanistan);
        buttonMap.put("Ural", ural);
        buttonMap.put("Sibirien", sibirien);
        buttonMap.put("Jakutien", jakutien);
        buttonMap.put("Kamtschatka", kamtschatka);
        buttonMap.put("Irkutsk", irkutsk);
        buttonMap.put("Mongolei", mongolei);
        buttonMap.put("Japan", japan);
        buttonMap.put("China", china);
        buttonMap.put("Indien", indien);
        buttonMap.put("Suedostasien", suedostasien);
        buttonMap.put("Venezuela", venezuela);
        buttonMap.put("Peru", peru);
        buttonMap.put("Argentinien", argentinien);
        buttonMap.put("Brasilien", brasilien);
        buttonMap.put("Nordafrika", nordafrika);
        buttonMap.put("Zentralafrika", zentralafrika);
        buttonMap.put("Suedafrika", suedafrika);
        buttonMap.put("Madagasgar", madagasgar);
        buttonMap.put("Ostafrika", ostafrika);
        buttonMap.put("Aegypten", aegypten);
        buttonMap.put("Indonesien", indonesien);
        buttonMap.put("Westaustralien", westaustralien);
        buttonMap.put("Ostaustralien", ostaustralien);
        buttonMap.put("Neuguinea", neuguinea);

        picPanel.setBounds(0, 0, picPanel.getWidth(), picPanel.getHeight());

        addTextfield(Notification, 100, 50, 1300);
        Notification.setFont(Notification.getFont().deriveFont((float) 19));
        addButton(plus, 400, 460, 100);
        addButton(minus,400,490,100);
        addButton(attack,500,460,150);
        addButton(defend,500,490,150);
        addButton(rechnen,400,520,250);
        addButton(alaska, 100, 190, 50);
        addButton(nordwestTerritorium, 170, 150, 50);
        addButton(alberta, 200, 280, 50);
        addButton(ontario, 330, 250, 50);
        addButton(weststaaten, 250, 400, 50);
        addButton(mittelamerika, 300, 500, 50);
        addButton(oststaaten, 350, 370, 50);
        addButton(ostkanada, 410, 300, 50);
        addButton(groenland, 520, 150, 50);
        addButton(island, 650, 200, 50);
        addButton(grossbritannien, 600, 350, 50);
        addButton(westeuropa, 680, 450, 50);
        addButton(nordeuropa, 750, 390, 50);
        addButton(suedeuropa, 800, 480, 50);
        addButton(skandinavien, 820, 150, 50);
        addButton(russland, 900, 350, 50);
        addButton(naherOsten, 900, 500, 50);
        addButton(afghanistan, 1020, 410, 50);
        addButton(ural, 1070, 220, 50);
        addButton(sibirien, 1130, 130, 50);
        addButton(jakutien, 1300, 110, 50);
        addButton(kamtschatka, 1300, 200, 50);
        addButton(irkutsk, 1220, 280, 50);
        addButton(mongolei, 1310, 350, 50);
        addButton(japan, 1450, 320, 50);
        addButton(china, 1200, 490, 50);
        addButton(indien, 1120, 570, 50);
        addButton(suedostasien, 1250, 620, 50);
        addButton(venezuela, 410, 570, 50);
        addButton(peru, 350, 700, 50);
        addButton(argentinien, 410, 850, 50);
        addButton(brasilien, 480, 700, 50);
        addButton(nordafrika, 700, 600, 50);
        addButton(zentralafrika, 800, 800, 50);
        addButton(suedafrika, 850, 920, 50);
        addButton(madagasgar, 1020, 920, 50);
        addButton(ostafrika, 920, 750, 50);
        addButton(aegypten, 800, 570, 50);
        addButton(indonesien, 1230, 750, 50);
        addButton(westaustralien, 1300, 880, 50);
        addButton(ostaustralien, 1450, 900, 50);
        addButton(neuguinea, 1400, 680, 50);

        add(new JScrollPane(picPanel));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(picPanel.getWidth(), picPanel.getHeight());

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                int Truppenzahl = Integer.parseInt(button.getText());
                Color color = button.getBackground();
                if(Modus==1){
                    button.setText(String.valueOf(Truppenzahl + 1)); //Einheiten hinzufügen
                }else if(Modus==2 && Truppenzahl>1){
                    button.setText(String.valueOf(Truppenzahl - 1)); //Einheiten abnehmen
                }else if(Modus==3){
                    boolean only = true;
                    if(color.equals(Color.pink)){
                        button.setBackground(Color.white); //Ausgewählte Angreiferland rückgängig machen
                    }else {
                        for (int i = 0; i < Laender.length; i++) {
                            JButton buttun = buttonMap.get(Laender[i]);
                            if (buttun.getBackground().equals(Color.pink)) {
                                only = false; //Überprüft ob bereits ein Angreiferland existiert
                            }
                        }
                        if (only) {
                            button.setBackground(Color.pink); //Angreiferland setzen
                        }
                    }
                }else if(Modus==4){
                    if(color.equals(Color.cyan)){
                        button.setBackground(Color.white); //Verteidigungsland zurücksetzen
                    }else {
                        button.setBackground(Color.cyan); //Verteidigungsland setzen
                    }
                }
            }
        };
        alaska.addActionListener(listener);
        nordwestTerritorium.addActionListener(listener);
        alberta.addActionListener(listener);
        ontario.addActionListener(listener);
        weststaaten.addActionListener(listener);
        mittelamerika.addActionListener(listener);
        oststaaten.addActionListener(listener);
        ostkanada.addActionListener(listener);
        groenland.addActionListener(listener);
        island.addActionListener(listener);
        grossbritannien.addActionListener(listener);
        westeuropa.addActionListener(listener);
        nordeuropa.addActionListener(listener);
        suedeuropa.addActionListener(listener);
        skandinavien.addActionListener(listener);
        russland.addActionListener(listener);
        naherOsten.addActionListener(listener);
        afghanistan.addActionListener(listener);
        ural.addActionListener(listener);
        sibirien.addActionListener(listener);
        jakutien.addActionListener(listener);
        kamtschatka.addActionListener(listener);
        irkutsk.addActionListener(listener);
        mongolei.addActionListener(listener);
        japan.addActionListener(listener);
        china.addActionListener(listener);
        indien.addActionListener(listener);
        suedostasien.addActionListener(listener);
        venezuela.addActionListener(listener);
        peru.addActionListener(listener);
        argentinien.addActionListener(listener);
        brasilien.addActionListener(listener);
        nordafrika.addActionListener(listener);
        zentralafrika.addActionListener(listener);
        suedafrika.addActionListener(listener);
        madagasgar.addActionListener(listener);
        ostafrika.addActionListener(listener);
        aegypten.addActionListener(listener);
        indonesien.addActionListener(listener);
        westaustralien.addActionListener(listener);
        ostaustralien.addActionListener(listener);
        neuguinea.addActionListener(listener);

        plus.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         Modus=1;
                                         plus.setBackground(Color.green);
                                         minus.setBackground(Color.white);
                                         attack.setBackground(Color.white);
                                         defend.setBackground(Color.white);
                                     }
                                 }
        );
        minus.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       Modus=2;
                                       plus.setBackground(Color.white);
                                       minus.setBackground(Color.green);
                                       attack.setBackground(Color.white);
                                       defend.setBackground(Color.white);
                                   }
                               }
        );
        attack.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        Modus=3;
                                        plus.setBackground(Color.white);
                                        attack.setBackground(Color.green);
                                        minus.setBackground(Color.white);
                                        defend.setBackground(Color.white);
                                    }
                                }
        );
        defend.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        Modus=4;
                                        plus.setBackground(Color.white);
                                        defend.setBackground(Color.green);
                                        minus.setBackground(Color.white);
                                        attack.setBackground(Color.white);
                                    }
                                }
        );
        rechnen.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         int Angreiferzahl=0;
                                         int Verteidigerzahl=0;
                                         double benötigteAngreifer=0;
                                         double p;

                                         for (int i = 0; i < Laender.length; i++) {
                                             JButton buttun = buttonMap.get(Laender[i]);
                                             if(buttun.getBackground().equals(Color.pink)){
                                                 Angreiferzahl=Angreiferzahl+Integer.parseInt(buttun.getText());
                                             }else if(buttun.getBackground().equals(Color.cyan)){
                                                 Verteidigerzahl=Verteidigerzahl+Integer.parseInt(buttun.getText());
                                                 benötigteAngreifer++; //Für jedes zu eroberndes Land wird eine Einheit hinzugefügt, da in jedes Land eine einheit zurückbleiben muss
                                                 Angreiferzahl--; //Analog wird für die Gesamtsiegeswahrscheinlichkeit die Angreifereinheiten abgezogen
                                             }
                                         }
                                         benötigteAngreifer=benötigteAngreifer+3+EdA(Verteidigerzahl);
                                         benötigteAngreifer = Math.round(benötigteAngreifer * 100);
                                         benötigteAngreifer = benötigteAngreifer / 100;

                                         p=Math.round(PE(Angreiferzahl, Verteidigerzahl)*100);
                                         p=p/100;

                                         Notification.setText("Der Siegeswahrscheinlichkeit für diesen Feldzug beträgt "+p+"%." + "Du benötigst durchschnittlich "+benötigteAngreifer+" Einheiten um diesen Feldzug zu gewinnen.");
                                     }
                                 }
        );
        setResizable(true);
        pack();
        setVisible(true);

    }
    public static void farbe(String land, Color color){
        JButton button = buttonMap.get(land);
        button.setBackground(color);
    }
    private void addButton(JButton button, int x, int y, int width) {
        button.setBounds(x, y, width, 30);
        picPanel.add(button);
    }

    private void addTextfield(JTextField field, int x, int y, int width) {
        field.setBounds(x, y, width, 30);
        picPanel.add(field);
    }
    public static double EdA(int v) {
        double p = 0;
        double pre1 = 0;
        double pre2 = 0;

        if (v == 0) {
            p = 0;
        } else if (v == 1) {
            p = (double) 49 / 95;
            pre1 = p;
        } else {
            for (int i = 2; i <= v; i++) {
                p = (double) 4550 / 5501 + (double) 2611 / 5501 * (1 + pre1) + (double) 2890 / 5501 * pre2;
                pre2 = pre1;
                pre1 = p;
            }
        }
        return p;
    }
    public static double PE(int a, int b) {
        String id = a + "+" + b;
        Double p;
        p = peContainer.get(id);
        if (null != p) {
            return p;
        }
        if (b == 0) {
            p = 100.;
        } else if (a == 0) {
            p = 0.;
        }
        if (a == 1) {
            if (b == 1) {
                p = (double) 15 / 36 * PE(a, b-1) + (double) 21 / 36 * PE(a - 1, b);
            } else if (b >= 2) {
                p = (double) 55 / 216 * PE(a, b - 1) + (double) 161 / 216 * PE(a - 1, b);
            }
        }
        if (a == 2) {
            if (b == 1) {
                p = (double) 125 / 216 * PE(a, b - 1) + (double) 91 / 216 * PE(a - 1, b);
            } else if (b >= 2) {
                p = (double) 295 / 1296 * PE(a, b - 2) + (double) 420 / 1296 * PE(a - 1, b - 1) + (double) 581 / 1296 * PE(a - 2, b);
            }
        }
        if (a >= 3) {
            if (b == 1) {
                p = (double) 95 / 144 * PE(a, b - 1) + (double) 49 / 144 * PE(a - 1, b);
            } else if (b >= 2) {
                p = (double) 2890 / 7776 * PE(a, b - 2) + (double) 2611 / 7776 * PE(a - 1, b - 1) + (double) 2275 / 7776 * PE(a - 2, b);
            }
        }
        peContainer.put(id, p);
        return p;
    }
}

