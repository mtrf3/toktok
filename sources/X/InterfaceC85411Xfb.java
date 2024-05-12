package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Xfb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC85411Xfb extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "denied", nestedClassType = InterfaceC85415Xff.class, required = false)
    InterfaceC85415Xff getDenied();

    @InterfaceC36563EWp(isGetter = true, keyPath = "granted", nestedClassType = InterfaceC85414Xfe.class, required = false)
    InterfaceC85414Xfe getGranted();

    @InterfaceC36563EWp(isGetter = false, keyPath = "denied", nestedClassType = InterfaceC85415Xff.class, required = false)
    void setDenied(InterfaceC85415Xff interfaceC85415Xff);

    @InterfaceC36563EWp(isGetter = false, keyPath = "granted", nestedClassType = InterfaceC85414Xfe.class, required = false)
    void setGranted(InterfaceC85414Xfe interfaceC85414Xfe);
}
