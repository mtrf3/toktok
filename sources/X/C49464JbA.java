package X;

import com.ss.android.ugc.aweme.search.ecom.data.Product;
import kotlin.jvm.internal.o;

/* renamed from: X.JbA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49464JbA implements InterfaceC57784Mm4 {
    public final Product LJLIL;
    public final InterfaceC49468JbE LJLILLLLZI;
    public final InterfaceC49469JbF LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49464JbA)) {
            return false;
        }
        C49464JbA c49464JbA = (C49464JbA) obj;
        return o.LJ(this.LJLIL, c49464JbA.LJLIL) && o.LJ(this.LJLILLLLZI, c49464JbA.LJLILLLLZI) && o.LJ(this.LJLJI, c49464JbA.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        InterfaceC49468JbE interfaceC49468JbE = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (interfaceC49468JbE == null ? 0 : interfaceC49468JbE.hashCode())) * 31;
        InterfaceC49469JbF interfaceC49469JbF = this.LJLJI;
        return hashCode2 + (interfaceC49469JbF != null ? interfaceC49469JbF.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductItem(product=");
        LIZ.append(this.LJLIL);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showListener=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C49464JbA(Product product, InterfaceC49468JbE interfaceC49468JbE, InterfaceC49469JbF interfaceC49469JbF) {
        this.LJLIL = product;
        this.LJLILLLLZI = interfaceC49468JbE;
        this.LJLJI = interfaceC49469JbF;
    }
}
