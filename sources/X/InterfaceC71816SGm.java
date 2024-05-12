package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.SGm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71816SGm extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "accessKeyId", required = true)
    String getAccessKeyId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "hostName", required = true)
    String getHostName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "secretAccessKey", required = true)
    String getSecretAccessKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "serviceId", required = true)
    String getServiceId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "sessionToken", required = true)
    String getSessionToken();
}
