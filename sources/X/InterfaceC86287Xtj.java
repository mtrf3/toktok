package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Xtj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86287Xtj extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "hideNavBar", required = false)
    Boolean getHideNavBar();

    @InterfaceC36563EWp(isGetter = true, keyPath = "navBarColor", required = false)
    String getNavBarColor();

    @InterfaceC36563EWp(isGetter = true, keyPath = "statusBarBgColor", required = false)
    String getStatusBarBgColor();

    @ED7(option = {"dark", "light"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "statusFontMode", required = false)
    String getStatusFontMode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "titleColor", required = false)
    String getTitleColor();
}
