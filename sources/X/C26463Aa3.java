package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.PreOrderShippingViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Aa3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26463Aa3 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26463Aa3 LJLIL = new C26463Aa3();

    public C26463Aa3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new PreOrderShippingViewHolder(it);
    }
}
