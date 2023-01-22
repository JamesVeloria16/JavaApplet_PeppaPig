
/**
 * @(#)PeppaPig.java
 *
 * PeppaPig Applet application
 *
 * @author JAMES VELORIA
 *
 * @version 1.00 2022/11/25
 */
 
 /**
  * Note
  * super.paint(g); - used to call something from parent class
	Graphics2D g2 = (Graphics2D) g; - graphics2d extends the graphic class
	g2.setStroke(new BasicStroke(10)); - to set new stroke
  *
  */
 
 
import java.awt.*;
import java.applet.*;

public class PeppaPig extends Applet {
	
	Image picture;
	
	public void init() {
		
		//Set Screen Size
		setSize(1900,940);
		
		//sky background color	
		Color Skyblue = new Color (81,189,236,255);
		setBackground(Skyblue);
		
		//Background audio
		AudioClip Song = getAudioClip(getDocumentBase(),"tomp3.cc - Its Peppa Pig.wav"); //RESERVE AUDIO "Theme Music From Peppa Pig"
		Song.play();
		
		//Peppa pig logo picture
		picture = getImage(getDocumentBase(), "PEPPA PIG LOGO.png");
	}

	public void paint(Graphics g) {
		
		//LOGO PICTURE 
		g.drawImage(picture, 650, 20, 500, 300, this); //variable, x, y, w, h
		
		//FONT STYLE DECLARE
		Font f1 = new Font("elephant", Font.BOLD, 18);
        g.setFont(f1);
  
        
        //FONT COLOR
        g.setColor(new Color(228,130,181,255));
       	g.drawString("By: James Veloria", 900, 260);
       	
		
		//Clouds
		g.setColor(Color.WHITE);
		
		// 1
		g.fillOval(-50, 270, 100, 65);
		g.fillOval(0, 260, 90, 85);
		g.fillOval(30, 270, 100, 65);
		
		// 2
		g.fillOval(50, 470, 120, 75);
		g.fillOval(100, 460, 100, 95);
		g.fillOval(130, 470, 120, 75);
		
		// 3
		g.fillOval(100, 100, 100, 65);
		g.fillOval(150, 90, 90, 85);
		g.fillOval(200, 80, 100, 65);
		g.fillOval(200, 90, 90, 85);
		g.fillOval(200, 100, 90, 85);
		g.fillOval(250, 100, 100, 65);
		g.fillOval(150, 110, 80, 80);
		
		// 4
		g.fillOval(270, 350, 100, 65);
		g.fillOval(300, 340, 100, 90);
		g.fillOval(350, 360, 100, 75);
		g.fillOval(350, 340, 100, 65);
		g.fillOval(400, 350, 100, 65);
		
		// 5
		g.fillOval(1300, 280, 100, 65);
		g.fillOval(1350, 270, 90, 85);
		g.fillOval(1400, 260, 100, 65);
		g.fillOval(1400, 270, 90, 85);
		g.fillOval(1400, 280, 90, 85);
		g.fillOval(1450, 280, 100, 65);
		g.fillOval(1350, 290, 80, 80);
		
		// 6
		g.fillOval(1500, 80, 100, 65);
		g.fillOval(1550, 70, 90, 85);
		g.fillOval(1600, 60, 100, 65);
		g.fillOval(1600, 70, 90, 85);
		g.fillOval(1600, 80, 90, 85);
		g.fillOval(1650, 80, 100, 65);
		g.fillOval(1550, 90, 80, 80);
		
		// 7
		g.fillOval(1600, 380, 100, 65);
		g.fillOval(1650, 370, 90, 85);
		g.fillOval(1700, 360, 100, 65);
		g.fillOval(1700, 370, 90, 85);
		g.fillOval(1700, 380, 90, 85);
		g.fillOval(1750, 380, 100, 65);
		g.fillOval(1650, 390, 80, 80);
		
		//Ground
		g.setColor(new Color(113,194,102,255));
		g.fillArc(-90,750,2180,500,0,390);
		
		//Grass & Flower stem
		super.paint(g); 
		Graphics2D g1 = (Graphics2D) g;
		g1.setStroke(new BasicStroke(3));
		
		g.setColor(new Color (68,177,93,255));
		
		//FLOWER STEM
		// 1
		g.drawLine(20, 925, 22, 930);
		g.drawLine(25, 925, 25, 910);
		g.drawLine(30, 925, 28, 930);
		
		// 2
		g.drawLine(195, 920, 197, 925);
		g.drawLine(200, 925, 200, 900);
		g.drawLine(205, 915, 203, 920);
		
		// 3
		g.drawLine(330, 850, 330, 840);
		
		// 4
		g.drawLine(430, 925, 430, 910);
		
		// 5
		g.drawLine(480, 830, 480, 810);
		g.drawLine(478, 830, 475, 825);
		
		// 6
		g.drawLine(545, 925, 547, 930);
		g.drawLine(550, 925, 550, 910);
		g.drawLine(555, 925, 553, 930);
		
		// 7 
		g.drawLine(910, 795, 910, 780);
		
		// 8
		g.drawLine(945, 920, 947, 925);
		g.drawLine(950, 925, 950, 900); 
		g.drawLine(955, 915, 953, 920);
		
		// 9
		g.drawLine(960, 845, 962, 850);
		g.drawLine(965, 855, 965, 830);
		g.drawLine(970, 845, 968, 850);
		
		// 10
		g.drawLine(1050, 790, 1050, 805);
		
		// 11
		g.drawLine(1425, 800, 1427, 805);
		g.drawLine(1430, 805, 1430, 780); 
		g.drawLine(1435, 795, 1433, 800);
		
		// 12
		g.drawLine(1465, 925, 1467, 930);
		g.drawLine(1470, 925, 1470, 910);
		g.drawLine(1475, 925, 1473, 930);
		
		// 13
		g.drawLine(1600, 885, 1602, 890);
		g.drawLine(1605, 895, 1605, 870); 
		g.drawLine(1610, 885, 1608, 890);
		
		// 14
		g.drawLine(1700, 820, 1700, 835);
		
		// 15
		g.drawLine(1785, 920, 1787, 925);
		g.drawLine(1790, 925, 1790, 900);
		g.drawLine(1795, 915, 1793, 920);
		
		
		//GRASS
		
		// 1
		g.drawLine(100, 930, 100, 920);
		g.drawLine(110, 925, 110, 915);
		g.drawLine(120, 925, 120, 915);
		
		// 2
		g.drawLine(180, 870, 180, 860);
		g.drawLine(190, 865, 190, 870);
		g.drawLine(200, 865, 200, 855);
		
		// 3
		g.drawLine(270, 890, 270, 880);
		g.drawLine(280, 885, 280, 880);
		g.drawLine(290, 885, 290, 875);
		
		// 4
		g.drawLine(300, 910, 300, 920);
		g.drawLine(310, 905, 310, 915);
		g.drawLine(320, 910, 320, 920);
		
		// 5
		g.drawLine(350, 890, 350, 880);
		g.drawLine(360, 885, 360, 880); 
		g.drawLine(370, 885, 370, 875);
		
		// 6
		g.drawLine(400, 830, 400, 820);
		g.drawLine(410, 825, 410, 820);
		g.drawLine(420, 830, 420, 820);
		
		// 7
		g.drawLine(460, 920, 460, 910);
		g.drawLine(470, 925, 470, 915);
		g.drawLine(480, 925, 480, 915);
		
		// 8
		g.drawLine(480, 870, 480, 860);
		g.drawLine(490, 865, 490, 860); 
		g.drawLine(500, 865, 500, 855);
		
		// 9
		g.drawLine(850, 920, 850, 930);
		g.drawLine(860, 925, 860, 920); 
		g.drawLine(870, 915, 870, 925);
		
		// 10
		g.drawLine(880, 840, 880, 850);
		g.drawLine(890, 845, 890, 840); 
		g.drawLine(900, 835, 900, 845);
		
		// 11
		g.drawLine(970, 770, 970, 780);
		g.drawLine(980, 775, 980, 770); 
		g.drawLine(990, 765, 990, 775);

		// 12
		g.drawLine(1000, 910, 1000, 920);
		g.drawLine(1010, 925, 1010, 920); 
		g.drawLine(1020, 915, 1020, 925);
		
		// 13
		g.drawLine(1020, 850, 1020, 860);
		g.drawLine(1030, 865, 1030, 860); 
		g.drawLine(1040, 855, 1040, 865);
		
		// 14
		g.drawLine(1340, 800, 1340, 810);
		g.drawLine(1350, 815, 1350, 810); 
		g.drawLine(1360, 805, 1360, 815);
		
		// 15
		g.drawLine(1380, 890, 1380, 900);
		g.drawLine(1390, 895, 1390, 890); 
		g.drawLine(1400, 885, 1400, 895);
		
		// 17
		g.drawLine(1530, 900, 1530, 910);
		g.drawLine(1540, 915, 1540, 910); 
		g.drawLine(1550, 905, 1550, 915);
		
		// 16
		g.drawLine(1480, 840, 1480, 850);
		g.drawLine(1490, 845, 1490, 840); 
		g.drawLine(1500, 835, 1500, 845);
		
		// 18
		g.drawLine(1580, 820, 1580, 830);
		g.drawLine(1590, 825, 1590, 820); 
		g.drawLine(1600, 815, 1600, 825);
		
		// 19
		g.drawLine(1680, 910, 1680, 920);
		g.drawLine(1690, 915, 1690, 910); 
		g.drawLine(1700, 905, 1700, 915);
		
		// 20
		g.drawLine(1780, 850, 1780, 860);
		g.drawLine(1790, 855, 1790, 850); 
		g.drawLine(1800, 845, 1800, 855);
		
		// 21
		g.drawLine(1860, 910, 1860, 920);
		g.drawLine(1870, 925, 1870, 920); 
		g.drawLine(1880, 915, 1880, 925);
		
		
		//FLOWERS
		
		//YELLOW PETALS
		g.setColor(Color.YELLOW);
		
		// 1
		g.fillOval(190,890 ,11,11);
		g.fillOval(200,890 ,11,11);
		g.fillOval(190,900 ,11,11);
		g.fillOval(200,900 ,11,11);

		// 2
		g.fillOval(420,902 ,12,12);
		g.fillOval(430,902 ,12,12);
		g.fillOval(425,893 ,12,12);
		
		// 3
		g.fillOval(540,895 ,11,11);
		g.fillOval(550,895 ,11,11);
		g.fillOval(540,905 ,11,11);
		g.fillOval(550,905 ,11,11);
		
		// 4
		g.fillOval(900,775 ,12,12);
		g.fillOval(905,766 ,12,12);
		g.fillOval(910,775 ,12,12);
		
		// 5
		g.fillOval(955,820 ,11,11);
		g.fillOval(965,820 ,11,11);
		g.fillOval(955,830 ,11,11);
		g.fillOval(965,830 ,11,11);
		
		// 6
		g.fillOval(1420,770 ,11,11);
		g.fillOval(1430,770 ,11,11);
		g.fillOval(1420,780 ,11,11);
		g.fillOval(1430,780 ,11,11);
		
		// 7
		g.fillOval(1460,895 ,11,11);
		g.fillOval(1470,895 ,11,11);
		g.fillOval(1460,905 ,11,11);
		g.fillOval(1470,905 ,11,11);
		
		// YELLOW MIDDLE
		g.fillOval(325, 827, 10, 10);
		g.fillOval(1045,780 ,10,10);
		g.fillOval(1695,810 ,10,10);
		
		// WHITE PETALS
		g.setColor(Color.WHITE);

		// 1
		g.fillOval(15, 895, 11, 11);
		g.fillOval(25, 895, 11, 11);
		g.fillOval(15, 905, 11, 11);
		g.fillOval(25, 905, 11, 11);
		
		// 2
		g.fillOval(320, 832, 11, 11);
		g.fillOval(325, 822, 11, 11);
		g.fillOval(330, 832, 11, 11);
		
		// 3
		g.fillOval(470, 805, 11, 11);
		g.fillOval(480, 805, 11, 11);
		g.fillOval(470, 795, 11, 11);
		g.fillOval(480, 795, 11, 11);
		
		// 4
		g.fillOval(940, 890, 11, 11);
		g.fillOval(950, 890, 11, 11);
		g.fillOval(940, 900, 11, 11);
		g.fillOval(950, 900, 11, 11);
		
		// 5
		g.fillOval(1040,785 ,11,11);
		g.fillOval(1045,775 ,11,11);
		g.fillOval(1050,785 ,11,11);
		
		// 6
		g.fillOval(1595,860 ,11,11);
		g.fillOval(1605,860 ,11,11);
		g.fillOval(1595,870 ,11,11);
		g.fillOval(1605,870 ,11,11);
		
		// 7 
		g.fillOval(1690,815 ,11,11);
		g.fillOval(1695,805 ,11,11);
		g.fillOval(1700,815 ,11,11);
		
		// 8 
		g.fillOval(1780,890 ,11,11);
		g.fillOval(1790,890 ,11,11);
		g.fillOval(1780,900 ,11,11);
		g.fillOval(1790,900 ,11,11);
		
		// WHITE MIDDLE
		g.fillOval(195,895 ,10,10);
		g.fillOval(425,900 ,10,10);
		g.fillOval(545,900 ,10,10);
		g.fillOval(905,772 ,10,10);
		g.fillOval(960,825 ,10,10);
		g.fillOval(1425,775 ,10,10);
		g.fillOval(1465,900 ,10,10);
		
		
		// YELLOW MIDDLE
		g.setColor(Color.YELLOW);
		
		g.fillOval(20,900 ,10,10);
		g.fillOval(475, 800, 10, 10);
		g.fillOval(945, 895, 10, 10);
		g.fillOval(1600,865 ,10,10);
		g.fillOval(1785,895 ,10,10);
		
		
		//Character 1
	
		//PEPPA PIG
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(10));
		
		//FEET
		g.setColor(new Color(240,187,220,255));
		g.drawLine(655,900,655 ,850);
		g.drawLine(750,900,750 ,850);
		
		//SHADOW
		g.setColor(new Color(84,145,76,255));
		g.fillOval(570,890, 290 , 30);
		
		//PEPPA'S BOOTS
		g.setColor(Color.YELLOW);
		
		//LEFT BOOTS
		g.fillRect(640,860,30,45);
		g.fillRect(640,880,50,27);
		g.fillOval(665,880,40 ,27);
		
		// RIGHT BOOTS
		g.fillRect(735,860,30,45);
		g.fillRect(735,880,50,27);
		g.fillOval(760,880,40 ,27);
		
		// LEFT HAND
		g.setColor(new Color(251,183,231,255));
		g.drawLine(810 , 700 , 885 ,660);
		g.drawLine(870, 675, 880, 680 );
		g.drawLine(865, 665, 870, 650 );
		
		
		// ICE CREAM
		g.setColor(new Color(255,251,152,255));
		g.fillOval(840,570,70,60);
		
		super.paint(g);
		Graphics2D g3 = (Graphics2D) g;
		g3.setStroke(new BasicStroke(10));
		
		// CONE
		g.setColor(new Color(255,192,45,255));
		int[] x_cone = {850, 900, 875, 850};
		int[] y_cone = {620, 620, 710, 620};
		g.drawPolyline(x_cone,y_cone,4);
		
		g.setColor(new Color(255,209,73,255));
		g.fillPolygon(x_cone,y_cone,4);
		
		
		super.paint(g);
		Graphics2D g4 = (Graphics2D) g;
		g4.setStroke(new BasicStroke(5));
		
		// CONE LINES
		g.setColor(new Color(255,192,45,255));
		g.drawLine(855,635,870,620);
		g.drawLine(860,650,890,620);
		g.drawLine(864,668,900,630);
		g.drawLine(868,685,890,661);
		g.drawLine(873,700,882,690);
		
		g.drawLine(885,620,895,635);
		g.drawLine(860,620,890,665);
		g.drawLine(860,660,880,690);
		
		
		super.paint(g);
		Graphics2D g5 = (Graphics2D) g;
		g5.setStroke(new BasicStroke(15));		
		
		//BODY OUTLINE
		g.setColor(new Color(236,56,38,255));
		g.drawArc(570, 590, 270, 500, 0, 180);
		g.drawLine(570, 840 ,840,840);
		
		//Inner Body
		g.setColor(new Color (240,101,94,255));
		g.fillArc(570,590, 270, 500, 0, 180);
		
		super.paint(g);
		Graphics2D g6 = (Graphics2D) g;
		g6.setStroke(new BasicStroke(9));
		
		//RIGHT HAND
		g.setColor(new Color(251,183,231,255));
		g.drawLine(540, 660, 565, 660 );
		g.drawLine(570, 660, 575, 635 );
		g.drawLine(550 , 640 , 600 ,690);
		
		//TAIL
		g.setColor(new Color (240,187,220,255));
		g.drawOval(530,785, 20, 20);
		g.drawArc (512,790, 60, 20, 180, 130);
		
		//EARS 
		g.setColor(new Color(240,151,194,255));
		g.drawArc(705,390, 50, 80, 0, 190);
		g.drawArc(620,410, 50, 85, 0, 210);
		
		g.setColor(new Color(241,190,213,255));
		g.fillArc(705,390, 50, 95, 0, 190);
		g.fillArc(620,410, 50, 95, 0, 210);
		
		//HEAD
		g.setColor(new Color(255,176,223,255));
		g.fillArc (585,450, 220, 230, 124, 380);
		g.fillArc (620,437, 289, 110, -79, 280);
		
		g.setColor(new Color(225,153,191,255));
		g.drawArc(585,450, 220, 230, 124, 250); 
		g.drawArc(620,437, 284, 110, -79, 242);
		g.drawOval(830, 460, 65,65);
		
		//EYES
		g.drawOval(680, 460, 45, 45);
		g.drawOval(750, 460, 45, 45);
		

		//RIBBON
		super.paint(g);
		Graphics2D g7 = (Graphics2D) g;
		g7.setStroke(new BasicStroke(10));
		
		g.setColor(Color.RED);
		int[] x_ribbon1 = {675, 690, 650, 675};
		int[] y_ribbon1 = {420, 450, 455, 420};
		g.drawPolyline(x_ribbon1,y_ribbon1,4);
		
		int[] x_ribbon2 = {608, 630, 650, 608};
		int[] y_ribbon2 = {460, 490, 457, 460};
		g.drawPolyline(x_ribbon2,y_ribbon2,4);
		
		g.setColor(new Color (238,86,82,255));
		g.fillPolygon(x_ribbon1,y_ribbon1,4);
		g.fillPolygon(x_ribbon2,y_ribbon2,4);
		
		g.setColor(Color.WHITE);
		g.fillOval(640,445, 25, 25);
		
		//MARK
		g.setColor(new Color(255,140,209,255));
		g.fillOval(605, 510, 75,70);
		
		//NOSE
		g.setColor(new Color(179,118,146,255));
		g.drawOval(850, 490, 8, 8);
		g.drawOval(875, 490, 8, 8);
		
		//eyeball
		g.setColor(Color.WHITE);
		g.fillOval(682, 465, 40, 40);
		g.fillOval(752, 465, 40, 40);
		
		g.setColor(Color.black);
		g.fillOval(695, 480, 25, 25);
		g.fillOval(765, 480, 25, 25);
		
		//MOUTH
		g.setColor(new Color (225,86,140,255));
		g.drawLine(685, 580 , 775, 580);
		g.drawArc (685,540, 90, 90, 180, 180);
		
		g.setColor(Color.black);
		g.fillArc (685,540, 90, 90, 180, 180);
		
		
		//Character 2
		
		//GEORGE PEPPA's LITTLE BROTHER
		g.setColor(new Color(240,187,220,255));
		
		//HANDS & FEET
		g.drawLine(1250,890,1250 ,880);
		
		//SHADOW
		g.setColor(new Color(84,145,76,255));
		g.fillOval(1060,920, 270 , 20);
		
		//BOOTS
		g.setColor(new Color(236,56,38,255));
		g.fillRect(1180,880,20,30);
		g.fillRect(1170,890,25,20);
		g.fillOval(1160,890,20,20);
		
		g.fillRect(1240,890,20,30);
		g.fillRect(1230,900,25,20);
		g.fillOval(1220,900,20,20);

		
		super.paint(g);
		Graphics2D g8 = (Graphics2D) g;
		g8.setStroke(new BasicStroke(6));
		
		//TAIL
		g.setColor(new Color (240,187,220,255));
		g.drawOval(1305,828, 20, 20);
		g.drawArc (1290,830, 50, 20, 220, 130);
		
		super.paint(g);
		Graphics2D g9 = (Graphics2D) g;
		g9.setStroke(new BasicStroke(9));
		
		//BODY
		g.setColor(new Color (80,142,201,255));
		g.fillOval(1140,748,155,142);
		
		//BODY OUTLINE
		g.setColor(new Color(17,120,194,255));
		g.drawOval(1140,748,155,142);
		
		//EARS OUTLINE
		g.setColor(new Color(240,151,194,255));
		g.drawArc(1190,630, 30, 80, 0, 170);
		g.drawArc(1250,640, 30, 80, 0, 160);
		
		//INNER EAR
		g.setColor(new Color(241,190,213,255));
		g.fillArc(1190,630, 30, 90, 0, 170);
		g.fillArc(1250,640, 30, 90, 0, 160);
		
		//HEAD INNER
		g.setColor(new Color(255,176,223,255));
		g.fillArc(1145,660,150,150,195, 270);
		g.fillArc(1090,660, 200, 100, 5, 360);
		
		//HEAD OUTLINE
		g.setColor(new Color(232,142,192,255));
		g.drawArc(1145,660, 150, 150, 195, 190); 
		g.drawArc(1090,660, 200, 100, 5, 240);
		
		//GEORGE MARK
		g.setColor(new Color(255,140,209,255));
		g.fillOval(1240, 720, 45,40);
		
		//NOSE
		g.setColor(new Color (232,142,192,255));
		g.drawOval(1095, 677 , 50, 65);
	
		//NOSE HOLE
		g.setColor(new Color(179,118,146,255));
		g.drawOval(1125, 705, 8, 8);
		g.drawOval(1105, 700, 8, 8);
		
		//EYE LINING
		g.setColor(new Color (232,142,192,255));
		g.drawOval(1170, 680, 30, 30);
		g.drawOval(1220, 680, 30, 30);
		
		//EYEBALL
		g.setColor(Color.white);
		g.fillOval(1170, 682, 25, 25);
		g.fillOval(1220, 682, 25, 25);
		
		g.setColor(Color.BLACK);
		g.fillOval(1170, 682, 20, 20);
		g.fillOval(1220, 682, 20, 20);
		
		//MOUTH
		g.setColor(Color.black);
		g.fillArc (1170,720, 60, 60, 180, 180);
		
		super.paint(g);
		Graphics2D g10 = (Graphics2D) g;
		g10.setStroke(new BasicStroke(6));
		
		//SCOOTER
		
		//WHEELS
		g.setColor(Color.black);
		g.fillOval(1085, 900, 30, 30);
		g.fillOval(1285, 900, 30, 30);
		
		g.setColor(Color.WHITE);
		g.fillOval(1090, 905, 20, 20);
		g.fillOval(1290, 905, 20, 20);
		
		//SCOOTER BODY
		g.setColor(Color.BLUE);
		g.drawLine(1080, 805, 1125, 815);
		g.drawLine(1100, 815, 1100, 915);
		g.drawArc(1075,890,50,40,355,85);
		g.drawLine(1125, 915, 1300, 915);
		
		super.paint(g);
		Graphics2D g11 = (Graphics2D) g;
		g11.setStroke(new BasicStroke(8));
		
		//ARM
		g.setColor(new Color (251,183,231,255));
		g.fillOval(1080, 795, 10,10);
		g.drawLine(1140,790,1085,800);
		g.drawLine(1160,830,1100,830);
		g.fillOval(1160, 825, 12, 10);
		
	}
}