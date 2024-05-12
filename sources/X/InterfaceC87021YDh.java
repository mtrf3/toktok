package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.YDh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC87021YDh extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "hasShopTab", required = true)
    Boolean getHasShopTab();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shopTabPosition", required = true)
    String getShopTabPosition();

    @InterfaceC36563EWp(isGetter = false, keyPath = "hasShopTab", required = true)
    void setHasShopTab(Boolean bool);

    @InterfaceC36563EWp(isGetter = false, keyPath = "shopTabPosition", required = true)
    void setShopTabPosition(String str);
}
