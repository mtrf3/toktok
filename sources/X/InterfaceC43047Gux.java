package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Gux, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43047Gux extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "bottomDistance", required = false)
    Number getBottomDistance();

    @InterfaceC36563EWp(isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC36563EWp(isGetter = true, keyPath = "message", required = true)
    String getMessage();

    @ED7(option = {"Link", "Button", "Chevron"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "trailingSlot", required = false)
    String getTrailingSlot();

    @InterfaceC36563EWp(isGetter = true, keyPath = "trailingText", required = false)
    String getTrailingText();

    @ED7(option = {"success", "info", "error", LiveGiftNewGifterBadgeSetting.DEFAULT})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "type", required = true)
    String getType();
}
