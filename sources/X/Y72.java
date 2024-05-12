package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* loaded from: classes16.dex */
public interface Y72 extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "requiredTextNum", required = false)
    Number getRequiredTextNum();

    @InterfaceC36563EWp(isGetter = true, keyPath = "successTextNum", required = false)
    Number getSuccessTextNum();

    @InterfaceC36563EWp(isGetter = true, keyPath = "usedTextNum", required = false)
    Number getUsedTextNum();

    @InterfaceC36563EWp(isGetter = false, keyPath = "requiredTextNum", required = false)
    void setRequiredTextNum(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "successTextNum", required = false)
    void setSuccessTextNum(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "usedTextNum", required = false)
    void setUsedTextNum(Number number);
}
