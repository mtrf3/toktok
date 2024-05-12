package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Xvv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86423Xvv extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "encryptedLatitude", required = true)
    String getEncryptedLatitude();

    @InterfaceC36563EWp(isGetter = true, keyPath = "encryptedLongitude", required = true)
    String getEncryptedLongitude();

    @InterfaceC36563EWp(isGetter = false, keyPath = "encryptedLatitude", required = true)
    void setEncryptedLatitude(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "encryptedLongitude", required = true)
    void setEncryptedLongitude(String str);
}
