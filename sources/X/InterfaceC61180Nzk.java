package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Nzk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC61180Nzk extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "formattedAddress", required = true)
    String getFormattedAddress();

    @InterfaceC36563EWp(isGetter = true, keyPath = "latitude", required = true)
    Number getLatitude();

    @InterfaceC36563EWp(isGetter = true, keyPath = "longitude", required = true)
    Number getLongitude();

    @InterfaceC36563EWp(isGetter = true, keyPath = "maptype", required = true)
    String getMaptype();

    @InterfaceC36563EWp(isGetter = true, keyPath = "poiName", required = true)
    String getPoiName();
}
