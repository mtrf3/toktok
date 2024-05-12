package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AbF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26537AbF extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26537AbF LJLIL = new C26537AbF();

    public C26537AbF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        return new PlatformDiscountsVH(C26558Aba.LIZ(R.layout.a17, context, it));
    }
}
