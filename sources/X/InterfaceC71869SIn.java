package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.SIn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71869SIn extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "autoRouteSchema", required = false)
    String getAutoRouteSchema();

    @InterfaceC36563EWp(isGetter = true, keyPath = "bagAutoRoute", required = false)
    Number getBagAutoRoute();

    @InterfaceC36563EWp(isGetter = true, keyPath = "bagLogExtra", required = false)
    String getBagLogExtra();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enterFromMerge", required = true)
    String getEnterFromMerge();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC36563EWp(isGetter = true, keyPath = "hasCommerceGoods", required = false)
    Boolean getHasCommerceGoods();

    @InterfaceC36563EWp(isGetter = true, keyPath = "logExtra", required = false)
    java.util.Map<String, Object> getLogExtra();

    @InterfaceC36563EWp(isGetter = true, keyPath = "owner", required = false)
    String getOwner();

    @InterfaceC36563EWp(isGetter = true, keyPath = "playerTag", required = false)
    String getPlayerTag();

    @InterfaceC36563EWp(isGetter = true, keyPath = "roomId", required = true)
    String getRoomId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "streamData", required = false)
    String getStreamData();
}
