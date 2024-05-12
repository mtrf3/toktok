package com.bytedance.android.livesdk.chatroom.behavior;

import X.C06C;
import X.C29306Beo;
import X.C45621qg;
import Y.AObjectS144S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ScrollHeaderBehavior extends C06C<View> {
    public AObjectS144S0100000_5 LIZ;

    public ScrollHeaderBehavior() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollHeaderBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
    }

    @Override // X.C06C
    public final boolean layoutDependsOn(C45621qg parent, View child, View dependency) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(dependency, "dependency");
        return o.LJ(dependency, parent.findViewWithTag("suctionBottomView"));
    }

    @Override // X.C06C
    public final boolean onDependentViewChanged(C45621qg parent, View child, View dependency) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(dependency, "dependency");
        AObjectS144S0100000_5 aObjectS144S0100000_5 = this.LIZ;
        if (aObjectS144S0100000_5 != null) {
            aObjectS144S0100000_5.invoke(dependency);
        }
        parent.requestLayout();
        return false;
    }

    @Override // X.C06C
    public final boolean onMeasureChild(C45621qg parent, View child, int i, int i2, int i3, int i4) {
        View findViewWithTag;
        int i5;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        int i6 = child.getLayoutParams().height;
        int i7 = 0;
        if ((i6 != -2 && i6 != -1) || (findViewWithTag = parent.findViewWithTag("suctionBottomView")) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = parent.getHeight();
        }
        int min = Math.min((int) Math.abs(findViewWithTag.getTranslationY()), findViewWithTag.getMeasuredHeight());
        if (C29306Beo.LJJIIJ(findViewWithTag)) {
            i7 = min;
        }
        int i8 = size - i7;
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        parent.LJIIJJI(child, i, i2, View.MeasureSpec.makeMeasureSpec(i8, i5), i4);
        return true;
    }
}
