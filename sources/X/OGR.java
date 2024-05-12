package X;

/* loaded from: classes11.dex */
public abstract class OGR extends AbstractC37594EpC<OGS, InterfaceC58863N8h> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26501"));

    @InterfaceC37838Et8(params = {"trackingURLs", "appID", "roomID", "taskID", "anchorID", "gameID", "viewReportScene", "packageName"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "sendThirdPartyLog";
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
