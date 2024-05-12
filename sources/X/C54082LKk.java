package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.LKk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54082LKk {
    public static final /* synthetic */ int LIZJ = 0;
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;

    static {
        new C54081LKj();
    }

    public final ActivityC45651qj LIZJ() {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        ActivityC45651qj activityC45651qj;
        LifecycleOwner lifecycleOwner = this.LIZIZ;
        if (!(lifecycleOwner instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) lifecycleOwner) == null) {
            if (!(lifecycleOwner instanceof Fragment) || (fragment = (Fragment) lifecycleOwner) == null || (mo49getActivity = fragment.mo49getActivity()) == null) {
                return LIZ(this.LIZ);
            }
            return mo49getActivity;
        }
        return activityC45651qj;
    }

    public static ActivityC45651qj LIZ(Context context) {
        ContextWrapper contextWrapper;
        Context baseContext;
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (!(context instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) context) == null || (baseContext = contextWrapper.getBaseContext()) == null) {
            return null;
        }
        return LIZ(baseContext);
    }

    public C54082LKk(Context context, LifecycleOwner lifecycleOwner) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
    }

    public static final C54082LKk LIZIZ(Context context, ActivityC45651qj owner) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(owner, "owner");
        return C54081LKj.LIZ(context, owner);
    }
}
