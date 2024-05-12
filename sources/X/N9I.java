package X;

/* loaded from: classes11.dex */
public abstract class N9I extends AbstractC37594EpC<N9K, N9H> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27070"));

    @InterfaceC37838Et8(params = {"opeartion"}, results = {"status"})
    public final String LJLILLLLZI = "getPhotoAlbumAuth";
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
