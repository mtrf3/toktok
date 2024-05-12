package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1V extends FrameLayout {
    public ElementDTO LJLIL;
    public PaymentInfo LJLILLLLZI;
    public B1Z LJLJI;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJJI;
    public InterfaceC88472Yns<? super PaymentInfo, C76800UCe> LJLJJL;

    public final void LIZIZ() {
        PaymentMethod paymentMethod;
        PaymentInfo paymentInfo;
        boolean z;
        B1Z b1z = this.LJLJI;
        ElementDTO elementDTO = this.LJLIL;
        PaymentInfo paymentInfo2 = this.LJLILLLLZI;
        Boolean bool = null;
        if (paymentInfo2 != null) {
            paymentMethod = paymentInfo2.paymentMethod;
        } else {
            paymentMethod = null;
        }
        if (b1z != null && elementDTO != null && paymentMethod != null) {
            String LIZIZ = SCS.LIZIZ(elementDTO, paymentMethod, b1z.getValue());
            PaymentInfo paymentInfo3 = this.LJLILLLLZI;
            if (paymentInfo3 != null) {
                if (LIZIZ == null) {
                    z = true;
                } else {
                    z = false;
                }
                paymentInfo = PaymentInfo.LIZ(paymentInfo3, null, null, Boolean.valueOf(z), 55);
            } else {
                paymentInfo = null;
            }
            this.LJLJJL.invoke(paymentInfo);
            PaymentInfo paymentInfo4 = this.LJLILLLLZI;
            if (paymentInfo4 != null) {
                if (paymentInfo != null) {
                    bool = paymentInfo.isValid;
                }
                paymentInfo4.isValid = bool;
            }
            b1z.LIZ(elementDTO, paymentMethod, b1z.getValue(), LIZIZ);
        }
    }

    public final B1Z getElement() {
        return this.LJLJI;
    }

    public final ElementDTO getElementDTO() {
        return this.LJLIL;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getLogVerify() {
        return this.LJLJJI;
    }

    public final InterfaceC88472Yns<PaymentInfo, C76800UCe> getOnPaymentInfoChangeListener() {
        return this.LJLJJL;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.LJLILLLLZI;
    }

    public final void setElement(B1Z b1z) {
        this.LJLJI = b1z;
    }

    public final void setElementDTO(ElementDTO elementDTO) {
        this.LJLIL = elementDTO;
    }

    public final void setLogVerify(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJJI = interfaceC88472Yns;
    }

    public final void setOnPaymentInfoChangeListener(InterfaceC88472Yns<? super PaymentInfo, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJJL = interfaceC88472Yns;
    }

    public final void setPaymentInfo(PaymentInfo paymentInfo) {
        this.LJLILLLLZI = paymentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1V(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = B2Y.LJLIL;
        this.LJLJJL = B2Z.LJLIL;
    }

    public final void LIZ(ElementDTO elementDTO, PaymentInfo paymentInfo) {
        String str;
        String str2;
        ElementDTO elementDTO2;
        List<PaymentElement> paymentElements;
        ElementDTO elementDTO3;
        o.LJIIIZ(paymentInfo, "paymentInfo");
        this.LJLIL = elementDTO;
        this.LJLILLLLZI = paymentInfo;
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        if (paymentMethod == null) {
            return;
        }
        B1Z b1z = this.LJLJI;
        if (b1z != null && (elementDTO3 = b1z.getElementDTO()) != null) {
            str = elementDTO3.id;
        } else {
            str = null;
        }
        if (!o.LJ(str, elementDTO.id)) {
            C28118B1u c28118B1u = B1Z.LJIIIIZZ;
            PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            c28118B1u.getClass();
            B1Z LIZ = C28118B1u.LIZ(elementDTO, paymentMethod2, context);
            this.LJLJI = LIZ;
            if (LIZ != null && (elementDTO2 = LIZ.getElementDTO()) != null) {
                str2 = elementDTO2.id;
            } else {
                str2 = null;
            }
            if (!o.LJ(str2, elementDTO.id)) {
                removeAllViews();
            }
            Object obj = this.LJLJI;
            o.LJII(obj, "null cannot be cast to non-null type android.view.View");
            addView((View) obj);
        }
        List<ElementDTO> LIZJ = elementDTO.LIZJ();
        ArrayList arrayList = new ArrayList();
        for (ElementDTO elementDTO4 : LIZJ) {
            PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo != null && (paymentElements = paymentMethodInfo.getPaymentElements()) != null) {
                Iterator<PaymentElement> it = paymentElements.iterator();
                while (true) {
                    if (it.hasNext()) {
                        PaymentElement next = it.next();
                        if (o.LJ(next.getElement(), elementDTO4.id)) {
                            if (next != null) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
            }
        }
        B1Z b1z2 = this.LJLJI;
        if (b1z2 != null) {
            b1z2.LIZ(elementDTO, paymentMethod, arrayList, null);
            if (b1z2 instanceof SD2) {
                ((SD2) b1z2).setOnVerify(new AqS108S0300000_4(elementDTO, paymentMethod, this, 11));
            }
        }
    }
}
