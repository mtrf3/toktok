package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.SeeMoreViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.APn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26187APn extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26187APn LJLIL = new C26187APn();

    public C26187APn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new SeeMoreViewHolder(it);
    }
}
