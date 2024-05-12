package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Ceb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31841Ceb extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "sharePlatform", required = false)
    String getSharePlatform();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shareSuccess", required = true)
    Boolean getShareSuccess();

    @InterfaceC36563EWp(isGetter = true, keyPath = "toUserId", required = false)
    String getToUserId();

    @InterfaceC36563EWp(isGetter = false, keyPath = "sharePlatform", required = false)
    void setSharePlatform(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "shareSuccess", required = true)
    void setShareSuccess(Boolean bool);

    @InterfaceC36563EWp(isGetter = false, keyPath = "toUserId", required = false)
    void setToUserId(String str);
}
