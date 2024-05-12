package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.ttf.delivery.module.logistic.TtfShipToBarHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Ab9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26531Ab9 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26531Ab9 LJLIL = new C26531Ab9();

    public C26531Ab9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new TtfShipToBarHolder(it);
    }
}
