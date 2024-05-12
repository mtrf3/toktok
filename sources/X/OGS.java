package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes11.dex */
public interface OGS extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "anchorID", required = true)
    String getAnchorID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "appID", required = true)
    String getAppID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "gameID", required = true)
    String getGameID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "gameName", required = false)
    String getGameName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "packageName", required = false)
    String getPackageName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "roomID", required = true)
    String getRoomID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "taskID", required = true)
    String getTaskID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "trackingURLs", nestedClassType = InterfaceC58865N8j.class, required = true)
    InterfaceC58865N8j getTrackingURLs();

    @InterfaceC36563EWp(isGetter = true, keyPath = "viewReportScene", required = false)
    String getViewReportScene();
}
