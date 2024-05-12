package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1S extends FrameLayout {
    public HashMap<String, Object> LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public InterfaceC88472Yns<? super PaymentInfo, C76800UCe> LJLJJI;
    public PaymentInfo LJLJJL;
    public PaymentMethod LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public final void LIZIZ() {
        String str;
        boolean z;
        PaymentMethod paymentMethod = this.LJLJJLL;
        if (paymentMethod != null) {
            str = paymentMethod.LJIIIIZZ();
        } else {
            str = null;
        }
        if (str != null && C78685UuP.LJJJZ(str)) {
            z = true;
        } else {
            PaymentMethod paymentMethod2 = this.LJLJJLL;
            if (paymentMethod2 != null) {
                str = paymentMethod2.extraInfo;
            } else {
                str = null;
            }
            z = false;
        }
        if (str != null && str.length() > 0) {
            View tag_extra_layout = LIZ(R.id.kzy);
            o.LJIIIIZZ(tag_extra_layout, "tag_extra_layout");
            OUP.LJJLIIIJ(tag_extra_layout);
            View tvExtraInfoBelow = LIZ(R.id.lwf);
            o.LJIIIIZZ(tvExtraInfoBelow, "tvExtraInfoBelow");
            OUP.LJJLIIIJ(tvExtraInfoBelow);
            ((TextView) LIZ(R.id.lwf)).setText(str);
            if (z) {
                ((TextView) LIZ(R.id.lwf)).setMaxLines(2);
                return;
            } else {
                ((TextView) LIZ(R.id.lwf)).setMaxLines(1);
                return;
            }
        }
        View tvExtraInfoBelow2 = LIZ(R.id.lwf);
        o.LJIIIIZZ(tvExtraInfoBelow2, "tvExtraInfoBelow");
        OUP.LJIJJLI(tvExtraInfoBelow2);
    }

    public final void LIZJ() {
        String str = null;
        if (((CompoundButton) LIZ(R.id.iln)).isChecked()) {
            C28098B1a c28098B1a = PaymentMethodView.Companion;
            PaymentMethod paymentMethod = this.LJLJJLL;
            c28098B1a.getClass();
            str = C28098B1a.LIZ(paymentMethod);
        }
        if (str != null && str.length() > 0) {
            View tvExtraInfoRight = LIZ(R.id.lwg);
            o.LJIIIIZZ(tvExtraInfoRight, "tvExtraInfoRight");
            OUP.LJJLIIIJ(tvExtraInfoRight);
            ((TextView) LIZ(R.id.lwg)).setText(str);
            return;
        }
        View tvExtraInfoRight2 = LIZ(R.id.lwg);
        o.LJIIIIZZ(tvExtraInfoRight2, "tvExtraInfoRight");
        OUP.LJIJJLI(tvExtraInfoRight2);
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

    public final InterfaceC88472Yns<PaymentInfo, C76800UCe> getOnPaymentInfoChangeListener() {
        return this.LJLJJI;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.LJLJJL;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.LJLJJLL;
    }

    public B1S(Context context) {
        super(context, null, 0);
        this.LJLIL = new HashMap<>();
        this.LJLILLLLZI = C28135B2l.LJLIL;
        this.LJLJI = C28134B2k.LJLIL;
        this.LJLJJI = C28124B2a.LJLIL;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a9d, this, true);
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
        PaymentMethod paymentMethod = this.LJLJJLL;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (!o.LJ(str, "pm_pi_ccdc_all")) {
            PaymentMethod paymentMethod2 = this.LJLJJLL;
            if (paymentMethod2 == null || (bindInfo = paymentMethod2.bindInfo) == null || (str5 = bindInfo.buttonText) == null || str5.length() == 0) {
                ((C63044Ooi) LIZ(R.id.iln)).setChecked(z);
                if (z) {
                    PaymentMethod paymentMethod3 = this.LJLJJLL;
                    if (paymentMethod3 != null && (str4 = paymentMethod3.balance) != null && C78857UxB.LJJJIL(str4)) {
                        View llBalanceLayout = LIZ(R.id.g0j);
                        o.LJIIIIZZ(llBalanceLayout, "llBalanceLayout");
                        OUP.LJJLIIIJ(llBalanceLayout);
                        ((TextView) LIZ(R.id.lvj)).setText(str4);
                        View llBalanceLayout2 = LIZ(R.id.g0j);
                        o.LJIIIIZZ(llBalanceLayout2, "llBalanceLayout");
                        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 62, 42), llBalanceLayout2);
                    }
                    PaymentMethod paymentMethod4 = this.LJLJJLL;
                    if (paymentMethod4 != null && (LJIIJ = paymentMethod4.LJIIJ()) != null && (elementDTO = (ElementDTO) ORZ.LJLLLL(LJIIJ)) != null) {
                        View superElement = LIZ(R.id.kty);
                        o.LJIIIIZZ(superElement, "superElement");
                        OUP.LJJLIIIJ(superElement);
                        B1V b1v = (B1V) LIZ(R.id.kty);
                        PaymentInfo paymentInfo = this.LJLJJL;
                        if (paymentInfo == null) {
                            PaymentMethod paymentMethod5 = this.LJLJJLL;
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
                        ((B1V) LIZ(R.id.kty)).setLogVerify(new AqS135S0200000_4(elementDTO, this, 154));
                        ((B1V) LIZ(R.id.kty)).setOnPaymentInfoChangeListener(this.LJLJJI);
                        B1Z element = ((B1V) LIZ(R.id.kty)).getElement();
                        if ((element instanceof SD6) && (sd6 = (SD6) element) != null) {
                            sd6.setOnFocusChange(new AqS135S0200000_4(elementDTO, sd6, 155));
                            if (o.LJ(elementDTO.id, "eg_ccdc_global_cvv")) {
                                sd6.getInputView().setInputType(2);
                                sd6.getInputView().setMaxLength(4);
                                sd6.getInputView().setInputTextEncrypted(true);
                            } else {
                                sd6.getInputView().setInputType(1);
                                sd6.getInputView().setMaxLength(Integer.MAX_VALUE);
                                sd6.getInputView().setInputTextEncrypted(false);
                            }
                        }
                    } else {
                        View superElement2 = LIZ(R.id.kty);
                        o.LJIIIIZZ(superElement2, "superElement");
                        OUP.LJIJJLI(superElement2);
                    }
                } else {
                    View llBalanceLayout3 = LIZ(R.id.g0j);
                    o.LJIIIIZZ(llBalanceLayout3, "llBalanceLayout");
                    OUP.LJIJJLI(llBalanceLayout3);
                    View superElement3 = LIZ(R.id.kty);
                    o.LJIIIIZZ(superElement3, "superElement");
                    OUP.LJIJJLI(superElement3);
                }
                LIZIZ();
                LIZJ();
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

    public final void setOnPaymentInfoChangeListener(InterfaceC88472Yns<? super PaymentInfo, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJJI = interfaceC88472Yns;
    }

    public final void setPaymentInfo(PaymentInfo paymentInfo) {
        this.LJLJJL = paymentInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r8 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r8) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1S.setPaymentMethod(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):void");
    }
}
