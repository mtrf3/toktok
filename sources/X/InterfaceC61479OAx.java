package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.OAx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC61479OAx extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "description_list", primitiveClassType = String.class, required = true)
    List<String> getDescriptionList();

    @InterfaceC36563EWp(isGetter = true, keyPath = "images", required = true)
    List<Object> getImages();

    @InterfaceC36563EWp(isGetter = true, keyPath = "index", required = true)
    Number getIndex();

    @InterfaceC36563EWp(isGetter = true, keyPath = "loop", required = true)
    boolean getLoop();

    @InterfaceC36563EWp(isGetter = true, keyPath = "needDownload", required = true)
    boolean getNeedDownload();

    @InterfaceC36563EWp(isGetter = true, keyPath = "openType", required = true)
    String getOpenType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "style", required = true)
    Number getStyle();
}
