package X;

import kotlin.jvm.internal.o;

/* renamed from: X.DzO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35678DzO implements C33Q {
    public final SW2 LJLIL;

    public C35678DzO() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35678DzO) && o.LJ(this.LJLIL, ((C35678DzO) obj).LJLIL);
    }

    public final int hashCode() {
        SW2 sw2 = this.LJLIL;
        if (sw2 == null) {
            return 0;
        }
        return sw2.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserBubbleState(updateUserBubble=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C35678DzO(SW2 sw2) {
        this.LJLIL = sw2;
    }
}
