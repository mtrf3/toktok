package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.vh.UsPdpReviewCellViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AYx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26431AYx extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26431AYx LJLIL = new C26431AYx();

    public C26431AYx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new UsPdpReviewCellViewHolder(it);
    }
}
