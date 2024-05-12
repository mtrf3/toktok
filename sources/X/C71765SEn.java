package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SEn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71765SEn implements C33Q {
    public final String LJLIL;
    public final PaymentMethod LJLILLLLZI;
    public final List<PaymentMethod> LJLJI;
    public final PaymentMethod LJLJJI;

    public C71765SEn() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71765SEn)) {
            return false;
        }
        C71765SEn c71765SEn = (C71765SEn) obj;
        return o.LJ(this.LJLIL, c71765SEn.LJLIL) && o.LJ(this.LJLILLLLZI, c71765SEn.LJLILLLLZI) && o.LJ(this.LJLJI, c71765SEn.LJLJI) && o.LJ(this.LJLJJI, c71765SEn.LJLJJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentMethod paymentMethod = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        List<PaymentMethod> list = this.LJLJI;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PaymentMethod paymentMethod2 = this.LJLJJI;
        return hashCode3 + (paymentMethod2 != null ? paymentMethod2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubPaymentListState(inputText=");
        LIZ.append(this.LJLIL);
        LIZ.append(", parentPaymentMethod=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", subPaymentMethodList=");
        LIZ.append(this.LJLJI);
        LIZ.append(", checkedSubPaymentMethod=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C71765SEn(String str, PaymentMethod paymentMethod, List<PaymentMethod> list, PaymentMethod paymentMethod2) {
        this.LJLIL = str;
        this.LJLILLLLZI = paymentMethod;
        this.LJLJI = list;
        this.LJLJJI = paymentMethod2;
    }

    public static C71765SEn LIZ(C71765SEn c71765SEn, PaymentMethod paymentMethod, List list, PaymentMethod paymentMethod2, int i) {
        String str;
        if ((i & 1) != 0) {
            str = c71765SEn.LJLIL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            paymentMethod = c71765SEn.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            list = c71765SEn.LJLJI;
        }
        if ((i & 8) != 0) {
            paymentMethod2 = c71765SEn.LJLJJI;
        }
        c71765SEn.getClass();
        return new C71765SEn(str, paymentMethod, list, paymentMethod2);
    }
}
