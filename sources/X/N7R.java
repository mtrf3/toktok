package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* loaded from: classes11.dex */
public interface N7R extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "routeUrls", primitiveClassType = String.class, required = false)
    List<String> getRouteUrls();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shortcutIconData", required = false)
    String getShortcutIconData();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shortcutIconPath", required = false)
    String getShortcutIconPath();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shortcutId", required = true)
    String getShortcutId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shortcutLabel", required = true)
    String getShortcutLabel();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shortcutNeedLogin", required = true)
    boolean getShortcutNeedLogin();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shortcutRouteAction", required = false)
    String getShortcutRouteAction();
}
