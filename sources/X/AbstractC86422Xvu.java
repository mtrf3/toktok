package X;

/* renamed from: X.Xvu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86422Xvu extends AbstractC37594EpC<InterfaceC86421Xvt, InterfaceC86423Xvv> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26957"));

    @InterfaceC37838Et8(params = {"originLongitude", "originLatitude"}, results = {"encryptedLongitude", "encryptedLatitude"})
    public final String LJLILLLLZI = "encryptLatLng";
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
