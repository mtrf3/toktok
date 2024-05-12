package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9AX, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9AX implements C33Q {
    public final Long LJLIL;
    public final Long LJLILLLLZI;

    public C9AX() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9AX)) {
            return false;
        }
        C9AX c9ax = (C9AX) obj;
        return o.LJ(this.LJLIL, c9ax.LJLIL) && o.LJ(this.LJLILLLLZI, c9ax.LJLILLLLZI);
    }

    public final int hashCode() {
        Long l = this.LJLIL;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.LJLILLLLZI;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveBubbleState(updateLiveCountBubble=");
        LIZ.append(this.LJLIL);
        LIZ.append(", updateVideDurationBubble=");
        return JBR.LJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C9AX(Long l, Long l2) {
        this.LJLIL = l;
        this.LJLILLLLZI = l2;
    }
}
