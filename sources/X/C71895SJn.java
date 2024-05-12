package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.SJn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71895SJn extends AbstractC72772ShE {
    public int LJLLL;
    public int LJLLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C71895SJn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final int getSkeletonHeight() {
        return this.LJLLLL;
    }

    public final int getSkeletonWidth() {
        return this.LJLLL;
    }

    public final void setSkeletonHeight(int i) {
        this.LJLLLL = i;
        requestLayout();
    }

    public final void setSkeletonWidth(int i) {
        this.LJLLL = i;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = LiveLayoutPreloadThreadPriority.DEFAULT;
        if (mode == 1073741824) {
            mode = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            i3 = mode2;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, i3));
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (LIZJ()) {
            int i4 = this.LJLLL;
            if (i4 != -2) {
                if (i4 != -1) {
                    if (i4 != 0) {
                        measuredWidth = i4;
                    } else {
                        measuredWidth = measuredHeight;
                    }
                }
            } else {
                measuredWidth = measuredWidth2;
            }
            int i5 = this.LJLLLL;
            if (i5 != -2) {
                if (i5 != -1) {
                    if (i5 != 0) {
                        measuredHeight = i5;
                    } else {
                        measuredHeight = getMeasuredWidth();
                    }
                }
            } else {
                measuredHeight = measuredHeight2;
            }
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        ((Drawable) ListProtector.get(getPlaceholders(), 0)).setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71895SJn(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r1 = 2
            r0 = r8 & 2
            if (r0 == 0) goto L6
            r7 = 0
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r4 = 0
            r5.<init>(r6, r7, r4)
            r3 = -2
            r5.LJLLL = r3
            r5.LJLLLL = r3
            int[] r0 = new int[r1]
            r0 = {x0034: FILL_ARRAY_DATA , data: [2130971967, 2130971976} // fill-array
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r0, r4, r4)
            r1 = 1
            int r0 = r2.getLayoutDimension(r1, r3)
            r5.setSkeletonWidth(r0)
            int r0 = r2.getLayoutDimension(r4, r3)
            r5.setSkeletonHeight(r0)
            r2.recycle()
            r5.LJ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71895SJn.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
