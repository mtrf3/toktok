package X;

/* renamed from: X.N9j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC58891N9j extends AbstractC37594EpC<InterfaceC58892N9k, InterfaceC58894N9m> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27082"));

    @InterfaceC37838Et8(params = {"resourceId", "panelName"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "isUsingLiveEffect";
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