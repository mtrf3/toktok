package X;

/* renamed from: X.FAl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38535FAl extends AbstractC37594EpC<InterfaceC38536FAm, InterfaceC38537FAn> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29878"));

    @InterfaceC37838Et8(params = {"key", "action", "userActData"}, results = {"userActData"})
    public final String LJLILLLLZI = "ecSearchManageUserAct";
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
