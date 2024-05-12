package X;

/* renamed from: X.Nzj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61179Nzj extends AbstractC37594EpC<InterfaceC61180Nzk, InterfaceC61178Nzi> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "24874"));

    @InterfaceC37838Et8(params = {"poiName", "formattedAddress", "latitude", "longitude", "maptype"})
    public final String LJLILLLLZI = "poiOpenMaps";
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
