package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.addon.AddonOrderVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ANg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26128ANg extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26128ANg INSTANCE = new C26128ANg();

    public C26128ANg() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup it) {
        o.LJIIIZ(it, "it");
        return new AddonOrderVH(C1FL.LIZIZ(it, R.layout.a9v, it, false, "from(it.context)\n       …                        )"));
    }
}
