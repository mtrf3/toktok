package X;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USSwitchInputItemVH;
import kotlin.jvm.internal.o;

/* renamed from: X.AMe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26100AMe extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, JediViewHolder<? extends InterfaceC98243tM, ?>> {
    public static final C26100AMe LJLIL = new C26100AMe();

    public C26100AMe() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final JediViewHolder<? extends InterfaceC98243tM, ?> invoke(ViewGroup viewGroup) {
        ViewGroup it = viewGroup;
        o.LJIIIZ(it, "it");
        return new USSwitchInputItemVH(it);
    }
}
