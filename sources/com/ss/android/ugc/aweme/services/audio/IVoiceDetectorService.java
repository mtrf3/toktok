package com.ss.android.ugc.aweme.services.audio;

/* loaded from: classes3.dex */
public interface IVoiceDetectorService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    void clearVoiceActivityDetection(Integer num);

    void setVoiceDetectionListener(int i, VoiceDetectionListener voiceDetectionListener);

    void startDetectVoiceActivity(VoiceDetectionParam voiceDetectionParam, IVoiceDetectorConfig iVoiceDetectorConfig);

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void clearVoiceActivityDetection$default(IVoiceDetectorService iVoiceDetectorService, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    num = null;
                }
                iVoiceDetectorService.clearVoiceActivityDetection(num);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearVoiceActivityDetection");
        }
    }
}
