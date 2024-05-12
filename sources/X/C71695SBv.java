package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.SBv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71695SBv implements InterfaceC57784Mm4 {
    public final Address LJLIL;
    public final String LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71695SBv)) {
            return false;
        }
        C71695SBv c71695SBv = (C71695SBv) obj;
        return o.LJ(this.LJLIL, c71695SBv.LJLIL) && o.LJ(this.LJLILLLLZI, c71695SBv.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        Address address = this.LJLIL;
        int hashCode = (address == null ? 0 : address.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("USSameShippingAddressElementItem(shippingAddress=");
        LIZ.append(this.LJLIL);
        LIZ.append(", openType=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C71695SBv(Address address, String str) {
        this.LJLIL = address;
        this.LJLILLLLZI = str;
    }
}
