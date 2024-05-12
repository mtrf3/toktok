package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Ugq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77844Ugq extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "defaultLocation", required = false)
    String getDefaultLocation();

    @ED6(option = {0, 1, 2, 3})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "level", required = true)
    Number getLevel();

    @InterfaceC36563EWp(isGetter = true, keyPath = "region", required = true)
    String getRegion();

    @InterfaceC36563EWp(isGetter = true, keyPath = "traceData", nestedClassType = InterfaceC77845Ugr.class, required = true)
    InterfaceC77845Ugr getTraceData();
}
