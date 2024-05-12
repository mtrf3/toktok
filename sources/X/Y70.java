package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* loaded from: classes16.dex */
public interface Y70 extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "finishedTime", required = false)
    Number getFinishedTime();

    @InterfaceC36563EWp(isGetter = true, keyPath = "speakerId", required = false)
    String getSpeakerId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "updateTime", required = true)
    String getUpdateTime();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isPrivate", required = false)
    Boolean isPrivate();

    @InterfaceC36563EWp(isGetter = false, keyPath = "finishedTime", required = false)
    void setFinishedTime(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "isPrivate", required = false)
    void setPrivate(Boolean bool);

    @InterfaceC36563EWp(isGetter = false, keyPath = "speakerId", required = false)
    void setSpeakerId(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "updateTime", required = true)
    void setUpdateTime(String str);
}
