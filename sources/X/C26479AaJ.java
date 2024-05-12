package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.common.JediSpaceHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AaJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26479AaJ extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26479AaJ LJLIL = new C26479AaJ();

    public C26479AaJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new JediSpaceHolder(it);
    }
}
