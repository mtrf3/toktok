package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.OOv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61841OOv {
    public static final String LIZ(CommuteType commuteType) {
        switch (C61840OOu.LIZ[commuteType.ordinal()]) {
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "7";
            case 6:
                return "8";
            case 7:
                return "9";
            case 8:
                return "10";
            default:
                throw new C162476Zf();
        }
    }

    public static final boolean LIZIZ(PaymentMethod paymentMethod, PaymentMethod paymentMethod2) {
        if (paymentMethod2 == null) {
            if (paymentMethod == null) {
                return true;
            }
            return false;
        }
        if (paymentMethod == null) {
            return false;
        }
        return o.LJ(paymentMethod.LJFF(), paymentMethod2.LJFF());
    }
}
