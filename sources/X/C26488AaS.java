package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AaS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26488AaS extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26488AaS LJLIL = new C26488AaS();

    public C26488AaS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new ShipToBarHolder(it, 0, 4);
    }
}
