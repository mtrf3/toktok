package X;

import android.view.View;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.PrivilegeBottomSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.Vhu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80458Vhu extends AbstractC270614k {
    public final /* synthetic */ PrivilegeBottomSheetBehavior LIZ;

    public C80458Vhu(PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior) {
        this.LIZ = privilegeBottomSheetBehavior;
    }

    @Override // X.AbstractC270614k
    public final int getViewVerticalDragRange(View view) {
        PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior = this.LIZ;
        if (privilegeBottomSheetBehavior.LJIILJJIL) {
            return privilegeBottomSheetBehavior.LJJ;
        }
        return privilegeBottomSheetBehavior.LJIILIIL;
    }

    @Override // X.AbstractC270614k
    public final void onViewDragStateChanged(int i) {
        if (i == 1) {
            PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior = this.LIZ;
            if (privilegeBottomSheetBehavior.LJIILLIIL) {
                privilegeBottomSheetBehavior.setStateInternal(1);
            }
        }
    }

    @Override // X.AbstractC270614k
    public final boolean tryCaptureView(View view, int i) {
        Reference reference;
        WeakReference<View> weakReference;
        View view2;
        PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior = this.LIZ;
        int i2 = privilegeBottomSheetBehavior.LJIIZILJ;
        if (i2 == 1 || privilegeBottomSheetBehavior.LJJIJ) {
            return false;
        }
        if ((i2 == 3 && privilegeBottomSheetBehavior.LJJIIZ == i && (weakReference = privilegeBottomSheetBehavior.LJJIII) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJJII) == null || reference.get() != view) {
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
        PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior = this.LIZ;
        if (privilegeBottomSheetBehavior.LJIILJJIL) {
            i3 = privilegeBottomSheetBehavior.LJJ;
        } else {
            i3 = privilegeBottomSheetBehavior.LJIILIIL;
        }
        return C78609UtB.LJJIIZ(i, expandedOffset, i3);
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View view, float f, float f2) {
        int i = 0;
        int i2 = 6;
        if (f2 < 0.0f || this.LIZ.LIZJ(view, f2)) {
            PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior = this.LIZ;
            if (privilegeBottomSheetBehavior.LIZ) {
                i = privilegeBottomSheetBehavior.LJIIJ;
                i2 = 3;
            } else {
                int top = view.getTop();
                PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior2 = this.LIZ;
                int i3 = privilegeBottomSheetBehavior2.LJIIJJI;
                if (top > i3) {
                    i = i3;
                } else {
                    privilegeBottomSheetBehavior2.getClass();
                    i2 = 3;
                }
            }
        } else {
            PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior3 = this.LIZ;
            if (privilegeBottomSheetBehavior3.LJIILJJIL && privilegeBottomSheetBehavior3.shouldHide(view, f2)) {
                i = this.LIZ.LJJ;
                i2 = 5;
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior4 = this.LIZ;
                if (privilegeBottomSheetBehavior4.LIZ) {
                    if (Math.abs(top2 - privilegeBottomSheetBehavior4.LJIIJ) < Math.abs(top2 - this.LIZ.LJIILIIL)) {
                        i = this.LIZ.LJIIJ;
                        i2 = 3;
                    } else {
                        i = this.LIZ.LJIILIIL;
                        i2 = 4;
                    }
                } else {
                    int i4 = privilegeBottomSheetBehavior4.LJIIJJI;
                    if (top2 < i4) {
                        if (top2 < Math.abs(top2 - privilegeBottomSheetBehavior4.LJIILIIL)) {
                            this.LIZ.getClass();
                            i2 = 3;
                        } else {
                            i = this.LIZ.LJIIJJI;
                        }
                    } else if (Math.abs(top2 - i4) < Math.abs(top2 - this.LIZ.LJIILIIL)) {
                        i = this.LIZ.LJIIJJI;
                    } else {
                        i = this.LIZ.LJIILIIL;
                        i2 = 4;
                    }
                }
            } else {
                PrivilegeBottomSheetBehavior privilegeBottomSheetBehavior5 = this.LIZ;
                if (privilegeBottomSheetBehavior5.LIZ) {
                    i = privilegeBottomSheetBehavior5.LJIILIIL;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - this.LIZ.LJIIJJI) < Math.abs(top3 - this.LIZ.LJIILIIL)) {
                        i = this.LIZ.LJIIJJI;
                    } else {
                        i = this.LIZ.LJIILIIL;
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
