package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.Vho, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80452Vho extends AbstractC270614k {
    public final /* synthetic */ BottomSheetBehavior LIZ;

    public C80452Vho(BottomSheetBehavior bottomSheetBehavior) {
        this.LIZ = bottomSheetBehavior;
    }

    @Override // X.AbstractC270614k
    public final int getViewVerticalDragRange(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.LIZ;
        if (bottomSheetBehavior.hideable) {
            return bottomSheetBehavior.parentHeight;
        }
        return bottomSheetBehavior.collapsedOffset;
    }

    @Override // X.AbstractC270614k
    public final void onViewDragStateChanged(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.LIZ;
            if (bottomSheetBehavior.draggable) {
                bottomSheetBehavior.setStateInternal(1);
            }
        }
    }

    @Override // X.AbstractC270614k
    public final boolean tryCaptureView(View view, int i) {
        Reference reference;
        WeakReference<View> weakReference;
        View view2;
        BottomSheetBehavior bottomSheetBehavior = this.LIZ;
        int i2 = bottomSheetBehavior.state;
        if (i2 == 1 || bottomSheetBehavior.touchingScrollingChild) {
            return false;
        }
        if ((i2 == 3 && bottomSheetBehavior.activePointerId == i && (weakReference = bottomSheetBehavior.nestedScrollingChildRef) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.viewRef) == null || reference.get() != view) {
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
        int expandedOffset = this.LIZ.getExpandedOffset();
        BottomSheetBehavior bottomSheetBehavior = this.LIZ;
        if (bottomSheetBehavior.hideable) {
            i3 = bottomSheetBehavior.parentHeight;
        } else {
            i3 = bottomSheetBehavior.collapsedOffset;
        }
        return C78609UtB.LJJIIZ(i, expandedOffset, i3);
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        int i2 = 6;
        if (f2 < 0.0f) {
            BottomSheetBehavior bottomSheetBehavior = this.LIZ;
            if (bottomSheetBehavior.fitToContents) {
                i = bottomSheetBehavior.fitToContentsOffset;
            } else {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior2 = this.LIZ;
                i = bottomSheetBehavior2.halfExpandedOffset;
                if (top <= i) {
                    i = bottomSheetBehavior2.expandedOffset;
                }
            }
            i2 = 3;
        } else {
            BottomSheetBehavior bottomSheetBehavior3 = this.LIZ;
            if (bottomSheetBehavior3.hideable && bottomSheetBehavior3.shouldHide(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    int top2 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior4 = this.LIZ;
                    if (top2 <= (bottomSheetBehavior4.getExpandedOffset() + bottomSheetBehavior4.parentHeight) / 2) {
                        BottomSheetBehavior bottomSheetBehavior5 = this.LIZ;
                        if (bottomSheetBehavior5.fitToContents) {
                            i = bottomSheetBehavior5.fitToContentsOffset;
                        } else if (Math.abs(view.getTop() - this.LIZ.expandedOffset) < Math.abs(view.getTop() - this.LIZ.halfExpandedOffset)) {
                            i = this.LIZ.expandedOffset;
                        } else {
                            i = this.LIZ.halfExpandedOffset;
                        }
                        i2 = 3;
                    }
                }
                i = this.LIZ.parentHeight;
                i2 = 5;
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior6 = this.LIZ;
                if (bottomSheetBehavior6.fitToContents) {
                    if (Math.abs(top3 - bottomSheetBehavior6.fitToContentsOffset) < Math.abs(top3 - this.LIZ.collapsedOffset)) {
                        i = this.LIZ.fitToContentsOffset;
                        i2 = 3;
                    } else {
                        i = this.LIZ.collapsedOffset;
                        i2 = 4;
                    }
                } else {
                    int i3 = bottomSheetBehavior6.halfExpandedOffset;
                    if (top3 < i3) {
                        if (top3 < Math.abs(top3 - bottomSheetBehavior6.collapsedOffset)) {
                            i = this.LIZ.expandedOffset;
                            i2 = 3;
                        } else {
                            i = this.LIZ.halfExpandedOffset;
                        }
                    } else if (Math.abs(top3 - i3) < Math.abs(top3 - this.LIZ.collapsedOffset)) {
                        i = this.LIZ.halfExpandedOffset;
                    } else {
                        i = this.LIZ.collapsedOffset;
                        i2 = 4;
                    }
                }
            } else {
                BottomSheetBehavior bottomSheetBehavior7 = this.LIZ;
                if (bottomSheetBehavior7.fitToContents) {
                    i = bottomSheetBehavior7.collapsedOffset;
                } else {
                    int top4 = view.getTop();
                    if (Math.abs(top4 - this.LIZ.halfExpandedOffset) < Math.abs(top4 - this.LIZ.collapsedOffset)) {
                        i = this.LIZ.halfExpandedOffset;
                    } else {
                        i = this.LIZ.collapsedOffset;
                    }
                }
                i2 = 4;
            }
        }
        this.LIZ.startSettlingAnimation(view, i2, i, true);
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        this.LIZ.dispatchOnSlide(i2);
    }
}
