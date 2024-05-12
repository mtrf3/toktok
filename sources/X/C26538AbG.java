package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.AddressVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AbG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26538AbG extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26538AbG LJLIL = new C26538AbG();

    public C26538AbG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        View LIZ = C26558Aba.LIZ(R.layout.a9w, context, it);
        LIZ.setTag("address_item_view");
        return new AddressVH(LIZ);
    }
}
