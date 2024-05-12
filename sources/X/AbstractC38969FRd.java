package X;

/* renamed from: X.FRd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38969FRd extends AbstractC37594EpC<InterfaceC38970FRe, InterfaceC38971FRf> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "28290"));

    @InterfaceC37838Et8(params = {"universalLink", "deeplink", "schema", "appPackageName"}, results = {"appInstalled"})
    public final String LJLILLLLZI = "open_third_party_link";
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
