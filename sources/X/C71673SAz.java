package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SAz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71673SAz extends SD2 {
    public PaymentMethod LJLJJLL;
    public ElementDTO LJLJL;
    public List<Region> LJLJLJ;
    public InterfaceC88472Yns<? super List<PaymentElement>, C76800UCe> LJLJLLL;
    public final java.util.Map<Integer, View> LJLL = new LinkedHashMap();

    @Override // X.SD2, X.B1Z
    public final void LIZ(ElementDTO elementDTO, PaymentMethod paymentMethod, List<PaymentElement> list, Object obj) {
        o.LJIIIZ(paymentMethod, "paymentMethod");
    }

    @Override // X.SD2, X.C252989wM
    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLL;
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
        return R.layout.xs;
    }

    @Override // X.SD2
    public C71731SDf getInputView() {
        return null;
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

    public final List<Region> getRegionList() {
        return this.LJLJLJ;
    }

    @Override // X.SD2, X.B1Z
    public List<PaymentElement> getValue() {
        return C61878OQg.INSTANCE;
    }

    public C71673SAz(Context context) {
        super(context, null, 0);
        this.LJLJLJ = C61878OQg.INSTANCE;
        this.LJLJLLL = SB0.LJLIL;
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

    public final void setRegionList(List<Region> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLJLJ = list;
    }
}
