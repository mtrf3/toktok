package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;

/* loaded from: classes13.dex */
public final class SAE {
    public static final String LIZ(PayResult payResult) {
        if (payResult != null) {
            switch (SAD.LIZ[payResult.ordinal()]) {
                case 1:
                    return "1";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "7";
                case 7:
                    return "8";
            }
        }
        return null;
    }
}
