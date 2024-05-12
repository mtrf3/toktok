package X;

/* renamed from: X.N9h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC58889N9h extends AbstractC37594EpC<InterfaceC58890N9i, InterfaceC58887N9f> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27083"));

    @InterfaceC37838Et8(params = {"resourceId", "panelName", "tabKey"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "downloadLiveEffect";
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
