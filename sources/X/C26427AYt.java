package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.CertificationViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AYt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26427AYt extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26427AYt LJLIL = new C26427AYt();

    public C26427AYt() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new CertificationViewHolder(it);
    }
}