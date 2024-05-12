package X;

import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8A {
    public static final void LIZ(VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        if (vEVideoFileInfo != null && vEVideoFileInfo.rotation % 180 != 0) {
            int i = vEVideoFileInfo.height;
            vEVideoFileInfo.height = vEVideoFileInfo.width;
            vEVideoFileInfo.width = i;
        }
    }

    public static final VEUtils.VEVideoFileInfo LIZIZ(String strInVideo) {
        o.LJIIIZ(strInVideo, "strInVideo");
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(strInVideo);
        LIZ(videoFileInfo);
        return videoFileInfo;
    }
}
