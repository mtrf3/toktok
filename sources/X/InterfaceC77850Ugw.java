package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Ugw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77850Ugw extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "location", nestedClassType = InterfaceC77849Ugv.class, required = true)
    InterfaceC77849Ugv getLocation();

    @ED6(option = {0, 1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "status", required = true)
    Number getStatus();

    @InterfaceC36563EWp(isGetter = false, keyPath = "location", nestedClassType = InterfaceC77849Ugv.class, required = true)
    void setLocation(InterfaceC77849Ugv interfaceC77849Ugv);

    @ED6(option = {0, 1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "status", required = true)
    void setStatus(Number number);
}
