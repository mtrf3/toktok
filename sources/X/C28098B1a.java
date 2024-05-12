package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.B1a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28098B1a {
    public static String LIZ(PaymentMethod paymentMethod) {
        if (paymentMethod == null || paymentMethod.id == null) {
            return null;
        }
        List<PaymentMethod> list = paymentMethod.subPaymentMethods;
        if (list != null && !list.isEmpty()) {
            return null;
        }
        return paymentMethod.LJII();
    }

    public static boolean LIZIZ(PaymentMethod paymentMethod) {
        if ((paymentMethod != null && (!((ArrayList) paymentMethod.LIZLLL()).isEmpty())) || C19N.LJ("standalone_ccdc_add_card", false)) {
            return true;
        }
        return false;
    }
}
