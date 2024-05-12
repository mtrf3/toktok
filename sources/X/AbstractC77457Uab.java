package X;

/* renamed from: X.Uab, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77457Uab extends AbstractC37594EpC<InterfaceC77456Uaa, InterfaceC77461Uaf> {
    public static final java.util.Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29929"));

    @InterfaceC37838Et8(params = {"diamondId", "way", "source", "coinsCount", "localAmount", "currencyCode", "showAmount", "symbol", "exchangeLevel", "currencyDot", "isFirstRecharge", "eventParams", "penaltyWarningSkip"}, results = {"result", "orderID", "penaltyWarningSkip"})
    public final String LJLILLLLZI = "exchangeCoinsForLive";
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
