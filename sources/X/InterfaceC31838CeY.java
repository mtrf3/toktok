package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.CeY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31838CeY extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "appVersion", required = true)
    String getAppVersion();

    @InterfaceC36563EWp(isGetter = true, keyPath = "clientVersion", required = true)
    String getClientVersion();

    @InterfaceC36563EWp(isGetter = false, keyPath = "appVersion", required = true)
    void setAppVersion(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "clientVersion", required = true)
    void setClientVersion(String str);
}
