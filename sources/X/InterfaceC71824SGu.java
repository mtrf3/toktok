package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.SGu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71824SGu extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "accessKeyId", required = true)
    String getAccessKeyId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "hostName", required = true)
    String getHostName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "secretAccessKey", required = true)
    String getSecretAccessKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "sessionToken", required = true)
    String getSessionToken();

    @InterfaceC36563EWp(isGetter = true, keyPath = "spaceName", required = true)
    String getSpaceName();
}
