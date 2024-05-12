package X;

/* renamed from: X.UgU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77822UgU extends AbstractC37594EpC<InterfaceC77823UgV, InterfaceC77824UgW> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26592"));

    @InterfaceC37838Et8(params = {"schema"})
    public final String LJLILLLLZI = "gameOpenSheetSchema";
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
