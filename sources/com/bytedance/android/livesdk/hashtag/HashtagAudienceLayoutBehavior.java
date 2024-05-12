package com.bytedance.android.livesdk.hashtag;

import X.C45621qg;
import X.C80217Ve1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HashtagAudienceLayoutBehavior extends AppBarLayout$ScrollingViewBehavior {
    public HashtagAudienceLayoutBehavior() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashtagAudienceLayoutBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, X.C06C
    public final boolean onDependentViewChanged(C45621qg parent, View child, View dependency) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(dependency, "dependency");
        if (!(dependency instanceof C80217Ve1)) {
            super.onDependentViewChanged(parent, child, dependency);
            return false;
        }
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = parent.getHeight() - dependency.getBottom();
        child.setLayoutParams(marginLayoutParams);
        super.onDependentViewChanged(parent, child, dependency);
        return false;
    }
}
