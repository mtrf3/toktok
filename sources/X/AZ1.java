package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.vh.UsPdpReviewCellViewHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AZ1 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final AZ1 LJLIL = new AZ1();

    public AZ1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new UsPdpReviewCellViewHolder(it);
    }
}
