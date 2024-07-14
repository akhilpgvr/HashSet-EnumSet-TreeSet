import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    enum JOBPROFILE{PAINTER, DOCTOR, ENGINEER, TEACHER, CLERK, WATCHMAN, TECHNICIAN}

    public static void main(String[] args) {
        System.out.println("..........................");
        //set operations

        //Set supports all operations performed in arrays
        //Set can be implemented in following ways
        //1. Using HashMap

        Set<Integer> intSet1 = new HashSet<>(Set.of(2,4,6,8,9,11));
        Set<Integer> intSet2 = new HashSet<>(Set.of(1, 2,3,7,9,11));
        System.out.println("Set1: "+ intSet1);
        System.out.println("Set2: "+ intSet2);
        System.out.println("..........................");
        intSet1.addAll(intSet2);
        System.out.println("union : "+intSet1);
        System.out.println("..........................");
        intSet1.retainAll(intSet2);
        System.out.println("intersection: "+intSet1);
        System.out.println("..........................");
        intSet1.removeAll(intSet2);
        System.out.println("difference: "+ intSet1);
        System.out.println("..........................");
        System.out.println("Set2 elements are: ");
        for(Integer setEle: intSet2){
            System.out.println(setEle);
        }

        /*
        Output:
        ..........................
        Set1: [2, 4, 6, 8, 9, 11]
        Set2: [1, 2, 3, 7, 9, 11]
        ..........................
        union : [1, 2, 3, 4, 6, 7, 8, 9, 11]
        ..........................
        intersection: [1, 2, 3, 7, 9, 11]
        ..........................
        difference: []
        ..........................
        Set2 elements are:
        1
        2
        3
        7
        9
        11
        */

        //2. EnumSet
        Set<JOBPROFILE> degreeJobs = EnumSet.of(JOBPROFILE.ENGINEER, JOBPROFILE.DOCTOR, JOBPROFILE.TEACHER, JOBPROFILE.TECHNICIAN);
        Set<JOBPROFILE> nonDegreeJobs = EnumSet.of(JOBPROFILE.CLERK, JOBPROFILE.PAINTER, JOBPROFILE.TECHNICIAN);
        System.out.println("Degree Jobs: "+ degreeJobs);
        System.out.println("Non-Degree Jobs: "+ nonDegreeJobs);
        degreeJobs.retainAll(nonDegreeJobs);
        System.out.println("CommonJobs: "+ degreeJobs);

        /*
        Output:
        ..........................
        Degree Jobs: [DOCTOR, ENGINEER, TEACHER, TECHNICIAN]
        Non-Degree Jobs: [PAINTER, CLERK, TECHNICIAN]
        CommonJobs: [TECHNICIAN]
        */

        //TreeSet -- operations are same but it saves element in an ascending order
        System.out.println("..........................");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(29);
        System.out.println(treeSet);

        /*
        Output:
        ..........................
        [2, 5, 10, 29]
        */
    }
}