package X;

/* loaded from: classes11.dex */
public abstract class N8K extends AbstractC37594EpC<N8J, N8L> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "25409"));

    @InterfaceC37838Et8(params = {"eventName", "params"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "adAutofill";
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