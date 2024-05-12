package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.UgL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77813UgL extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "extra", required = false)
    java.util.Map<String, Object> getExtra();

    @InterfaceC36563EWp(isGetter = true, keyPath = "giftEnterMethod", required = true)
    String getGiftEnterMethod();

    @InterfaceC36563EWp(isGetter = true, keyPath = "giftEnterPage", required = false)
    String getGiftEnterPage();

    @InterfaceC36563EWp(isGetter = true, keyPath = "giftEnterSource", required = true)
    String getGiftEnterSource();
}
