package X;

import com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig;
import java.util.Random;

/* renamed from: X.UsB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78547UsB {
    public static final int LIZ = new Random().nextInt(100);
    public static final ToolsBaseInfoConfig LIZIZ = new ToolsBaseInfoConfig(false, 0, 0, 0, 15, null);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C78550UsE.LJLIL);

    public static final boolean LIZ() {
        C62822Ol8 c62822Ol8 = LIZJ;
        if (!((ToolsBaseInfoConfig) c62822Ol8.getValue()).getEnable() || LIZ > ((ToolsBaseInfoConfig) c62822Ol8.getValue()).getSamplingRate()) {
            return false;
        }
        return true;
    }
}
