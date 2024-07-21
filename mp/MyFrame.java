package myframe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.*;
import java.math.*;

class MyFrame extends JFrame implements ActionListener {
		JLabel title,mname,name,mno,type,add,res;
		JTextField tname,tmno;
		JRadioButton veg,non;
		JCheckBox checkBox1;
		ButtonGroup gengp;
		JTextArea tadd;
		JButton sub,cancel,tea,coffee,ojuice,vegt,rice,nonvegt,print;
                int  f1, f2, f3, f4, f5, f6, value5, totaltea, totalcoffee, totalojuice, totalrice, totalvegt, totalnont;
                String value1, value3, value4, ord;
                int value2;
                String msg="*********************************************************************************\n\t                         VP CATTERING\n*********************************************************************************\n\n-----------------------------------------------------------------------------------------------------\n    item\t\tqty\trate\tAmount\n\n";
                    
	public MyFrame()
	{
		setTitle("Order Here!!");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);

		title = new JLabel("Customer Order Details");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setBounds(300, 30, 500, 50);
		add(title);

		name = new JLabel("Customer name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setBounds(100, 100, 300, 20);
		add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setBounds(250, 100, 200, 20);
		add(tname);

		mno = new JLabel("Mobile Number");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setBounds(100, 150, 200, 20);
		add(mno);
                
                tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(150, 20);
		tmno.setBounds(250, 150, 200, 20);
		add(tmno);

		type = new JLabel("Order Information: ");
		type.setFont(new Font("Arial", Font.PLAIN, 20));
		type.setSize(100, 20);
		type.setBounds(100, 215, 200, 20);
		add(type);

		veg = new JRadioButton("Order");
		veg.setFont(new Font("Arial", Font.PLAIN, 15));
		veg.setSelected(true);
		veg.setSize(75, 20);
		veg.setBounds(280, 225, 80, 20);
		add(veg);

		non = new JRadioButton("Parcel");
		non.setFont(new Font("Arial", Font.PLAIN, 15));
		non.setSelected(false);
		non.setSize(80, 20);
		non.setBounds(370, 225, 150, 20);
		add(non);
                

                
		tadd = new JTextArea();
                tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        	tadd.setSize(200, 75);
            	tadd.setBounds(220, 270, 250, 100);
		add(tadd);

		gengp = new ButtonGroup();
		gengp.add(veg);
		gengp.add(non);

		add = new JLabel("Table No.");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setBounds(100, 270, 100, 20);
		add(add);

		add = new JLabel("(Description of");
		add.setSize(100, 20);
		add.setBounds(100, 290, 100, 20);
		add(add);
		add = new JLabel("the order / parcel)");
		add.setSize(100, 20);
		add.setBounds(100,310, 120, 20);
		add(add);
                
		mname = new JLabel("Beverages:");
		mname.setFont(new Font("Arial", Font.PLAIN, 20));
		mname.setSize(100, 20);
		mname.setBounds(580,120,120,20);
		add(mname);
                
		tea = new JButton("Tea");
		tea.setSize(100, 20);
		tea.setBounds(580, 160, 120, 25);
		tea.addActionListener(this);
		add(tea);

		coffee = new JButton("Coffee");
		coffee.setSize(100, 20);
		coffee.setBounds(580, 200, 120, 25);
		coffee.addActionListener(this);
		add(coffee);

		ojuice = new JButton("Orange Juice");
		ojuice.setSize(100, 20);
		ojuice.setBounds(580, 240, 120, 25);
		ojuice.addActionListener(this);
		add(ojuice);

		mname = new JLabel("Menu items :- ");
		mname.setFont(new Font("Verdana", Font.PLAIN, 22));
		mname.setSize(100, 20);
		mname.setBounds(580,80,160,20);
		add(mname);

		JLabel l1 = new JLabel("Food:");
		l1.setFont(new Font("Arial", Font.PLAIN, 20));
		l1.setSize(100, 20);
		l1.setBounds(730,120,120,20);
		add(l1);

		vegt = new JButton("Vegetarian Thali");
		vegt.setSize(100, 20);
		vegt.setBounds(730, 160, 120, 25);
		vegt.addActionListener(this);
		add(vegt);

		nonvegt = new JButton("Non Vegetarian Thali");
		nonvegt.setSize(100, 20);
		nonvegt.setBounds(730, 200, 120, 25);
		nonvegt.addActionListener(this);
		add(nonvegt);

		rice = new JButton("Rice");
		rice.setSize(100, 20);
		rice.setBounds(730, 240, 120, 25);
		rice.addActionListener(this);
		add(rice);

		//String name=JOptionPane.showInputDialog("Enter Name");




		sub = new JButton("Submit");
		sub.setSize(100, 20);
		sub.setBounds(180, 400, 100, 40);
		sub.addActionListener(this);
		add(sub);

		cancel = new JButton("Cancel");
		cancel.setSize(100, 20);
		cancel.setBounds(300, 400, 100, 40);
		cancel.addActionListener(this);
		add(cancel);
                
                print = new JButton("Print Recipt");
		print.setSize(100, 20);
		print.setBounds(420, 400, 100, 40);
		print.addActionListener(this);
		add(print);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{       

                
		if (e.getSource() == tea) {
			//String name=JOptionPane.showInputDialog("Tea");
			//System.out.println(name);
                f1 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of tea cups:","",JOptionPane.PLAIN_MESSAGE));
                 totaltea = f1 * 15;
		msg+= "    tea\t\t"+f1+"\t15\t"+totaltea+"\n";
                }
                
		if (e.getSource() == coffee) {
			f2 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of coffee cups:","",JOptionPane.PLAIN_MESSAGE));
                 totalcoffee = f2 * 20;
		msg+= "    coffee\t\t"+f2+"\t15\t"+totalcoffee+"\n";
		}
		if (e.getSource() == ojuice) {
			f3 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of Orange Juices:","",JOptionPane.PLAIN_MESSAGE));
                 totalojuice = f3 * 35;
		msg+= "    OrangeJuice\t\t"+f3+"\t15\t"+totalojuice+"\n";
		}
		if (e.getSource() == vegt) {
			f4 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of veg thalies:","",JOptionPane.PLAIN_MESSAGE));
		 totalvegt = f4 * 70;
                msg+= "    Veg-Thali\t\t"+f4+"\t15\t"+totalvegt+"\n";
		 
                }
		if (e.getSource() == nonvegt) {
			f5 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of non-veg thalies:","",JOptionPane.PLAIN_MESSAGE));
                totalnont = f5 * 85;
		msg+= "    NonVeg-Thali\t\t"+f5+"\t15\t"+totalnont+"\n";
                }
		if (e.getSource() == rice) {
			f6 = Integer.parseInt( JOptionPane.showInputDialog(null,"Number of rice plates:","",JOptionPane.PLAIN_MESSAGE));
                 totalrice = f6   * 40;
		msg+= "    Rice\t\t"+f6+"\t15\t"+totalrice+"\n";
		}
                
		if (e.getSource() == sub) {
		showMessageDialog(null, "Order Placed!");
                
                int totalcost = totaltea + totalcoffee + totalojuice + totalrice + totalvegt + totalnont;
                    
                msg+="\n\tTotal :-   "+totalcost+"/-"+" \n-----------------------------------------------------------------------------------------------------";
                 
                if(veg.isSelected())
                {
                    ord = "order";
                }    
                else
                {
                    ord = "parcel";
                }
                	value1 = tname.getText();
                        value4 = tadd.getText();
			value3 = tmno.getText();
                        value2 = Integer.parseInt(value3);
                        try{ 
                        Class.forName("com.mysql.jdbc.Driver"); 
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myhotel","root","");
                        Statement stmt=con.createStatement();
                        String i="INSERT INTO `myorder`(`name`, `contact`, `od`, `tbno`, `tea`, `coffee`, `ojuice`, `veg`, `nonveg`, `rice`) VALUES (?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStatement = con.prepareStatement(i);
                        preparedStatement.setString(1,value1);
                        preparedStatement.setInt(2,value2);
                        preparedStatement.setString(3,ord); 
                        preparedStatement.setString(4,value4);
                        preparedStatement.setInt(5,f1);
                        preparedStatement.setInt(6,f2);
                        preparedStatement.setInt(7,f3);
                        preparedStatement.setInt(8,f4);
                        preparedStatement.setInt(9,f5);
                        preparedStatement.setInt(10,f6);
                    
                        
                        int row = preparedStatement.executeUpdate();
 
                        if (row > 0) {
                         System.out.println("Order Placed Successfully.");
                            }
                        con.close(); 
                        }
                            catch(Exception ee){ 
                            System.out.println("Wrong Input");
                        }

                }
		else if (e.getSource() == cancel) {
			setVisible(false);
		}
                if (e.getSource() == print){
                   
                    JOptionPane.showMessageDialog(null,new JTextArea(msg),"",JOptionPane.PLAIN_MESSAGE);
                    msg="*********************************************************************************\n\t                         VP CATTERING\n*********************************************************************************\n\n-----------------------------------------------------------------------------------------------------\n    item\t\tqty\trate\tAmount\n\n";
                    
                }        
		
        }       
        
		public static void main(String[] args) throws Exception
	{
		MyFrame f = new MyFrame();
                
 
        }
}