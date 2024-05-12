package X;

/* renamed from: X.UzG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78986UzG extends AbstractC37594EpC<InterfaceC78987UzH, InterfaceC78988UzI> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29714"));

    @InterfaceC37838Et8(params = {"verifyCode"}, results = {"result"})
    public final String LJLILLLLZI = "verificationCheck";
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
