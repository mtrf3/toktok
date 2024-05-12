package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shopprofile.UsShopProfileVH;
import kotlin.jvm.internal.o;

/* renamed from: X.AMy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26120AMy extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26120AMy LJLIL = new C26120AMy();

    public C26120AMy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new UsShopProfileVH(it);
    }
}
