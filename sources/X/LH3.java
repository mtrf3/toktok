package X;

import Y.IDFactoryS410S0100000_9;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LH3 {
    public final synchronized HomeTabViewModel LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (HomeTabViewModel) ViewModelProviders.of(activity, new IDFactoryS410S0100000_9(activity, 0)).get(HomeTabViewModel.class);
    }

    public final boolean LIZIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return false;
        }
        if (C53320KwG.LIZ() != 2 && C53320KwG.LIZ() != 6) {
            return false;
        }
        return LIZ(activityC45651qj).LJLJJL;
    }
}
