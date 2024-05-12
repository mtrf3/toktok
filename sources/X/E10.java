package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class E10 {
    public final E11<String, Pattern> LIZ = new E11<>();

    public final Pattern LIZ(String str) {
        Object obj;
        E11<String, Pattern> e11 = this.LIZ;
        synchronized (e11) {
            obj = e11.LIZ.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            Pattern compile = PatternProtector.compile(str);
            this.LIZ.LIZ(str, compile);
            return compile;
        }
        return pattern;
    }
}
