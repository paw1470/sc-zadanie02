package pl.paw1470;

import com.google.common.base.Splitter;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SplitterTest {
    @Test
    public void shouldSplitString(){
        String text = "The Guava project contains several";
        Splitter splitter = Splitter.on(" ");
        String[] expectedSplittedValues = {"The", "Guava", "project", "contains", "several"};

        List<String> splittedList = splitter.splitToList(text);

        Assert.assertArrayEquals(splittedList.toArray(), expectedSplittedValues);
    }
}
