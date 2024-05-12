package X;

import kotlin.jvm.internal.o;

/* renamed from: X.M3n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56191M3n {
    public static C56192M3o LIZ() {
        if (C56192M3o.LIZJ == null || !o.LJ(C56192M3o.LIZIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
            synchronized (C56192M3o.class) {
                C56192M3o.LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
                C56192M3o.LIZJ = new C56192M3o();
            }
        }
        C56192M3o c56192M3o = C56192M3o.LIZJ;
        if (c56192M3o != null) {
            return c56192M3o;
        }
        "Require instance of BindPhonePopKeva must not be null".toString();
        throw new IllegalArgumentException("Require instance of BindPhonePopKeva must not be null");
    }
}
