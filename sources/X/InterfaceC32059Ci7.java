package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Ci7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC32059Ci7 extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "base64Data", required = true)
    String getBase64Data();

    @InterfaceC36563EWp(isGetter = true, keyPath = "path", required = true)
    String getPath();

    @InterfaceC36563EWp(isGetter = true, keyPath = "size", required = true)
    String getSize();

    @InterfaceC36563EWp(isGetter = false, keyPath = "base64Data", required = true)
    void setBase64Data(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "path", required = true)
    void setPath(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "size", required = true)
    void setSize(String str);
}
