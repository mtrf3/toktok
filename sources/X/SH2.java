package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* loaded from: classes13.dex */
public interface SH2 extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "errorCode", required = false)
    Number getErrorCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "errorMessage", required = false)
    String getErrorMessage();

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorCode", required = false)
    void setErrorCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorMessage", required = false)
    void setErrorMessage(String str);
}
