package X;

/* renamed from: X.Xfl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC85421Xfl extends AbstractC37594EpC<InterfaceC85422Xfm, Object> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27657"));

    @InterfaceC37838Et8(params = {"poiID", "collectStatus", "poiName", "poiAddress"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "poiCollectNotice";
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
