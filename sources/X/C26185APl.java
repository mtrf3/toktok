package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.SaveElementViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.APl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26185APl extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26185APl LJLIL = new C26185APl();

    public C26185APl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new SaveElementViewHolder(it);
    }
}
