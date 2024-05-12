package X;

import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.router.fragment.NavigationUtils;
import com.ss.android.ugc.aweme.experiment.EasyNavigationExperimentService;
import com.ss.android.ugc.aweme.homepage.ui.experiment.EasyNavigationExperimentServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AX6 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        EasyNavigationExperimentService LJFF = EasyNavigationExperimentServiceImpl.LJFF();
        if ((LJFF == null || !LJFF.LIZIZ()) && !C53355Kwp.LIZ()) {
            return false;
        }
        return true;
    }

    public static void LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (LIZIZ() && NavigationUtils.findNavigationContainer(fragment) != null) {
            FragmentRoute fragmentNavigation = SmartRouter.fragmentNavigation(fragment);
            o.LJIIIIZZ(fragmentNavigation, "fragmentNavigation(fragment)");
            FragmentRoute.pop$default(fragmentNavigation, null, 1, null);
            FragmentRoute.commit$default(fragmentNavigation, null, 1, null);
            return;
        }
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        mo49getActivity.finish();
    }

    public static void LIZJ(int i, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("launch_mode", String.valueOf(i));
        hashMap.put("cost_time", String.valueOf(System.currentTimeMillis() - j));
        hashMap.put("page", "inbox-activity");
        FMX.LJIIL("easy_navigation_performance_track", hashMap);
    }
}
