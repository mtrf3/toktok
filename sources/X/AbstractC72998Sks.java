package X;

/* renamed from: X.Sks, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC72998Sks extends AbstractC37594EpC<InterfaceC73001Skv, InterfaceC72999Skt> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "28416"));

    @InterfaceC37838Et8(params = {"url", "suffix", "redirect", "schema", "roomid", "anchor_id", "enter_from_page", "enter_from", "clip_id", "duration", "shoot_way"})
    public final String LJLILLLLZI = "postVideo";
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
