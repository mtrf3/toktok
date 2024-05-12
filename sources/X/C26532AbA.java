package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.ttf.delivery.module.logistic.TtfExtraLogisticsInfoViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AbA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26532AbA extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26532AbA LJLIL = new C26532AbA();

    public C26532AbA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new TtfExtraLogisticsInfoViewHolder(it);
    }
}
