package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Ud0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77606Ud0 extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "amountLimit", required = false)
    String getAmountLimit();

    @InterfaceC36563EWp(isGetter = true, keyPath = "chargeErrorCode", required = false)
    Number getChargeErrorCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "source", required = false)
    Number getSource();

    @InterfaceC36563EWp(isGetter = true, keyPath = "status", required = true)
    Number getStatus();

    @InterfaceC36563EWp(isGetter = true, keyPath = "userType", required = false)
    String getUserType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isWithinPeriod", required = false)
    Boolean isWithinPeriod();

    @InterfaceC36563EWp(isGetter = false, keyPath = "amountLimit", required = false)
    void setAmountLimit(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "chargeErrorCode", required = false)
    void setChargeErrorCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "source", required = false)
    void setSource(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "status", required = true)
    void setStatus(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "userType", required = false)
    void setUserType(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "isWithinPeriod", required = false)
    void setWithinPeriod(Boolean bool);
}
