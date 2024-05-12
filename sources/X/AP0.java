package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectaddress.USLogisticSelectAddressItemVH;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AP0 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final AP0 LJLIL = new AP0();

    public AP0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new USLogisticSelectAddressItemVH(it);
    }
}
