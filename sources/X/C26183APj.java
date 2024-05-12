package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierNormalElementVH;
import kotlin.jvm.internal.o;

/* renamed from: X.APj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26183APj extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26183APj LJLIL = new C26183APj();

    public C26183APj() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new USCashierNormalElementVH(it);
    }
}
