package com.cg.lb06.ui;
import java.util.HashMap;
import java.util.Set;
public class Ex4
{
       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> stu = new HashMap<>();
              Ex4 p = new Ex4();
              stu.put("Siri",66);
              stu.put("chinni",79);
              stu.put("Adi",99);
              stu.put("lalli",93);
              stu.put("phani",92);
              System.out.println(p.getStudent(stu));
       }
}

