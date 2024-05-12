package X;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.LKa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54072LKa {
    public static String LIZJ = "click_button_icon";
    public static boolean LIZLLL;
    public boolean LIZ;
    public ActivityC45651qj LIZIZ;

    public final void LIZ(TuxIconView tuxIconView) {
        if (!this.LIZ) {
            return;
        }
        if (C53765L8f.LJIIL("NOTIFICATION")) {
            tuxIconView.setVisibility(8);
            return;
        }
        ActivityC45651qj activityC45651qj = this.LIZIZ;
        if (activityC45651qj == null) {
            return;
        }
        tuxIconView.setVisibility(0);
        if (C53765L8f.LJIILJJIL()) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = C7MY.LIZIZ(18);
            c2068389v.LIZJ = C7MY.LIZIZ(18);
            c2068389v.LIZ = R.raw.icon_chevron_right_fill_ltr;
            c2068389v.LJ = Integer.valueOf(R.attr.gx);
            SY9 LIZ = c2068389v.LIZ(activityC45651qj);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LJII = C7MY.LIZIZ(28);
            c110614Vt.LJI = C7MY.LIZIZ(28);
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LIZJ = Float.valueOf(Float.MAX_VALUE);
            tuxIconView.setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(activityC45651qj)));
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(20);
                layoutParams2.addRule(21, -1);
                layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
                layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                tuxIconView.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
        }
        C16880lQ.LJJJ(tuxIconView, new LK7(activityC45651qj));
    }

    public final void LIZIZ(Bundle bundle, ActivityC45651qj activityC45651qj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init bundle = ");
        LIZ.append(bundle);
        C221018lt.LJFF("InboxPageHelper", X1D.LIZIZ(LIZ));
        this.LIZ = true;
        this.LIZIZ = activityC45651qj;
    }
}
