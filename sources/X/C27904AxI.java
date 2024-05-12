package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.StarlingKeyValue;
import com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AxI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27904AxI extends AbstractC65781Prl implements InterfaceC88475Ynv<AML, Boolean, PaymentInfo, Boolean, C26566Abi, C76800UCe> {
    public final /* synthetic */ OrderSubmitBottomWidget LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27904AxI(View view, OrderSubmitBottomWidget orderSubmitBottomWidget) {
        super(5);
        this.LJLIL = orderSubmitBottomWidget;
        this.LJLILLLLZI = view;
    }

    @Override // X.InterfaceC88475Ynv
    public final C76800UCe invoke(AML selectSubscribe, Boolean bool, PaymentInfo paymentInfo, Boolean bool2, C26566Abi c26566Abi) {
        String str;
        StarlingKeyValue placeOrderButtonText;
        BillInfoData billInfoData;
        StarlingKeyValue placeOrderButtonText2;
        BillInfoData billInfoData2;
        Integer num;
        int i;
        String str2;
        PaymentMethod paymentMethod;
        boolean z;
        Boolean bool3;
        boolean booleanValue = bool.booleanValue();
        PaymentInfo paymentInfo2 = paymentInfo;
        boolean booleanValue2 = bool2.booleanValue();
        C26566Abi c26566Abi2 = c26566Abi;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!this.LJLIL.getViewModel().LLJJLIIIJLLLLLLLZ) {
            ((SY4) this.LJLILLLLZI.findViewById(R.id.hqz)).setLoading(false);
            if (this.LJLIL.getBottomBarStyle().getCheckPlaceOrderEnableState()) {
                SY4 sy4 = (SY4) this.LJLILLLLZI.findViewById(R.id.hqz);
                if (booleanValue && paymentInfo2 != null && (bool3 = paymentInfo2.isValid) != null && bool3.booleanValue() && booleanValue2 && (c26566Abi2 == null || !o.LJ(c26566Abi2.LJIIJ, Boolean.FALSE))) {
                    z = true;
                } else {
                    z = false;
                }
                sy4.setEnabled(z);
                ((SY4) this.LJLILLLLZI.findViewById(R.id.hqz)).setSupportClickWhenDisable(true);
            } else {
                ((SY4) this.LJLILLLLZI.findViewById(R.id.hqz)).setSupportClickWhenDisable(false);
            }
            String str3 = "place_order";
            String str4 = null;
            if (!booleanValue) {
                str = "add_shipping_address";
            } else if (paymentInfo2 == null && ((billInfoData = this.LJLIL.getViewModel().LJZ) == null || !C1XY.LJJII(billInfoData))) {
                str = "add_payment_method";
            } else {
                BillInfoData billInfoData3 = this.LJLIL.getViewModel().LJZ;
                if (billInfoData3 != null && (placeOrderButtonText = billInfoData3.getPlaceOrderButtonText()) != null) {
                    str = placeOrderButtonText.key;
                } else {
                    str = null;
                }
                if (o.LJ(str, "ecom_order_summary_button_placeorder")) {
                    str = "place_order";
                } else if (o.LJ(str, "ecom_order_summary_button_paynow")) {
                    str = "pay_now";
                } else if (str == null) {
                    str = "";
                }
            }
            if (!o.LJ(str, this.LJLIL.previousButtonName)) {
                if (paymentInfo2 != null && (paymentMethod = paymentInfo2.paymentMethod) != null) {
                    str2 = paymentMethod.LJFF();
                } else {
                    str2 = null;
                }
                Boolean valueOf = Boolean.valueOf(o.LJ(str2, this.LJLIL.getViewModel().LLJL));
                if (o.LJ(str, "add_shipping_address") || o.LJ(str, "add_payment_method")) {
                    str3 = "next";
                    valueOf = null;
                }
                C27949Ay1.LJIJI(str, str3, this.LJLIL.getViewModel().fw0(false), null, null, valueOf, null, 3568);
                this.LJLIL.previousButtonName = str;
            }
            if (!booleanValue && (((num = this.LJLIL.getViewModel().LLJI) == null || num.intValue() != 1) && !this.LJLIL.getBottomBarStyle().getCheckPlaceOrderEnableState())) {
                TextView textView = (TextView) this.LJLILLLLZI.findViewById(R.id.hqz);
                Context context = this.LJLILLLLZI.getContext();
                if (C27920AxY.LIZ()) {
                    i = R.string.r_a;
                } else {
                    i = R.string.r9x;
                }
                textView.setText(context.getString(i));
            } else if (paymentInfo2 != null || this.LJLIL.getBottomBarStyle().getCheckPlaceOrderEnableState() || ((billInfoData2 = this.LJLIL.getViewModel().LJZ) != null && C1XY.LJJII(billInfoData2))) {
                TextView textView2 = (TextView) this.LJLILLLLZI.findViewById(R.id.hqz);
                BillInfoData billInfoData4 = this.LJLIL.getViewModel().LJZ;
                if (billInfoData4 != null && (placeOrderButtonText2 = billInfoData4.getPlaceOrderButtonText()) != null) {
                    str4 = placeOrderButtonText2.value;
                }
                textView2.setText(str4);
            } else {
                ((TextView) this.LJLILLLLZI.findViewById(R.id.hqz)).setText(this.LJLILLLLZI.getContext().getString(R.string.fep));
            }
        }
        return C76800UCe.LIZ;
    }
}
