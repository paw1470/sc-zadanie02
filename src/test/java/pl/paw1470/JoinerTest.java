package pl.paw1470;

import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

public class JoinerTest {

    @Test
    public void shouldJoinStrings(){
        String a = "aaaa";
        String b = "bbbbbb";
        Joiner joiner = Joiner.on("&");
        String exoected = "aaaa&bbbbb";

        String result = joiner.join(a, b);

        Assert.assertEquals(exoected, result);
    }
}
