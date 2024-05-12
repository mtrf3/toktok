package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.XfZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC85409XfZ extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "authorizationParams", nestedClassType = InterfaceC85413Xfd.class, required = false)
    InterfaceC85413Xfd getAuthorizationParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "business", required = true)
    String getBusiness();

    @InterfaceC36563EWp(isGetter = true, keyPath = "certName", required = true)
    String getCertName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "certNameForNotReduced", required = true)
    String getCertNameForNotReduced();

    @InterfaceC36563EWp(isGetter = true, keyPath = WM7.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC36563EWp(isGetter = true, keyPath = "trackParams", nestedClassType = InterfaceC85412Xfc.class, required = false)
    InterfaceC85412Xfc getTrackParams();
}
