package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.L7n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53747L7n implements Serializable {
    public final C191427fG LJLIL;
    public final C191427fG LJLILLLLZI;
    public final C191427fG LJLJI;
    public final C191427fG LJLJJI;
    public final C53746L7m LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C53747L7n() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C53747L7n copy$default(C53747L7n c53747L7n, C191427fG c191427fG, C191427fG c191427fG2, C191427fG c191427fG3, C191427fG c191427fG4, C53746L7m c53746L7m, int i, Object obj) {
        if ((i & 1) != 0) {
            c191427fG = c53747L7n.LJLIL;
        }
        if ((i & 2) != 0) {
            c191427fG2 = c53747L7n.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c191427fG3 = c53747L7n.LJLJI;
        }
        if ((i & 8) != 0) {
            c191427fG4 = c53747L7n.LJLJJI;
        }
        if ((i & 16) != 0) {
            c53746L7m = c53747L7n.LJLJJL;
        }
        return c53747L7n.copy(c191427fG, c191427fG2, c191427fG3, c191427fG4, c53746L7m);
    }

    public final C53747L7n copy(C191427fG c191427fG, C191427fG c191427fG2, C191427fG c191427fG3, C191427fG c191427fG4, C53746L7m c53746L7m) {
        return new C53747L7n(c191427fG, c191427fG2, c191427fG3, c191427fG4, c53746L7m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53747L7n)) {
            return false;
        }
        C53747L7n c53747L7n = (C53747L7n) obj;
        return o.LJ(this.LJLIL, c53747L7n.LJLIL) && o.LJ(this.LJLILLLLZI, c53747L7n.LJLILLLLZI) && o.LJ(this.LJLJI, c53747L7n.LJLJI) && o.LJ(this.LJLJJI, c53747L7n.LJLJJI) && o.LJ(this.LJLJJL, c53747L7n.LJLJJL);
    }

    public int hashCode() {
        C191427fG c191427fG = this.LJLIL;
        int hashCode = (c191427fG == null ? 0 : c191427fG.hashCode()) * 31;
        C191427fG c191427fG2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c191427fG2 == null ? 0 : c191427fG2.hashCode())) * 31;
        C191427fG c191427fG3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (c191427fG3 == null ? 0 : c191427fG3.hashCode())) * 31;
        C191427fG c191427fG4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c191427fG4 == null ? 0 : c191427fG4.hashCode())) * 31;
        C53746L7m c53746L7m = this.LJLJJL;
        return hashCode4 + (c53746L7m != null ? c53746L7m.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MapVisibleRegion(nearLeft=");
        LIZ.append(this.LJLIL);
        LIZ.append(", nearRight=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", farLeft=");
        LIZ.append(this.LJLJI);
        LIZ.append(", farRight=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", bounds=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C53746L7m getBounds() {
        return this.LJLJJL;
    }

    public final C191427fG getFarLeft() {
        return this.LJLJI;
    }

    public final C191427fG getFarRight() {
        return this.LJLJJI;
    }

    public final C191427fG getNearLeft() {
        return this.LJLIL;
    }

    public final C191427fG getNearRight() {
        return this.LJLILLLLZI;
    }

    public C53747L7n(C191427fG c191427fG, C191427fG c191427fG2, C191427fG c191427fG3, C191427fG c191427fG4, C53746L7m c53746L7m) {
        this.LJLIL = c191427fG;
        this.LJLILLLLZI = c191427fG2;
        this.LJLJI = c191427fG3;
        this.LJLJJI = c191427fG4;
        this.LJLJJL = c53746L7m;
    }

    public /* synthetic */ C53747L7n(C191427fG c191427fG, C191427fG c191427fG2, C191427fG c191427fG3, C191427fG c191427fG4, C53746L7m c53746L7m, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c191427fG, (i & 2) != 0 ? null : c191427fG2, (i & 4) != 0 ? null : c191427fG3, (i & 8) != 0 ? null : c191427fG4, (i & 16) == 0 ? c53746L7m : null);
    }
}
