package X;

/* renamed from: X.SGy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71828SGy extends AbstractC37594EpC<SH0, SH1> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26429"));

    @InterfaceC37838Et8(params = {"authConfig", "uploadConfig", "filePath"}, results = {"traceId", "errorInfo", "videoInfo"})
    public final String LJLILLLLZI = "x.uploadVideoToVOD";
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
