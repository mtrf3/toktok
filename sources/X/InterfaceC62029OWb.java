package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.OWb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC62029OWb extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "preloadKey", required = false)
    String getPreloadKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "preloadUrl", required = false)
    String getPreloadUrl();

    @InterfaceC36563EWp(isGetter = false, keyPath = "preloadKey", required = false)
    void setPreloadKey(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "preloadUrl", required = false)
    void setPreloadUrl(String str);
}
