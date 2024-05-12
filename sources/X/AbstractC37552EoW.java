package X;

/* renamed from: X.EoW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37552EoW extends AbstractC37594EpC<InterfaceC37554EoY, InterfaceC36553EWf> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29080"));

    @InterfaceC37838Et8(params = {"loadMoreParams"}, results = {"jsonDict"})
    public final String LJLILLLLZI = "ecSearchLoadMoreLiveRooms";
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
