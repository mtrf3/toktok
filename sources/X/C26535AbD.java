package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.ttf.delivery.uk.module.logistic.TtfUkShipFromBarHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.AbD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26535AbD extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26535AbD LJLIL = new C26535AbD();

    public C26535AbD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new TtfUkShipFromBarHolder(it);
    }
}
