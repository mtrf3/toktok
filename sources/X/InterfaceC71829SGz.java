package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.SGz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71829SGz extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "coverUri", required = false)
    String getCoverUri();

    @InterfaceC36563EWp(isGetter = true, keyPath = "metaInfo", required = false)
    java.util.Map<String, Object> getMetaInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "vid", required = false)
    String getVid();

    @InterfaceC36563EWp(isGetter = false, keyPath = "coverUri", required = false)
    void setCoverUri(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "metaInfo", required = false)
    void setMetaInfo(java.util.Map<String, ? extends Object> map);

    @InterfaceC36563EWp(isGetter = false, keyPath = "vid", required = false)
    void setVid(String str);
}
