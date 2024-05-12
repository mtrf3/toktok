package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.AddressEditCategoryHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AaE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26474AaE extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26474AaE LJLIL = new C26474AaE();

    public C26474AaE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new AddressEditCategoryHolder(it);
    }
}
