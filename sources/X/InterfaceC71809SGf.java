package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.SGf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71809SGf extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "product_info", nestedClassType = InterfaceC71808SGe.class, required = true)
    InterfaceC71808SGe getProductInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "seller_info", nestedClassType = InterfaceC71810SGg.class, required = true)
    InterfaceC71810SGg getSellerInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "share_deeplink", required = true)
    String getShareDeeplink();
}
