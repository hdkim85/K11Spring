package di;

public class BMICalResult {
	
	private double lowWeight;	//저체중
	private double normal;		//정상
	private double overWeight;	//과체중
	private double obesity;		//비만
	
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
		
	public String bmiCalculation(double weight,
			double height) {
		
		double h = height*0.01;
		double result = weight/(h*h);
		
		String resultStr = "당신의 BMI지수는?" +
				(int)result;
		
		if(result > obesity) {
			resultStr += "<br/>비만입니다ㅜㅜ'";
		}
		else if(result > overWeight) {
			resultStr += "<br/>과체중입니다 ㅡㅜ";
		}
		else if(result > normal) {
			resultStr += "<br/>정상입니다.^^*";
		}
		else {
			resultStr += "<br/>저체중입니다 -_-;";
		}
		
		return resultStr;	
		
		}
	
}
