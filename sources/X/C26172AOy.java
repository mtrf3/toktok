package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.staticsellingpoint.GlobalStaticSellingPointVH;
import kotlin.jvm.internal.o;

/* renamed from: X.AOy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26172AOy extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26172AOy LJLIL = new C26172AOy();

    public C26172AOy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new GlobalStaticSellingPointVH(it);
    }
}
