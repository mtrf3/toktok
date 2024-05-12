package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipFromBarHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Ab6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26528Ab6 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26528Ab6 LJLIL = new C26528Ab6();

    public C26528Ab6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new ShipFromBarHolder(it);
    }
}
