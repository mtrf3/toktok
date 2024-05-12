package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Oct, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62311Oct {
    public static String LIZ(AbstractC62625Ohx content) {
        String str;
        o.LJIIIZ(content, "content");
        String str2 = "";
        if (content instanceof C62313Ocv) {
            C62313Ocv c62313Ocv = (C62313Ocv) content;
            String str3 = c62313Ocv.LIZLLL;
            if (str3 == null || str3.length() == 0) {
                str = c62313Ocv.LJFF;
                if (str == null) {
                    return "";
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(c62313Ocv.LIZLLL);
                LIZ.append(' ');
                String str4 = c62313Ocv.LJFF;
                if (str4 != null) {
                    str2 = str4;
                }
                LIZ.append(str2);
                return X1D.LIZIZ(LIZ);
            }
        } else {
            if (!(content instanceof C62314Ocw)) {
                return "";
            }
            C62314Ocw c62314Ocw = (C62314Ocw) content;
            String str5 = c62314Ocw.LIZJ;
            if (str5 == null || str5.length() == 0) {
                str = c62314Ocw.LJ;
                if (str == null) {
                    return "";
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(c62314Ocw.LIZJ);
                LIZ2.append(' ');
                String str6 = c62314Ocw.LJ;
                if (str6 != null) {
                    str2 = str6;
                }
                LIZ2.append(str2);
                return X1D.LIZIZ(LIZ2);
            }
        }
        return str;
    }
}
