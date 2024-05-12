package X;

import Y.ARunnableS33S0200000_14;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.VmA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80722VmA extends AbstractC270614k {
    public final int LIZ;
    public C270714l LIZIZ;
    public final ARunnableS33S0200000_14 LIZJ;
    public final /* synthetic */ DrawerLayout LIZLLL;

    @Override // X.AbstractC270614k
    public final boolean onEdgeLock(int i) {
        return false;
    }

    @Override // X.AbstractC270614k
    public final int getViewHorizontalDragRange(View child) {
        o.LJIIIZ(child, "child");
        this.LIZLLL.getClass();
        if (DrawerLayout.LJIILJJIL(child)) {
            return child.getWidth();
        }
        return 0;
    }

    @Override // X.AbstractC270614k
    public final void onViewDragStateChanged(int i) {
        DrawerLayout drawerLayout = this.LIZLLL;
        C270714l c270714l = this.LIZIZ;
        o.LJI(c270714l);
        drawerLayout.LJIJJLI(i, c270714l.LJIJI);
    }

    public C80722VmA(DrawerLayout drawerLayout, int i) {
        this.LIZLLL = drawerLayout;
        this.LIZ = i;
        this.LIZJ = new ARunnableS33S0200000_14(drawerLayout, this, 39);
    }

    @Override // X.AbstractC270614k
    public final void onEdgeDragStarted(int i, int i2) {
        View LJFF;
        if ((i & 1) == 1) {
            LJFF = this.LIZLLL.LJFF(3);
        } else {
            LJFF = this.LIZLLL.LJFF(5);
        }
        if (LJFF != null && this.LIZLLL.LJIIIIZZ(LJFF) == 0) {
            C270714l c270714l = this.LIZIZ;
            o.LJI(c270714l);
            c270714l.LIZJ(i2, LJFF);
        }
    }

    @Override // X.AbstractC270614k
    public final void onEdgeTouched(int i, int i2) {
        this.LIZLLL.postDelayed(this.LIZJ, 160L);
    }

    @Override // X.AbstractC270614k
    public final void onViewCaptured(View capturedChild, int i) {
        o.LJIIIZ(capturedChild, "capturedChild");
        ViewGroup.LayoutParams layoutParams = capturedChild.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
        ((C80724VmC) layoutParams).LIZJ = false;
        int i2 = 3;
        if (this.LIZ == 3) {
            i2 = 5;
        }
        View LJFF = this.LIZLLL.LJFF(i2);
        if (LJFF != null) {
            this.LIZLLL.LIZLLL(LJFF, true);
        }
    }

    @Override // X.AbstractC270614k
    public final boolean tryCaptureView(View child, int i) {
        o.LJIIIZ(child, "child");
        this.LIZLLL.getClass();
        if (DrawerLayout.LJIILJJIL(child) && this.LIZLLL.LIZIZ(child, this.LIZ) && this.LIZLLL.LJIIIIZZ(child) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionHorizontal(View child, int i, int i2) {
        o.LJIIIZ(child, "child");
        if (this.LIZLLL.LIZIZ(child, 3)) {
            return Math.max(-child.getWidth(), Math.min(i, 0));
        }
        int width = this.LIZLLL.getWidth();
        return Math.max(width - child.getWidth(), Math.min(i, width));
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionVertical(View child, int i, int i2) {
        o.LJIIIZ(child, "child");
        return child.getTop();
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View releasedChild, float f, float f2) {
        o.LJIIIZ(releasedChild, "releasedChild");
        this.LIZLLL.getClass();
        ViewGroup.LayoutParams layoutParams = releasedChild.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout.LayoutParams");
        float f3 = ((C80724VmC) layoutParams).LIZIZ;
        int width = releasedChild.getWidth();
        int i = 0;
        if (this.LIZLLL.LIZIZ(releasedChild, 3)) {
            if (f <= 0.0f && (f != 0.0f || f3 <= 0.5f)) {
                i = -width;
            }
        } else {
            i = this.LIZLLL.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                i -= width;
            }
        }
        C270714l c270714l = this.LIZIZ;
        o.LJI(c270714l);
        c270714l.LJIJI(i, releasedChild.getTop());
        this.LIZLLL.invalidate();
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View changedView, int i, int i2, int i3, int i4) {
        float width;
        o.LJIIIZ(changedView, "changedView");
        int width2 = changedView.getWidth();
        if (this.LIZLLL.LIZIZ(changedView, 3)) {
            width = i + width2;
        } else {
            width = this.LIZLLL.getWidth() - i;
        }
        float f = width / width2;
        this.LIZLLL.LJIJI(changedView, f);
        int i5 = 0;
        if (f == 0.0f) {
            i5 = 4;
        }
        changedView.setVisibility(i5);
        this.LIZLLL.invalidate();
    }
}
