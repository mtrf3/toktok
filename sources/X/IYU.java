package X;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class IYU {
    public static Boolean LIZ;
    public static ITN LIZIZ;
    public static ITN LIZJ;
    public static String LIZLLL;

    public static ITN LIZ(String str) {
        ITN itn = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.toLowerCase().equals("video/avc") && !str.toLowerCase().equals("video/hevc")) {
            return null;
        }
        try {
            MediaCodecInfo LIZ2 = IYV.LIZ(new IYY(), new IYW(), new IYX(str));
            if (LIZ2 == null) {
                return null;
            }
            ITN itn2 = new ITN();
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = LIZ2.getCapabilitiesForType(str);
                itn2.LIZJ = capabilitiesForType.getVideoCapabilities().getSupportedHeights().getUpper().intValue();
                itn2.LIZIZ = capabilitiesForType.getVideoCapabilities().getSupportedWidths().getUpper().intValue();
                itn2.LIZ = LIZ2.getName().toLowerCase(Locale.US);
                return itn2;
            } catch (Exception e) {
                e = e;
                itn = itn2;
                IXB.LJ("heightUpperLimitForByteVc1", e);
                return itn;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
