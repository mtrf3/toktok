package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.SGl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71815SGl extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "authConfig", nestedClassType = InterfaceC71816SGm.class, required = true)
    InterfaceC71816SGm getAuthConfig();

    @InterfaceC36563EWp(isGetter = true, keyPath = "filePaths", primitiveClassType = String.class, required = true)
    List<String> getFilePaths();

    @InterfaceC36563EWp(isGetter = true, keyPath = "uploadConfig", nestedClassType = InterfaceC71817SGn.class, required = false)
    InterfaceC71817SGn getUploadConfig();
}
