package com.ss.android.ugc.aweme.result.common.core.ui;

import X.C45621qg;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HalfShopBehavior extends BottomSheetBehavior<View> {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C06C
    public final boolean onInterceptTouchEvent(C45621qg parent, View child, MotionEvent event) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(event, "event");
        if (event.getAction() == 2) {
            return false;
        }
        return super.onInterceptTouchEvent(parent, child, event);
    }
}
