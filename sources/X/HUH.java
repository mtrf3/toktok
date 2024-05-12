package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes8.dex */
public interface HUH extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "base64DataCompress", required = false)
    Number getBase64DataCompress();

    @InterfaceC36563EWp(isGetter = true, keyPath = "imageCompress", required = false)
    Number getImageCompress();

    @InterfaceC36563EWp(isGetter = true, keyPath = "maxRecordSeconds", required = false)
    Number getMaxRecordSeconds();

    @InterfaceC36563EWp(isGetter = true, keyPath = "maxSelectAssetCount", required = true)
    Number getMaxSelectAssetCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "maxSelectVideoCount", required = true)
    Number getMaxSelectVideoCount();

    @InterfaceC36563EWp(isGetter = true, keyPath = "minRecordSeconds", required = false)
    Number getMinRecordSeconds();

    @InterfaceC36563EWp(isGetter = true, keyPath = "previousPage", required = true)
    String getPreviousPage();

    @InterfaceC36563EWp(isGetter = true, keyPath = "showPreviewAfterRecord", required = false)
    Boolean getShowPreviewAfterRecord();

    @ED6(option = {0, 1})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "toolbarType", required = false)
    Number getToolbarType();

    @ED6(option = {0, 1})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "type", required = true)
    Number getType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoCompress", required = false)
    Number getVideoCompress();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoTargetSize", nestedClassType = HUL.class, required = false)
    HUL getVideoTargetSize();
}
