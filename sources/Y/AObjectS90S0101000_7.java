package Y;

import X.C26045AKb;
import X.EQE;
import X.HJ3;
import X.I0N;
import X.InterfaceC29911Fj;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.zhiliaoapp.musically.R;
import defpackage.g0;

/* loaded from: classes8.dex */
public class AObjectS90S0101000_7 implements InterfaceC29911Fj {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObjectS90S0101000_7 aObjectS90S0101000_7, Object obj) {
        switch (aObjectS90S0101000_7.i1) {
            case 0:
                BaseScreenAdaptScene baseScreenAdaptScene = (BaseScreenAdaptScene) aObjectS90S0101000_7.l0;
                baseScreenAdaptScene.LLJLLL(0, null);
                baseScreenAdaptScene.LLJJI();
                return;
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) ((BaseScreenAdaptScene) aObjectS90S0101000_7.l0);
                g0.LJJIJIL(videoRecordNewScene.requireAppCompatActivity(), (HJ3) obj, new AObjectS136S0100000_7(videoRecordNewScene, 11), new AObjectS136S0100000_7(videoRecordNewScene, 5), new AObjectS136S0100000_7(videoRecordNewScene, 6), new AObjectS52S0101000_7(2, videoRecordNewScene, 12));
                return;
        }
    }

    public static final void onChanged$1(AObjectS90S0101000_7 aObjectS90S0101000_7, Object obj) {
        switch (aObjectS90S0101000_7.i1) {
            case 0:
                Fragment fragment = (Fragment) aObjectS90S0101000_7.l0;
                fragment.getClass();
                if (obj instanceof EQE) {
                    C26045AKb c26045AKb = new C26045AKb(fragment.requireActivity());
                    c26045AKb.LJIIIIZZ(R.string.fz2);
                    c26045AKb.LIZ(true);
                    c26045AKb.LJIIJ();
                    fragment.requireActivity().finish();
                    return;
                }
                C26045AKb c26045AKb2 = new C26045AKb(fragment.requireActivity());
                c26045AKb2.LJIIIIZZ(R.string.fz1);
                c26045AKb2.LJIIJ();
                return;
            default:
                ((I0N) aObjectS90S0101000_7.l0).wn0();
                return;
        }
    }

    public AObjectS90S0101000_7(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
