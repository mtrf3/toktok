package X;

/* renamed from: X.Uht, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77909Uht extends AbstractC37594EpC<InterfaceC77910Uhu, InterfaceC77907Uhr> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "25593"));

    @InterfaceC37838Et8(params = {"callbackUrl", "loginContext"}, results = {"errorCode"})
    public final String LJLILLLLZI = "loginOrRegister";
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
