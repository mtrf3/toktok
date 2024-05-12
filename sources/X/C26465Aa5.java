package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.moduletitle.USLogisticSelectModuleTitleVH;
import kotlin.jvm.internal.o;

/* renamed from: X.Aa5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26465Aa5 extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26465Aa5 LJLIL = new C26465Aa5();

    public C26465Aa5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new USLogisticSelectModuleTitleVH(it);
    }
}
