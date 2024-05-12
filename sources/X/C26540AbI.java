package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.discount.TtfDiscountVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AbI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26540AbI extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26540AbI LJLIL = new C26540AbI();

    public C26540AbI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        return new TtfDiscountVH(C26558Aba.LIZ(R.layout.a18, context, it));
    }
}
