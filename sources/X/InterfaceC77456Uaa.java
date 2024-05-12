package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Uaa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77456Uaa extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "coinsCount", required = true)
    Number getCoinsCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "currencyCode", required = true)
    String getCurrencyCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "currencyDot", required = true)
    Number getCurrencyDot();

    @InterfaceC36563EWp(isGetter = true, keyPath = "diamondId", required = true)
    Number getDiamondId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "eventParams", required = false)
    java.util.Map<String, Object> getEventParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "exchangeLevel", required = true)
    String getExchangeLevel();

    @InterfaceC36563EWp(isGetter = true, keyPath = "localAmount", required = true)
    Number getLocalAmount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "penaltyWarningSkip", required = false)
    String getPenaltyWarningSkip();

    @InterfaceC36563EWp(isGetter = true, keyPath = "showAmount", required = false)
    String getShowAmount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "source", required = true)
    Number getSource();

    @InterfaceC36563EWp(isGetter = true, keyPath = "symbol", required = true)
    String getSymbol();

    @InterfaceC36563EWp(isGetter = true, keyPath = "way", required = true)
    Number getWay();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isFirstRecharge", required = true)
    boolean isFirstRecharge();
}
