package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticPromotionHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Ab3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26525Ab3 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26525Ab3 LJLIL = new C26525Ab3();

    public C26525Ab3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new LogisticPromotionHolder(it);
    }
}
