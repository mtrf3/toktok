package X;

/* renamed from: X.SGb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71805SGb extends AbstractC37594EpC<InterfaceC71809SGf, InterfaceC71811SGh> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "20853"));

    @InterfaceC37838Et8(params = {"product_info", "seller_info", "share_deeplink"})
    public final String LJLILLLLZI = "ec_product_share_action";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final EnumC38004Evo getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC37666EqM
    public final String getName() {
        return this.LJLILLLLZI;
    }
}
