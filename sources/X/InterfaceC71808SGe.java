package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.SGe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71808SGe extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "cover", nestedClassType = InterfaceC71807SGd.class, required = true)
    InterfaceC71807SGd getCover();

    @InterfaceC36563EWp(isGetter = true, keyPath = "price", required = true)
    String getPrice();

    @InterfaceC36563EWp(isGetter = true, keyPath = "product_id", required = true)
    String getProductId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "sold_count", required = true)
    String getSoldCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = true)
    String getTitle();
}
