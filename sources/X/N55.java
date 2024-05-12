package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N55 {
    public static C58798N5u LIZ(N54 depend) {
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(depend, "depend");
        C58798N5u c58798N5u = new C58798N5u(depend);
        ((ArrayList) c58798N5u.LJLJJLL).clear();
        ActivityC45651qj activityC45651qj = c58798N5u.LJLJJI;
        if (activityC45651qj != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activityC45651qj)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new NEO(c58798N5u, null), 3);
        }
        return c58798N5u;
    }
}
