package X;

import android.app.Dialog;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.immersionbar.ImmersionBar;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OJw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61712OJw {
    public static C61713OJx LIZ(DialogFragment dialogFragment) {
        o.LJIIIZ(dialogFragment, "dialogFragment");
        if (dialogFragment.mo49getActivity() != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(dialogFragment.mo49getActivity().toString());
            LIZ.append(dialogFragment.toString());
            String LIZIZ = X1D.LIZIZ(LIZ);
            HashMap hashMap = (HashMap) ImmersionBar.LJIIJJI;
            ImmersionBar immersionBar = (ImmersionBar) hashMap.get(LIZIZ);
            if (immersionBar == null) {
                immersionBar = new ImmersionBar(dialogFragment, LIZIZ);
                hashMap.put(LIZIZ, immersionBar);
            }
            return new C61713OJx(dialogFragment.getContext(), immersionBar);
        }
        throw new NullPointerException("Activity cannot be null");
    }

    public static C61713OJx LIZIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (fragment.mo49getActivity() != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(fragment.mo49getActivity().toString());
            LIZ.append(fragment.toString());
            String LIZIZ = X1D.LIZIZ(LIZ);
            HashMap hashMap = (HashMap) ImmersionBar.LJIIJJI;
            ImmersionBar immersionBar = (ImmersionBar) hashMap.get(LIZIZ);
            if (immersionBar == null) {
                immersionBar = new ImmersionBar(fragment, LIZIZ);
                hashMap.put(LIZIZ, immersionBar);
            }
            return new C61713OJx(fragment.getContext(), immersionBar);
        }
        throw new NullPointerException("Activity cannot be null");
    }

    public static C61713OJx LIZJ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return new C61713OJx(activity, ImmersionBar.LJIILIIL(activity));
    }

    public static C61713OJx LIZLLL(ActivityC45651qj activity, Dialog dialog) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialog, "dialog");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(activity.toString());
        LIZ.append(dialog.toString());
        String LIZIZ = X1D.LIZIZ(LIZ);
        HashMap hashMap = (HashMap) ImmersionBar.LJIIJJI;
        ImmersionBar immersionBar = (ImmersionBar) hashMap.get(LIZIZ);
        if (immersionBar == null) {
            immersionBar = new ImmersionBar(activity, dialog, LIZIZ);
            hashMap.put(LIZIZ, immersionBar);
        }
        return new C61713OJx(activity, immersionBar);
    }

    public static C61713OJx LJ(ActivityC45651qj activityC45651qj, Window window) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(activityC45651qj.toString());
        LIZ.append(window.toString());
        String LIZIZ = X1D.LIZIZ(LIZ);
        HashMap hashMap = (HashMap) ImmersionBar.LJIIJJI;
        ImmersionBar immersionBar = (ImmersionBar) hashMap.get(LIZIZ);
        if (immersionBar == null) {
            immersionBar = new ImmersionBar(activityC45651qj, window, LIZIZ);
            hashMap.put(LIZIZ, immersionBar);
        }
        return new C61713OJx(activityC45651qj, immersionBar);
    }
}
