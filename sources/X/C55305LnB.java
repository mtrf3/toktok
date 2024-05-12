package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LnB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55305LnB implements C33Q {
    public final List<C55794Lv4> LJLIL;
    public final boolean LJLILLLLZI;

    public C55305LnB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55305LnB)) {
            return false;
        }
        C55305LnB c55305LnB = (C55305LnB) obj;
        return o.LJ(this.LJLIL, c55305LnB.LJLIL) && this.LJLILLLLZI == c55305LnB.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<C55794Lv4> list = this.LJLIL;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductViewState(showProducts=");
        LIZ.append(this.LJLIL);
        LIZ.append(", hideProducts=");
        return C48339Iy7.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C55305LnB(int i) {
        this(null, false);
    }

    public C55305LnB(List<C55794Lv4> list, boolean z) {
        this.LJLIL = list;
        this.LJLILLLLZI = z;
    }
}
