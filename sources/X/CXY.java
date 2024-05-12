package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes6.dex */
public final class CXY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(LifecycleOwner lifecycleOwner, C29701Eo c29701Eo, String str, String str2, List list, List list2, int i, int i2, boolean z) {
        if (list.size() != list2.size() || c29701Eo == null) {
            return;
        }
        C29306Beo.LJJIIJZLJL(lifecycleOwner, null, new CXV(list2, new CountDownLatch(list2.size() + 1), z, c29701Eo, str, str2, i, i2, list, null), 3);
    }
}
