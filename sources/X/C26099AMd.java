package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.DescItemViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AMd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26099AMd extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26099AMd LJLIL = new C26099AMd();

    public C26099AMd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new DescItemViewHolder(it);
    }
}
