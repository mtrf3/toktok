package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Ufz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77791Ufz extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "download_url", required = false)
    String getDownloadUrl();

    @InterfaceC36563EWp(isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enter_from_page", required = false)
    String getEnterFromPage();

    @InterfaceC36563EWp(isGetter = true, keyPath = "m3u8_url", required = true)
    String getM3u8Url();

    @InterfaceC36563EWp(isGetter = true, keyPath = "room_id", required = true)
    String getRoomId();

    @ED6(option = {0, 1, 2, 3, 4})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "status", required = true)
    Number getStatus();

    @InterfaceC36563EWp(isGetter = true, keyPath = "video_info", nestedClassType = InterfaceC77793Ug1.class, required = false)
    InterfaceC77793Ug1 getVideoInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "video_length", required = false)
    Number getVideoLength();
}
