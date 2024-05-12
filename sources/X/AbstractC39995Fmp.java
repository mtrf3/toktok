package X;

/* renamed from: X.Fmp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39995Fmp extends AbstractC37594EpC<InterfaceC39997Fmr, InterfaceC39992Fmm> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26788"));

    @InterfaceC37838Et8(params = {"audioUrl", "isLoop", "localKey", "channel"}, results = {"audioUrl", "status"})
    public final String LJLILLLLZI = "ecPlayAudio";
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
