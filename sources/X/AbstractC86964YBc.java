package X;

/* renamed from: X.YBc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86964YBc extends AbstractC37594EpC<InterfaceC86963YBb, InterfaceC86965YBd> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "24780"));

    @InterfaceC37838Et8(params = {"center", "imageWidth", "imageHeight", "markers", "scale", "maptype", "style"}, results = {"staticMapURL"})
    public final String LJLILLLLZI = "getPOIStaticMapURL";
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
