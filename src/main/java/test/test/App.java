package test.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Student> list=new ArrayList<Student>();
        Student s1=new Student();
        s1.setAge("21");
        s1.setName("dd");
        Student s2=new Student();
        s2.setAge("21");
        s2.setName("dd");
        list.add(s1);
        list.add(s2);
        
        //JSONObject o=JSONObject.fromObject(list);
        
        //JSONArray a=JSONArray.fromObject(list);
        //System.out.println(o.toString());
        //System.out.println(a.toString());
        
        
        File file=new File("E:\\uploadss");
        if(!file.exists()){
        	System.out.println(file.mkdirs());
        }
        
        String ss="qwerty";
//        System.out.println(ss.substring(0,6));
        
        String[] aa=new String[]{"a","b","c","d","e"};
        List<String> l=new ArrayList<String>(Arrays.asList(aa));
        Iterator<String> iter=l.iterator();
        int i=0;
        while(iter.hasNext()){
        	iter.next();
        	if(i==3){
        		iter.remove();
//        		System.out.println(l.size());
        	}
        	i++;
        }
        
        
        String s="a/b/c/d/";
        System.out.println(s.substring(0, s.lastIndexOf("/")));
        
        
        
        Map<String,String> m=new HashMap<String, String>();
        m.put("a", "aa");
        m.put("b", "bb");
        
        Map<String,String> m2=new HashMap<String, String>(m);
       
        m2.put("a", "bb");
        System.out.println(m);
        System.out.println(m2);
        
        
        
        
        
        
    }
}
