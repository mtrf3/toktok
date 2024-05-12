package X;

import Y.IDFactoryS63S0000000_7;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GIS {
    public static SubscriptionVM LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (SubscriptionVM) ViewModelProviders.of(activity, new IDFactoryS63S0000000_7(3)).get(SubscriptionVM.class);
    }
}
