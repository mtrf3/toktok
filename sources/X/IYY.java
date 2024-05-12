package X;

import android.media.MediaCodecInfo;

/* loaded from: classes9.dex */
public class IYY implements IYZ {
    @Override // X.IYZ
    public final boolean LIZ(MediaCodecInfo mediaCodecInfo) {
        if (!mediaCodecInfo.isEncoder()) {
            return true;
        }
        return false;
    }
}
