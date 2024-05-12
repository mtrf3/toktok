package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.utils.Edge2EdgeConfig;
import com.ss.android.ugc.aweme.utils.LongPressConfig;

/* loaded from: classes5.dex */
public final class ATO {
    public static int LIZ;

    public static final boolean LIZ() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        Edge2EdgeConfig edge2EdgeConfig = (Edge2EdgeConfig) ATR.LIZIZ.getValue();
        if (edge2EdgeConfig == null) {
            edge2EdgeConfig = ATR.LIZ;
        }
        if (!edge2EdgeConfig.getEnable()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        LongPressConfig longPressConfig = (LongPressConfig) ATP.LIZIZ.getValue();
        if (longPressConfig == null) {
            longPressConfig = ATP.LIZ;
        }
        if (!longPressConfig.getEnable()) {
            return false;
        }
        return true;
    }

    public static final int LIZJ() {
        String colorForDarkPage;
        Edge2EdgeConfig edge2EdgeConfig = (Edge2EdgeConfig) ATR.LIZIZ.getValue();
        if (edge2EdgeConfig == null || (colorForDarkPage = edge2EdgeConfig.getColorForDarkPage()) == null || colorForDarkPage.length() <= 0) {
            colorForDarkPage = ATR.LIZ.getColorForDarkPage();
        }
        return ColorProtector.parseColor(colorForDarkPage);
    }
}
