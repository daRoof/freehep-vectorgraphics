// AUTOMATICALLY GENERATED by FreeHEP JAVAGraphics2D

package org.freehep.graphicsio.java.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.TexturePaint;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.freehep.graphics2d.VectorGraphics;
import org.freehep.graphicsio.test.TestingPanel;

public class TestPaint extends TestingPanel {

    public TestPaint(String[] args) throws Exception {
        super(args);
        setName("TestPaint");
    } // contructor

    public void paint(Graphics g) {
        vg[0] = VectorGraphics.create(g);
        vg[0].setCreator("FreeHEP JAVAGraphics2D");
        Paint0s0.paint(vg);
    } // paint

    private static class Paint0s0 {
        public static void paint(VectorGraphics[] vg) {
            vg[0].setColor(new Color(0, 0, 0, 255));
            vg[0].setFont(new Font("Dialog", 0, 12));
            vg[1] = (VectorGraphics)vg[0].create();
            vg[1].setClip(0, 0, 600, 600);
            vg[1].setColor(new Color(255, 255, 255, 255));
            vg[1].fillRect(0, 0, 600, 600);
            vg[1].setColor(new Color(0, 0, 0, 255));
            vg[1].drawRect(0.0, 200.0, 180.0, 180.0);
            vg[1].setPaint(new TexturePaint(
                (BufferedImage)
                new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB), new Rectangle2D.Double(0.0, 0.0, 32.0, 32.0)));
            vg[1].fillRect(0.0, 200.0, 180.0, 180.0);
            vg[1].setColor(new Color(0, 0, 0, 255));
            vg[1].drawRect(200.0, 200.0, 180.0, 180.0);
            vg[1].setPaint(new TexturePaint(
                (BufferedImage)
                new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB), new Rectangle2D.Double(0.0, 0.0, 16.0, 16.0)));
            vg[1].fillRect(200.0, 200.0, 180.0, 180.0);
            vg[1].setColor(new Color(0, 0, 0, 255));
            vg[1].drawRect(400.0, 200.0, 180.0, 180.0);
            vg[1].setPaint(new TexturePaint(
                (BufferedImage)
                new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB), new Rectangle2D.Double(16.0, 16.0, 32.0, 32.0)));
            vg[1].fillRect(400.0, 200.0, 180.0, 180.0);
            vg[1].setPaint(new GradientPaint(
                new Point2D.Double(0.0, 400.0), new Color(255, 0, 0, 255), 
                new Point2D.Double(180.0, 580.0), new Color(0, 0, 255, 255), false
            ));
            vg[1].fillRect(0.0, 400.0, 180.0, 180.0);
            vg[1].setPaint(new GradientPaint(
                new Point2D.Double(250.0, 450.0), new Color(0, 255, 0, 255), 
                new Point2D.Double(320.0, 520.0), new Color(255, 0, 255, 255), false
            ));
            vg[1].fillRect(200.0, 400.0, 180.0, 180.0);
            vg[1].setPaint(new GradientPaint(
                new Point2D.Double(400.0, 400.0), new Color(255, 0, 0, 255), 
                new Point2D.Double(440.0, 440.0), new Color(255, 255, 0, 255), true
            ));
            vg[1].fillRect(400.0, 400.0, 180.0, 180.0);
            vg[2] = (VectorGraphics)vg[1].create();
            vg[2].shear(0.5, 0.5);
            vg[2].setPaint(new GradientPaint(
                new Point2D.Double(0.0, 0.0), new Color(255, 0, 0, 255), 
                new Point2D.Double(120.0, 120.0), new Color(0, 0, 255, 255), false
            ));
            vg[2].fillRect(0.0, 0.0, 120.0, 120.0);
            vg[2].setPaint(new TexturePaint(
                (BufferedImage)
                new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB), new Rectangle2D.Double(0.0, 0.0, 32.0, 32.0)));
            vg[2].fillRect(200.0, -100.0, 120.0, 120.0);
            vg[2].dispose();
            vg[1].dispose();
        } // paint
    } // class Paint0s0

    private VectorGraphics vg[] = new VectorGraphics[3];

    public static void main(String[] args) throws Exception {
        new TestPaint(args).runTest(600, 600);
    }
} // class
