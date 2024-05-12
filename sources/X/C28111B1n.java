package X;

import Y.ACListenerS43S1100000_4;
import Y.IDCListenerS373S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.B1n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28111B1n extends SD2 {
    public PaymentMethod LJLJJLL;
    public ElementDTO LJLJL;
    public C28117B1t LJLJLJ;
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLJLLL;
    public C27486AqY LJLL;
    public final int LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // X.SD2, X.C252989wM
    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLILLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C252989wM
    public View getContentView() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C27486AqY c27486AqY = new C27486AqY(context, null, 6);
        c27486AqY.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C26338AVi.LJIIIZ(c27486AqY.getEditText(), null, Integer.valueOf(this.LJLLI), null, Integer.valueOf(this.LJLLI), 21);
        this.LJLL = c27486AqY;
        return c27486AqY;
    }

    @Override // X.SD2, X.B1Z
    public List<PaymentElement> getValue() {
        C27488Aqa c27488Aqa;
        ElementDTO elementDTO;
        ElementDTO elementDTO2;
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        List<ElementDTO> list;
        List<ElementDTO> list2;
        C27486AqY c27486AqY = this.LJLL;
        Boolean bool2 = null;
        if (c27486AqY != null) {
            c27488Aqa = c27486AqY.getPhoneModel();
        } else {
            c27488Aqa = null;
        }
        ElementDTO elementDTO3 = getElementDTO();
        if (elementDTO3 != null && (list2 = elementDTO3.subElementDTOList) != null) {
            elementDTO = (ElementDTO) ORZ.LJLLLLLL(0, list2);
        } else {
            elementDTO = null;
        }
        ElementDTO elementDTO4 = getElementDTO();
        if (elementDTO4 != null && (list = elementDTO4.subElementDTOList) != null) {
            elementDTO2 = (ElementDTO) ORZ.LJLLLLLL(1, list);
        } else {
            elementDTO2 = null;
        }
        PaymentElement[] paymentElementArr = new PaymentElement[3];
        String str7 = null;
        if (c27488Aqa != null) {
            str = c27488Aqa.LIZ;
        } else {
            str = null;
        }
        paymentElementArr[0] = new PaymentElement(null, null, str, null, null, 24, null);
        if (elementDTO2 != null) {
            str2 = elementDTO2.id;
            str3 = elementDTO2.paramName;
        } else {
            str2 = null;
            str3 = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('+');
        if (c27488Aqa != null) {
            str4 = c27488Aqa.LIZIZ;
        } else {
            str4 = null;
        }
        LIZ.append(str4);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (elementDTO2 != null) {
            bool = elementDTO2.needEncryption;
        } else {
            bool = null;
        }
        paymentElementArr[1] = new PaymentElement(str2, str3, LIZIZ, bool, null, 16, null);
        if (elementDTO != null) {
            str5 = elementDTO.id;
            str7 = elementDTO.paramName;
        } else {
            str5 = null;
        }
        if (c27488Aqa != null) {
            str6 = c27488Aqa.LIZJ;
        } else {
            str6 = null;
        }
        if (!C78857UxB.LJJJIL(str6)) {
            str6 = null;
        }
        if (elementDTO != null) {
            bool2 = elementDTO.needEncryption;
        }
        paymentElementArr[2] = new PaymentElement(str5, str7, str6, bool2, null, 16, null);
        return C47261Igj.LJJIJIIJI(paymentElementArr);
    }

    @Override // X.SD2
    public C71731SDf getInputView() {
        C71731SDf country_code_phone_input = (C71731SDf) LIZIZ(R.id.bwr);
        o.LJIIIIZZ(country_code_phone_input, "country_code_phone_input");
        return country_code_phone_input;
    }

    @Override // X.SD2, X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLJL;
    }

    @Override // X.SD2
    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LJLJLLL;
    }

    @Override // X.SD2
    public PaymentMethod getPaymentMethod() {
        return this.LJLJJLL;
    }

    public C28111B1n(Context context) {
        super(context, null, 0);
        this.LJLJLLL = B2O.LJLIL;
        this.LJLLI = (int) KL2.LIZJ(context, 15.0f);
        ((C71731SDf) LIZIZ(R.id.bwr)).setInputType(3);
    }

    @Override // X.SD2
    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLJL = elementDTO;
    }

    @Override // X.SD2, X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJLLL = interfaceC88472Yns;
    }

    @Override // X.SD2
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLJJLL = paymentMethod;
    }

    @Override // X.SD2, X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        String str;
        String str2;
        C27486AqY c27486AqY;
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        super.LIZ(elementDTO, paymentMethod, list, obj);
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        String str3 = elementDTO.notificationUrl;
        String str4 = null;
        if (!C78857UxB.LJJJIL(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            LIZIZ(R.id.c6p).setVisibility(0);
            ((ImageView) LIZIZ(R.id.e_q)).setVisibility(0);
            C16880lQ.LJJJ((TuxIconView) LIZIZ(R.id.e_q), new ACListenerS43S1100000_4(this, str3, 0));
        } else {
            LIZIZ(R.id.c6p).setVisibility(8);
            ((ImageView) LIZIZ(R.id.e_q)).setVisibility(8);
        }
        ((C71731SDf) LIZIZ(R.id.bwr)).setMaxLines(1);
        C28117B1t c28117B1t = this.LJLJLJ;
        if (c28117B1t != null) {
            ((TextView) LIZIZ(R.id.eof)).removeTextChangedListener(c28117B1t);
        }
        this.LJLJLJ = new C28117B1t(this);
        ((TextView) LIZIZ(R.id.eof)).addTextChangedListener(this.LJLJLJ);
        ((C71731SDf) LIZIZ(R.id.bwr)).setOnEditTextFocusChangeListener(new IDCListenerS373S0100000_4(this, 0));
        if (list != null) {
            if (list.size() < 3) {
                C27486AqY c27486AqY2 = this.LJLL;
                if (c27486AqY2 != null) {
                    C86804Y4y LIZ = QDN.LIZ();
                    c27486AqY2.LIZJ(LIZ.LJLJJI, LIZ.LJLJI);
                }
                C27486AqY c27486AqY3 = this.LJLL;
                if (c27486AqY3 != null) {
                    c27486AqY3.setPhoneNumber("");
                }
            } else {
                PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, list);
                if (paymentElement != null) {
                    str = paymentElement.getParamValue();
                } else {
                    str = null;
                }
                PaymentElement paymentElement2 = (PaymentElement) ORZ.LJLLLLLL(1, list);
                if (paymentElement2 != null) {
                    str2 = paymentElement2.getParamValue();
                } else {
                    str2 = null;
                }
                PaymentElement paymentElement3 = (PaymentElement) ORZ.LJLLLLLL(2, list);
                if (paymentElement3 != null) {
                    str4 = paymentElement3.getParamValue();
                }
                if (str != null && str2 != null && str4 != null && (c27486AqY = this.LJLL) != null) {
                    c27486AqY.setPhoneModel(new C27488Aqa(str, ujb.o.LJJJJZ(str2, "+", "", false), str4));
                }
            }
        }
        ((TextView) LIZIZ(R.id.eof)).setImeOptions(6);
    }
}
