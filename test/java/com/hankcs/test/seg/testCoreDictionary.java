package com.hankcs.test.seg;

import com.hankcs.hanlp.corpus.dictionary.DictionaryMaker;

public class testCoreDictionary
{
    public static void main(String[] args)
    {
//        BaseSearcher searcher = CoreDictionary.getSearcher("我是一个程序员");
//        Map.Entry entry;
//        while ((entry = searcher.next()) != null)
//        {
//            System.out.print(searcher.getOffset());
//            System.out.println(entry);
//        }
        DictionaryMaker dictionaryMaker = DictionaryMaker.combineWhenNotInclude(new String[]{"data/dictionary/CoreNatureDictionary.txt", "data/dictionary/CoreDictionary.txt"});
        dictionaryMaker.saveTxtTo("data/dictionary/CoreNatureDictionary.txt");
    }
}