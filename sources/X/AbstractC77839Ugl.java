package X;

/* renamed from: X.Ugl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77839Ugl extends AbstractC37594EpC<InterfaceC77840Ugm, InterfaceC77841Ugn> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "28193"));

    @InterfaceC37838Et8(params = {"bannerID", "status"})
    public final String LJLILLLLZI = "liveBannerItemStatusChanged";
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
