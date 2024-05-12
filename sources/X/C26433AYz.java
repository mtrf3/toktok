package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.vh.UsPdpReviewCellViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AYz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26433AYz extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26433AYz LJLIL = new C26433AYz();

    public C26433AYz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new UsPdpReviewCellViewHolder(it);
    }
}
