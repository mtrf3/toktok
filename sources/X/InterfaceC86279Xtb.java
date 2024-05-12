package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Xtb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86279Xtb extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "dataURL", required = true)
    String getDataURL();

    @InterfaceC36563EWp(isGetter = true, keyPath = "extension", required = true)
    String getExtension();

    @InterfaceC36563EWp(isGetter = true, keyPath = "filename", required = true)
    String getFilename();

    @InterfaceC36563EWp(isGetter = true, keyPath = "saveToAlbum", required = false)
    String getSaveToAlbum();
}
