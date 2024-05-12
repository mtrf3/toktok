package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Chg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC32032Chg extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "path", required = true)
    String getPath();

    @InterfaceC36563EWp(isGetter = true, keyPath = "size", required = true)
    String getSize();

    @InterfaceC36563EWp(isGetter = true, keyPath = "uri", required = true)
    String getUri();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url", required = true)
    String getUrl();

    @InterfaceC36563EWp(isGetter = false, keyPath = "path", required = true)
    void setPath(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "size", required = true)
    void setSize(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "uri", required = true)
    void setUri(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "url", required = true)
    void setUrl(String str);
}
