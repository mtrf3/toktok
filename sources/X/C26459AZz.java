package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectdescription.USLogisticDiscriptionVH;
import kotlin.jvm.internal.o;

/* renamed from: X.AZz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26459AZz extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26459AZz LJLIL = new C26459AZz();

    public C26459AZz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new USLogisticDiscriptionVH(it);
    }
}
