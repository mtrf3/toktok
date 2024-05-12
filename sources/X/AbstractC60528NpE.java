package X;

/* renamed from: X.NpE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC60528NpE extends AbstractC37594EpC<InterfaceC60527NpD, InterfaceC60530NpG> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "24103"));

    @InterfaceC37838Et8(results = {"phoneCode", "shortCountryName"})
    public final String LJLILLLLZI = "choosePhoneArea";
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
