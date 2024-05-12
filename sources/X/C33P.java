package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.33P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33P implements C33Q {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final List<InterfaceC57784Mm4> LJLJI;
    public final C87933cj LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33P)) {
            return false;
        }
        C33P c33p = (C33P) obj;
        return this.LJLIL == c33p.LJLIL && this.LJLILLLLZI == c33p.LJLILLLLZI && o.LJ(this.LJLJI, c33p.LJLJI) && o.LJ(this.LJLJJI, c33p.LJLJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.LJLILLLLZI ? 1 : 0)) * 31;
        List<InterfaceC57784Mm4> list = this.LJLJI;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        C87933cj c87933cj = this.LJLJJI;
        return hashCode + (c87933cj != null ? c87933cj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMSearchDefaultState(resetAnimator=");
        LIZ.append(this.LJLIL);
        LIZ.append(", scrollToTop=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", defaultContentList=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pageLoadData=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33P(boolean z, boolean z2, List<? extends InterfaceC57784Mm4> list, C87933cj c87933cj) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = list;
        this.LJLJJI = c87933cj;
    }

    public static C33P LIZ(C33P c33p, boolean z, boolean z2, List list, C87933cj c87933cj, int i) {
        if ((i & 1) != 0) {
            z = c33p.LJLIL;
        }
        if ((i & 2) != 0) {
            z2 = c33p.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            list = c33p.LJLJI;
        }
        if ((i & 8) != 0) {
            c87933cj = c33p.LJLJJI;
        }
        c33p.getClass();
        return new C33P(z, z2, list, c87933cj);
    }
}
