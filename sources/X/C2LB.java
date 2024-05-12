package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.uikit.base.AbsFragment;

/* renamed from: X.2LB, reason: invalid class name */
/* loaded from: classes2.dex */
public class C2LB {
    public Activity LJLIL;
    public Fragment LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public String LJLJJLL = "click";
    public String LJLJL;
    public String LJLJLJ;

    public void LJIIIZ() {
        this.LJLIL = null;
    }

    public final FragmentManager LJ() {
        Fragment LJI = LJI();
        if (LJI == null) {
            Activity activity = this.LJLIL;
            if (activity instanceof ActivityC45651qj) {
                return ((ActivityC45651qj) activity).getSupportFragmentManager();
            }
            return null;
        }
        return LJI.getChildFragmentManager();
    }

    public final boolean LJII() {
        AbsFragment absFragment = (AbsFragment) LJI();
        if (absFragment == null) {
            Activity activity = this.LJLIL;
            if (activity != null && !activity.isFinishing()) {
                return true;
            }
            return false;
        }
        return absFragment.isViewValid();
    }

    public Activity LIZLLL() {
        return this.LJLIL;
    }

    public String LJFF() {
        return this.LJLJI;
    }

    public Fragment LJI() {
        return this.LJLILLLLZI;
    }

    public void LJIIJ(String str) {
        this.LJLJJL = str;
    }

    public C2LB(String str, int i) {
        this.LJLJI = str;
        this.LJLJJI = i;
    }

    public void LJIIIIZZ(Activity activity, Fragment fragment) {
        this.LJLIL = activity;
        this.LJLILLLLZI = fragment;
    }
}
