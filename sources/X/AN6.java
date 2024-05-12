package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.address.USAddressVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AN6 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final AN6 INSTANCE = new AN6();

    public AN6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup it) {
        o.LJIIIZ(it, "it");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(it.getContext()), R.layout.a93, it, false);
        LLLLIILL.setTag("address_item_view");
        return new USAddressVH(LLLLIILL);
    }
}
