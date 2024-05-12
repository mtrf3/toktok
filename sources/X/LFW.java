package X;

import Y.AgS112S0200000_9;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFW implements InterfaceC53944LFc, G27 {
    public final Activity LJLIL;
    public final View LJLILLLLZI;
    public final View LJLJI;

    @Override // X.InterfaceC53944LFc
    public final boolean LJIIJJI() {
        return true;
    }

    public LFW(Activity mActivity) {
        o.LJIIIZ(mActivity, "mActivity");
        this.LJLIL = mActivity;
        View findViewById = mActivity.findViewById(R.id.j7i);
        o.LJIIIIZZ(findViewById, "mActivity.findViewById(rootFrameLayoutId)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = mActivity.findViewById(R.id.kzd);
        o.LJIIIIZZ(findViewById2, "mActivity.findViewById(tabletCrossContainerId)");
        this.LJLJI = findViewById2;
        findViewById.setBackgroundResource(R.color.ak);
        C53948LFg LIZJ = C53946LFe.LIZJ(mActivity, null);
        LIZ(LIZJ.LIZIZ, LIZJ.LIZJ, LIZJ.LJFF);
        C9XU.LIZ(mActivity.hashCode(), this);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        if (!o.LJ(this.LJLIL, activity)) {
            return;
        }
        C10K.LJII(100L).LJ(new AgS112S0200000_9(newConfig, this, 2), C10K.LJIIIIZZ, null);
    }

    public final void LIZ(int i, int i2, boolean z) {
        ViewGroup.LayoutParams layoutParams = this.LJLILLLLZI.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.LJLJI.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        if (z) {
            if (i2 < 0) {
                return;
            }
            layoutParams2.height = i2;
            layoutParams2.width = i;
            layoutParams4.height = i2;
            layoutParams4.width = (int) (i2 / 1.777777d);
        } else {
            layoutParams2.width = i;
            layoutParams2.height = i2;
            layoutParams4.width = i;
            layoutParams4.height = i2;
        }
        this.LJLILLLLZI.setLayoutParams(layoutParams2);
        this.LJLJI.setLayoutParams(layoutParams4);
    }
}
