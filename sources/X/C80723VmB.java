package X;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.VmB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80723VmB {
    public final DrawerLayout LIZ;
    public final int LIZIZ;
    public final C270714l LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public float LJFF;
    public float LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;

    public C80723VmB(DrawerLayout drawerLayout, C270714l c270714l) {
        o.LJIIIZ(drawerLayout, "drawerLayout");
        this.LIZ = drawerLayout;
        this.LIZIZ = 8388613;
        this.LIZJ = c270714l;
        this.LJ = ((Number) C53938LEw.LIZ.getValue()).intValue();
        this.LJII = 1;
        this.LIZLLL = ViewConfiguration.get(drawerLayout.getContext()).getScaledTouchSlop();
        drawerLayout.setScrimColor(0);
        drawerLayout.LJIJ(1, 8388611);
    }

    public static boolean LIZIZ(C80723VmB c80723VmB, float f, float f2) {
        float f3 = (f2 * f2) + (f * f);
        int i = c80723VmB.LIZLLL;
        if (f3 > i * i) {
            return true;
        }
        return false;
    }

    public final boolean LIZ(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i;
        if (view instanceof ViewGroup) {
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0 && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && (i5 = i3 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && LIZ(childAt, true, i6, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            if (C16310kV.LIZLLL(this.LIZ) != 1) {
                i6 = -i6;
            }
            if (view.canScrollHorizontally(i6)) {
                return true;
            }
        }
        return false;
    }
}
