package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;

/* renamed from: X.4m6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119224m6 extends C45631qh {
    public boolean LLIFFJFJJ;
    public int LLII;

    @Override // X.C45631qh
    public final int LIZIZ(Rect rect) {
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (!this.LLIFFJFJJ) {
            if (rect != null) {
                i = rect.height();
            } else {
                i = 0;
            }
            if (i <= KL2.LIZJ(getContext(), 50.0f)) {
                int LIZIZ = super.LIZIZ(rect);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("rect left ");
                Integer num5 = null;
                if (rect != null) {
                    num = Integer.valueOf(rect.left);
                } else {
                    num = null;
                }
                LIZ.append(num);
                LIZ.append("  right ");
                if (rect != null) {
                    num2 = Integer.valueOf(rect.right);
                } else {
                    num2 = null;
                }
                LIZ.append(num2);
                LIZ.append(" bottom ");
                if (rect != null) {
                    num3 = Integer.valueOf(rect.bottom);
                } else {
                    num3 = null;
                }
                LIZ.append(num3);
                LIZ.append(" top ");
                if (rect != null) {
                    num4 = Integer.valueOf(rect.top);
                } else {
                    num4 = null;
                }
                LIZ.append(num4);
                LIZ.append("height ");
                if (rect != null) {
                    num5 = Integer.valueOf(rect.height());
                }
                LIZ.append(num5);
                LIZ.append("   result ");
                LIZ.append(LIZIZ);
                X1D.LIZIZ(LIZ);
                return LIZIZ;
            }
        }
        return 0;
    }

    public final void setForbidAutoScrollToShowChild(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public final void setMaxHeight(int i) {
        this.LLII = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119224m6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLIFFJFJJ = true;
        this.LLII = -1;
    }

    @Override // X.C45631qh, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLII;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
    }
}
