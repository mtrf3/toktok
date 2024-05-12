package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.HTb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC44115HTb extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "base64Data", required = false)
    String getBase64Data();

    @InterfaceC36563EWp(isGetter = true, keyPath = "filePath", required = false)
    String getFilePath();

    @InterfaceC36563EWp(isGetter = true, keyPath = "identifier", required = false)
    String getIdentifier();

    @ED6(option = {1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "mediaType", required = false)
    Number getMediaType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "mimeType", required = false)
    String getMimeType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "size", required = false)
    Number getSize();

    @InterfaceC36563EWp(isGetter = false, keyPath = "base64Data", required = false)
    void setBase64Data(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "filePath", required = false)
    void setFilePath(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "identifier", required = false)
    void setIdentifier(String str);

    @ED6(option = {1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "mediaType", required = false)
    void setMediaType(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "mimeType", required = false)
    void setMimeType(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "size", required = false)
    void setSize(Number number);
}
