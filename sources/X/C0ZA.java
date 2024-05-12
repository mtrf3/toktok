package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0ZA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZA {
    public static final C51171zd LIZ(C51171zd c51171zd) {
        C51171zd LIZ;
        switch (C0Z9.LIZ[c51171zd.LJLJJI.ordinal()]) {
            case 1:
            case 2:
                return c51171zd;
            case 3:
            case 4:
                C51171zd c51171zd2 = c51171zd.LJLJJL;
                if (c51171zd2 != null && (LIZ = LIZ(c51171zd2)) != null) {
                    return LIZ;
                }
                "no child".toString();
                throw new IllegalStateException("no child");
            case 5:
            case 6:
                return null;
            default:
                throw new C162476Zf();
        }
    }

    public static final void LIZIZ(C51171zd c51171zd) {
        C0ZH.LIZ(c51171zd);
        C25710zf<C51171zd> c25710zf = c51171zd.LJLJI;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            C51171zd[] c51171zdArr = c25710zf.LJLIL;
            o.LJII(c51171zdArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                LIZIZ(c51171zdArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }
}
