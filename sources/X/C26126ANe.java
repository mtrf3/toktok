package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ANe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26126ANe extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26126ANe INSTANCE = new C26126ANe();

    public C26126ANe() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup it) {
        o.LJIIIZ(it, "it");
        return new USAddonOrderVH(C1FL.LIZIZ(it, R.layout.a92, it, false, "from(it.context).inflate…_order_sku_vh, it, false)"));
    }
}
