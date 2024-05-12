package com.ss.android.ugc.aweme.share.core.ui;

import X.C45621qg;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SkeletonSharePanelBehavior<V extends View> extends BottomSheetBehavior<V> {
    public boolean LIZ;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C06C
    public final void onNestedPreScroll(C45621qg coordinatorLayout, V child, View target, int i, int i2, int[] consumed, int i3) {
        o.LJIIIZ(coordinatorLayout, "coordinatorLayout");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        if (getState() == 4 && this.LIZ) {
            consumed[0] = 0;
            consumed[1] = i2;
        } else {
            super.onNestedPreScroll(coordinatorLayout, child, target, i, i2, consumed, i3);
        }
    }
}
