package X;

import android.view.View;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.Vjt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80581Vjt extends AbstractC270614k {
    public final /* synthetic */ ViewPagerBottomSheetBehavior LIZ;

    public C80581Vjt(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.LIZ = viewPagerBottomSheetBehavior;
    }

    @Override // X.AbstractC270614k
    public final int getViewVerticalDragRange(View view) {
        int i;
        int i2;
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
        if (viewPagerBottomSheetBehavior.LJII) {
            i = viewPagerBottomSheetBehavior.LJIILJJIL;
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
        WeakReference<View> weakReference;
        View view2;
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
        int i2 = viewPagerBottomSheetBehavior.LJIIIZ;
        if (i2 == 1 || viewPagerBottomSheetBehavior.LJIJJLI) {
            return false;
        }
        if ((i2 == 3 && viewPagerBottomSheetBehavior.LJIJI == i && (weakReference = viewPagerBottomSheetBehavior.LJIILLIIL) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIILL) == null || reference.get() != view) {
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
        int i4 = i - ((int) ((1.0d - viewPagerBottomSheetBehavior.LJIL) * i2));
        int i5 = viewPagerBottomSheetBehavior.LJFF;
        if (viewPagerBottomSheetBehavior.LJII) {
            i3 = viewPagerBottomSheetBehavior.LJIILJJIL;
        } else {
            i3 = viewPagerBottomSheetBehavior.LJI;
        }
        return C78609UtB.LJJIIZ(i4, i5, i3);
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        TMN tmn;
        int i2 = 3;
        if (f2 < 0.0f) {
            i = this.LIZ.LJFF;
        } else {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
            if (viewPagerBottomSheetBehavior.LJII && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                i = this.LIZ.LJIILJJIL;
                i2 = 5;
                Reference reference = this.LIZ.LJIILL;
                if (reference != null && reference.get() != null && (tmn = this.LIZ.LJIIZILJ) != null) {
                    tmn.getClass();
                }
            } else {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - this.LIZ.LJFF) < Math.abs(top - this.LIZ.LJI)) {
                        i = this.LIZ.LJFF;
                    } else {
                        i = this.LIZ.LJI;
                    }
                } else {
                    i = this.LIZ.LJI;
                }
                i2 = 4;
            }
        }
        if (this.LIZ.LJIIJ.LJIJI(view.getLeft(), i)) {
            this.LIZ.setStateInternal(2);
            C16300kU.LJIIL(view, new RunnableC80582Vju(this.LIZ, view, i2));
        } else {
            this.LIZ.setStateInternal(i2);
        }
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        this.LIZ.dispatchOnSlide(i2);
    }
}
