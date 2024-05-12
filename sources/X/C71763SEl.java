package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.SEl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71763SEl implements InterfaceC87283bg {
    public final String LJLIL;
    public final PaymentMethod LJLILLLLZI;
    public final boolean LJLJI;
    public final EnterParams LJLJJI;
    public final C27593AsH LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71763SEl)) {
            return false;
        }
        C71763SEl c71763SEl = (C71763SEl) obj;
        return o.LJ(this.LJLIL, c71763SEl.LJLIL) && o.LJ(this.LJLILLLLZI, c71763SEl.LJLILLLLZI) && this.LJLJI == c71763SEl.LJLJI && o.LJ(this.LJLJJI, c71763SEl.LJLJJI) && o.LJ(this.LJLJJL, c71763SEl.LJLJJL) && o.LJ(this.LJLJJLL, c71763SEl.LJLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentMethod paymentMethod = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJLJJLL.hashCode() + ((this.LJLJJL.hashCode() + ((this.LJLJJI.hashCode() + ((hashCode2 + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubPaymentListHierarchyData(checkedSubPaymentMethodId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", parentPaymentMethod=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isFromOsp=");
        LIZ.append(this.LJLJI);
        LIZ.append(", enterParams=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", subPaymentListLogger=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", buttonClick=");
        return C06540Nm.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public C71763SEl(String str, PaymentMethod paymentMethod, boolean z, EnterParams enterParams, C27593AsH subPaymentListLogger, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(enterParams, "enterParams");
        o.LJIIIZ(subPaymentListLogger, "subPaymentListLogger");
        this.LJLIL = str;
        this.LJLILLLLZI = paymentMethod;
        this.LJLJI = z;
        this.LJLJJI = enterParams;
        this.LJLJJL = subPaymentListLogger;
        this.LJLJJLL = interfaceC65784Pro;
    }
}
