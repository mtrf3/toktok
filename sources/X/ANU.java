package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewViewHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ANU extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final ANU LJLIL = new ANU();

    public ANU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new PdpReviewViewHolder(it);
    }
}