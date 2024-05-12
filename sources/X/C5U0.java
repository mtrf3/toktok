package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5U0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5U0 extends AbstractC56012Ht<C76800UCe, C76800UCe> {
    public C29701Eo LJLIL;

    @Override // X.AbstractC56012Ht
    public final void onHide() {
        super.onHide();
        C29701Eo c29701Eo = this.LJLIL;
        if (c29701Eo != null) {
            C146035oF.LIZIZ(c29701Eo);
        }
        C29701Eo c29701Eo2 = this.LJLIL;
        if (c29701Eo2 != null) {
            c29701Eo2.cancelAnimation();
        }
    }

    @Override // X.AbstractC56012Ht
    public final void onShow() {
        super.onShow();
        C29701Eo c29701Eo = this.LJLIL;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(0);
        }
        C29701Eo c29701Eo2 = this.LJLIL;
        if (c29701Eo2 != null) {
            c29701Eo2.playAnimation();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cbi, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int LJ = C81184Vtc.LJ(this.mActivity);
        layoutParams.gravity = 17;
        int i = (int) (LJ * 0.6d);
        layoutParams.width = i;
        layoutParams.height = i;
        viewGroup2.setLayoutParams(layoutParams);
        this.LJLIL = (C29701Eo) viewGroup2.findViewById(R.id.ga5);
        return viewGroup2;
    }
}
