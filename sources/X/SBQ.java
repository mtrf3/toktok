package X;

import Y.ACListenerS32S0100000_12;
import Y.ACListenerS46S1100000_12;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SBQ extends LinearLayout implements B1Z {
    public PaymentMethod LJLIL;
    public ElementDTO LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    private final TuxIconView getIconView() {
        return (TuxIconView) this.LJLJLLL.getValue();
    }

    private final TuxTextView getTitleView() {
        return (TuxTextView) this.LJLJLJ.getValue();
    }

    public final C71897SJp getCheckBox() {
        return (C71897SJp) this.LJLJL.getValue();
    }

    @Override // X.B1Z
    public List<PaymentElement> getValue() {
        return C47261Igj.LJJIJ(new PaymentElement("need_save", null, String.valueOf(getCheckBox().isChecked()), null, null, 24, null));
    }

    @Override // X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLILLLLZI;
    }

    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LJLJJLL;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SBQ(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJI = (int) KL2.LIZJ(context, 14.0f);
        KL2.LIZJ(context, 16.0f);
        this.LJLJJI = (int) KL2.LIZJ(context, 4.0f);
        int LIZJ = (int) KL2.LIZJ(context, 8.0f);
        this.LJLJJL = LIZJ;
        this.LJLJJLL = SBR.LJLIL;
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0200000_7(context, this, 10));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS150S0200000_3(context, this, 5));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS150S0200000_3(context, this, 4));
        setOrientation(0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        setGravity(16);
        C26338AVi.LJIIIZ(this, null, Integer.valueOf(LIZJ), null, Integer.valueOf(LIZJ), 21);
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLILLLLZI = elementDTO;
    }

    @Override // X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJJLL = interfaceC88472Yns;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLIL = paymentMethod;
    }

    @Override // X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        boolean z;
        String paramValue;
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        if (list != null) {
            C71897SJp checkBox = getCheckBox();
            PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLLLL(0, list);
            if (paymentElement != null && (paramValue = paymentElement.getParamValue()) != null) {
                z = Boolean.parseBoolean(paramValue);
            } else {
                z = false;
            }
            checkBox.setChecked(z);
        }
        getTitleView().setText(elementDTO.displayName);
        String str = paymentMethod.saveNotificationUrl;
        if (C78857UxB.LJJJIL(str) && str != null) {
            getIconView().setVisibility(0);
            C16880lQ.LJJJ(getIconView(), new ACListenerS46S1100000_12(this, str, 4));
        } else {
            getIconView().setVisibility(8);
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 17)));
    }
}
