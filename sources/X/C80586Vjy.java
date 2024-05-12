package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import java.lang.ref.Reference;

/* renamed from: X.Vjy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80586Vjy extends AbstractC270614k {
    public final /* synthetic */ ViewPagerBottomSheetBehavior LIZ;

    public C80586Vjy(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.LIZ = viewPagerBottomSheetBehavior;
    }

    @Override // X.AbstractC270614k
    public final int getViewVerticalDragRange(View view) {
        int i;
        int i2;
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
        if (viewPagerBottomSheetBehavior.LJI) {
            i = viewPagerBottomSheetBehavior.LJIILIIL;
            i2 = viewPagerBottomSheetBehavior.LJ;
        } else {
            i = viewPagerBottomSheetBehavior.LJFF;
            i2 = viewPagerBottomSheetBehavior.LJ;
        }
        return i - i2;
    }

    @Override // X.AbstractC270614k
    public final void onViewDragStateChanged(int i) {
        if (i == 1) {
            this.LIZ.setStateInternal(1);
        }
    }

    @Override // X.AbstractC270614k
    public final boolean tryCaptureView(View view, int i) {
        Reference reference;
        View view2;
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
        int i2 = viewPagerBottomSheetBehavior.LJIIIIZZ;
        if (i2 == 1 || viewPagerBottomSheetBehavior.LJIJJ) {
            return false;
        }
        if ((i2 == 3 && viewPagerBottomSheetBehavior.LJIJ == i && (view2 = viewPagerBottomSheetBehavior.LJIILL.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIILJJIL) == null || reference.get() != view) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        return view.getLeft();
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionVertical(View view, int i, int i2) {
        int i3;
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
        int i4 = viewPagerBottomSheetBehavior.LJ;
        if (viewPagerBottomSheetBehavior.LJI) {
            i3 = viewPagerBottomSheetBehavior.LJIILIIL;
        } else {
            i3 = viewPagerBottomSheetBehavior.LJFF;
        }
        return C78609UtB.LJJIIZ(i, i4, i3);
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        int i2 = 3;
        if (f2 < 0.0f) {
            i = this.LIZ.LJ;
        } else {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
            if (viewPagerBottomSheetBehavior.LJI && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                i = this.LIZ.LJIILIIL;
                i2 = 5;
            } else {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - this.LIZ.LJ) < Math.abs(top - this.LIZ.LJFF)) {
                        i = this.LIZ.LJ;
                    } else {
                        i = this.LIZ.LJFF;
                    }
                } else {
                    i = this.LIZ.LJFF;
                }
                i2 = 4;
            }
        }
        if (this.LIZ.LJIIIZ.LJIJI(view.getLeft(), i)) {
            this.LIZ.setStateInternal(2);
            C16300kU.LJIIL(view, new RunnableC80587Vjz(this.LIZ, view, i2));
        } else {
            this.LIZ.setStateInternal(i2);
        }
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        this.LIZ.dispatchOnSlide(i2);
    }
}
