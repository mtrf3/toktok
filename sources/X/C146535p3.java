package X;

import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.5p3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146535p3 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(VideoPublishEditModel model) {
        Integer num;
        o.LJIIIZ(model, "model");
        HashMap<Integer, PreCheckResultModel> detectResults = model.creativeModel.audioCopyrightDetectModel.getDetectResults();
        if (detectResults != null) {
            for (Map.Entry<Integer, PreCheckResultModel> entry : detectResults.entrySet()) {
                PreCheckResultModel value = entry.getValue();
                if (value == null || (num = value.unavailableReasonsV1) == null || num.intValue() != 0) {
                    return entry.getKey().intValue();
                }
            }
        }
        return EnumC139485dg.UNKNOWN.getScene();
    }

    public static boolean LIZIZ(int i) {
        if ((C146355ol.LIZ() && i == EnumC139485dg.LONG_VIDEO_NEW.getScene()) || (C5HS.LIZ() && i == EnumC139485dg.SHORT_VIDEO.getScene())) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(int i) {
        if ((C146545p4.LIZ() && i == EnumC139485dg.LONG_VIDEO_NEW.getScene()) || (C5HR.LIZ() && i == EnumC139485dg.SHORT_VIDEO.getScene())) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(VideoPublishEditModel model) {
        boolean z;
        boolean z2;
        Collection<PreCheckResultModel> values;
        Integer num;
        o.LJIIIZ(model, "model");
        HashMap<Integer, PreCheckResultModel> detectResults = model.creativeModel.audioCopyrightDetectModel.getDetectResults();
        if (detectResults != null && (values = detectResults.values()) != null && !values.isEmpty()) {
            for (PreCheckResultModel preCheckResultModel : values) {
                if (preCheckResultModel != null && ((num = preCheckResultModel.unavailableReasonsV1) == null || num.intValue() != 0)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ArrayList<Integer> detectScenes = model.creativeModel.audioCopyrightDetectModel.getDetectScenes();
        if (C63144OqK.LIZLLL(EnumC139485dg.LONG_VIDEO_NEW, detectScenes) || C63144OqK.LIZLLL(EnumC139485dg.SHORT_VIDEO, detectScenes)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2 || model.voiceVolume <= 0.0f || !C44384HbQ.LJLJJI(model) || C44384HbQ.LJLLLLLL(model)) {
            return false;
        }
        String musicId = model.getMusicId();
        if ((musicId != null && musicId.length() != 0 && model.musicVolume != 0.0f && !C146355ol.LIZ() && !C5HS.LIZ()) || model.veAudioEffectParam != null || model.creativeModel.streamVoiceConversionModel.vcEffectId.length() != 0 || C44384HbQ.LJLJL(model) || model.creativeModel.audioCopyrightDetectModel.getHasMusicReplaced() || C78983UzD.LJJJJJL(model)) {
            return false;
        }
        return true;
    }
}
