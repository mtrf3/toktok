package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.ObA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC62204ObA extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "tempFilePath", required = false)
    String getTempFilePath();

    @InterfaceC36563EWp(isGetter = true, keyPath = "uri", required = false)
    String getUri();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url", required = false)
    String getUrl();

    @InterfaceC36563EWp(isGetter = false, keyPath = "tempFilePath", required = false)
    void setTempFilePath(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "uri", required = false)
    void setUri(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "url", required = false)
    void setUrl(String str);
}
