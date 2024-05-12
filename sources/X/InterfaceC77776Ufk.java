package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Ufk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77776Ufk extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "anchorID", required = false)
    String getAnchorID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "appID", required = false)
    String getAppID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "audienceUID", required = false)
    String getAudienceUID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "CPPURL", required = false)
    String getCPPURL();

    @InterfaceC36563EWp(isGetter = true, keyPath = "deepLink", required = false)
    String getDeepLink();

    @InterfaceC36563EWp(isGetter = true, keyPath = "gameID", required = true)
    String getGameID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "packageName", required = false)
    String getPackageName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "roomID", required = false)
    String getRoomID();

    @InterfaceC36563EWp(isGetter = true, keyPath = WM7.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC36563EWp(isGetter = true, keyPath = "siteID", required = false)
    String getSiteID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "sourceID", required = false)
    String getSourceID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "taskID", required = false)
    String getTaskID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isAnchor", required = false)
    Boolean isAnchor();
}
