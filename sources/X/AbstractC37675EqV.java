package X;

/* renamed from: X.EqV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37675EqV extends AbstractC37594EpC<InterfaceC37676EqW, EX5> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "25774"));

    @InterfaceC37838Et8(params = {"productIdList", "pdp_template", "sourcePageType", "trafficSourceList", "pageSourceList"})
    public final String LJLILLLLZI = "ec_prefetch_pdp";
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