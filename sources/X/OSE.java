package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes11.dex */
public final class OSE implements VTX {
    public final OSD LIZ;

    public OSE(OSD floatLinearLayout) {
        o.LJIIIZ(floatLinearLayout, "floatLinearLayout");
        this.LIZ = floatLinearLayout;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        OSF osf;
        OSG osg;
        C118234kV it = C78842Uww.LJJ(0, this.LIZ.getChildCount()).iterator();
        while (it.LJLJI) {
            int nextInt = it.nextInt();
            View childAt = this.LIZ.getChildAt(nextInt);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof OSF) && (osf = (OSF) layoutParams) != null && osf.LIZ) {
                Integer num = this.LIZ.getChildOffsets().get(Integer.valueOf(nextInt));
                if (num == null) {
                    num = 0;
                }
                o.LJIIIIZZ(num, "floatLinearLayout.childOffsets[i] ?: 0");
                int intValue = num.intValue();
                if (intValue < 0) {
                    return;
                }
                int top = (-i) - this.LIZ.getTop();
                Object tag = childAt.getTag(R.id.nb0);
                if (!(tag instanceof OSG) || (osg = (OSG) tag) == null) {
                    osg = new OSG(childAt);
                    childAt.setTag(R.id.nb0, osg);
                }
                if (intValue < top) {
                    intValue = top;
                }
                if (osg.LIZIZ) {
                    View view = osg.LIZ;
                    h0.LJIIL(intValue - view.getTop(), view);
                }
            }
        }
    }
}
