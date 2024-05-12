package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3lr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93593lr {
    public static final SpannableString LIZ(int i, int i2, String str, String keyword) {
        o.LJIIIZ(keyword, "keyword");
        if (s.LJJJLZIJ(keyword, ".", false)) {
            keyword = ujb.o.LJJJJZ(keyword, ".", "\\.", false);
        }
        SpannableString spannableString = new SpannableString(str);
        try {
            Pattern compile = PatternProtector.compile(keyword);
            o.LJIIIIZZ(compile, "{\n            Pattern.compile(keyword)\n        }");
            Matcher matcher = compile.matcher(spannableString);
            if (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (start >= i2) {
                    spannableString.setSpan(new ForegroundColorSpan(i), start, end, 33);
                }
            }
            return spannableString;
        } catch (PatternSyntaxException e) {
            C34B.LJ("HighLightKeyWordUtil", e);
            return spannableString;
        }
    }
}
