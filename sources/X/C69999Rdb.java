package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rdb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69999Rdb extends AbstractC38521fE {
    @Override // X.AbstractC38521fE
    public final String LJI() {
        return "ec_page_refresh";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69999Rdb(String productId) {
        super(productId);
        o.LJIIIZ(productId, "productId");
    }

    public final void LJIIL(EnumC70000Rdc state) {
        o.LJIIIZ(state, "state");
        ((java.util.Map) this.LJLILLLLZI).put("event_type", Integer.valueOf(state.getValue()));
    }
}
