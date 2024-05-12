package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B17 extends LinearLayout implements B1Z {
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLIL;
    public PaymentMethod LJLILLLLZI;
    public ElementDTO LJLJI;
    public boolean LJLJJI;
    public HashMap<String, Object> LJLJJL;
    public B1K LJLJJLL;
    public String LJLJL;
    public final C62822Ol8 LJLJLJ;

    private final C233969Ge getBalanceView() {
        return (C233969Ge) this.LJLJLJ.getValue();
    }

    @Override // X.B1Z
    public List<PaymentElement> getValue() {
        return C47261Igj.LJJIJ(new PaymentElement("balance", null, null, null, null, 24, null));
    }

    @Override // X.B1Z
    public ElementDTO getElementDTO() {
        return this.LJLJI;
    }

    public final boolean getHasCheckedPaymentMethod() {
        return this.LJLJJI;
    }

    public InterfaceC88472Yns<List<PaymentElement>, C76800UCe> getOnValueChange() {
        return this.LJLIL;
    }

    public final String getPaySource() {
        return this.LJLJL;
    }

    public final B1K getPaymentLogger() {
        return this.LJLJJLL;
    }

    public PaymentMethod getPaymentMethod() {
        return this.LJLILLLLZI;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B17(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = B18.LJLIL;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0200000_4(context, this, 3));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
    }

    public void setElementDTO(ElementDTO elementDTO) {
        this.LJLJI = elementDTO;
    }

    public final void setHasCheckedPaymentMethod(boolean z) {
        this.LJLJJI = z;
    }

    @Override // X.B1Z
    public void setOnValueChange(InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LJLIL = interfaceC88472Yns;
    }

    public final void setPaySource(String str) {
        this.LJLJL = str;
    }

    public final void setPaymentLogger(B1K b1k) {
        this.LJLJJLL = b1k;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.LJLILLLLZI = paymentMethod;
    }

    public final void setTrackParams(HashMap<String, Object> hashMap) {
        this.LJLJJL = hashMap;
    }

    @Override // X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        int i;
        o.LJIIIZ(elementDTO, "elementDTO");
        o.LJIIIZ(paymentMethod, "paymentMethod");
        setPaymentMethod(paymentMethod);
        setElementDTO(elementDTO);
        C233969Ge balanceView = getBalanceView();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.gv, context);
        int i2 = 0;
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        balanceView.setBalanceTextColor(i);
        getBalanceView().setBalanceTextValue("");
        String str = paymentMethod.balance;
        if (str != null && C78685UuP.LJJJZ(str)) {
            getBalanceView().setBalanceTextValue(str);
        }
        Availability availability = paymentMethod.availability;
        if (availability != null && o.LJ(availability.isAvailable, Boolean.FALSE)) {
            C233969Ge balanceView2 = getBalanceView();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.gp, context2);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            }
            balanceView2.setBalanceTextColor(i2);
        }
    }
}
