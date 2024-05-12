package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpBlankVH;
import kotlin.jvm.internal.o;

/* renamed from: X.AZn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26447AZn extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26447AZn LJLIL = new C26447AZn();

    public C26447AZn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new PdpBlankVH(it);
    }
}
