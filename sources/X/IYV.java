package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes9.dex */
public class IYV {
    public static MediaCodecInfo LIZ(IYZ... iyzArr) {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null) {
                    codecInfoAt.getName();
                    codecInfoAt.getSupportedTypes();
                    boolean z = true;
                    for (IYZ iyz : iyzArr) {
                        z = iyz.LIZ(codecInfoAt);
                        if (!z) {
                            break;
                        }
                    }
                    if (z) {
                        return codecInfoAt;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            IXB.LJ("selectCodec", th);
            return null;
        }
    }
}
