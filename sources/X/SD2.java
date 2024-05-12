package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class SD2 extends C252989wM implements B1Z {
    public InterfaceC88472Yns<? super List<PaymentElement>, String> LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    @Override // X.C252989wM
    public View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJL;
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

    public abstract /* synthetic */ ElementDTO getElementDTO();

    public abstract C71731SDf getInputView();

    public abstract /* synthetic */ InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange();

    public abstract /* synthetic */ PaymentMethod getPaymentMethod();

    public abstract /* synthetic */ List<PaymentElement> getValue();

    public abstract /* synthetic */ void setElementDTO(ElementDTO elementDTO);

    public abstract /* synthetic */ void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns);

    public abstract /* synthetic */ void setPaymentMethod(PaymentMethod paymentMethod);

    public final InterfaceC65784Pro<C76800UCe> getOnErrorClear() {
        return this.LJLJJI;
    }

    public final InterfaceC88472Yns<List<PaymentElement>, String> getOnVerify() {
        return this.LJLJI;
    }

    public final void setOnErrorClear(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLJJI = interfaceC65784Pro;
    }

    public final void setOnVerify(InterfaceC88472Yns<? super List<PaymentElement>, String> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLJI = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SD2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJL = C62850Ola.LJFF(context, "context");
        this.LJLJI = SDL.LJLIL;
        this.LJLJJI = SDU.LJLIL;
    }

    public void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        Integer num;
        int i;
        int i2;
        boolean z;
        Integer num2;
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        C71731SDf inputView = getInputView();
        if (inputView != null) {
            ((TextView) inputView.LIZ(R.id.eof)).setHint(elementDTO.placeholderDisplayName);
            Configuration configuration = elementDTO.configuration;
            if (configuration != null) {
                num = configuration.inputType;
            } else {
                num = null;
            }
            int ordinal = SDG.NUMBER.ordinal();
            int i3 = 1;
            if (num == null || num.intValue() != ordinal) {
                int ordinal2 = SDG.PHONE.ordinal();
                if (num == null || num.intValue() != ordinal2) {
                    int ordinal3 = SDG.TEXT.ordinal();
                    if (num == null || num.intValue() != ordinal3) {
                        i = inputView.getInputType();
                    } else {
                        i = 1;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
            inputView.setInputType(i);
            View contentView = LIZIZ(R.id.bt5);
            o.LJIIIIZZ(contentView, "contentView");
            C16880lQ.LJIIJ(new Au2S19S0200000_12(inputView, this, 5, 42), contentView);
            Configuration configuration2 = elementDTO.configuration;
            if (configuration2 != null && (num2 = configuration2.maxLength) != null) {
                i2 = num2.intValue();
            } else {
                i2 = Integer.MAX_VALUE;
            }
            inputView.setMaxLength(i2);
            Configuration configuration3 = elementDTO.configuration;
            if (configuration3 != null) {
                z = o.LJ(configuration3.lineBreak, Boolean.TRUE);
                if (z) {
                    i3 = Integer.MAX_VALUE;
                }
            } else {
                z = false;
            }
            inputView.setMaxLines(i3);
            if (z) {
                inputView.setInputType(inputView.getInputType() | 131072);
            }
        }
        if (obj instanceof String) {
            LJ(new C253009wO((String) obj, null, false, 6));
        } else {
            LIZJ();
        }
    }
}
