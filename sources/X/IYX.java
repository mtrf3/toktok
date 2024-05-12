package X;

import android.media.MediaCodecInfo;

/* loaded from: classes9.dex */
public class IYX implements IYZ {
    public final String LIZ;

    public IYX(String str) {
        this.LIZ = str;
    }

    @Override // X.IYZ
    public final boolean LIZ(MediaCodecInfo mediaCodecInfo) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (str.equalsIgnoreCase(this.LIZ)) {
                return true;
            }
        }
        return false;
    }
}
