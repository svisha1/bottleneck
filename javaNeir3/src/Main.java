import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Main {
    static double [][] X= {
        {1,1,1, //0
         1,0,1,
         1,0,1,
         1,0,1,
         1,1,1},
        {0,1,0, //1
         1,1,0,
         0,1,0,
         0,1,0,
         1,1,1},
        {0,1,1, //2
         1,0,1,
         0,0,1,
         0,1,0,
         1,1,1},
        {1,1,1, //3
         0,0,1,
         1,1,1,
         0,0,1,
         1,1,1}};
static double [][] Y= {
            {1,1,1, //0
            1,0,1,
            1,0,1,
            1,0,1,
            1,1,1},
            {0,1,0, //1
            1,1,0,
            0,1,0,
            0,1,0,
            1,1,1},
            {0,1,1, //2
            1,0,1,
            0,0,1,
            0,1,0,
            1,1,1},
            {1,1,1, //3
            0,0,1,
            1,1,1,
            0,0,1,
            1,1,1}};

public static void main(String[] args) {
    
    NeuralNetwork nn = new NeuralNetwork(15,5,15);
    
    
    List<Double>output;
    
    nn.fit(X, Y, 60000);
    double [][] input = {
        {1,1,1, //0
        1,0,1,
        1,0,1,
        1,0,1,
        1,1,1},
        {0,1,0, //1
        1,1,0,
        0,1,0,
        0,1,0,
        1,1,1},
        {0,1,1, //2
        1,0,1,
        0,0,1,
        0,1,0,
        1,1,1},
        {0.5,0.7,1, //3
        0,0,1,
        0.3,1,1,
        0,0,1,
        1,1,1}
};

    System.out.println("\n");
    for(double d[]:input)
    {
        output = nn.predict(d);
        System.out.println(output.toString());
    }		

}

}