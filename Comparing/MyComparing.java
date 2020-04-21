
package cvika5_video3_comparing_interface;

/**
 *
 * @author David Bálik
 */
public class MyComparing {
    
    public static void main(String[] args) {
        Student[] students = Datasource.loadDataAsArray();
        print(students);
        System.out.println("Sort by number");
        sortByNumber(students);
        print(students);
        
        
    }
    
    
    
        private static void sort (CompareInterface[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j-1].isSmaller(array[j])) {
                
                    CompareInterface temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    
                } 
            } 
        }
    }
        
        public static void sort(Object [] array, ComparatorInterface o){
          for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (o.bigger(array[j-1], array[j])) {
                    Object temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
   
            }
        }
    }
   
    
    private static void sortByNumber(Student[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j-1].startLater(array[j])) {
                
                    Student temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    
                } 
            }  
        }
    }
    
  
    
    
    public static void print(Student[] array){
        for (Student student : array) {
            System.out.println(student);
        }
    } 
}
