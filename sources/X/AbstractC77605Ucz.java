package X;

/* renamed from: X.Ucz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77605Ucz extends AbstractC37594EpC<InterfaceC77604Ucy, InterfaceC77606Ud0> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "28033"));

    @InterfaceC37838Et8(params = {"firstRecharge", "iapId", "givingCount", "diamondCount", "rechargeReason", "panelType", "diamondId", "giftEnterFrom", "notificationType", "chargeSource", "eventParams"}, results = {"status", "chargeErrorCode", "source", "userType", "isWithinPeriod", "amountLimit"})
    public final String LJLILLLLZI = "chargeForLive";
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
