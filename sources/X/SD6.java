package X;

import Y.ACListenerS46S1100000_12;
import Y.IDCListenerS376S0100000_12;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SD6 extends SD2 {
    public PaymentMethod LJLJJLL;
    public ElementDTO LJLJL;
    public TextWatcher LJLJLJ;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJLLL;
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLL;
    public String LJLLI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLLILLLL;
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
        return R.layout.a1k;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    @Override // X.SD2, X.B1Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement> getValue() {
        /*
            r10 = this;
            r0 = 2131368825(0x7f0a1b79, float:1.835761E38)
            android.view.View r0 = r10.LIZIZ(r0)
            X.19K r0 = (X.C19K) r0
            android.text.Editable r0 = r0.getText()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r10.getElementDTO()
            r3 = 0
            if (r0 == 0) goto L22
            java.lang.Integer r2 = r0.styleType
            X.B1v r0 = X.EnumC28119B1v.CPF
            int r1 = r0.ordinal()
            if (r2 != 0) goto L7d
        L22:
            r0 = 0
        L23:
            java.lang.String r5 = ""
            if (r0 == 0) goto L33
            java.lang.String r0 = "."
            java.lang.String r1 = ujb.o.LJJJJZ(r4, r0, r5, r3)
            java.lang.String r0 = "-"
            java.lang.String r4 = ujb.o.LJJJJZ(r1, r0, r5, r3)
        L33:
            int r0 = r4.length()
            if (r0 <= 0) goto L4f
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r10.getElementDTO()
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration r0 = r0.configuration
            if (r0 == 0) goto L4b
            java.lang.String r0 = r0.prefix
            if (r0 != 0) goto L7b
        L4b:
            java.lang.String r5 = X.JBR.LJFF(r1, r5, r4, r1)
        L4f:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r2 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r10.getElementDTO()
            r7 = 0
            if (r0 == 0) goto L79
            java.lang.String r3 = r0.id
        L5a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r10.getElementDTO()
            if (r0 == 0) goto L77
            java.lang.String r4 = r0.paramName
        L62:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = r10.getElementDTO()
            if (r0 == 0) goto L75
            java.lang.Boolean r6 = r0.needEncryption
        L6a:
            r8 = 16
            r9 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.util.List r0 = X.C47261Igj.LJJIJ(r2)
            return r0
        L75:
            r6 = r7
            goto L6a
        L77:
            r4 = r7
            goto L62
        L79:
            r3 = r7
            goto L5a
        L7b:
            r5 = r0
            goto L4b
        L7d:
            int r0 = r2.intValue()
            if (r0 != r1) goto L22
            r0 = 1
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SD6.getValue():java.util.List");
    }

    @Override // X.SD2, X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLJL;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getFocusChange() {
        return this.LJLLILLLL;
    }

    public final String getInputMethod() {
        return this.LJLLI;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getOnFocusChange() {
        return this.LJLJLLL;
    }

    @Override // X.SD2
    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LJLL;
    }

    @Override // X.SD2
    public PaymentMethod getPaymentMethod() {
        return this.LJLJJLL;
    }

    public SD6(Context context) {
        super(context, null, 0);
        this.LJLJLLL = C34396Dei.LJLIL;
        this.LJLL = SDN.LJLIL;
        this.LJLLI = "";
        this.LJLLILLLL = C34395Deh.LJLIL;
    }

    @Override // X.SD2
    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLJL = elementDTO;
    }

    public final void setFocusChange(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLLILLLL = interfaceC88472Yns;
    }

    public final void setInputMethod(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLI = str;
    }

    public final void setOnFocusChange(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJLLL = interfaceC88472Yns;
    }

    @Override // X.SD2, X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLL = interfaceC88472Yns;
    }

    @Override // X.SD2
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLJJLL = paymentMethod;
    }

    @Override // X.SD2, X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        TextWatcher sdb;
        boolean z;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        super.LIZ(elementDTO, paymentMethod, list, obj);
        setElementDTO(elementDTO);
        setPaymentMethod(paymentMethod);
        LIZIZ(R.id.eof).setTag(elementDTO.styleType);
        ((C71731SDf) LIZIZ(R.id.eod)).setOnEditTextFocusChangeListener(new IDCListenerS376S0100000_12(this, 0));
        TextWatcher textWatcher = this.LJLJLJ;
        if (textWatcher != null) {
            ((TextView) LIZIZ(R.id.eof)).removeTextChangedListener(textWatcher);
        }
        Integer num = elementDTO.styleType;
        int ordinal = EnumC28119B1v.CPF.ordinal();
        if (num == null || num.intValue() != ordinal) {
            sdb = new SDD(this);
        } else {
            sdb = new SDB(this, LIZIZ(R.id.eof));
        }
        this.LJLJLJ = sdb;
        ((TextView) LIZIZ(R.id.eof)).addTextChangedListener(this.LJLJLJ);
        boolean z2 = true;
        String str4 = null;
        if (list != null) {
            Configuration configuration = elementDTO.configuration;
            if (configuration != null) {
                str2 = configuration.prefix;
            } else {
                str2 = null;
            }
            PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, list);
            if (paymentElement == null || (str3 = paymentElement.getParamValue()) == null) {
                str3 = "";
            }
            if (str2 != null && str2.length() != 0) {
                str3 = ujb.o.LJJJJZI(str3, str2, "", false);
            }
            ((C71731SDf) LIZIZ(R.id.eod)).setText(str3);
        }
        String str5 = elementDTO.notificationUrl;
        if (!C78857UxB.LJJJIL(str5)) {
            str5 = null;
        }
        if (str5 != null) {
            ((ImageView) LIZIZ(R.id.e_q)).setVisibility(0);
            C16880lQ.LJJJ((TuxIconView) LIZIZ(R.id.e_q), new ACListenerS46S1100000_12(this, str5, 2));
        } else {
            ((ImageView) LIZIZ(R.id.e_q)).setVisibility(8);
        }
        String str6 = elementDTO.description;
        if (str6 == null || str6.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LIZIZ(R.id.l8x).setVisibility(0);
            ((TextView) LIZIZ(R.id.l8x)).setText(elementDTO.description);
        } else {
            LIZIZ(R.id.l8x).setVisibility(8);
        }
        Configuration configuration2 = elementDTO.configuration;
        if (configuration2 != null && (str = configuration2.prefix) != null && str.length() != 0) {
            z2 = false;
        }
        if (!z2) {
            LIZIZ(R.id.i14).setVisibility(0);
            TextView textView = (TextView) LIZIZ(R.id.i14);
            Configuration configuration3 = elementDTO.configuration;
            if (configuration3 != null) {
                str4 = configuration3.prefix;
            }
            textView.setText(str4);
        } else {
            LIZIZ(R.id.i14).setVisibility(8);
        }
        ((TextView) LIZIZ(R.id.eof)).setImeOptions(6);
    }
}
