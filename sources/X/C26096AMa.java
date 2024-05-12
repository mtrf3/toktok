package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.policy.TtfPolicyVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AMa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26096AMa extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26096AMa INSTANCE = new C26096AMa();

    public C26096AMa() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup it) {
        o.LJIIIZ(it, "it");
        return new TtfPolicyVH(C1FL.LIZIZ(it, R.layout.a19, it, false, "from(it.context)\n       …it_policy_ttf, it, false)"));
    }
}
