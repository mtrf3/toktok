package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpPromotionEntranceInfoViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AMs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26114AMs extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26114AMs LJLIL = new C26114AMs();

    public C26114AMs() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new PdpPromotionEntranceInfoViewHolder(it);
    }
}