package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.SeeMoreVH;
import kotlin.jvm.internal.o;

/* renamed from: X.AMi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26104AMi extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26104AMi LJLIL = new C26104AMi();

    public C26104AMi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new SeeMoreVH(it);
    }
}
