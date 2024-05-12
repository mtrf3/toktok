package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* loaded from: classes11.dex */
public interface OCN extends XBaseModel {
    @ED6(option = {0, 1})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "disableNavBarBackButton", required = false)
    Number getDisableNavBarBackButton();

    @ED6(option = {0, 1})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "disableSwipe", required = false)
    Number getDisableSwipe();

    @ED7(option = {"collect", "report", "share"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "navBtnType", required = false)
    String getNavBtnType();
}
