package X;

import Y.IDFactoryS60S0000000_1;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3SZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SZ {
    public static HomePageDataViewModel LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (HomePageDataViewModel) ViewModelProviders.of(activity, new IDFactoryS60S0000000_1(2)).get(HomePageDataViewModel.class);
    }
}
