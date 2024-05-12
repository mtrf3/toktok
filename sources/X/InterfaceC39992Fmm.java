package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Fmm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC39992Fmm extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "audioUrl", required = true)
    String getAudioUrl();

    @ED6(option = {-11, -12, -21, -22, 1})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "status", required = true)
    Number getStatus();

    @InterfaceC36563EWp(isGetter = false, keyPath = "audioUrl", required = true)
    void setAudioUrl(String str);

    @ED6(option = {-11, -12, -21, -22, 1})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "status", required = true)
    void setStatus(Number number);
}
