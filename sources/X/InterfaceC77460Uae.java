package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Uae, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77460Uae extends XBaseParamModel {
    @ED7(option = {"open", "close"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "action", required = true)
    String getAction();

    @InterfaceC36563EWp(isGetter = true, keyPath = "badgeImageList", required = false)
    java.util.Map<String, Object> getBadgeImageList();

    @InterfaceC36563EWp(isGetter = true, keyPath = "logInfo", required = true)
    java.util.Map<String, Object> getLogInfo();
}
