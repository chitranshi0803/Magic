import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;


/*<applet code="Magic.class" archive="Magic.jar" width=500 height=500>
</applet>
*/

public class Magic extends Applet implements MouseListener,MouseMotionListener,ActionListener
{
	int magic;
	Panel p1,p2,p3,p4;
	Label  l1,l2,l3,l4,l5,l6,l7,l8,l9;
	TextField t1,t2,t3,t4,t5;
	Choice c1,c2,c3,c4,c5;
	Button b1,b2,b3,b4,b5;
	String w;

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String q=c1.getSelectedItem();
		    int r=Integer.parseInt(q);

			if(r>magic)
			{
				System.out.println("High");
			    t1.setText("High");
			}
			if(r<magic)
			{
				System.out.println("Low");
				t1.setText("Low");
			}
			if(r==magic)
			{
				System.out.println("Hurrayy!! You won the game");
				t1.setText("Hurrayy!! You won the game");
				System.out.println(magic);

			}
		}

		if(ae.getSource()==b2)
				{
					String q=c2.getSelectedItem();
				    int d=Integer.parseInt(q);

					if(d>magic)
					{
						System.out.println("High");
						t2.setText("High");

					}
					if(d<magic)
					{
						System.out.println("Low");
						t2.setText("Low");
					}
					if(d==magic)
					{
						System.out.println("Hurrayy!! You won the game");
						t2.setText("Hurrayy!! You won the game");
						System.out.println(magic);

						}
				}

				if(ae.getSource()==b3)
				{
					String q=c3.getSelectedItem();
				    int c=Integer.parseInt(q);

					if(c>magic)
					{
						System.out.println("High");
						t3.setText("High");
					}
					if(c<magic)
					{
						System.out.println("Low");
						t3.setText("Low");
					}

					if(c==magic)
					{
						System.out.println("Hurrayy!! You won the game");
						t3.setText("Hurrayy!! You won the game");
						System.out.println(magic);

					}
				}


				if(ae.getSource()==b4)
				{
					String q=c4.getSelectedItem();
				    int b=Integer.parseInt(q);

					if(b>magic)
					{
						System.out.println("High");
						t4.setText("High");
					}
					if(b<magic)
					{
     					System.out.println("Low");
     					t4.setText("Low");
					}
					if(b==magic)
					{
						System.out.println("Hurrayy!! You won the game");
						t4.setText("Hurrayy!! you won the game");
                        System.out.println(magic);

     				}
				}

				if(ae.getSource()==b5)
				{
					String q=c5.getSelectedItem();
				    int a=Integer.parseInt(q);

					if(a!=magic)
					{
						System.out.println("Sorryy!! You Lose the game");
						t5.setText("Sorryy!! You Lose the game");
						System.out.println(magic);
					}
					if(a==magic)
					{
			    		System.out.println("Hurrayy!! You won the game");
			    		t5.setText("Hurrayy!! you won the game");
			    		System.out.println(magic);


					}
				}


	}


	    public void mouseEntered(MouseEvent me)
		{
			showStatus("Mouse Moved:"+me.getX()+","+me.getY());

	      }

		 public void mouseExited(MouseEvent me)
		  {
			   showStatus("Mouse Moved:"+me.getX()+","+me.getY());

		   }


		public void mouseClicked(MouseEvent me)
	     {
		   showStatus("Mouse Moved:"+me.getX()+","+me.getY());

	  }


		public void mousePressed(MouseEvent me)
		{
		   showStatus("Mouse Moved:"+me.getX()+","+me.getY());
	   }


	   public void mouseReleased(MouseEvent me)
	   {
		   showStatus("Mouse Moved:"+me.getX()+","+me.getY());
	   }


	   public void mouseMoved(MouseEvent me)
	   {
		   showStatus("Mouse Moved:"+me.getX()+","+me.getY());
		}

	   public void mouseDragged(MouseEvent me)
	   {
		   showStatus("Mouse Moved:"+me.getX()+","+me.getY());
	    }

	public void init()
	{
		 magic=(int)(Math.random()*100)+1;
		//System.out.println(magic);
         


	p1=new Panel();
	p2=new Panel();
	p3=new Panel();
	p4=new Panel();


	p1.setLayout(new BorderLayout());
	p2.setLayout(new GridLayout(5,1));
	p3.setLayout(new GridLayout(5,1));
	p4.setLayout(new GridLayout(3,1));


    b1=new Button("GO");
    b2=new Button("GO");
    b3=new Button("GO");
    b4=new Button("GO");
    b5=new Button("GO");

    t1=new TextField(30);
    t2=new TextField(30);
    t3=new TextField(30);
    t4=new TextField(30);
    t5=new TextField(30);






    c1=new Choice();
    c1.addItem("1");
    c1.addItem("2");
    c1.addItem("3");
    c1.addItem("4");
    c1.addItem("5");
    c1.addItem("6");
    c1.addItem("7");
    c1.addItem("8");
    c1.addItem("9");
    c1.addItem("10");
    c1.addItem("11");
	c1.addItem("12");
	c1.addItem("13");
	c1.addItem("14");
	c1.addItem("15");
	c1.addItem("16");
	c1.addItem("17");
	c1.addItem("18");
	c1.addItem("19");
    c1.addItem("20");
    c1.addItem("21");
	c1.addItem("22");
	c1.addItem("23");
	c1.addItem("24");
	c1.addItem("25");
	c1.addItem("26");
	c1.addItem("27");
	c1.addItem("28");
	c1.addItem("29");
    c1.addItem("30");
    c1.addItem("31");
	c1.addItem("32");
	c1.addItem("33");
	c1.addItem("34");
	c1.addItem("35");
	c1.addItem("36");
	c1.addItem("37");
	c1.addItem("38");
	c1.addItem("39");
    c1.addItem("40");
    c1.addItem("41");
	c1.addItem("42");
	c1.addItem("43");
	c1.addItem("44");
	c1.addItem("45");
	c1.addItem("46");
	c1.addItem("47");
	c1.addItem("48");
	c1.addItem("49");
    c1.addItem("50");
    c1.addItem("51");
	c1.addItem("52");
	c1.addItem("53");
	c1.addItem("54");
	c1.addItem("55");
	c1.addItem("56");
	c1.addItem("57");
	c1.addItem("58");
	c1.addItem("59");
    c1.addItem("60");
    c1.addItem("61");
	c1.addItem("62");
	c1.addItem("63");
	c1.addItem("64");
	c1.addItem("65");
	c1.addItem("66");
	c1.addItem("67");
	c1.addItem("68");
	c1.addItem("69");
    c1.addItem("70");
    c1.addItem("71");
	c1.addItem("72");
	c1.addItem("73");
	c1.addItem("4");
	c1.addItem("75");
	c1.addItem("76");
	c1.addItem("77");
	c1.addItem("78");
	c1.addItem("79");
    c1.addItem("80");
    c1.addItem("81");
	c1.addItem("82");
	c1.addItem("83");
	c1.addItem("84");
	c1.addItem("85");
	c1.addItem("86");
	c1.addItem("87");
	c1.addItem("88");
	c1.addItem("89");
    c1.addItem("90");
    c1.addItem("91");
	c1.addItem("92");
	c1.addItem("93");
	c1.addItem("94");
	c1.addItem("95");
	c1.addItem("96");
	c1.addItem("97");
	c1.addItem("98");
	c1.addItem("99");
    c1.addItem("100");


        c2=new Choice();
	    c2.addItem("1");
	    c2.addItem("2");
	    c2.addItem("3");
	    c2.addItem("4");
	    c2.addItem("5");
	    c2.addItem("6");
	    c2.addItem("7");
	    c2.addItem("8");
	    c2.addItem("9");
	    c2.addItem("10");
	    c2.addItem("11");
		c2.addItem("12");
		c2.addItem("13");
		c2.addItem("14");
		c2.addItem("15");
		c2.addItem("16");
		c2.addItem("17");
		c2.addItem("18");
		c2.addItem("19");
	    c2.addItem("20");
	    c2.addItem("21");
		c2.addItem("22");
		c2.addItem("23");
		c2.addItem("24");
		c2.addItem("25");
		c2.addItem("26");
		c2.addItem("27");
		c2.addItem("28");
		c2.addItem("29");
	    c2.addItem("30");
	    c2.addItem("31");
		c2.addItem("32");
		c2.addItem("33");
		c2.addItem("34");
		c2.addItem("35");
		c2.addItem("36");
		c2.addItem("37");
		c2.addItem("38");
		c2.addItem("39");
	    c2.addItem("40");
	    c2.addItem("41");
		c2.addItem("42");
		c2.addItem("43");
		c2.addItem("44");
		c2.addItem("45");
		c2.addItem("46");
		c2.addItem("47");
		c2.addItem("48");
		c2.addItem("49");
	    c2.addItem("50");
	    c2.addItem("51");
		c2.addItem("52");
		c2.addItem("53");
		c2.addItem("54");
		c2.addItem("55");
		c2.addItem("56");
		c2.addItem("57");
		c2.addItem("58");
		c2.addItem("59");
	    c2.addItem("60");
	    c2.addItem("61");
		c2.addItem("62");
		c2.addItem("63");
		c2.addItem("64");
		c2.addItem("65");
		c2.addItem("66");
		c2.addItem("67");
		c2.addItem("68");
		c2.addItem("69");
	    c2.addItem("70");
	    c2.addItem("71");
		c2.addItem("72");
		c2.addItem("73");
		c2.addItem("4");
		c2.addItem("75");
		c2.addItem("76");
		c2.addItem("77");
		c2.addItem("78");
		c2.addItem("79");
	    c2.addItem("80");
	    c2.addItem("81");
		c2.addItem("82");
		c2.addItem("83");
		c2.addItem("84");
		c2.addItem("85");
		c2.addItem("86");
		c2.addItem("87");
		c2.addItem("88");
		c2.addItem("89");
	    c2.addItem("90");
	    c2.addItem("91");
		c2.addItem("92");
		c2.addItem("93");
		c2.addItem("94");
		c2.addItem("95");
		c2.addItem("96");
		c2.addItem("97");
		c2.addItem("98");
		c2.addItem("99");
        c2.addItem("100");

        c3=new Choice();
	    c3.addItem("1");
	    c3.addItem("2");
	    c3.addItem("3");
	    c3.addItem("4");
	    c3.addItem("5");
	    c3.addItem("6");
	    c3.addItem("7");
	    c3.addItem("8");
	    c3.addItem("9");
	    c3.addItem("10");
	    c3.addItem("11");
		c3.addItem("12");
		c3.addItem("13");
		c3.addItem("14");
		c3.addItem("15");
		c3.addItem("16");
		c3.addItem("17");
		c3.addItem("18");
		c3.addItem("19");
	    c3.addItem("20");
	    c3.addItem("21");
		c3.addItem("22");
		c3.addItem("23");
		c3.addItem("24");
		c3.addItem("25");
		c3.addItem("26");
		c3.addItem("27");
		c3.addItem("28");
		c3.addItem("29");
	    c3.addItem("30");
	    c3.addItem("31");
		c3.addItem("32");
		c3.addItem("33");
		c3.addItem("34");
		c3.addItem("35");
		c3.addItem("36");
		c3.addItem("37");
		c3.addItem("38");
		c3.addItem("39");
	    c3.addItem("40");
	    c3.addItem("41");
		c3.addItem("42");
		c3.addItem("43");
		c3.addItem("44");
		c3.addItem("45");
		c3.addItem("46");
		c3.addItem("47");
		c3.addItem("48");
		c3.addItem("49");
	    c3.addItem("50");
	    c3.addItem("51");
		c3.addItem("52");
		c3.addItem("53");
		c3.addItem("54");
		c3.addItem("55");
		c3.addItem("56");
		c3.addItem("57");
		c3.addItem("58");
		c3.addItem("59");
	    c3.addItem("60");
	    c3.addItem("61");
		c3.addItem("62");
		c3.addItem("63");
		c3.addItem("64");
		c3.addItem("65");
		c3.addItem("66");
		c3.addItem("67");
		c3.addItem("68");
		c3.addItem("69");
	    c3.addItem("70");
	    c3.addItem("71");
		c3.addItem("72");
		c3.addItem("73");
		c3.addItem("74");
		c3.addItem("75");
		c3.addItem("76");
		c3.addItem("77");
		c3.addItem("78");
		c3.addItem("79");
	    c3.addItem("80");
	    c3.addItem("81");
		c3.addItem("82");
		c3.addItem("83");
		c3.addItem("84");
		c3.addItem("85");
		c3.addItem("86");
		c3.addItem("87");
		c3.addItem("88");
		c3.addItem("89");
	    c3.addItem("90");
	    c3.addItem("91");
		c3.addItem("92");
		c3.addItem("93");
		c3.addItem("94");
		c3.addItem("95");
		c3.addItem("96");
		c3.addItem("97");
		c3.addItem("98");
		c3.addItem("99");
        c3.addItem("100");


        c4=new Choice();
	    c4.addItem("1");
	    c4.addItem("2");
	    c4.addItem("3");
	    c4.addItem("4");
	    c4.addItem("5");
	    c4.addItem("6");
	    c4.addItem("7");
	    c4.addItem("8");
	    c4.addItem("9");
	    c4.addItem("10");
	    c4.addItem("11");
		c4.addItem("12");
		c4.addItem("13");
		c4.addItem("14");
		c4.addItem("15");
		c4.addItem("16");
		c4.addItem("17");
		c4.addItem("18");
		c4.addItem("19");
	    c4.addItem("20");
	    c4.addItem("21");
		c4.addItem("22");
		c4.addItem("23");
		c4.addItem("24");
		c4.addItem("25");
		c4.addItem("26");
		c4.addItem("27");
		c4.addItem("28");
		c4.addItem("29");
	    c4.addItem("30");
	    c4.addItem("31");
		c4.addItem("32");
		c4.addItem("33");
		c4.addItem("34");
		c4.addItem("35");
		c4.addItem("36");
		c4.addItem("37");
		c4.addItem("38");
		c4.addItem("39");
	    c4.addItem("40");
	    c4.addItem("41");
		c4.addItem("42");
		c4.addItem("43");
		c4.addItem("44");
		c4.addItem("45");
		c4.addItem("46");
		c4.addItem("47");
		c4.addItem("48");
		c4.addItem("49");
	    c4.addItem("50");
	    c4.addItem("51");
		c4.addItem("52");
		c4.addItem("53");
		c4.addItem("54");
		c4.addItem("55");
		c4.addItem("56");
		c4.addItem("57");
		c4.addItem("58");
		c4.addItem("59");
	    c4.addItem("60");
	    c4.addItem("61");
		c4.addItem("62");
		c4.addItem("63");
		c4.addItem("64");
		c4.addItem("65");
		c4.addItem("66");
		c4.addItem("67");
		c4.addItem("68");
		c4.addItem("69");
	    c4.addItem("70");
	    c4.addItem("71");
		c4.addItem("72");
		c4.addItem("73");
		c4.addItem("74");
		c4.addItem("75");
		c4.addItem("76");
		c4.addItem("77");
		c4.addItem("78");
		c4.addItem("79");
	    c4.addItem("80");
	    c4.addItem("81");
		c4.addItem("82");
		c4.addItem("83");
		c4.addItem("84");
		c4.addItem("85");
		c4.addItem("86");
		c4.addItem("87");
		c4.addItem("88");
		c4.addItem("89");
	    c4.addItem("90");
	    c4.addItem("91");
		c4.addItem("92");
		c4.addItem("93");
		c4.addItem("94");
		c4.addItem("95");
		c4.addItem("96");
		c4.addItem("97");
		c4.addItem("98");
		c4.addItem("99");
        c4.addItem("100");

        c5=new Choice();
	    c5.addItem("1");
	    c5.addItem("2");
	    c5.addItem("3");
	    c5.addItem("4");
	    c5.addItem("5");
	    c5.addItem("6");
	    c5.addItem("7");
	    c5.addItem("8");
	    c5.addItem("9");
	    c5.addItem("10");
	    c5.addItem("11");
		c5.addItem("12");
		c5.addItem("13");
		c5.addItem("14");
		c5.addItem("15");
		c5.addItem("16");
		c5.addItem("17");
		c5.addItem("18");
		c5.addItem("19");
	    c5.addItem("20");
	    c5.addItem("21");
		c5.addItem("22");
		c5.addItem("23");
		c5.addItem("24");
		c5.addItem("25");
		c5.addItem("26");
		c5.addItem("27");
		c5.addItem("28");
		c5.addItem("29");
	    c5.addItem("30");
	    c5.addItem("31");
		c5.addItem("32");
		c5.addItem("33");
		c5.addItem("34");
		c5.addItem("35");
		c5.addItem("36");
		c5.addItem("37");
		c5.addItem("38");
		c5.addItem("39");
	    c5.addItem("40");
	    c5.addItem("41");
		c5.addItem("42");
		c5.addItem("43");
		c5.addItem("44");
		c5.addItem("45");
		c5.addItem("46");
		c5.addItem("47");
		c5.addItem("48");
		c5.addItem("49");
	    c5.addItem("50");
	    c5.addItem("51");
		c5.addItem("52");
		c5.addItem("53");
		c5.addItem("54");
		c5.addItem("55");
		c5.addItem("56");
		c5.addItem("57");
		c5.addItem("58");
		c5.addItem("59");
	    c5.addItem("60");
	    c5.addItem("61");
		c5.addItem("62");
		c5.addItem("63");
		c5.addItem("64");
		c5.addItem("65");
		c5.addItem("66");
		c5.addItem("67");
		c5.addItem("68");
		c5.addItem("69");
	    c5.addItem("70");
	    c5.addItem("71");
		c5.addItem("72");
		c5.addItem("73");
		c5.addItem("74");
		c5.addItem("75");
		c5.addItem("76");
		c5.addItem("77");
		c5.addItem("78");
		c5.addItem("79");
	    c5.addItem("80");
	    c5.addItem("81");
		c5.addItem("82");
		c5.addItem("83");
		c5.addItem("84");
		c5.addItem("85");
		c5.addItem("86");
		c5.addItem("87");
		c5.addItem("88");
		c5.addItem("89");
	    c5.addItem("90");
	    c5.addItem("91");
		c5.addItem("92");
		c5.addItem("93");
		c5.addItem("94");
		c5.addItem("95");
		c5.addItem("96");
		c5.addItem("97");
		c5.addItem("98");
		c5.addItem("99");
        c5.addItem("100");



	l1=new Label("WELCOME TO MAGIC NUMBER GAME");
	Font f=new Font("Arial",Font.BOLD,30);
	l1.setFont(f);


	l2=new Label("Guess 1:");
	l3=new Label("Guess 2:");
	l4=new Label("Guess 3:");
	l5=new Label("Guess 4:");
	l6=new Label("Guess 5:");


	l7=new Label("How to play");
	Font fo=new Font("Arial",Font.BOLD,15);
	l7.setFont(fo);

	l8=new Label("1.The computer generated one number and the user have to guess the number in 5 attempts. If the user number is larger than the computer number then it shows high, if the user number is smaller than the computer number then it shows low. ");
	l9=new Label("2.If the guess(user number) is correct then you win the game.");

	setLayout(new GridLayout(4,1));
	setBackground(Color.pink);

	p1.add(l1,BorderLayout.SOUTH);

	add(p1);


	p2.add(l2);
	p2.add(c1);
	p2.add(b1);
	p2.add(l3);
	p2.add(c2);
	p2.add(b2);
	p2.add(l4);
	p2.add(c3);
	p2.add(b3);
	p2.add(l5);
	p2.add(c4);
	p2.add(b4);
	p2.add(l6);
	p2.add(c5);
	p2.add(b5);
	add(p2);

	p3.add(t1);
	p3.add(t2);
	p3.add(t3);
	p3.add(t4);
	p3.add(t5);
	add(p3);

	p4.add(l7);
	p4.add(l8);
	p4.add(l9);
	add(p4);


	p1.addMouseListener(this);
	p2.addMouseListener(this);
	p3.addMouseListener(this);
	p4.addMouseListener(this);
	p1.addMouseMotionListener(this);
	p2.addMouseMotionListener(this);
	p3.addMouseMotionListener(this);
	p4.addMouseMotionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);

}
}

