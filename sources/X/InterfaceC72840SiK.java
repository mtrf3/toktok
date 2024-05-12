package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.SiK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC72840SiK extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "productId", required = false)
    String getProductId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "searchEntrance", required = true)
    String getSearchEntrance();

    @InterfaceC36563EWp(isGetter = true, keyPath = "searchPosition", required = true)
    String getSearchPosition();

    @InterfaceC36563EWp(isGetter = true, keyPath = "searchlogId", required = true)
    String getSearchlogId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "userId", required = false)
    String getUserId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "wordContent", required = true)
    String getWordContent();

    @InterfaceC36563EWp(isGetter = true, keyPath = "wordGroupId", required = true)
    String getWordGroupId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "wordImageUrl", required = true)
    String getWordImageUrl();
}
