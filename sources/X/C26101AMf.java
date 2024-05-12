package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.discount.GlobalDiscountVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AMf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26101AMf extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26101AMf INSTANCE = new C26101AMf();

    public C26101AMf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup it) {
        o.LJIIIZ(it, "it");
        return new GlobalDiscountVH(C1FL.LIZIZ(it, R.layout.z6, it, false, "from(it.context)\n       …bmit_discount, it, false)"));
    }
}
