package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.SBt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71693SBt implements InterfaceC87283bg {
    public final PaymentMethod LJLIL;
    public final EnterParams LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71693SBt)) {
            return false;
        }
        C71693SBt c71693SBt = (C71693SBt) obj;
        return o.LJ(this.LJLIL, c71693SBt.LJLIL) && o.LJ(this.LJLILLLLZI, c71693SBt.LJLILLLLZI) && o.LJ(this.LJLJI, c71693SBt.LJLJI) && o.LJ(this.LJLJJI, c71693SBt.LJLJJI) && o.LJ(this.LJLJJL, c71693SBt.LJLJJL);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LJLIL;
        int hashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        EnterParams enterParams = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (enterParams == null ? 0 : enterParams.hashCode())) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJI;
        int hashCode3 = (hashCode2 + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode())) * 31;
        String str = this.LJLJJI;
        return this.LJLJJL.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ATMCardHierarchyData(paymentMethod=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterParams=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", dismissParent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", openType=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", logBtName=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public C71693SBt(PaymentMethod paymentMethod, EnterParams enterParams, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str, String logBtName) {
        o.LJIIIZ(logBtName, "logBtName");
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = enterParams;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = str;
        this.LJLJJL = logBtName;
    }
}
