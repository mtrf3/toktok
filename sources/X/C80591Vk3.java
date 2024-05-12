package X;

import android.view.View;
import com.ss.android.ugc.aweme.vision.behavior.SearchBottomSheetBehavior;
import java.lang.ref.Reference;

/* renamed from: X.Vk3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80591Vk3 extends AbstractC270614k {
    public final /* synthetic */ SearchBottomSheetBehavior LIZ;

    public C80591Vk3(SearchBottomSheetBehavior searchBottomSheetBehavior) {
        this.LIZ = searchBottomSheetBehavior;
    }

    @Override // X.AbstractC270614k
    public final int getViewVerticalDragRange(View view) {
        int i;
        int i2;
        SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
        if (searchBottomSheetBehavior.LJII) {
            i = searchBottomSheetBehavior.LJIILJJIL;
            i2 = searchBottomSheetBehavior.LJFF;
        } else {
            i = searchBottomSheetBehavior.LJI;
            i2 = searchBottomSheetBehavior.LJFF;
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
        SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
        int i2 = searchBottomSheetBehavior.LJIIIZ;
        if (i2 == 1 || searchBottomSheetBehavior.LJIJJLI) {
            return false;
        }
        if ((i2 == 3 && searchBottomSheetBehavior.LJIJI == i && (view2 = searchBottomSheetBehavior.LJIILLIIL.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIILL) == null || reference.get() != view) {
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
        SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
        int i4 = searchBottomSheetBehavior.LJFF;
        if (searchBottomSheetBehavior.LJII) {
            i3 = searchBottomSheetBehavior.LJIILJJIL;
        } else {
            i3 = searchBottomSheetBehavior.LJI;
        }
        return C78609UtB.LJJIIZ(i, i4, i3);
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        int i2 = 3;
        if (f2 < 0.0f) {
            i = this.LIZ.LJFF;
        } else {
            SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
            if (searchBottomSheetBehavior.LJII && searchBottomSheetBehavior.shouldHide(view, f2)) {
                SearchBottomSheetBehavior searchBottomSheetBehavior2 = this.LIZ;
                i = searchBottomSheetBehavior2.LJIL;
                if (i <= 0) {
                    i = searchBottomSheetBehavior2.LJIILJJIL;
                }
                i2 = 5;
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
        C270714l c270714l = this.LIZ.LJIIJ;
        if (c270714l != null && c270714l.LJIJI(view.getLeft(), i)) {
            this.LIZ.setStateInternal(2);
            C16300kU.LJIIL(view, new RunnableC80592Vk4(this.LIZ, view, i2));
        } else {
            this.LIZ.setStateInternal(i2);
        }
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        this.LIZ.dispatchOnSlide(i2);
    }
}
