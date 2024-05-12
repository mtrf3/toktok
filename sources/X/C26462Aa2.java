package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.PreOrderShippingViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Aa2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26462Aa2 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26462Aa2 LJLIL = new C26462Aa2();

    public C26462Aa2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new PreOrderShippingViewHolder(it);
    }
}
