package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpFlashSaleReminderViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AMo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26110AMo extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26110AMo LJLIL = new C26110AMo();

    public C26110AMo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new PdpFlashSaleReminderViewHolder(it);
    }
}
