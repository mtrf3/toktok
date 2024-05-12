package X;

/* renamed from: X.Cee, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31844Cee extends AbstractC37594EpC<InterfaceC31843Ced, InterfaceC31841Ceb> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27594"));

    @InterfaceC37838Et8(params = {"innerUrl", "outerUrl", "coverUrl", "title", "desc", "senderPreviewText", "receiverPreviewText", "quotePreviewText", "titleStarlingKey", "titleStarlingKeyArgs", "descriptionStarlingKey", "descriptionStarlingKeyArgs", "senderPreviewTextStarlingKey", "senderPreviewTextStarlingKeyArgs", "receiverPreviewTextStarlingKey", "receiverPreviewTextStarlingKeyArgs", "quotePreviewTextStarlingKey", "quotePreviewTextStarlingKeyArgs", "outerTitle", "outerDescription"}, results = {"shareSuccess", "sharePlatform", "toUserId"})
    public final String LJLILLLLZI = "subLinkShare";
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
