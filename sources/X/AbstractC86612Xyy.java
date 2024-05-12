package X;

/* renamed from: X.Xyy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86612Xyy extends AbstractC37594EpC<InterfaceC86610Xyw, InterfaceC86614Xz0> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29591"));

    @InterfaceC37838Et8(params = {"url", "method", "body", "bodyType", "params", "header", "disableRedirect", "jsonFormatOption", "_jsb_secure_dataflow_id"}, results = {"httpCode", "clientCode", "header", "response", "responseType", "rawResponse"})
    public final String LJLILLLLZI = "x.requestForThird";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.SECURE;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final EnumC38004Evo getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC37666EqM
    public final String getName() {
        return this.LJLILLLLZI;
    }
}
