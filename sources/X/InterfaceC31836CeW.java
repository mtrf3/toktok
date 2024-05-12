package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.CeW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31836CeW extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "errorInfo", nestedClassType = InterfaceC31837CeX.class, required = false)
    InterfaceC31837CeX getErrorInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "inAppClientData", nestedClassType = InterfaceC31838CeY.class, required = false)
    InterfaceC31838CeY getInAppClientData();

    @InterfaceC36563EWp(isGetter = true, keyPath = "products", required = false)
    Object getProducts();

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorInfo", nestedClassType = InterfaceC31837CeX.class, required = false)
    void setErrorInfo(InterfaceC31837CeX interfaceC31837CeX);

    @InterfaceC36563EWp(isGetter = false, keyPath = "inAppClientData", nestedClassType = InterfaceC31838CeY.class, required = false)
    void setInAppClientData(InterfaceC31838CeY interfaceC31838CeY);

    @InterfaceC36563EWp(isGetter = false, keyPath = "products", required = false)
    void setProducts(Object obj);
}
