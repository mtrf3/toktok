package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1T extends FrameLayout {
    public HashMap<String, Object> LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public PaymentInfo LJLJJI;
    public PaymentMethod LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setPaymentInfoFromOSP(Boolean bool) {
    }

    public final HashMap<String, Object> getGeneralParams() {
        return this.LJLIL;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnBalanceClickListener() {
        return this.LJLJI;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnCheckedListener() {
        return this.LJLILLLLZI;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.LJLJJI;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.LJLJJL;
    }

    public B1T(Context context) {
        super(context, null, 0);
        this.LJLIL = new HashMap<>();
        this.LJLILLLLZI = C28137B2n.LJLIL;
        this.LJLJI = C28136B2m.LJLIL;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.z_, this, true);
    }

    public final void setChecked(boolean z) {
        String str;
        List<ElementDTO> LJIIJ;
        ElementDTO elementDTO;
        SD6 sd6;
        String str2;
        String str3;
        List<PaymentElement> list;
        String str4;
        BindInfo bindInfo;
        String str5;
        PaymentMethod paymentMethod = this.LJLJJL;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (!o.LJ(str, "pm_pi_ccdc_all")) {
            PaymentMethod paymentMethod2 = this.LJLJJL;
            if (paymentMethod2 == null || (bindInfo = paymentMethod2.bindInfo) == null || (str5 = bindInfo.buttonText) == null || str5.length() == 0) {
                ((C63044Ooi) LIZ(R.id.iln)).setChecked(z);
                if (z) {
                    PaymentMethod paymentMethod3 = this.LJLJJL;
                    if (paymentMethod3 != null && (str4 = paymentMethod3.balance) != null && C78857UxB.LJJJIL(str4)) {
                        View llBalanceLayout = LIZ(R.id.g0j);
                        o.LJIIIIZZ(llBalanceLayout, "llBalanceLayout");
                        OUP.LJJLIIIJ(llBalanceLayout);
                        ((TextView) LIZ(R.id.lvj)).setText(str4);
                        View llBalanceLayout2 = LIZ(R.id.g0j);
                        o.LJIIIIZZ(llBalanceLayout2, "llBalanceLayout");
                        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 86, 42), llBalanceLayout2);
                    }
                    PaymentMethod paymentMethod4 = this.LJLJJL;
                    if (paymentMethod4 != null && (LJIIJ = paymentMethod4.LJIIJ()) != null && (elementDTO = (ElementDTO) ORZ.LJLLLL(LJIIJ)) != null) {
                        View superElement = LIZ(R.id.kty);
                        o.LJIIIIZZ(superElement, "superElement");
                        OUP.LJJLIIIJ(superElement);
                        B1V b1v = (B1V) LIZ(R.id.kty);
                        PaymentInfo paymentInfo = this.LJLJJI;
                        if (paymentInfo == null) {
                            PaymentMethod paymentMethod5 = this.LJLJJL;
                            if (paymentMethod5 != null) {
                                str2 = paymentMethod5.id;
                                str3 = paymentMethod5.token;
                                list = paymentMethod5.LJIILLIIL();
                            } else {
                                str2 = null;
                                str3 = null;
                                list = null;
                            }
                            paymentInfo = new PaymentInfo(new PaymentMethodInfo(str2, str3, list, null, null, null, null, 64, null), paymentMethod5, null, null, null, null, 56, null);
                        }
                        b1v.LIZ(elementDTO, paymentInfo);
                        ((B1V) LIZ(R.id.kty)).setLogVerify(new AqS135S0200000_4(elementDTO, this, 207));
                        B1Z element = ((B1V) LIZ(R.id.kty)).getElement();
                        if ((element instanceof SD6) && (sd6 = (SD6) element) != null) {
                            sd6.setOnFocusChange(new AqS135S0200000_4(elementDTO, sd6, 208));
                            if (o.LJ(elementDTO.id, "eg_ccdc_global_cvv")) {
                                sd6.getInputView().setInputType(2);
                                sd6.getInputView().setMaxLength(4);
                                return;
                            } else {
                                sd6.getInputView().setInputType(1);
                                sd6.getInputView().setMaxLength(Integer.MAX_VALUE);
                                return;
                            }
                        }
                        return;
                    }
                    View superElement2 = LIZ(R.id.kty);
                    o.LJIIIIZZ(superElement2, "superElement");
                    OUP.LJIJJLI(superElement2);
                    return;
                }
                View llBalanceLayout3 = LIZ(R.id.g0j);
                o.LJIIIIZZ(llBalanceLayout3, "llBalanceLayout");
                OUP.LJIJJLI(llBalanceLayout3);
                View superElement3 = LIZ(R.id.kty);
                o.LJIIIIZZ(superElement3, "superElement");
                OUP.LJIJJLI(superElement3);
            }
        }
    }

    public final void setGeneralParams(HashMap<String, Object> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.LJLIL = hashMap;
    }

    public final void setOnBalanceClickListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLJI = interfaceC65784Pro;
    }

    public final void setOnCheckedListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    public final void setPaymentInfo(PaymentInfo paymentInfo) {
        this.LJLJJI = paymentInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r11 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r11) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1T.setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):void");
    }
}
