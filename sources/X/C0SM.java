package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0SM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SM {
    public final long LIZ;
    public final InterfaceC09420Yo LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (C61876OQe.LIZJ(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OverscrollConfiguration(glowColor=");
        C78920UyC.LJ(this.LIZ, LIZ, ", drawPadding=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C0SM() {
        long LJFF = C78897Uxp.LJFF(4284900966L);
        C1P9 LIZ = C70657RoD.LIZ(0.0f, 0.0f, 3);
        this.LIZ = LJFF;
        this.LIZIZ = LIZ;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C0SM.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C0SM c0sm = (C0SM) obj;
        if (C11850dJ.LIZJ(this.LIZ, c0sm.LIZ) && o.LJ(this.LIZIZ, c0sm.LIZIZ)) {
            return true;
        }
        return false;
    }
}
