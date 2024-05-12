package X;

/* renamed from: X.Ufp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77781Ufp extends AbstractC37594EpC<InterfaceC77782Ufq, InterfaceC77788Ufw> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29459"));

    @InterfaceC37838Et8(params = {"deeplink", "url", "packageName", "jumpType", "roomID", "taskID", "audienceUID", "anchorID", "appID", "gameID", "gameName"}, results = {"response"})
    public final String LJLILLLLZI = "gameJumpToApp";
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
