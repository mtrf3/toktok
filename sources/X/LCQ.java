package X;

import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LCQ implements LCR {
    public LKF LIZ;

    @Override // X.LCR
    public final LKF H4() {
        return this.LIZ;
    }

    @Override // X.LCR
    public final View LIZ(AbsFragment fragment, LayoutInflater inflater) {
        View rootView;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(inflater, "inflater");
        if (C35138Dqg.LIZJ()) {
            rootView = C16970lZ.LIZLLL(fragment.mo49getActivity(), R.layout.azq);
        } else {
            rootView = C16970lZ.LIZLLL(fragment.mo49getActivity(), R.layout.azp);
        }
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            LFH.LIZIZ.LIZLLL().LJIILIIL();
            C53816LAe c53816LAe = C53816LAe.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HOME_");
            LIZ.append(mo49getActivity.hashCode());
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIIZZ(rootView, "rootView");
            LKF LIZ2 = c53816LAe.LIZ(rootView, fragment, LIZIZ);
            this.LIZ = LIZ2;
            View LJIILJJIL = LIZ2.LJIILJJIL();
            if (LJIILJJIL != null) {
                return LJIILJJIL;
            }
        }
        o.LJIIIIZZ(rootView, "rootView");
        return rootView;
    }
}
