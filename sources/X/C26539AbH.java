package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shipment.ShipmentVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AbH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26539AbH extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26539AbH LJLIL = new C26539AbH();

    public C26539AbH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        return new ShipmentVH(C26558Aba.LIZ(R.layout.a_a, context, it));
    }
}
