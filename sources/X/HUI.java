package X;

/* loaded from: classes8.dex */
public abstract class HUI extends AbstractC37594EpC<HUH, InterfaceC44116HTc> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26498"));

    @InterfaceC37838Et8(params = {"type", "maxSelectVideoCount", "maxSelectAssetCount", "minRecordSeconds", "maxRecordSeconds", "imageCompress", "videoCompress", "base64DataCompress", "videoTargetSize", "showPreviewAfterRecord", "previousPage", "toolbarType"}, results = {"files"})
    public final String LJLILLLLZI = "ecChooseMedia";
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
