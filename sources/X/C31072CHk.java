package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.CHk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31072CHk extends ConstraintLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            return super.dispatchApplyWindowInsets(windowInsets);
        } catch (NullPointerException e) {
            V0N.LJFF(e, new Exception(i0.LJFF("current view ids: ", C0YI.LIZIZ(this))));
            throw e;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31072CHk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int LIZ = C15380j0.LIZ(150.0f);
        if (LIZ > 0 && View.MeasureSpec.getSize(i) > LIZ) {
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                i = View.MeasureSpec.makeMeasureSpec(LIZ, LiveLayoutPreloadThreadPriority.DEFAULT);
            } else {
                i = View.MeasureSpec.makeMeasureSpec(LIZ, 1073741824);
            }
        }
        int LIZ2 = C15380j0.LIZ(40.0f);
        if (LIZ2 > 0 && View.MeasureSpec.getSize(i2) > LIZ2) {
            if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
                i2 = View.MeasureSpec.makeMeasureSpec(LIZ2, LiveLayoutPreloadThreadPriority.DEFAULT);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(LIZ2, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31072CHk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
