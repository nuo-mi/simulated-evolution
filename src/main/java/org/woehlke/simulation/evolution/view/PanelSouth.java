package org.woehlke.simulation.evolution.view;

import org.woehlke.simulation.evolution.config.Preparable;
import org.woehlke.simulation.evolution.config.SimulatedEvolutionConfig;

import javax.swing.*;
import java.awt.*;

public class PanelSouth extends JPanel implements Preparable {

    private final FlowLayout layout = new FlowLayout();

    private final JLabel footerLabel;

    private final Rectangle panelSouthRectangle;

    private final Dimension preferredSize;

    public final String layoutConstraint  = BorderLayout.CENTER;

    public PanelSouth(SimulatedEvolutionConfig simulatedEvolutionConfig){
        this.footerLabel = new JLabel(simulatedEvolutionConfig.getFooter());
        this.layout.setAlignment(FlowLayout.CENTER);
        this.setLayout(this.layout);
        this.add(this.footerLabel, this.layoutConstraint);
        this.preferredSize = simulatedEvolutionConfig.getPreferredSize();
        this.panelSouthRectangle = simulatedEvolutionConfig.getPanelSouthRectangle();
        this.setPreferredSize(this.preferredSize);
    }

    public void prepareMe(){
        this.setPreferredSize(this.preferredSize);
        this.setBounds( this.panelSouthRectangle );
    }
}