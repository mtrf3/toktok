package X;

/* renamed from: X.Ugu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77848Ugu extends AbstractC37594EpC<InterfaceC77844Ugq, InterfaceC77850Ugw> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "24788"));

    @InterfaceC37838Et8(params = {"level", "region", "traceData", "defaultLocation"}, results = {"status", "location"})
    public final String LJLILLLLZI = "showLocationPicker";
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
