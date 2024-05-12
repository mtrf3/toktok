package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* loaded from: classes11.dex */
public interface OTA extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "signature", required = true)
    String getSignature();

    @InterfaceC36563EWp(isGetter = false, keyPath = "signature", required = true)
    void setSignature(String str);
}
