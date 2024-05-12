package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* loaded from: classes7.dex */
public interface EX4 extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "extra", required = false)
    java.util.Map<String, Object> getExtra();

    @InterfaceC36563EWp(isGetter = true, keyPath = "pageName", required = true)
    String getPageName();
}
