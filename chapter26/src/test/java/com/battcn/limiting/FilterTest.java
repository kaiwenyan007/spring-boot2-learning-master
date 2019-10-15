package com.battcn.limiting;

import com.battcn.EmojiParser;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Levin
 * @since 2018/7/24 0024
 */
public class FilterTest {


    @Test
    public void testAtomic() throws InterruptedException {
      //  "\uD83C\uDF38Gulnur\u200F☀️";

        String s = "🌸Gulnur‏☀";
        String s1 = EmojiParser.emojiChange(s);
        System.out.println(s1);

    }

}
