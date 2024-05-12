package X;

/* renamed from: X.Ugf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77833Ugf extends AbstractC37594EpC<InterfaceC77835Ugh, InterfaceC77836Ugi> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "30116"));

    @InterfaceC37838Et8(params = {"userType", "roomId", "taskId"}, results = {"data"})
    public final String LJLILLLLZI = "getGamePartnershipCachedData";
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
