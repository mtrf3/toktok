package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.SplitContainerManager;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LAe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53816LAe {
    public static final C53816LAe LIZ = new C53816LAe();

    public static final boolean LJIIIIZZ() {
        return LEO.LIZJ();
    }

    public final boolean LJFF() {
        if (!LJIIIIZZ() || ((Number) DUT.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean LJII() {
        if (!LJIIIIZZ() || ((Number) DUV.LIZ.getValue()).intValue() != 0) {
            return false;
        }
        return true;
    }

    public static final LKF LIZJ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return SplitContainerManager.LIZIZ(Integer.valueOf(activity.hashCode()));
    }

    public static final int LIZLLL(ActivityC45651qj activityC45651qj) {
        LKF LIZIZ = SplitContainerManager.LIZIZ(Integer.valueOf(activityC45651qj.hashCode()));
        if (LIZIZ != null) {
            return LIZIZ.LJIIIZ();
        }
        return 0;
    }

    public static final LKF LJ(String str) {
        WeakReference<LKF> weakReference;
        if (!LEO.LIZJ() || str == null || (weakReference = SplitContainerManager.LIZ.get(str)) == null) {
            return null;
        }
        return weakReference.get();
    }

    public static final boolean LJI(Activity activity, Configuration configuration) {
        return LEO.LIZ(activity, configuration);
    }

    public static final void LJIIIZ(ActivityC45651qj activityC45651qj, String str) {
        Integer valueOf;
        if (activityC45651qj != null && (valueOf = Integer.valueOf(activityC45651qj.hashCode())) != null) {
            int intValue = valueOf.intValue();
            List<String> list = SplitContainerManager.LIZIZ.get(Integer.valueOf(intValue));
            if (list != null && list.contains(str)) {
                SplitContainerManager.LIZJ.put(Integer.valueOf(intValue), str);
            }
        }
    }

    public final LKF LIZ(View view, Fragment fragment, String tag) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(fragment, "fragment");
        return SplitContainerManager.LIZ(tag, fragment, view, false);
    }

    public final LKF LIZIZ(String tag, Fragment fragment, View view) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(fragment, "fragment");
        return SplitContainerManager.LIZ(tag, fragment, view, true);
    }
}
