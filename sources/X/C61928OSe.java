package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OSe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61928OSe extends AbstractC38521fE {
    @Override // X.AbstractC38521fE
    public final String LJI() {
        return "ec_page_quit";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61928OSe(String productId) {
        super(productId);
        o.LJIIIZ(productId, "productId");
    }

    public final void LJIIL(long j) {
        ((java.util.Map) this.LJLILLLLZI).put("duration", Long.valueOf(j));
    }

    public final void LJIILIIL(EnumC61929OSf type) {
        o.LJIIIZ(type, "type");
        ((java.util.Map) this.LJLILLLLZI).put("quit_type", Integer.valueOf(type.getValue()));
    }
}
