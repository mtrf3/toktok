package X;

/* renamed from: X.CeU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31834CeU extends AbstractC37594EpC<InterfaceC31835CeV, InterfaceC31836CeW> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "28011"));

    @InterfaceC37838Et8(params = {"productIDs", "productType", "merchantID"}, results = {"products", "errorInfo", "inAppClientData"})
    public final String LJLILLLLZI = "getIapProductsV2";
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
