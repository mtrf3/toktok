package com.bytedance.android.live.rank.impl.list.fragment.behavior;

import X.C45621qg;
import X.C80217Ve1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RankBottomBehavior extends AppBarLayout$ScrollingViewBehavior {
    public C80217Ve1 LJ;
    public boolean LJFF;

    public RankBottomBehavior() {
        this.LJFF = true;
    }

    public RankBottomBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJFF = true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, X.C06C
    public final boolean onDependentViewChanged(C45621qg parent, View child, View dependency) {
        C80217Ve1 c80217Ve1;
        int top;
        boolean z;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(dependency, "dependency");
        if (dependency instanceof C80217Ve1) {
            c80217Ve1 = (C80217Ve1) dependency;
        } else {
            c80217Ve1 = null;
        }
        this.LJ = c80217Ve1;
        super.onDependentViewChanged(parent, child, dependency);
        C80217Ve1 c80217Ve12 = this.LJ;
        if (c80217Ve12 == null) {
            top = 0;
        } else {
            top = c80217Ve12.getTop() + c80217Ve12.getTotalScrollRange();
        }
        if (top != child.getPaddingBottom()) {
            z = true;
            if (this.LJFF) {
                child.setPadding(child.getPaddingLeft(), child.getPaddingTop(), child.getPaddingRight(), top);
            }
        } else {
            z = false;
        }
        if (!this.LJFF || !z) {
            return false;
        }
        return true;
    }
}
