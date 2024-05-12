package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.SGr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71821SGr extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "metaInfo", required = false)
    java.util.Map<String, Object> getMetaInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "uri", required = false)
    String getUri();

    @InterfaceC36563EWp(isGetter = false, keyPath = "metaInfo", required = false)
    void setMetaInfo(java.util.Map<String, ? extends Object> map);

    @InterfaceC36563EWp(isGetter = false, keyPath = "uri", required = false)
    void setUri(String str);
}
