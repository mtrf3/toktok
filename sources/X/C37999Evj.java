package X;

import com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Evj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37999Evj {
    public static List LIZ(String str, String channel) {
        o.LJIIIZ(channel, "channel");
        HybridTrafficColoringSettings.HybridTrafficColoringModel LIZ = HybridTrafficColoringSettings.LIZ();
        if (LIZ.enabled && LIZ.headerModEnabled) {
            return C47261Igj.LJJIJIIJI(new EJ6("X-TT-Hybrid-UA", channel), new EJ6("X-TT-Hybrid-Referer", str));
        }
        return C61878OQg.INSTANCE;
    }
}
