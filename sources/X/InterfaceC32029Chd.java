package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.Chd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC32029Chd extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "header", required = false)
    java.util.Map<String, Object> getHeader();

    @InterfaceC36563EWp(isGetter = true, keyPath = "imageList", primitiveClassType = String.class, required = true)
    List<String> getImageList();

    @InterfaceC36563EWp(isGetter = true, keyPath = "params", required = false)
    java.util.Map<String, Object> getParams();

    @ED7(option = {"base64", "path"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "type", required = true)
    String getType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
