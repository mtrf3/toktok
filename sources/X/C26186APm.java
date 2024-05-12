package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.SeeMoreViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.APm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26186APm extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26186APm LJLIL = new C26186APm();

    public C26186APm() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new SeeMoreViewHolder(it);
    }
}
