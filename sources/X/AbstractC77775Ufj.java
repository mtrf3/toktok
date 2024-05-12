package X;

/* renamed from: X.Ufj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77775Ufj extends AbstractC37594EpC<InterfaceC77776Ufk, InterfaceC77779Ufn> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29811"));

    @InterfaceC37838Et8(params = {"roomID", "taskID", "audienceUID", "anchorID", "appID", "packageName", "isAnchor", "gameID", "CPPURL", "deepLink", WM7.SCENE_SERVICE, "siteID", "sourceID"})
    public final String LJLILLLLZI = "downloadPartneringGame";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PROTECT;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final EnumC38004Evo getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC37666EqM
    public final String getName() {
        return this.LJLILLLLZI;
    }
}
