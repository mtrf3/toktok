package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.io.File;

/* renamed from: X.Hdl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44529Hdl extends C43075GvP {
    public static final String LJIIZILJ = new File(C60903NvH.LJ.getFilesDir(), "sticker_1_0/3d/resources").getPath();

    public static long LIZIZ() {
        long LIZIZ = J9A.LIZIZ("video_duration_limit_ms", 1000L);
        if (LIZIZ < 1000 || LIZIZ >= LivePlayEnforceIntervalSetting.DEFAULT) {
            return 1000L;
        }
        return LIZIZ;
    }
}
