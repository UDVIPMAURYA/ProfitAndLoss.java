
class ProfitAndLoss{
	static double costPrice = 40;
	double sellingPrice=20;
	double markedPrice=0.5;
	double profit= sellingPrice - costPrice;
	double loss= costPrice-sellingPrice;
	double discount=markedPrice-sellingPrice;
	double profitPercent=profit*100/costPrice;
	double lossPercent =loss*100/costPrice;
	double CPP=sellingPrice*100/100+profitPercent;
	double CPL=sellingPrice*100/100-lossPercent;
	double SPP=costPrice*(100+profitPercent)/100;
	double SPL=costPrice*(100-lossPercent)/100;
	
	public static void main(String b[]){
		ProfitAndLoss Bussiness=new ProfitAndLoss();
		
		System.out.println("PROFIT= "+" "+Bussiness.profit+"  "+
		"LOSS= "+" "+Bussiness.loss+"  "+"DISCOUNT= "+" "+Bussiness.discount
		+" \n"+"ProfitPercent= "+" "+Bussiness.profitPercent+"%"+"  "+"Losspercent= "
		+" "+Bussiness.lossPercent+"%\n");
		System.out.println("C.P.P.= "+Bussiness.CPP+"  "+"C.P.L.= "+ Bussiness.CPL+"\n"+
		"S.P.P.= "+Bussiness.SPP+"  "+"S.P.L.= "+Bussiness.SPL);
	}
}