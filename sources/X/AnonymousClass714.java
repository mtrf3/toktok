package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.714, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass714 {
    public static final Pattern LIZ = PatternProtector.compile("(\\[)([^\\[\\]]+)(])");
    public static final Pattern LIZIZ = PatternProtector.compile("<no_trans>(.+?)</no_trans>");
    public static final C4VR LIZJ = new C4VR();

    public static String LIZ(String str) {
        Matcher matcher = LIZIZ.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (matcher.find()) {
            sb.replace(matcher.start() - i, matcher.end() - i, matcher.group(1));
            i += 21;
        }
        return sb.toString();
    }
}
