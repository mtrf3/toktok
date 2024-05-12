package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.L7m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53746L7m implements Serializable {
    public final C191427fG LJLIL;
    public final C191427fG LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C53746L7m() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C53746L7m copy$default(C53746L7m c53746L7m, C191427fG c191427fG, C191427fG c191427fG2, int i, Object obj) {
        if ((i & 1) != 0) {
            c191427fG = c53746L7m.LJLIL;
        }
        if ((i & 2) != 0) {
            c191427fG2 = c53746L7m.LJLILLLLZI;
        }
        return c53746L7m.copy(c191427fG, c191427fG2);
    }

    public final C53746L7m copy(C191427fG c191427fG, C191427fG c191427fG2) {
        return new C53746L7m(c191427fG, c191427fG2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53746L7m)) {
            return false;
        }
        C53746L7m c53746L7m = (C53746L7m) obj;
        return o.LJ(this.LJLIL, c53746L7m.LJLIL) && o.LJ(this.LJLILLLLZI, c53746L7m.LJLILLLLZI);
    }

    public int hashCode() {
        C191427fG c191427fG = this.LJLIL;
        int hashCode = (c191427fG == null ? 0 : c191427fG.hashCode()) * 31;
        C191427fG c191427fG2 = this.LJLILLLLZI;
        return hashCode + (c191427fG2 != null ? c191427fG2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MapBounds(southwest=");
        LIZ.append(this.LJLIL);
        LIZ.append(", northeast=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C191427fG getNortheast() {
        return this.LJLILLLLZI;
    }

    public final C191427fG getSouthwest() {
        return this.LJLIL;
    }

    public C53746L7m(C191427fG c191427fG, C191427fG c191427fG2) {
        this.LJLIL = c191427fG;
        this.LJLILLLLZI = c191427fG2;
    }

    public /* synthetic */ C53746L7m(C191427fG c191427fG, C191427fG c191427fG2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c191427fG, (i & 2) != 0 ? null : c191427fG2);
    }
}
