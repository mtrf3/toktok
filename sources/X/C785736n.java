package X;

import kotlin.jvm.internal.o;

/* renamed from: X.36n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C785736n implements InterfaceC57784Mm4 {
    public final Y9V LJLIL;
    public final C85993Zb LJLILLLLZI;

    public /* synthetic */ C785736n() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C785736n)) {
            return false;
        }
        C785736n c785736n = (C785736n) obj;
        return o.LJ(this.LJLIL, c785736n.LJLIL) && o.LJ(this.LJLILLLLZI, c785736n.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C85993Zb c85993Zb = this.LJLILLLLZI;
        return hashCode + (c85993Zb == null ? 0 : c85993Zb.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMSearchCommonItem(searchCellDelegate=");
        LIZ.append(this.LJLIL);
        LIZ.append(", searchSortData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C785736n)) {
            return false;
        }
        return this.LJLIL.LJIIIZ(((C785736n) interfaceC57784Mm4).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C785736n)) {
            return false;
        }
        return this.LJLIL.LJII(((C785736n) interfaceC57784Mm4).LJLIL);
    }

    public C785736n(Y9V y9v, C85993Zb c85993Zb) {
        this.LJLIL = y9v;
        this.LJLILLLLZI = c85993Zb;
    }
}
