package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpPromotionResourceBannerViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.ANc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26124ANc extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26124ANc LJLIL = new C26124ANc();

    public C26124ANc() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new PdpPromotionResourceBannerViewHolder(it);
    }
}
