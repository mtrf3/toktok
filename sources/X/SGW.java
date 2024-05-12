package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* loaded from: classes13.dex */
public interface SGW extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "click_event_params", required = true)
    String getClickEventParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "dark_icon", required = false)
    String getDarkIcon();

    @InterfaceC36563EWp(isGetter = true, keyPath = "icon", required = true)
    String getIcon();

    @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = true)
    String getTitle();
}
