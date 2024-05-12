package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Y6t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86851Y6t extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "audioPlayProgress", required = false)
    Number getAudioPlayProgress();

    @ED6(option = {0, 1, 2, 3, 4, 5, 6})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "qualityResult", required = false)
    Number getQualityResult();

    @InterfaceC36563EWp(isGetter = true, keyPath = "recordStatus", nestedClassType = Y72.class, required = false)
    Y72 getRecordStatus();

    @InterfaceC36563EWp(isGetter = true, keyPath = "vopCode", required = true)
    Number getVopCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "vopSpeakerInfo", nestedClassType = Y70.class, required = false)
    Y70 getVopSpeakerInfo();

    @ED6(option = {0, 1, 2, 3, 4, 5, 6})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "vopState", required = false)
    Number getVopState();

    @InterfaceC36563EWp(isGetter = true, keyPath = "vopTextState", nestedClassType = Y71.class, required = false)
    Y71 getVopTextState();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isBlueToothConnected", required = false)
    Boolean isBlueToothConnected();

    @InterfaceC36563EWp(isGetter = false, keyPath = "audioPlayProgress", required = false)
    void setAudioPlayProgress(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "isBlueToothConnected", required = false)
    void setBlueToothConnected(Boolean bool);

    @ED6(option = {0, 1, 2, 3, 4, 5, 6})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "qualityResult", required = false)
    void setQualityResult(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "recordStatus", nestedClassType = Y72.class, required = false)
    void setRecordStatus(Y72 y72);

    @InterfaceC36563EWp(isGetter = false, keyPath = "vopCode", required = true)
    void setVopCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "vopSpeakerInfo", nestedClassType = Y70.class, required = false)
    void setVopSpeakerInfo(Y70 y70);

    @ED6(option = {0, 1, 2, 3, 4, 5, 6})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "vopState", required = false)
    void setVopState(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "vopTextState", nestedClassType = Y71.class, required = false)
    void setVopTextState(Y71 y71);
}
