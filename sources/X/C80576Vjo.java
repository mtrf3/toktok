package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import java.lang.ref.Reference;

/* renamed from: X.Vjo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80576Vjo extends AbstractC270614k {
    public final /* synthetic */ ViewPagerBottomSheetBehavior LIZ;

    public C80576Vjo(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.LIZ = viewPagerBottomSheetBehavior;
    }

    @Override // X.AbstractC270614k
    public final int getViewVerticalDragRange(View view) {
        int i;
        int i2;
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
        if (viewPagerBottomSheetBehavior.LJII) {
            i = viewPagerBottomSheetBehavior.LJIILIIL;
            i2 = viewPagerBottomSheetBehavior.LJFF;
        } else {
            i = viewPagerBottomSheetBehavior.LJI;
            i2 = viewPagerBottomSheetBehavior.LJFF;
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
        int i2 = viewPagerBottomSheetBehavior.LJIIIZ;
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
        int i4 = viewPagerBottomSheetBehavior.LJFF;
        if (viewPagerBottomSheetBehavior.LJII) {
            i3 = viewPagerBottomSheetBehavior.LJIILIIL;
        } else {
            i3 = viewPagerBottomSheetBehavior.LJI;
        }
        return C78609UtB.LJJIIZ(i, i4, i3);
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        int i2 = 3;
        if (f2 < 0.0f && Math.abs(f2) > this.LIZ.LIZ && Math.abs(f2) > Math.abs(f)) {
            i = this.LIZ.LJFF;
        } else {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
            if (viewPagerBottomSheetBehavior.LJII && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                i = this.LIZ.LJIILIIL;
                i2 = 5;
            } else {
                if (f2 > 0.0f && Math.abs(f2) > this.LIZ.LIZ && Math.abs(f2) > Math.abs(f)) {
                    i = this.LIZ.LJI;
                } else {
                    int top = view.getTop();
                    if (Math.abs(top - this.LIZ.LJFF) < Math.abs(top - this.LIZ.LJI)) {
                        i = this.LIZ.LJFF;
                    } else {
                        i = this.LIZ.LJI;
                    }
                }
                i2 = 4;
            }
        }
        if (this.LIZ.LJIIJ.LJIJI(view.getLeft(), i)) {
            this.LIZ.setStateInternal(2);
            C16300kU.LJIIL(view, new RunnableC80577Vjp(this.LIZ, view, i2));
        } else {
            this.LIZ.setStateInternal(i2);
        }
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        this.LIZ.dispatchOnSlide(i2);
    }
}
