package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public final class VTM implements VTO {
    public final /* synthetic */ VTN LIZ;
    public final /* synthetic */ View LIZIZ;

    public VTM(VTN vtn, View view) {
        this.LIZ = vtn;
        this.LIZIZ = view;
    }

    @Override // X.VTO
    public final void LIZ(C80261Vej c80261Vej, boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.LIZIZ;
        viewGroup.getClass();
        if (c80261Vej != null) {
            if (C78996UzQ.LJJIIJZLJL(c80261Vej)) {
                C78996UzQ.LJI();
            }
            viewGroup.removeView(c80261Vej);
        }
        VTN vtn = this.LIZ;
        if (c80261Vej == null) {
            vtn.getClass();
        } else {
            int childCount = vtn.getMAppBarLayout().getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = vtn.getMAppBarLayout().getChildAt(i);
                if (childAt instanceof C80261Vej) {
                    if (childAt != null) {
                        VTS mAppBarLayout = vtn.getMAppBarLayout();
                        if (C78996UzQ.LJJIIJZLJL(childAt)) {
                            C78996UzQ.LJI();
                        }
                        mAppBarLayout.removeView(childAt);
                    }
                } else {
                    i++;
                }
            }
            vtn.LLIFFJFJJ.addView(c80261Vej);
        }
        ((VTR) this.LIZ.findViewById(R.id.a6n)).setIsEnableTabbarDrag(z);
    }
}
