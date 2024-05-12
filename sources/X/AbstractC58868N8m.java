package X;

/* renamed from: X.N8m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC58868N8m extends AbstractC37594EpC<InterfaceC58869N8n, InterfaceC58866N8k> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "28635"));

    @InterfaceC37838Et8(params = {"lifecycle", "debugBtn", "pageName", "extraData"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "ec_provide_debug_message";
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
