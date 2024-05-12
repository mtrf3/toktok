package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VS4 {
    public static VS5 LIZ() {
        if (VS5.LIZIZ == null) {
            synchronized (VS5.class) {
                if (VS5.LIZIZ == null) {
                    VS5.LIZIZ = new VS5();
                }
            }
        }
        VS5 vs5 = VS5.LIZIZ;
        if (vs5 != null) {
            return vs5;
        }
        o.LJIIZILJ();
        throw null;
    }
}
