package X;

/* renamed from: X.Guq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43040Guq extends AbstractC37594EpC<InterfaceC43031Guh, Object> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26764"));

    @InterfaceC37838Et8(params = {"itemID", "musicID"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "prefetchPromoteRecommendMusicList";
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
