package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.RuV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71047RuV extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "galleryList", nestedClassType = InterfaceC71046RuU.class, required = true)
    List<InterfaceC71046RuU> getGalleryList();

    @InterfaceC36563EWp(isGetter = true, keyPath = "index", required = true)
    Number getIndex();
}
