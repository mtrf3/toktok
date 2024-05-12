package X;

/* renamed from: X.UgK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77812UgK extends AbstractC37594EpC<InterfaceC77811UgJ, InterfaceC77802UgA> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27842"));

    @InterfaceC37838Et8(params = {"giftId", "giftCount", "giftType", "toUserId", "secToUserId", "clientShowComboButton", "toRoomId", "eventData", "fromUserId", "secFromUserId", "closeGiftPanel", "allowCharge", "comboOffsetX", "comboOffsetY", "giftsInBox", "giftExtra", "comboButtonAwaitBehaviour", "toUserNickName"}, results = {"errorCode"})
    public final String LJLILLLLZI = "sendGiftV2";
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
