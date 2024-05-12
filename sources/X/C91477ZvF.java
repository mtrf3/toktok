package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZvF, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91477ZvF implements C33Q {
    public final C43I<Boolean> LJLIL;

    public C91477ZvF() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C91477ZvF) && o.LJ(this.LJLIL, ((C91477ZvF) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<Boolean> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicDspUGCButtonState(collectStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91477ZvF(C43I<Boolean> c43i) {
        this.LJLIL = c43i;
    }
}
