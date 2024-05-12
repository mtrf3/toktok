package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import kotlin.jvm.internal.o;

/* renamed from: X.AdO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26670AdO implements InterfaceC26837Ag5 {
    public final UserRight LJLIL;
    public final PDPReturnPolicyModule LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.InterfaceC26837Ag5
    public final String LJJLIL() {
        return "retailer_policies";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26670AdO)) {
            return false;
        }
        C26670AdO c26670AdO = (C26670AdO) obj;
        return o.LJ(this.LJLIL, c26670AdO.LJLIL) && o.LJ(this.LJLILLLLZI, c26670AdO.LJLILLLLZI) && this.LJLJI == c26670AdO.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        PDPReturnPolicyModule pDPReturnPolicyModule = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (pDPReturnPolicyModule == null ? 0 : pDPReturnPolicyModule.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductReturnPolicyVO(userRight=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pdpReturnPolicyModule=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", showDivider=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C26670AdO(UserRight userRight, PDPReturnPolicyModule pDPReturnPolicyModule, boolean z) {
        o.LJIIIZ(userRight, "userRight");
        this.LJLIL = userRight;
        this.LJLILLLLZI = pDPReturnPolicyModule;
        this.LJLJI = z;
    }
}
