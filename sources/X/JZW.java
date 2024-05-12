package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZW implements KK7 {
    public final JZX LJLIL;

    public JZW() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JZW) && o.LJ(this.LJLIL, ((JZW) obj).LJLIL);
    }

    public final int hashCode() {
        JZX jzx = this.LJLIL;
        if (jzx == null) {
            return 0;
        }
        return jzx.hashCode();
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateSearchAwemeItemInfoAction(cardItemInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    static {
        C17N.LJJJJLI().CB().LIZIZ(C65352Pkq.LIZ(JZW.class), JZY.LJLIL);
    }

    public JZW(JZX jzx) {
        this.LJLIL = jzx;
    }
}
