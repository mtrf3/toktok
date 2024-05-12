package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.IAd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46171IAd extends ScrollView {
    public final int LJLIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46171IAd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.scrollViewStyle);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{com.zhiliaoapp.musically.R.attr.b0b, com.zhiliaoapp.musically.R.attr.b0c, com.zhiliaoapp.musically.R.attr.b_5});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…able.MaxHeightScrollView)");
        this.LJLIL = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LJLIL;
        if (i3 <= 0) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, LiveLayoutPreloadThreadPriority.DEFAULT));
        }
    }
}
