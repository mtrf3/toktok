package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode.USLogisticSelectByZipcodeVH;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AP1 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final AP1 LJLIL = new AP1();

    public AP1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new USLogisticSelectByZipcodeVH(it);
    }
}
