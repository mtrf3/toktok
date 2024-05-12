package X;

/* renamed from: X.CLr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31183CLr extends AbstractC37594EpC<InterfaceC31167CLb, InterfaceC31185CLt> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27605"));

    @InterfaceC37838Et8(params = {"user", "anchorId", "logInfo"}, results = {"notificationStatus"})
    public final String LJLILLLLZI = "liveNotification";
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
