package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.SecurePaymentDetailDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import java.util.HashMap;

/* renamed from: X.AlL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27163AlL {
    public static void LIZ(FragmentManager fragmentManager, Bundle bundle, PaymentMethodsData paymentMethodsData, HashMap hashMap) {
        ASL LIZ = C249109q6.LIZ(1);
        LIZ.LIZ.LJLLLLLL = (int) C27162AlK.LJFF;
        SecurePaymentDetailDialogFragment securePaymentDetailDialogFragment = new SecurePaymentDetailDialogFragment();
        securePaymentDetailDialogFragment.setArguments(bundle);
        securePaymentDetailDialogFragment.LJLIL = paymentMethodsData;
        securePaymentDetailDialogFragment.LJLILLLLZI = hashMap;
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLLILLLL = securePaymentDetailDialogFragment;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        tuxSheet.show(fragmentManager, "SecurePaymentDetailDialogFragment");
    }
}
