package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ANG extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final ANG INSTANCE = new ANG();

    public ANG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup it) {
        o.LJIIIZ(it, "it");
        return new CpfVH(C1FL.LIZIZ(it, R.layout.a0y, it, false, "from(it.context)\n       …submit_cpf_vh, it, false)"));
    }
}
