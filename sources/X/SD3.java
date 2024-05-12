package X;

import Y.ACListenerS46S1100000_12;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class SD3 extends SD2 {
    public PaymentMethod LJLJJLL;
    public ElementDTO LJLJL;
    public SDA LJLJLJ;
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLJLLL;
    public String LJLL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLLI;
    public boolean LJLLILLLL;
    public final java.util.Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // X.SD2, X.C252989wM
    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLJ;
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
    public int getContentViewLayoutId() {
        return R.layout.a11;
    }

    @Override // X.C252989wM
    public int getFooterViewLayoutId() {
        return R.layout.a1l;
    }

    @Override // X.SD2
    public C71731SDf getInputView() {
        C71731SDf inputWithIndicator = (C71731SDf) LIZIZ(R.id.eod);
        o.LJIIIIZZ(inputWithIndicator, "inputWithIndicator");
        return inputWithIndicator;
    }

    @Override // X.SD2, X.B1Z
    public List<PaymentElement> getValue() {
        ElementDTO elementDTO;
        ElementDTO elementDTO2;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        List<ElementDTO> list;
        ElementDTO elementDTO3;
        List<ElementDTO> list2;
        ElementDTO elementDTO4;
        List LJLJJL = s.LJLJJL(String.valueOf(((C19K) LIZIZ(R.id.eof)).getText()), new String[]{"/"}, 0, 6);
        String str5 = (String) ORZ.LJLLLLLL(0, LJLJJL);
        String str6 = (String) ORZ.LJLLLLLL(1, LJLJJL);
        ElementDTO elementDTO5 = getElementDTO();
        Boolean bool2 = null;
        if (elementDTO5 != null && (list2 = elementDTO5.subElementDTOList) != null) {
            Iterator<ElementDTO> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    elementDTO4 = it.next();
                    if (o.LJ(elementDTO4.id, "eg_ccdc_global_expiration_month")) {
                        break;
                    }
                } else {
                    elementDTO4 = null;
                    break;
                }
            }
            elementDTO = elementDTO4;
        } else {
            elementDTO = null;
        }
        ElementDTO elementDTO6 = getElementDTO();
        if (elementDTO6 != null && (list = elementDTO6.subElementDTOList) != null) {
            Iterator<ElementDTO> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    elementDTO3 = it2.next();
                    if (o.LJ(elementDTO3.id, "eg_ccdc_global_expiration_year")) {
                        break;
                    }
                } else {
                    elementDTO3 = null;
                    break;
                }
            }
            elementDTO2 = elementDTO3;
        } else {
            elementDTO2 = null;
        }
        PaymentElement[] paymentElementArr = new PaymentElement[2];
        if (elementDTO != null) {
            str = elementDTO.id;
            str2 = elementDTO.paramName;
            bool = elementDTO.needEncryption;
        } else {
            str = null;
            str2 = null;
            bool = null;
        }
        paymentElementArr[0] = new PaymentElement(str, str2, str5, bool, null, 16, null);
        if (elementDTO2 != null) {
            str3 = elementDTO2.id;
            str4 = elementDTO2.paramName;
            bool2 = elementDTO2.needEncryption;
        } else {
            str3 = null;
            str4 = null;
        }
        paymentElementArr[1] = new PaymentElement(str3, str4, str6, bool2, null, 16, null);
        return C47261Igj.LJJIJIIJI(paymentElementArr);
    }

    @Override // X.SD2, X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLJL;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getFocusChange() {
        return this.LJLLI;
    }

    public final String getInputType() {
        return this.LJLL;
    }

    @Override // X.SD2
    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LJLJLLL;
    }

    @Override // X.SD2
    public PaymentMethod getPaymentMethod() {
        return this.LJLJJLL;
    }

    public final boolean getTextHasFocus() {
        return this.LJLLILLLL;
    }

    public SD3(Context context) {
        super(context, null, 0);
        this.LJLJLLL = SDS.LJLIL;
        this.LJLL = "";
        this.LJLLI = C34403Dep.LJLIL;
        ((C71731SDf) LIZIZ(R.id.eod)).setInputType(2);
    }

    @Override // X.SD2
    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLJL = elementDTO;
    }

    public final void setFocusChange(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLLI = interfaceC88472Yns;
    }

    public final void setInputType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLL = str;
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

    public final void setTextHasFocus(boolean z) {
        this.LJLLILLLL = z;
    }

    @Override // X.SD2, X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        int inputType;
        int i;
        boolean z;
        Integer num;
        o.LJIIIZ(paymentMethod, "paymentMethod");
        super.LIZ(elementDTO, paymentMethod, list, obj);
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        ((TextView) LIZIZ(R.id.lw9)).setText(elementDTO.displayName);
        String str = elementDTO.notificationUrl;
        Integer num2 = null;
        if (!C78857UxB.LJJJIL(str)) {
            str = null;
        }
        if (str != null) {
            LIZIZ(R.id.c6p).setVisibility(0);
            ((ImageView) LIZIZ(R.id.e_q)).setVisibility(0);
            C16880lQ.LJJJ((TuxIconView) LIZIZ(R.id.e_q), new ACListenerS46S1100000_12(this, str, 9));
        } else {
            LIZIZ(R.id.c6p).setVisibility(8);
            ((ImageView) LIZIZ(R.id.e_q)).setVisibility(8);
        }
        C71731SDf c71731SDf = (C71731SDf) LIZIZ(R.id.eod);
        Configuration configuration = elementDTO.configuration;
        if (configuration != null) {
            num2 = configuration.inputType;
        }
        int ordinal = SDG.NUMBER.ordinal();
        if (num2 == null || num2.intValue() != ordinal) {
            int ordinal2 = SDG.PHONE.ordinal();
            if (num2 == null || num2.intValue() != ordinal2) {
                inputType = ((C71731SDf) LIZIZ(R.id.eod)).getInputType();
            } else {
                inputType = ((C71731SDf) LIZIZ(R.id.eod)).getInputType() | 3;
            }
        } else {
            inputType = ((C71731SDf) LIZIZ(R.id.eod)).getInputType() | 2;
        }
        c71731SDf.setInputType(inputType);
        C71731SDf c71731SDf2 = (C71731SDf) LIZIZ(R.id.eod);
        Configuration configuration2 = elementDTO.configuration;
        int i2 = Integer.MAX_VALUE;
        if (configuration2 != null && (num = configuration2.maxLength) != null) {
            i = num.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        c71731SDf2.setMaxLength(i);
        Configuration configuration3 = elementDTO.configuration;
        if (configuration3 != null) {
            z = o.LJ(configuration3.lineBreak, Boolean.TRUE);
        } else {
            z = false;
        }
        C71731SDf c71731SDf3 = (C71731SDf) LIZIZ(R.id.eod);
        boolean z2 = true;
        if (!z) {
            i2 = 1;
        }
        c71731SDf3.setMaxLines(i2);
        if (z) {
            ((C71731SDf) LIZIZ(R.id.eod)).setInputType(((C71731SDf) LIZIZ(R.id.eod)).getInputType() | 131072);
        }
        String str2 = elementDTO.description;
        if (str2 != null && str2.length() != 0) {
            z2 = false;
        }
        if (!z2) {
            LIZIZ(R.id.l8x).setVisibility(0);
            ((TextView) LIZIZ(R.id.l8x)).setText(elementDTO.description);
        } else {
            LIZIZ(R.id.l8x).setVisibility(8);
        }
        SDA sda = this.LJLJLJ;
        if (sda != null) {
            ((TextView) LIZIZ(R.id.eof)).removeTextChangedListener(sda);
        }
        this.LJLJLJ = new SDA(this, LIZIZ(R.id.eof));
        ((TextView) LIZIZ(R.id.eof)).addTextChangedListener(this.LJLJLJ);
        ((C71731SDf) LIZIZ(R.id.eod)).setOnEditTextFocusChangeListener(new SD8(this, elementDTO));
        if (list != null) {
            C71731SDf c71731SDf4 = (C71731SDf) LIZIZ(R.id.eod);
            ArrayList arrayList = new ArrayList();
            Iterator<PaymentElement> it = list.iterator();
            while (it.hasNext()) {
                String paramValue = it.next().getParamValue();
                if (paramValue != null) {
                    arrayList.add(paramValue);
                }
            }
            c71731SDf4.setText(ORZ.LLD(arrayList, "/", null, null, SDJ.LJLIL, 30));
        }
        ((TextView) LIZIZ(R.id.eof)).setImeOptions(6);
    }
}
