package X;

import Y.AfS65S0100000_13;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public final class U1W implements C0C4 {
    public final ViewPager LIZ;
    public final boolean LIZIZ;

    public U1W(UHK uhk, boolean z) {
        this.LIZ = uhk;
        this.LIZIZ = z;
    }

    @Override // X.C0C4
    public final void LIZ(View view, float f) {
        Integer num;
        InterpolatorC22990vH interpolatorC22990vH = new InterpolatorC22990vH(0.32f, 0.94f, 0.6f, 1.0f);
        View findViewById = view.findViewById(R.id.f9e);
        C76612U4y c76612U4y = null;
        if (findViewById != null) {
            Object tag = view.getTag();
            if (tag instanceof Integer) {
                num = (Integer) tag;
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (intValue - this.LIZ.getCurrentItem() == 2) {
                    findViewById.setPivotX(0.0f);
                } else if (this.LIZ.getCurrentItem() - intValue == 2) {
                    findViewById.setPivotX(findViewById.getWidth());
                } else {
                    findViewById.setPivotX(findViewById.getWidth() / 2.0f);
                }
            }
            findViewById.setPivotY(findViewById.getHeight() / 2.0f);
            float f2 = 1;
            float f3 = 0.7f * f;
            findViewById.setScaleX(f2 - interpolatorC22990vH.getInterpolation(Math.abs(f3)));
            findViewById.setScaleY(f2 - interpolatorC22990vH.getInterpolation(Math.abs(f3)));
            findViewById.setAlpha(f2 - Math.abs(f));
        }
        if (f == 0.0f) {
            if (view instanceof C76612U4y) {
                c76612U4y = (C76612U4y) view;
            }
            if (this.LIZIZ) {
                if (c76612U4y != null) {
                    c76612U4y.LIZJ();
                }
            } else {
                if (c76612U4y == null) {
                    return;
                }
                c76612U4y.LJLIL = (C73411SrX) C265112h.LIZ(TMC.LJIL(0L, 2300L, TimeUnit.MILLISECONDS)).LJJJJZI(new AfS65S0100000_13(c76612U4y, 8));
            }
        }
    }
}
