import java.util.Scanner;

//Gabriel Kenji Utiyama CB3012069
//Gustavo Barbosa da Silva CB3010627


// Exercício 01
// Crie a classe Hora conforme especificado abaixo:

// Hora
// - hora: int
// - min: int
// - seg: int
// + Hora()
// + Hora(int h, int m, int s)
// + setHor(int h)
// + setMin(int m)
// + setSeg(int s)
// + setHor()
// + setMin()
// + setSeg()
// + getHor(): int
// + getMin(): int
// + getSeg(): int
// + getHora1(): String
// + getHora2(): String
// + getSegundos(): int

// O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e
// segundos e com eles inicializar os atributos da classe. Os valores digitados deverão ser
// consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;

// O construtor Hora(int h, int m, int s) deverá receber os valores de hora, minuto e
// segundos e com eles inicializa as propriedades da classe;

// Os métodos setHor(int h), setMin(int m) e setSeg(int s) devem receber um valor e
// atribuí-lo ao respectivo atributo;

// Os métodos setHor(), setMin() e setSeg() devem permitir que o usuário digite um
// valor e atribuí-lo ao respectivo atributo. Os valores digitados deverão ser consistidos e
// só aceitos se válidos, caso contrário, exigir ao usuário redigitar;

// Os métodos getHor(), getMin() e getSeg() devem devolver as respectivas
// propriedades;

// O método getHora1() deve nos devolver a hora no formato: hh:mm:ss;

// O método getHora2() deve nos devolver a hora no formato: hh:mm:ss (AM/PM);

// O método getSegundos() deve nos devolver a quantidade de segundos expressa na
// hora em questão, (exemplo: 01:00:01 = 3601 segundos) .

// Conveniente colocar tratamento de exceção para as possíveis inconsistências na
// entrada de dados.



// Exercício 02
// Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no
// exercício anterior.

public class Hora {
    
        Scanner ler = new Scanner(System.in);
        private int hora;
        private int min;
        private int seg;
        
        public Hora() {
            
            setHora();
            setMin();
            setSeg();

        }
        
        public Hora(int h, int m, int s){
            
            this.hora = h;
            this.min = m;
            this.seg = s;
           
        }
        
        public void setHora(int h){
            this.hora = h;
        }
        
        public void setMin(int m){
            this.min = m;
        }
        
        public void setSeg(int s){
            this.seg = s;
        }
        
        public void setHora(){
            
            do {
                System.out.println("Digite a hora: ");
                hora = ler.nextInt(); 
                } while (hora > 24 || hora < 1);       
        }
        
        public void setMin(){
            
            do {	
                System.out.println("Digite os minutos: ");
                min = ler.nextInt();
                } while (min > 59 || min < 0);
        }
        
        public void setSeg(){
            
            do {
                System.out.println("Digite os segundos: ");
                seg = ler.nextInt();
                } while (seg > 59 || seg < 0);
        }
        
        public int getHora(int hora){
            return hora;
        }
        
        public int getMin(int min){
            return min;
        }
        
        public int getSeg(int seg){
            return seg;
        }
        
        public String getHora1(){
            
            if(this.hora == 24)
            {
                String A = ("00:"+this.min+":"+this.seg);
                return A;
            }
            else
            {
              String A = (this.hora+":"+this.min+":"+this.seg);
              return A;
            }
            
        }
        
        public String getHora2(){
            
            String hora;
            String min;
            String seg;
            String periodo;
            int hora2;
            
            if(this.hora > 12)
            {
                hora2 = this.hora - 12;
            }
            else 
            {
                hora2 = this.hora;
            }
            if(hora2 < 10)
            {
                hora = "0"+hora2;
            }
            else
            {
                hora = ""+hora2;
            }
            
            if(this.min < 10)
                {
                    min = "0"+this.min;
                }
            else
                {
                    min = ""+this.min;
                }
            if(this.seg < 10)
                {
                    seg = "0"+this.seg;
                }
            else 
                {
                    seg = ""+this.seg;
                }
            if(this.hora < 12)
                {                    
                    periodo = "AM";
                }
            else
                {
                    
                    periodo = "PM";
                }
        
        return hora+":"+min+":"+seg+"("+periodo+")";
            
        }
        
        public int getSegundos(){
            
            int calcH = hora * 3600;
            int calcM = min * 60;		
            int horario = seg + calcH + calcM;    
            return horario;
        }

        public static void main(String args[]) {
            
        Hora hora = new Hora();
        hora.getHora1();
        hora.getSegundos();
        hora.getHora2();
        System.out.println("Horario AM/PM: "+hora.getHora2());
        System.out.println("Horario: "+hora.getHora1());
        System.out.println("Quantidade de segundos: "+hora.getSegundos());
        
    }
}