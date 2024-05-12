package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Uhz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77915Uhz extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "avatarUrl", required = true)
    String getAvatarUrl();

    @InterfaceC36563EWp(isGetter = true, keyPath = "creatorVerified", required = true)
    Boolean getCreatorVerified();

    @InterfaceC36563EWp(isGetter = true, keyPath = "nickname", required = true)
    String getNickname();

    @InterfaceC36563EWp(isGetter = true, keyPath = "secUid", required = true)
    String getSecUid();

    @InterfaceC36563EWp(isGetter = true, keyPath = "username", required = true)
    String getUsername();

    @InterfaceC36563EWp(isGetter = false, keyPath = "avatarUrl", required = true)
    void setAvatarUrl(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "creatorVerified", required = true)
    void setCreatorVerified(Boolean bool);

    @InterfaceC36563EWp(isGetter = false, keyPath = "nickname", required = true)
    void setNickname(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "secUid", required = true)
    void setSecUid(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "username", required = true)
    void setUsername(String str);
}
