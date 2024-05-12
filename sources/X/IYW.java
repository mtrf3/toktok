package X;

import android.media.MediaCodecInfo;
import java.util.Locale;

/* loaded from: classes9.dex */
public class IYW implements IYZ {
    @Override // X.IYZ
    public final boolean LIZ(MediaCodecInfo mediaCodecInfo) {
        String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.US);
        if (!lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("omx.ffmpeg.") && ((!lowerCase.startsWith("omx.sec.") || !lowerCase.contains(".sw.")) && !"omx.qcom.video.decoder.hevcswvdec".equals(lowerCase) && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.") && (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")))) {
            return true;
        }
        return false;
    }
}
