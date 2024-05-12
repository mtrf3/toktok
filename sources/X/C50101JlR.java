package X;

import ujb.o;

/* renamed from: X.JlR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50101JlR {
    public static int LIZ(String str) {
        if (str == null || o.LJJJJJL(str)) {
            return 3;
        }
        Integer num = C50102JlS.LJIILL.get(str);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public static void LIZIZ(String str) {
        if (str == null || o.LJJJJJL(str)) {
            return;
        }
        C50102JlS.LJIILL.remove(str);
    }
}
