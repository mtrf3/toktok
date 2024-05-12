package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* renamed from: X.NsC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC60712NsC extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "css", primitiveClassType = String.class, required = false)
    List<String> getCss();

    @InterfaceC36563EWp(isGetter = true, keyPath = "customUA", required = false)
    String getCustomUA();

    @InterfaceC36563EWp(isGetter = true, keyPath = "html", required = false)
    String getHtml();

    @InterfaceC36563EWp(isGetter = true, keyPath = "img", primitiveClassType = String.class, required = false)
    List<String> getImg();

    @InterfaceC36563EWp(isGetter = true, keyPath = "js", primitiveClassType = String.class, required = false)
    List<String> getJs();

    @InterfaceC36563EWp(isGetter = true, keyPath = "universal", primitiveClassType = String.class, required = false)
    List<String> getUniversal();

    @InterfaceC36563EWp(isGetter = true, keyPath = "webKey", required = false)
    String getWebKey();
}
