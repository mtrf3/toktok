package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4m5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119214m5 extends C45631qh {
    public final int LLIFFJFJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119214m5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLIFFJFJJ = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b0b});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…axHeightNestedScrollView)");
        this.LLIFFJFJJ = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }

    @Override // X.C45631qh, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLIFFJFJJ;
        if (i3 >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
    }
}
