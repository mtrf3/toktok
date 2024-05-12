package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import kotlin.jvm.internal.o;

/* renamed from: X.AdN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26669AdN implements InterfaceC26837Ag5 {
    public final UserRight LJLIL;
    public final PDPReturnPolicyModule LJLILLLLZI;
    public final Boolean LJLJI;

    @Override // X.InterfaceC26837Ag5
    public final String LJJLIL() {
        return "return_policy";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26669AdN)) {
            return false;
        }
        C26669AdN c26669AdN = (C26669AdN) obj;
        return o.LJ(this.LJLIL, c26669AdN.LJLIL) && o.LJ(this.LJLILLLLZI, c26669AdN.LJLILLLLZI) && o.LJ(this.LJLJI, c26669AdN.LJLJI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        PDPReturnPolicyModule pDPReturnPolicyModule = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (pDPReturnPolicyModule == null ? 0 : pDPReturnPolicyModule.hashCode())) * 31;
        Boolean bool = this.LJLJI;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalReturnPolicyVO(returnPolicy=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pdpReturnPolicyModule=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", needDivider=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C26669AdN(UserRight returnPolicy, PDPReturnPolicyModule pDPReturnPolicyModule, Boolean bool) {
        o.LJIIIZ(returnPolicy, "returnPolicy");
        this.LJLIL = returnPolicy;
        this.LJLILLLLZI = pDPReturnPolicyModule;
        this.LJLJI = bool;
    }
}
