package X;

import android.app.Activity;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.CCh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30939CCh {
    public static final /* synthetic */ int LIZIZ = 0;
    public final java.util.Map<String, WeakReference<Activity>> LIZ = new ConcurrentHashMap();

    public final void LIZ(ActivityC45651qj activityC45651qj) {
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
            if (((Reference) entry.getValue()).get() == activityC45651qj) {
                ((ConcurrentHashMap) this.LIZ).remove(entry.getKey());
                return;
            }
        }
    }
}
