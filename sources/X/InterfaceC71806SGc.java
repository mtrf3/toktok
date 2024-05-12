package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* renamed from: X.SGc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71806SGc extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "height", required = false)
    Number getHeight();

    @InterfaceC36563EWp(isGetter = true, keyPath = "mimetype", required = false)
    String getMimetype();

    @InterfaceC36563EWp(isGetter = true, keyPath = "thumb_uri", required = false)
    String getThumbUri();

    @InterfaceC36563EWp(isGetter = true, keyPath = "thumb_url_list", primitiveClassType = String.class, required = false)
    List<String> getThumbUrlList();

    @InterfaceC36563EWp(isGetter = true, keyPath = "uri", required = false)
    String getUri();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url_list", primitiveClassType = String.class, required = false)
    List<String> getUrlList();

    @InterfaceC36563EWp(isGetter = true, keyPath = "width", required = false)
    Number getWidth();
}
