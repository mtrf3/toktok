package X;

/* loaded from: classes11.dex */
public abstract class N9P extends AbstractC37594EpC<N9S, N9Q> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "24172"));

    @InterfaceC37838Et8(params = {""}, results = {"network_traceparent"})
    public final String LJLILLLLZI = "ec_get_traceparent";
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
