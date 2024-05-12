package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;

@InterfaceC31169CLd
/* renamed from: X.Y6x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86855Y6x extends XBaseParamModel {
    @ED6(option = {3, 4, 5})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "manageVoiceType", required = false)
    Number getManageVoiceType();

    @ED6(option = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY, 12, ABRConfig.ABR_STARTUP_MAX_BITRATE, 14})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "methodType", required = true)
    Number getMethodType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "playOrStopAudio", required = false)
    Boolean getPlayOrStopAudio();

    @InterfaceC36563EWp(isGetter = true, keyPath = "startOrStopRecord", required = false)
    Boolean getStartOrStopRecord();
}
