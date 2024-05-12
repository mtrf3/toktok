package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Xfm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC85422Xfm extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "collectStatus", required = true)
    boolean getCollectStatus();

    @InterfaceC36563EWp(isGetter = true, keyPath = "poiAddress", required = false)
    String getPoiAddress();

    @InterfaceC36563EWp(isGetter = true, keyPath = "poiID", required = true)
    String getPoiID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "poiName", required = false)
    String getPoiName();
}
