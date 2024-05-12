package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shopprofile.UsShopProfileVH;
import kotlin.jvm.internal.o;

/* renamed from: X.AMz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26121AMz extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26121AMz LJLIL = new C26121AMz();

    public C26121AMz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new UsShopProfileVH(it);
    }
}
