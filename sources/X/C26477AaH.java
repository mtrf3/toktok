package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayout.ViewMoreVH;
import kotlin.jvm.internal.o;

/* renamed from: X.AaH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26477AaH extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26477AaH LJLIL = new C26477AaH();

    public C26477AaH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new ViewMoreVH(it);
    }
}
