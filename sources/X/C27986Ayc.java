package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingFragmentEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ayc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27986Ayc extends TAT {
    public final /* synthetic */ BillingAddressFragment LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27986Ayc(BillingAddressFragment billingAddressFragment) {
        super(700L);
        this.LJLJJI = billingAddressFragment;
    }

    @Override // X.TAT
    public final void LIZ(View view) {
        BillingFragmentEnterParams billingFragmentEnterParams;
        PaymentInfo paymentInfo;
        List<PaymentElement> list;
        String str;
        EnumC27826Aw2 enumC27826Aw2;
        if (view != null) {
            BillingAddressViewModel billingAddressViewModel = (BillingAddressViewModel) this.LJLJJI.LJLILLLLZI.getValue();
            if (billingAddressViewModel.jv0() == null || (billingFragmentEnterParams = billingAddressViewModel.LJLILLLLZI) == null || (paymentInfo = billingFragmentEnterParams.getPaymentInfo()) == null) {
                return;
            }
            String str2 = null;
            Object obj = null;
            if (billingAddressViewModel.qv0()) {
                C27493Aqf.LIZIZ("confirm", ORZ.LLD(billingAddressViewModel.LJLJJLL, ",", null, null, null, 62));
                List<InterfaceC57784Mm4> list2 = billingAddressViewModel.getState().LJLJJL;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC57784Mm4 interfaceC57784Mm4 : list2) {
                        if (interfaceC57784Mm4 instanceof SB1) {
                            arrayList.add(interfaceC57784Mm4);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (C78685UuP.LJJJZ(((SB1) next).LJLILLLLZI.LIZJ)) {
                            obj = next;
                            break;
                        }
                    }
                    SB1 sb1 = (SB1) obj;
                    if (sb1 != null) {
                        sb1.LJLJI = true;
                    }
                }
                billingAddressViewModel.setState(C28029AzJ.LJLIL);
                return;
            }
            java.util.Map<String, List<PaymentElement>> map = billingAddressViewModel.LJLIL;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
            while (it2.hasNext()) {
                ORS.LJJLIIIJILLIZJL((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList2);
            }
            SAN san = SAN.LIZ;
            PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo != null) {
                list = paymentMethodInfo.getPaymentElements();
            } else {
                list = null;
            }
            san.getClass();
            List<PaymentElement> LJI = SAN.LJI(list, arrayList2);
            PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo2 != null) {
                paymentMethodInfo2.setPaymentElements(LJI);
            }
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod != null) {
                str = paymentMethod.LJFF();
            } else {
                str = null;
            }
            PaymentCacheHelper.LIZ(str, arrayList2);
            BillingFragmentEnterParams billingFragmentEnterParams2 = billingAddressViewModel.LJLILLLLZI;
            if (billingFragmentEnterParams2 != null) {
                enumC27826Aw2 = billingFragmentEnterParams2.getOpenFrom();
            } else {
                enumC27826Aw2 = null;
            }
            if (enumC27826Aw2 == EnumC27826Aw2.ADD_NEW_CARD) {
                PaymentCacheHelper.LIZIZ(paymentInfo);
                BillingFragmentEnterParams billingFragmentEnterParams3 = billingAddressViewModel.LJLILLLLZI;
                if (billingFragmentEnterParams3 != null) {
                    str2 = billingFragmentEnterParams3.getOldKey();
                }
                C2U8.LIZ(new C27985Ayb(paymentInfo, "ADD_NEW_CARD", str2));
            } else {
                PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
                if (paymentMethod2 != null && paymentMethod2.LIZIZ) {
                    PaymentCacheHelper.LIZIZ(paymentInfo);
                }
                C2U8.LIZ(new C27985Ayb(paymentInfo, "EDIT_CCDC_BILLING_ADDRESS", 4));
            }
            billingAddressViewModel.setState(C28030AzK.LJLIL);
            C27493Aqf.LIZIZ("confirm", "1");
        }
    }
}
