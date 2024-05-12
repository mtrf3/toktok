package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.RuU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71046RuU extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "coverImageURL", required = false)
    String getCoverImageURL();

    @InterfaceC36563EWp(isGetter = true, keyPath = "imageURL", required = false)
    String getImageURL();

    @ED6(option = {0, 1})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "type", required = true)
    Number getType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoBackupURL", required = false)
    String getVideoBackupURL();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoDuration", required = false)
    Number getVideoDuration();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoHeight", required = false)
    Number getVideoHeight();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoID", required = false)
    String getVideoID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoMainURL", required = false)
    String getVideoMainURL();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoWidth", required = false)
    Number getVideoWidth();
}
