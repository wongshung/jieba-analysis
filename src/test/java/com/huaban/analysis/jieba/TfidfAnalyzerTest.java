package com.huaban.analysis.jieba;

import com.qianxinyao.analysis.jieba.keyword.Keyword;
import com.qianxinyao.analysis.jieba.keyword.TFIDFAnalyzer;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * test methods for TFIDFAnalyzer
 *
 * @author Liping
 * @version 1.0.0
 * @date 2020/2/13
 */
public class TfidfAnalyzerTest extends TestCase {
    @Test
    public void testWordExtract() {
        String content="孩子上了幼儿园 安全防拐教育要做好";
        int topN=5;
        TFIDFAnalyzer tfidfAnalyzer=new TFIDFAnalyzer();
        List<Keyword> list=tfidfAnalyzer.analyze(content,topN);
        for(Keyword word:list)
            System.out.println(word.getName()+":"+word.getTfidfvalue()+",");

        Assert.assertTrue(list.size() > 0);
    }
}
