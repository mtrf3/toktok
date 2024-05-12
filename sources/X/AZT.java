package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shipping.UsShippingVH;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AZT implements InterfaceC26432AYy {
    @Override // X.InterfaceC26432AYy
    public final JediViewHolder<? extends InterfaceC98243tM, ?> LIZ(ViewGroup viewGroup, C26778Af8 adapter) {
        o.LJIIIZ(viewGroup, "viewGroup");
        o.LJIIIZ(adapter, "adapter");
        return new UsShippingVH(viewGroup, adapter.LJLJJLL);
    }
}
