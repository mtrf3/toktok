package X;

/* renamed from: X.Che, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32030Che extends AbstractC37594EpC<InterfaceC32029Chd, InterfaceC32031Chf> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27174"));

    @InterfaceC37838Et8(params = {"url", "type", "imageList", "header", "params"}, results = {"uploadedImageList"})
    public final String LJLILLLLZI = "uploadImageForGame";
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
