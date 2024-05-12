package X;

/* renamed from: X.Xtc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86280Xtc extends AbstractC37594EpC<InterfaceC86279Xtb, InterfaceC86281Xtd> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "20202"));

    @InterfaceC37838Et8(params = {"dataURL", "filename", "extension", "saveToAlbum"}, results = {"filePath"})
    public final String LJLILLLLZI = "x.saveDataURL";
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
