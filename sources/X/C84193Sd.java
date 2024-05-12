package X;

import Y.IDFactoryS60S0000000_1;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.internal.o;

/* renamed from: X.3Sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84193Sd {
    public static ScrollSwitchStateManager LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (ScrollSwitchStateManager) ViewModelProviders.of(activity, new IDFactoryS60S0000000_1(3)).get(ScrollSwitchStateManager.class);
    }
}
