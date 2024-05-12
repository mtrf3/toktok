package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipFromBarHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Ab5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26527Ab5 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26527Ab5 LJLIL = new C26527Ab5();

    public C26527Ab5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new ShipFromBarHolder(it);
    }
}
