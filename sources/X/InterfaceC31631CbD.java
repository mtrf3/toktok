package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.CbD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31631CbD extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "errorInfo", nestedClassType = InterfaceC31630CbC.class, required = false)
    InterfaceC31630CbC getErrorInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "orderID", required = false)
    String getOrderID();

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorInfo", nestedClassType = InterfaceC31630CbC.class, required = false)
    void setErrorInfo(InterfaceC31630CbC interfaceC31630CbC);

    @InterfaceC36563EWp(isGetter = false, keyPath = "orderID", required = false)
    void setOrderID(String str);
}
