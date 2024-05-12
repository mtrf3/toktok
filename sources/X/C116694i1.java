package X;

import Y.IDFactoryS60S0000000_1;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.internal.o;

/* renamed from: X.4i1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116694i1 {
    public static TabChangeManager LIZ(ActivityC45651qj activityC45651qj) {
        o.LJI(activityC45651qj);
        return (TabChangeManager) ViewModelProviders.of(activityC45651qj, new IDFactoryS60S0000000_1(6)).get(TabChangeManager.class);
    }
}
