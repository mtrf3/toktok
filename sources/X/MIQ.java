package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;

/* loaded from: classes10.dex */
public final class MIQ {
    public static final int LIZ = ((Number) C52806Kny.LIZ.getValue()).intValue();
    public static final C0M6<String, MIS> LIZIZ = new C0M6<>(4);
    public static final C0M6<String, MIT> LIZJ = new C0M6<>(4);

    public static final void LIZ(boolean z) {
        String str;
        if (!C52945KqD.LIZ()) {
            return;
        }
        IAVPerformance provideAVPerformance = AVExternalServiceImpl.LIZ().provideAVPerformance();
        if (z) {
            str = "tool_performance_prop_detail_shoot_same";
        } else {
            str = "tool_performance_prop_list_shoot_same";
        }
        provideAVPerformance.end(str, "Handle prop data");
    }

    public static final void LIZIZ(boolean z) {
        String str;
        if (!C52945KqD.LIZ()) {
            return;
        }
        IAVPerformance provideAVPerformance = AVExternalServiceImpl.LIZ().provideAVPerformance();
        if (z) {
            str = "tool_performance_prop_detail_shoot_same";
        } else {
            str = "tool_performance_prop_list_shoot_same";
        }
        provideAVPerformance.start(str, "Begin fetch prop");
    }
}
