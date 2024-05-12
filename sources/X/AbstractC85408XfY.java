package X;

/* renamed from: X.XfY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC85408XfY extends AbstractC37594EpC<InterfaceC85407XfX, InterfaceC85417Xfh> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "25792"));

    @InterfaceC37838Et8(params = {"poi", "poiName", "showClaimStore", "isBaAccount", "enterFrom", "showSuggestAnEdit", "trackerParams", "shareInfo"})
    public final String LJLILLLLZI = "showSharePOIPanel";
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
