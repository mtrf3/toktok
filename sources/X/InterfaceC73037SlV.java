package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.SlV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC73037SlV extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enter_from_page", required = false)
    String getEnterFromPage();

    @InterfaceC36563EWp(isGetter = true, keyPath = "last_page", required = false)
    String getLastPage();

    @InterfaceC36563EWp(isGetter = true, keyPath = "play_url", required = true)
    String getPlayUrl();

    @InterfaceC36563EWp(isGetter = true, keyPath = "room_id", required = true)
    String getRoomId();
}
