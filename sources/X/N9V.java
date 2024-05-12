package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* loaded from: classes11.dex */
public interface N9V extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "status", required = true)
    String getStatus();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isVisible", required = true)
    Boolean isVisible();

    @InterfaceC36563EWp(isGetter = false, keyPath = "status", required = true)
    void setStatus(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "isVisible", required = true)
    void setVisible(Boolean bool);
}
