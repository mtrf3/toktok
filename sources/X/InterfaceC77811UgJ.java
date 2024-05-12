package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.UgJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77811UgJ extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "allowCharge", required = false)
    Boolean getAllowCharge();

    @InterfaceC36563EWp(isGetter = true, keyPath = "clientShowComboButton", required = true)
    boolean getClientShowComboButton();

    @InterfaceC36563EWp(isGetter = true, keyPath = "closeGiftPanel", required = false)
    Number getCloseGiftPanel();

    @ED6(option = {0, 1})
    @InterfaceC36563EWp(defaultValue = @InterfaceC36566EWs(intValue = 0, type = DefaultType.INT), isEnum = true, isGetter = true, keyPath = "comboButtonAwaitBehaviour", required = false)
    Number getComboButtonAwaitBehaviour();

    @InterfaceC36563EWp(isGetter = true, keyPath = "comboOffsetX", required = false)
    Number getComboOffsetX();

    @InterfaceC36563EWp(isGetter = true, keyPath = "comboOffsetY", required = false)
    Number getComboOffsetY();

    @InterfaceC36563EWp(isGetter = true, keyPath = "eventData", nestedClassType = InterfaceC77813UgL.class, required = true)
    InterfaceC77813UgL getEventData();

    @InterfaceC36563EWp(isGetter = true, keyPath = "fromUserId", required = false)
    String getFromUserId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "giftCount", required = true)
    Number getGiftCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "giftExtra", required = false)
    String getGiftExtra();

    @InterfaceC36563EWp(isGetter = true, keyPath = "giftId", required = true)
    Number getGiftId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "giftType", required = true)
    String getGiftType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "giftsInBox", required = false)
    String getGiftsInBox();

    @InterfaceC36563EWp(isGetter = true, keyPath = "secFromUserId", required = false)
    String getSecFromUserId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "secToUserId", required = true)
    String getSecToUserId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "toRoomId", required = true)
    String getToRoomId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "toUserId", required = true)
    String getToUserId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "toUserNickName", required = false)
    String getToUserNickName();
}
