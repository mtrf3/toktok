package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.AddressVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AbE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26536AbE extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26536AbE LJLIL = new C26536AbE();

    public C26536AbE() {
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
