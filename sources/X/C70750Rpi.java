package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewGalleryViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70750Rpi extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, C70717RpB>> {
    public static final C70750Rpi LJLIL = new C70750Rpi();

    public C70750Rpi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, C70717RpB> invoke(ViewGroup viewGroup) {
        ViewGroup parent = viewGroup;
        o.LJIIIZ(parent, "parent");
        return new ReviewGalleryViewHolder(parent);
    }
}
