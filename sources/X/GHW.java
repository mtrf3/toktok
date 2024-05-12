package X;

import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DefaultInitialSectionFragment;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GHW {
    public static void LIZ(C81202Vtu splitContainer) {
        o.LJIIIZ(splitContainer, "splitContainer");
        if (splitContainer.LJII("default_initial_section") != null) {
            splitContainer.LJFF("default_initial_section", false);
            return;
        }
        GHW ghw = DefaultInitialSectionFragment.LJLJJLL;
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(splitContainer, 320);
        ghw.getClass();
        DefaultInitialSectionFragment defaultInitialSectionFragment = new DefaultInitialSectionFragment();
        defaultInitialSectionFragment.LJLIL = aqS157S0100000_7;
        splitContainer.LIZJ(defaultInitialSectionFragment);
    }
}
