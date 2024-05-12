package X;

/* renamed from: X.UgP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77817UgP extends AbstractC37594EpC<InterfaceC77819UgR, InterfaceC77818UgQ> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29766"));

    @InterfaceC37838Et8(params = {"roomID"}, results = {"chatEnable"})
    public final String LJLILLLLZI = "getRoomChatEnable";
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
