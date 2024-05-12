package X;

import com.ss.android.ugc.aweme.pipfeed.PipFeedManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes9.dex */
public final class JDC {
    public static final java.util.Map<String, List<String>> LIZ = C51029K0z.LJJIIZI(new OSZ("For You", C47261Igj.LJJIJ("homepage_hot")));
    public static final List<String> LIZIZ = C47261Igj.LJJIJ("homepage_hot");

    public static void LIZIZ(ActivityC45651qj activityC45651qj, String str, java.util.Map map) {
        C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
        c26045AKb.LJIIIZ(activityC45651qj.getString(R.string.jmg));
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LIZLLL(3000L);
        c26045AKb.LJIIJ();
        java.util.Map LJJLIL = C113554cx.LJJLIL(map);
        LJJLIL.put("enter_from", str);
        C60903NvH.LJJIJIL("show_open_floating_window_toast", LJJLIL);
    }

    public static void LIZ(ActivityC45651qj activityC45651qj, String str, java.util.Map map, boolean z) {
        PipFeedManager.Companion.getClass();
        PipFeedManager pipFeedManager = JD9.LIZ;
        if (C48800JDg.LIZ()) {
            if (z) {
                LIZIZ(activityC45651qj, str, map);
                pipFeedManager.startPipByEnterBackground$pipfeed_release(3000L);
                return;
            } else {
                PipFeedManager.startPipByEnterBackground$pipfeed_release$default(pipFeedManager, 0L, 1, null);
                return;
            }
        }
        LIZIZ(activityC45651qj, str, map);
        pipFeedManager.setPipEnabled$pipfeed_release(true);
    }
}
