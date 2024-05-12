package X;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.PPr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64411PPr extends AbstractC64406PPm {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof ActivityC45651qj) {
            ((ActivityC45651qj) activity).getSupportFragmentManager().LJLJJLL(C64402PPi.LIZIZ);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof ActivityC45651qj) {
            ((ActivityC45651qj) activity).getSupportFragmentManager().LJJLIL(C64402PPi.LIZIZ, true);
        }
    }
}
