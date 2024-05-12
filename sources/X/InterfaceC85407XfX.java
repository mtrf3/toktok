package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.XfX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC85407XfX extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC36563EWp(isGetter = true, keyPath = "poi", required = true)
    String getPoi();

    @InterfaceC36563EWp(isGetter = true, keyPath = "poiName", required = true)
    String getPoiName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shareInfo", required = false)
    java.util.Map<String, Object> getShareInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "showClaimStore", required = true)
    boolean getShowClaimStore();

    @InterfaceC36563EWp(isGetter = true, keyPath = "showSuggestAnEdit", required = true)
    boolean getShowSuggestAnEdit();

    @InterfaceC36563EWp(isGetter = true, keyPath = "trackerParams", required = false)
    java.util.Map<String, Object> getTrackerParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isBaAccount", required = true)
    boolean isBaAccount();
}
