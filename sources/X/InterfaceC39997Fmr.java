package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Fmr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC39997Fmr extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "audioUrl", required = true)
    String getAudioUrl();

    @InterfaceC36563EWp(isGetter = true, keyPath = "channel", required = false)
    String getChannel();

    @InterfaceC36563EWp(isGetter = true, keyPath = "localKey", required = false)
    String getLocalKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isLoop", required = false)
    Boolean isLoop();
}
