package X;

import Y.IDFactoryS64S0000000_9;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LPY {
    public static AdHomePageDataVM LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (AdHomePageDataVM) ViewModelProviders.of(activity, new IDFactoryS64S0000000_9(0)).get(AdHomePageDataVM.class);
    }
}
