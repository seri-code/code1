package classLesson;

public class Average { //일반 클래스
	 double Average(int[] TestArr) { 
	        int sum = 0;
	       
	        for(int i=0; i<TestArr.length; i++){ 
	            sum += TestArr[i]; //원소들의 합
	        }
	        
	        return(double)sum / TestArr.length; //평균
	    }
	}


