package X;

/* renamed from: X.N8d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC58859N8d extends AbstractC37594EpC<InterfaceC58861N8f, InterfaceC58858N8c> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "25559"));

    @InterfaceC37838Et8(params = {"status"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "notifyFeedbackStatus";
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
