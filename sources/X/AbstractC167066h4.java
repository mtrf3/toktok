package X;

import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import kotlin.jvm.internal.o;

/* renamed from: X.6h4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC167066h4 implements IVoiceDetectorConfig {
    public int LIZ;
    public double LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final void setVoiceDetectionParam(VoiceDetectionParam param) {
        o.LJIIIZ(param, "param");
        this.LIZIZ = param.getTargetThresholds();
        this.LIZ = param.getSourceType();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final void mobEvent(int i, long j, long j2, long j3, long j4, double d, VoiceDetectionResult voiceDetectionResult, long j5) {
        String str;
        o.LJIIIZ(voiceDetectionResult, "voiceDetectionResult");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("algo_name", "AED");
        c145995oB.LIZIZ(j, "export_duration");
        c145995oB.LIZIZ(j2, "download_duration");
        c145995oB.LIZIZ(j3, "algo_duration");
        c145995oB.LIZIZ(j4, "total_duration");
        c145995oB.LIZJ(Double.valueOf(d), "threshold");
        c145995oB.LIZ(voiceDetectionResult.getErrorCode(), "error_code");
        c145995oB.LJI("error_msg", voiceDetectionResult.getErrorMsg());
        if (i == 0) {
            str = "Music";
        } else {
            str = "AutoMusicRecommendForVideo";
        }
        c145995oB.LJI("bizType", str);
        c145995oB.LIZIZ(j5, "extract_file_length");
        FMX.LJIIL("speech_detection", c145995oB.LIZ);
    }
}
