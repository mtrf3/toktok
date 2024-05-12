package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AA1 {
    public static AA0 LIZ() {
        if (AA0.LIZJ == null || !o.LJ(AA0.LIZIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
            synchronized (AA0.class) {
                AA0.LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
                AA0.LIZJ = new AA0();
            }
        }
        AA0 aa0 = AA0.LIZJ;
        o.LJI(aa0);
        return aa0;
    }
}
