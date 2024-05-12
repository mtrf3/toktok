package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.YBb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86963YBb extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "center", required = true)
    String getCenter();

    @InterfaceC36563EWp(isGetter = true, keyPath = "imageHeight", required = true)
    Number getImageHeight();

    @InterfaceC36563EWp(isGetter = true, keyPath = "imageWidth", required = true)
    Number getImageWidth();

    @InterfaceC36563EWp(isGetter = true, keyPath = "maptype", required = false)
    String getMaptype();

    @InterfaceC36563EWp(isGetter = true, keyPath = "markers", required = true)
    String getMarkers();

    @InterfaceC36563EWp(isGetter = true, keyPath = "scale", required = false)
    String getScale();

    @InterfaceC36563EWp(isGetter = true, keyPath = "style", required = false)
    String getStyle();
}
