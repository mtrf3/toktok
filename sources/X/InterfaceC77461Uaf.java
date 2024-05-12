package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Uaf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77461Uaf extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "orderID", required = false)
    String getOrderID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "penaltyWarningSkip", required = false)
    String getPenaltyWarningSkip();

    @InterfaceC36563EWp(isGetter = true, keyPath = "result", required = true)
    String getResult();

    @InterfaceC36563EWp(isGetter = false, keyPath = "orderID", required = false)
    void setOrderID(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "penaltyWarningSkip", required = false)
    void setPenaltyWarningSkip(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "result", required = true)
    void setResult(String str);
}
