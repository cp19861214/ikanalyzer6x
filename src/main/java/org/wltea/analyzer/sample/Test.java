package org.wltea.analyzer.sample;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

public class Test {
	
	public static List<String> getIKWordTerms(String word,boolean useSmart) {
		List<String> list = new ArrayList<String>();
		try {
			StringReader sr = new StringReader(word);
			IKSegmenter ik = new IKSegmenter(sr, useSmart);

			Lexeme lexeme = null; 
		    while((lexeme = ik.next())!=null) {
		    	list.add(lexeme.getLexemeText());
		  
		    }
		  
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		String word = "双塔框架核心筒+框架剪力墙结构图纸";
		System.out.println(getIKWordTerms(word,false));
		System.out.println(getIKWordTerms(word,true));
	}
}
