package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4lS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118824lS {
    public static final Pattern LIZ = PatternProtector.compile("(\\[)([^\\[\\]]+)(])");
    public static final C4VR LIZIZ = new C4VR();
    public static final Pattern LIZJ = PatternProtector.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)");

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            int length = str.length();
            Matcher matcher = LIZJ.matcher(str);
            int i = 0;
            int i2 = 0;
            while (matcher.find()) {
                i2 += matcher.group().length();
                i++;
            }
            if (i != 1 || i2 != length) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int LIZIZ(String str) {
        C4VR c4vr = LIZIZ;
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            int length = str.length();
            Matcher matcher = LIZJ.matcher(str);
            int i = 0;
            while (matcher.find()) {
                i += matcher.group().length();
            }
            if (i != length) {
                Matcher matcher2 = LIZ.matcher(str);
                while (matcher2.find()) {
                    String group = matcher2.group();
                    if (c4vr.LIZJ(group)) {
                        i += group.length();
                    }
                }
                if (i == 0) {
                    return 0;
                }
                if (i != length) {
                    return 2;
                }
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if (r14 == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.text.Editable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.widget.TextView r15, android.text.TextWatcher r16) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118824lS.LIZJ(android.widget.TextView, android.text.TextWatcher):void");
    }

    public static List<C118834lT> LIZLLL(Context context, String str) {
        if ((context == null && (context = C84763XOl.LJIIIIZZ()) == null) || TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = LIZ.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            Drawable LIZ2 = LIZIZ.LIZ(context, group);
            if (LIZ2 != null) {
                arrayList.add(new C118834lT(matcher.start(), matcher.end(), group, LIZ2));
            }
        }
        return arrayList;
    }
}
