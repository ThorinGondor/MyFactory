package org.entity.DataBase;

import java.util.List;

public class Test {

	public static void main(String[] args) {
        TopicsService TS = new TopicsServiceImpl();
        TS.deleteTopic(25);
        List<Topic> list =  TS.findAllTopics();
        for(Topic buff:list){
        	System.out.println(buff.getID()+" - - - "+buff.getTopicName());
        }
	}

}
