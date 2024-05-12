package X;

/* renamed from: X.SGo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71818SGo extends AbstractC37594EpC<InterfaceC71815SGl, InterfaceC71819SGp> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26428"));

    @InterfaceC37838Et8(params = {"authConfig", "uploadConfig", "filePaths"}, results = {"imageInfos", "errorInfo", "traceId"})
    public final String LJLILLLLZI = "x.uploadImagesToImageX";
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
