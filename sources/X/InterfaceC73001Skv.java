package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Skv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC73001Skv extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "anchor_id", required = true)
    String getAnchorId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "clip_id", required = true)
    String getClipId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "duration", required = true)
    Number getDuration();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enter_from", required = true)
    String getEnterFrom();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enter_from_page", required = true)
    String getEnterFromPage();

    @ED6(option = {0, 1})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "redirect", required = true)
    Number getRedirect();

    @InterfaceC36563EWp(isGetter = true, keyPath = "roomid", required = true)
    String getRoomid();

    @InterfaceC36563EWp(isGetter = true, keyPath = "schema", required = false)
    String getSchema();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shoot_way", required = true)
    String getShootWay();

    @InterfaceC36563EWp(isGetter = true, keyPath = "suffix", required = true)
    String getSuffix();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
