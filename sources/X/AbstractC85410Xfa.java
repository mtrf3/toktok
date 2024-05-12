package X;

/* renamed from: X.Xfa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC85410Xfa extends AbstractC37594EpC<InterfaceC85409XfZ, InterfaceC85411Xfb> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29857"));

    @InterfaceC37838Et8(params = {"business", WM7.SCENE_SERVICE, "certName", "certNameForNotReduced", "authorizationParams", "trackParams"}, results = {"granted", "denied"})
    public final String LJLILLLLZI = "x.requestLocationPermission";
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
