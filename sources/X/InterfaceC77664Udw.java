package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Udw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77664Udw extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "diamondCount", required = false)
    Number getDiamondCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "diamondId", required = false)
    Number getDiamondId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "givingCount", required = false)
    Number getGivingCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "iapId", required = false)
    String getIapId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "price", required = false)
    String getPrice();

    @InterfaceC36563EWp(isGetter = false, keyPath = "diamondCount", required = false)
    void setDiamondCount(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "diamondId", required = false)
    void setDiamondId(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "givingCount", required = false)
    void setGivingCount(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "iapId", required = false)
    void setIapId(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "price", required = false)
    void setPrice(String str);
}
