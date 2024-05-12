package X;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.apm.core.ActivityLifeObserver;

/* loaded from: classes12.dex */
public final class PH9 {
    public static float LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static int LJ;

    static {
        Context context = C09970aH.LIZ;
        ActivityLifeObserver.getInstance().register(new PHA());
        boolean z = false;
        float f = 0.0f;
        if (!C09970aH.LJIJ || Build.VERSION.SDK_INT < 23 || context == null) {
            LIZJ = 60;
            LIZIZ = 60;
            LIZLLL = true;
            LIZ = 1000.0f / 60;
            LJ = 60;
            if (Build.VERSION.SDK_INT >= 23 && context != null) {
                Display defaultDisplay = ((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay();
                LIZ(defaultDisplay.getRefreshRate());
                for (Display.Mode mode : defaultDisplay.getSupportedModes()) {
                    float refreshRate = mode.getRefreshRate();
                    if (refreshRate > f) {
                        f = refreshRate;
                    }
                }
                LJ = LIZ(f);
                return;
            }
            return;
        }
        Display defaultDisplay2 = ((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay();
        float refreshRate2 = defaultDisplay2.getRefreshRate();
        for (Display.Mode mode2 : defaultDisplay2.getSupportedModes()) {
            float refreshRate3 = mode2.getRefreshRate();
            if (refreshRate3 > f) {
                f = refreshRate3;
            }
        }
        LIZIZ = LIZ(refreshRate2);
        int LIZ2 = LIZ(f);
        LIZJ = LIZ2;
        int i = LIZIZ;
        if (i == LIZ2) {
            z = true;
        }
        LIZLLL = z;
        LIZ = 1000.0f / i;
    }

    public static int LIZ(float f) {
        if (Math.abs(f - 60.0f) < 5.1f) {
            return 60;
        }
        if (Math.abs(f - 90.0f) < 5.1f) {
            return 90;
        }
        if (Math.abs(f - 120.0f) < 5.1f) {
            return LiveTryModeCountDownThresholdSetting.DEFAULT;
        }
        return (int) f;
    }
}
