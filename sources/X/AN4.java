package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.address.GlobalAddressVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AN4 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final AN4 INSTANCE = new AN4();

    public AN4() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup it) {
        o.LJIIIZ(it, "it");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(it.getContext()), R.layout.z4, it, false);
        LLLLIILL.setTag("address_item_view");
        return new GlobalAddressVH(LLLLIILL);
    }
}
