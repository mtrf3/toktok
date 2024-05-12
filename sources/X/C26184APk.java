package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.SaveElementViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.APk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26184APk extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26184APk LJLIL = new C26184APk();

    public C26184APk() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new SaveElementViewHolder(it);
    }
}
