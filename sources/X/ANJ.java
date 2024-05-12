package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ANJ extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final ANJ INSTANCE = new ANJ();

    public ANJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup it) {
        o.LJIIIZ(it, "it");
        return new PaymentInfoVH(C1FL.LIZIZ(it, R.layout.a_5, it, false, "from(it.context)\n       …_payment_card, it, false)"));
    }
}
