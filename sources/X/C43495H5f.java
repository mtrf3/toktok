package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEUtils;

/* renamed from: X.H5f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43495H5f {
    public static int LIZ(String str) {
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return 0;
        }
        return videoFileInfo.bitrate;
    }

    public static int[] LIZIZ(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) == 0) {
            return iArr;
        }
        return null;
    }

    public static VideoFileInfo LIZJ(String str) {
        int[] LIZIZ = LIZIZ(str);
        if (LIZIZ == null) {
            return null;
        }
        return new VideoFileInfo(LIZIZ[0], LIZIZ[1], LIZIZ[3], LIZIZ[7], LIZIZ[6], LIZIZ[8], LIZIZ[9]);
    }
}
