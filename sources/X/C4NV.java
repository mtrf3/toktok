package X;

import Y.IDFactoryS60S0000000_1;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import kotlin.jvm.internal.o;

/* renamed from: X.4NV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NV {
    public static ShakeEggVM LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (ShakeEggVM) ViewModelProviders.of(activity, new IDFactoryS60S0000000_1(1)).get(ShakeEggVM.class);
    }
}
