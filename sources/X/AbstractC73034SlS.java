package X;

/* renamed from: X.SlS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73034SlS extends AbstractC37594EpC<InterfaceC73037SlV, InterfaceC73035SlT> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29961"));

    @InterfaceC37838Et8(params = {"room_id", "play_url", "enter_from_page", "enter_from", "duration", "last_page"})
    public final String LJLILLLLZI = "openVideoClipPage";
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
