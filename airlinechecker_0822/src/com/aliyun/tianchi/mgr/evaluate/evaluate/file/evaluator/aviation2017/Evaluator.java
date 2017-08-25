package com.aliyun.tianchi.mgr.evaluate.evaluate.file.evaluator.aviation2017;


import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by peicheng on 17/6/28.
 */
public class Evaluator {

    public static void main(String[] args) {
    	 String inputDataFilePath = "data/厦航大赛数据20170814.xlsx";
         //String resultDataFilePath = "data/baseline_result_2.csv";
         //String resultDataFilePath = "data/firstresult826.csv";
         String resultDataFilePath = "data/pony_517159.5_240.csv";
         
         
        try {
            //计算所得分数
            InputStream inputDataStream = new FileInputStream(inputDataFilePath);
            InputStream resultDataStream = new FileInputStream(resultDataFilePath);
            ResultEvaluator resultEvaluator = new ResultEvaluator(inputDataStream);
            double score = resultEvaluator.runEvaluation(resultDataStream);
            System.out.println("选手所得分数为：" + score);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
