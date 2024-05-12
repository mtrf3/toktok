package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes13.dex */
public interface SH0 extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "authConfig", nestedClassType = InterfaceC71824SGu.class, required = true)
    InterfaceC71824SGu getAuthConfig();

    @InterfaceC36563EWp(isGetter = true, keyPath = "filePath", required = true)
    String getFilePath();

    @InterfaceC36563EWp(isGetter = true, keyPath = "uploadConfig", nestedClassType = InterfaceC71825SGv.class, required = false)
    InterfaceC71825SGv getUploadConfig();
}
