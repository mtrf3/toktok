package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Ufv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77787Ufv extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "error", required = true)
    String getError();

    @InterfaceC36563EWp(isGetter = true, keyPath = "errorCode", required = true)
    Number getErrorCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "errorDescription", required = true)
    String getErrorDescription();

    @InterfaceC36563EWp(isGetter = false, keyPath = "error", required = true)
    void setError(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorCode", required = true)
    void setErrorCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorDescription", required = true)
    void setErrorDescription(String str);
}
