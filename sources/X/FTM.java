package X;

/* loaded from: classes7.dex */
public abstract class FTM extends AbstractC37594EpC<FTP, FTN> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29724"));

    @InterfaceC37838Et8(params = {"phoneNumber", "content", "_jsb_secure_dataflow_id"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "x.sendSMS";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.SECURE;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final EnumC38004Evo getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC37666EqM
    public final String getName() {
        return this.LJLILLLLZI;
    }
}
