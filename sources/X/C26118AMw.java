package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AMw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26118AMw extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26118AMw LJLIL = new C26118AMw();

    public C26118AMw() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new PdpShopReviewHeadViewHolder(it);
    }
}
