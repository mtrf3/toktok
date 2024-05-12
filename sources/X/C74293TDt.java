package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.TDt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74293TDt extends C74295TDv {
    public java.util.Map<Integer, View> _$_findViewCache;
    public ConstraintLayout mContainer;
    public int mDefaultIndicatorColor;
    public final Paint mPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C74293TDt(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L18;
     */
    @Override // X.AbstractC019505v, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            java.lang.String r0 = "canvas"
            r5 = r12
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            super.onDraw(r5)
            int r2 = r11.mCount
            r1 = 0
        Lc:
            if (r1 >= r2) goto L86
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.mContainer
            android.view.View[] r0 = r11.getViews(r0)
            r3 = r0[r1]
            if (r3 != 0) goto L1b
        L18:
            int r1 = r1 + 1
            goto Lc
        L1b:
            int r4 = r3.getVisibility()
            r0 = 8
            if (r4 != r0) goto L24
            goto L18
        L24:
            boolean r0 = r3 instanceof X.CVQ
            if (r0 == 0) goto L40
            r0 = r3
            X.CVQ r0 = (X.CVQ) r0
            if (r0 == 0) goto L40
            java.lang.Integer r0 = r0.getIndicatorColor$live_widget_release()
            if (r0 == 0) goto L40
            int r4 = r0.intValue()
            android.graphics.Paint r0 = r11.mPaint
            r0.setColor(r4)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L47
        L40:
            android.graphics.Paint r4 = r11.mPaint
            int r0 = r11.mDefaultIndicatorColor
            r4.setColor(r0)
        L47:
            int r0 = r3.getHeight()
            if (r0 <= 0) goto L66
            int r0 = r3.getLeft()
            float r6 = (float) r0
            int r0 = r3.getTop()
            float r7 = (float) r0
            int r0 = r3.getLeft()
            float r8 = (float) r0
            int r0 = r3.getBottom()
            float r9 = (float) r0
            android.graphics.Paint r10 = r11.mPaint
            r5.drawLine(r6, r7, r8, r9, r10)
        L66:
            int r0 = r3.getWidth()
            if (r0 <= 0) goto L18
            int r0 = r3.getLeft()
            float r6 = (float) r0
            int r0 = r3.getTop()
            float r7 = (float) r0
            int r0 = r3.getRight()
            float r8 = (float) r0
            int r0 = r3.getTop()
            float r9 = (float) r0
            android.graphics.Paint r10 = r11.mPaint
            r5.drawLine(r6, r7, r8, r9, r10)
            goto L18
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74293TDt.onDraw(android.graphics.Canvas):void");
    }

    @Override // X.AbstractC019505v
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        super.updatePostLayout(constraintLayout);
        invalidate();
    }

    @Override // X.C74295TDv, X.AbstractC019505v
    public void updatePreDraw(ConstraintLayout container) {
        o.LJIIIZ(container, "container");
        super.updatePreDraw(container);
        this.mContainer = container;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74293TDt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        this.mDefaultIndicatorColor = -65536;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.mDefaultIndicatorColor);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.adm));
        paint.setPathEffect(new DashPathEffect(new float[]{context.getResources().getDimensionPixelSize(R.dimen.adl), context.getResources().getDimensionPixelSize(R.dimen.adk)}, 0.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint = paint;
    }

    public /* synthetic */ C74293TDt(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
