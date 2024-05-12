package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.IAc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46170IAc extends ScrollView {
    public int LJLIL;

    public final int getMaxHeightDp() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setMaxHeightDp(int i) {
        this.LJLIL = i;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46170IAc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.b0b, R.attr.b0c, R.attr.b_5}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.getTheme().obtai…axHeightScrollView, 0, 0)");
        try {
            this.LJLIL = obtainStyledAttributes.getInteger(1, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(SFS.LJI(this.LJLIL), LiveLayoutPreloadThreadPriority.DEFAULT));
    }
}
