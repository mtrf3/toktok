package com.ss.android.ugc.aweme.services.audio;

import X.InterfaceC67352kd;

/* loaded from: classes3.dex */
public interface IVoiceDetectorConfig {
    Boolean getVoiceDetectCacheResult();

    Object getVoiceDetectPath(InterfaceC67352kd<? super DetectionPathResult> interfaceC67352kd);

    void mobEvent(int i, long j, long j2, long j3, long j4, double d, VoiceDetectionResult voiceDetectionResult, long j5);

    void setVoiceDetectCacheResult(boolean z);

    void setVoiceDetectionParam(VoiceDetectionParam voiceDetectionParam);
}
