package com.ss.android.ugc.aweme.photo;

import X.C45621qg;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LocalViewPagerBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attributeSet, "attributeSet");
    }

    @Override // com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior, X.C06C
    public final void onNestedPreScroll(C45621qg coordinatorLayout, V child, View target, int i, int i2, int[] consumed) {
        o.LJIIIZ(coordinatorLayout, "coordinatorLayout");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        target.getId();
        throw null;
    }
}
