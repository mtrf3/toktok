package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SBI implements InterfaceC57784Mm4 {
    public final Address LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public SBI(Address address, boolean z) {
        this.LJLIL = address;
        this.LJLILLLLZI = z;
    }
}
