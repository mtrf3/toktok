package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Xfe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC85414Xfe extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "inAppIsNotReduced", required = true)
    Boolean getInAppIsNotReduced();

    @InterfaceC36563EWp(isGetter = true, keyPath = "systemIsNotReduced", required = true)
    Boolean getSystemIsNotReduced();

    @InterfaceC36563EWp(isGetter = false, keyPath = "inAppIsNotReduced", required = true)
    void setInAppIsNotReduced(Boolean bool);

    @InterfaceC36563EWp(isGetter = false, keyPath = "systemIsNotReduced", required = true)
    void setSystemIsNotReduced(Boolean bool);
}
