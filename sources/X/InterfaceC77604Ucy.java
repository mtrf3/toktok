package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Ucy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77604Ucy extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "chargeSource", required = true)
    Number getChargeSource();

    @InterfaceC36563EWp(isGetter = true, keyPath = "diamondCount", required = true)
    Number getDiamondCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "diamondId", required = true)
    Number getDiamondId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "eventParams", required = false)
    java.util.Map<String, Object> getEventParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "firstRecharge", required = false)
    Boolean getFirstRecharge();

    @InterfaceC36563EWp(isGetter = true, keyPath = "giftEnterFrom", required = true)
    String getGiftEnterFrom();

    @InterfaceC36563EWp(isGetter = true, keyPath = "givingCount", required = true)
    String getGivingCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "iapId", required = true)
    String getIapId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "notificationType", required = true)
    String getNotificationType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "panelType", required = true)
    String getPanelType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "rechargeReason", required = true)
    String getRechargeReason();
}
