package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.B1p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28113B1p {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(FragmentManager fragmentManager, PaymentMethod ccdcPaymentMethod, EnterParams enterParams, InterfaceC65784Pro interfaceC65784Pro, String str, EnumC28021AzB pageType) {
        o.LJIIIZ(ccdcPaymentMethod, "ccdcPaymentMethod");
        o.LJIIIZ(pageType, "pageType");
        CCDCAddCardHalfFragment cCDCAddCardHalfFragment = new CCDCAddCardHalfFragment();
        cCDCAddCardHalfFragment.setCcdcPaymentMethod(ccdcPaymentMethod);
        cCDCAddCardHalfFragment.setEnterParams(enterParams);
        cCDCAddCardHalfFragment.setDismissParent(interfaceC65784Pro);
        cCDCAddCardHalfFragment.setOpenType(str);
        cCDCAddCardHalfFragment.setPageType(pageType);
        cCDCAddCardHalfFragment.show(fragmentManager, "ccdc_add_card_half_fragment");
    }
}
