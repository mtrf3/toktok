package X;

import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.6jT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168556jT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        int i6;
        String mMusicPath;
        int i7 = 1;
        if (e1.LIZ(31744, "audio_data_track_on", true, false)) {
            boolean realHasOriginalSound = videoPublishEditModel.realHasOriginalSound();
            if (videoPublishEditModel.isMusic() == 1 && (mMusicPath = videoPublishEditModel.getMMusicPath()) != null && C78685UuP.LJJJZ(mMusicPath)) {
                z = true;
            } else {
                z = false;
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", videoPublishEditModel.creativeInfo.getCreationId());
            c145995oB.LIZIZ(System.currentTimeMillis(), "calling_event_ts");
            c145995oB.LJI("audio_shootway", C42090GfW.LJI(videoPublishEditModel, "audio_shootway_default"));
            AudioAlgorithmModel audioAlgorithmModel = videoPublishEditModel.creativeModel.audioAlgorithmModel;
            if (audioAlgorithmModel.isMicOn && audioAlgorithmModel.isMicEnabled) {
                i = 1;
            } else {
                i = 0;
            }
            c145995oB.LIZ(i, "microphone_status");
            int i8 = 3;
            if (realHasOriginalSound) {
                if (z) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
            } else if (z) {
                i2 = 1;
            } else {
                i2 = 3;
            }
            c145995oB.LIZ(i2, "audio_source");
            c145995oB.LIZ(videoPublishEditModel.isFastImport ? 1 : 0, "is_fast_import");
            int LIZ2 = C47636Imm.LIZ();
            if (LIZ2 != 0) {
                if (LIZ2 != 1 && LIZ2 != 2) {
                    if (LIZ2 != 3) {
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                }
            } else {
                i3 = 0;
            }
            c145995oB.LIZ(i3, "audio_source_device_input");
            int LIZJ = C47636Imm.LIZJ();
            if (LIZJ != 0) {
                if (LIZJ != 2) {
                    if (LIZJ == 4 || LIZJ == 5) {
                        i8 = 1;
                    }
                } else {
                    i8 = 2;
                }
            } else {
                i8 = 0;
            }
            c145995oB.LIZ(i8, "audio_source_device_output");
            if (o.LJ(str, "audio_data_record")) {
                f = videoPublishEditModel.creativeModel.audioAlgorithmModel.shootVolumeStart;
            } else {
                f = videoPublishEditModel.creativeModel.audioAlgorithmModel.editVolumeStart;
            }
            c145995oB.LIZJ(Float.valueOf(f), "volume_level_start");
            if (o.LJ(str, "audio_data_record")) {
                f2 = videoPublishEditModel.creativeModel.audioAlgorithmModel.shootVolumeEnd;
            } else {
                f2 = videoPublishEditModel.creativeModel.audioAlgorithmModel.editVolumeEnd;
            }
            c145995oB.LIZJ(Float.valueOf(f2), "volume_level_end");
            if (videoPublishEditModel.creativeModel.audioAlgorithmModel.isAECOn) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            c145995oB.LIZ(i4, "algorithm_aec");
            if (videoPublishEditModel.creativeModel.audioAlgorithmModel.isTAOn) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            c145995oB.LIZ(i5, "algorithm_delay");
            if (videoPublishEditModel.creativeModel.audioAlgorithmModel.isLoudnessOn) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            c145995oB.LIZ(i6, "algorithm_loudness");
            if (!videoPublishEditModel.creativeModel.audioAlgorithmModel.isDenoiseOn) {
                i7 = 0;
            }
            c145995oB.LIZ(i7, "algorithm_denoise");
            c145995oB.LIZ(videoPublishEditModel.recordBgmDelay, "algorithm_delay_value");
            float f3 = 100;
            c145995oB.LIZ((int) (videoPublishEditModel.voiceVolume * f3), "original_sound_volume");
            if (z) {
                c145995oB.LIZ((int) (videoPublishEditModel.musicVolume * f3), "bgm_sound_volume");
            }
            FMX.LJIIL(str, c145995oB.LIZ);
        }
    }
}
