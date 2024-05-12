package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rku, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70452Rku extends AbstractC38521fE {
    @Override // X.AbstractC38521fE
    public final String LJI() {
        return "ec_page_scroll_state_change";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70452Rku(String productId) {
        super(productId);
        o.LJIIIZ(productId, "productId");
    }

    public final void LJIIL(EnumC70453Rkv state, Boolean bool) {
        o.LJIIIZ(state, "state");
        ((java.util.Map) this.LJLILLLLZI).put("state", Integer.valueOf(state.getValue()));
        if (bool != null) {
            bool.booleanValue();
            ((java.util.Map) this.LJLILLLLZI).put("is_down", bool);
        }
    }
}
