package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public class AqS42S1000000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS42S1000000_4 aqS42S1000000_4) {
        return PaymentCacheHelper.LIZIZ.get(aqS42S1000000_4.s0);
    }

    public static final Object invoke$1(AqS42S1000000_4 aqS42S1000000_4) {
        String str;
        PaymentInfo next;
        LinkedList<PaymentInfo> linkedList = PaymentCacheHelper.LIZJ;
        String str2 = aqS42S1000000_4.s0;
        Iterator<PaymentInfo> it = linkedList.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            PaymentMethod paymentMethod = next.paymentMethod;
            if (paymentMethod != null) {
                str = paymentMethod.LJFF();
            }
        } while (!o.LJ(str, str2));
        return next;
    }

    public static final Object invoke$2(AqS42S1000000_4 aqS42S1000000_4) {
        String str;
        Iterator<PaymentInfo> it = PaymentCacheHelper.LIZJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PaymentInfo next = it.next();
            PaymentMethod paymentMethod = next.paymentMethod;
            if (paymentMethod != null) {
                str = paymentMethod.LJFF();
            } else {
                str = null;
            }
            if (o.LJ(str, aqS42S1000000_4.s0)) {
                PaymentCacheHelper.LIZJ.remove(next);
                break;
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS42S1000000_4(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
