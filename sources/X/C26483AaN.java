package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.global.address.edit.vh.GlobalDividerViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AaN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26483AaN extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26483AaN LJLIL = new C26483AaN();

    public C26483AaN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new GlobalDividerViewHolder(it);
    }
}