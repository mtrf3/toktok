package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.CbC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31630CbC extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "errorCode", required = true)
    Number getErrorCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "errorDetailCode", required = true)
    Number getErrorDetailCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "errorMsg", required = true)
    String getErrorMsg();

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorCode", required = true)
    void setErrorCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorDetailCode", required = true)
    void setErrorDetailCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorMsg", required = true)
    void setErrorMsg(String str);
}
