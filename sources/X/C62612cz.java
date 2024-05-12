package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ujb.o;
import ujb.s;

/* renamed from: X.2cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62612cz {
    public static final Pattern LIZ = PatternProtector.compile("/(data|user)/.+?/files/[\\w-]+/[a-zA-Z0-9]+/([\\w-]+)/[a-zA-Z0-9]+/res/([^?]+)");

    public static String LIZ(String str) {
        String str2;
        String str3;
        String LIZIZ;
        String str4 = "";
        if (str == null) {
            return "";
        }
        try {
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (o.LJJJLIIL(str, "http", false)) {
            LIZIZ = (String) ORZ.LJLLJ(s.LJLJJL(str, new String[]{"?"}, 0, 6));
        } else {
            if (o.LJJJLIIL(str, "/data", false)) {
                Matcher matcher = LIZ.matcher(str);
                if (!matcher.find()) {
                    str2 = "";
                    str3 = "";
                } else {
                    str3 = matcher.group(2);
                    kotlin.jvm.internal.o.LJFF(str3, "matcher.group(2)");
                    str2 = matcher.group(3);
                    kotlin.jvm.internal.o.LJFF(str2, "matcher.group(3)");
                }
                if ((!o.LJJJJJL(str3)) && (!o.LJJJJJL(str2))) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('/');
                    LIZ2.append(str3);
                    LIZ2.append('/');
                    LIZ2.append(str2);
                    LIZIZ = X1D.LIZIZ(LIZ2);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
            return str4;
        }
        str4 = LIZIZ;
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return str4;
    }
}
