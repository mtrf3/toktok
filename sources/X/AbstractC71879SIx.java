package X;

/* renamed from: X.SIx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71879SIx extends AbstractC37594EpC<InterfaceC71880SIy, InterfaceC71881SIz> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "28889"));

    @InterfaceC37838Et8(params = {"request_id", "redirect_uri"})
    public final String LJLILLLLZI = "open_singpass_sdk";
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
