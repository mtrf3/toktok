package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.skeleton.PdpSkeletonVH;
import kotlin.jvm.internal.o;

/* renamed from: X.AZl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26445AZl extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26445AZl LJLIL = new C26445AZl();

    public C26445AZl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new PdpSkeletonVH(it);
    }
}
