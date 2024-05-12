package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Ugr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77845Ugr extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "chargeReason", required = true)
    String getChargeReason();

    @InterfaceC36563EWp(isGetter = true, keyPath = "extra", required = false)
    java.util.Map<String, Object> getExtra();

    @InterfaceC36563EWp(isGetter = true, keyPath = "requestPage", required = true)
    String getRequestPage();
}
