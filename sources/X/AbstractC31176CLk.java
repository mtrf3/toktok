package X;

/* renamed from: X.CLk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31176CLk extends AbstractC31179CLn<InterfaceC31166CLa, InterfaceC31175CLj> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "23218"));

    @InterfaceC37838Et8(params = {"cover_url", "title", "desc", "inner_url", "url", "third_party_desc", "uid"}, results = {"share_platfrom", "shareType"})
    public final String LJLILLLLZI = "shareSubInvitation";
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
