package X;

/* renamed from: X.Ug0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77792Ug0 extends AbstractC37594EpC<InterfaceC77791Ufz, InterfaceC77794Ug2> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26590"));

    @InterfaceC37838Et8(params = {"room_id", "m3u8_url", "status", "download_url", "enter_from_page", "duration", "video_info", "enter_from", "video_length"})
    public final String LJLILLLLZI = "openReplayPlayer";
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
