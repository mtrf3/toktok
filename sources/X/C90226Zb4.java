package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Zb4, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90226Zb4 extends View {
    public static final /* synthetic */ int LJLLI = 0;
    public final C90462Zes LJLIL;
    public final List<C90461Zer> LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public final Paint LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;

    public int getMaxProgress() {
        return this.LJLIL.LIZ;
    }

    public int getProgress() {
        this.LJLIL.getClass();
        return 0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int progress = getProgress();
        int save2 = canvas.save();
        canvas.translate(0.0f, ((measuredHeight - paddingTop) - paddingBottom) / 2);
        this.LJLIL.getClass();
        int max = Math.max(0, 0);
        if (max > 0) {
            LIZ(canvas, 0, max, this.LJLIL.LIZ, measuredWidth, this.LJLJLLL);
        }
        if (progress > max) {
            LIZ(canvas, max, progress, this.LJLIL.LIZ, measuredWidth, this.LJLJLJ);
        }
        int i = this.LJLIL.LIZ;
        if (i > progress) {
            LIZ(canvas, progress, i, i, measuredWidth, this.LJLJLLL);
        }
        canvas.restoreToCount(save2);
        List<C90461Zer> list = this.LJLILLLLZI;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                this.LJLJL.setColor(this.LJLL);
                int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight2 = getMeasuredHeight();
                int paddingTop2 = getPaddingTop();
                int paddingBottom2 = getPaddingBottom();
                int save3 = canvas.save();
                canvas.translate(0.0f, ((measuredHeight2 - paddingTop2) - paddingBottom2) / 2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        int min = Math.min(0, this.LJLIL.LIZ);
                        float f = measuredWidth2;
                        float f2 = this.LJLIL.LIZ;
                        float f3 = (min * f) / f2;
                        float f4 = ((min + 1) * f) / f2;
                        float f5 = this.LJLJJLL;
                        if (f4 - f3 < f5) {
                            f4 = f3 + f5;
                        }
                        if (f4 <= f) {
                            f = f4;
                        }
                        if (f - f3 < f5) {
                            f3 = f - f5;
                        }
                        float f6 = this.LJLJJL;
                        canvas.drawRect(f3, -f6, f, f6, this.LJLJL);
                    }
                }
                canvas.restoreToCount(save3);
            }
        }
        if (isEnabled()) {
            this.LJLIL.getClass();
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            this.LJLIL.getClass();
            return false;
        }
        return false;
    }

    public C90226Zb4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = new ArrayList();
        setAccessibilityDelegate(new C90463Zet(this));
        Paint paint = new Paint(1);
        this.LJLJL = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LJLJI = context.getResources().getDimension(R.dimen.a5);
        this.LJLJJI = context.getResources().getDimension(R.dimen.a4);
        this.LJLJJL = context.getResources().getDimension(R.dimen.a6) / 2.0f;
        context.getResources().getDimension(R.dimen.a7);
        this.LJLJJLL = context.getResources().getDimension(R.dimen.a3);
        C90462Zes c90462Zes = new C90462Zes();
        this.LJLIL = c90462Zes;
        c90462Zes.LIZ = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.a, R.attr.b, R.attr.c, R.attr.d, R.attr.e, R.attr.f, R.attr.g, R.attr.k, R.attr.n, R.attr.o, R.attr.p, R.attr.q, R.attr.u, R.attr.z, R.attr.a2, R.attr.a3, R.attr.a4, R.attr.a6, R.attr.a7, R.attr.a8, R.attr.a9, R.attr.a_, R.attr.aa, R.attr.ab, R.attr.ad, R.attr.ae, R.attr.af}, R.attr.r, R.style.a);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.LJLJLJ = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.LJLJLLL = context.getResources().getColor(resourceId3);
        this.LJLL = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.LJLJI + getPaddingLeft() + getPaddingRight()), i, 0), View.resolveSizeAndState((int) (this.LJLJJI + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    public final void LIZ(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        this.LJLJL.setColor(i5);
        float f = i3;
        float f2 = i4;
        float f3 = this.LJLJJL;
        canvas.drawRect((i / f) * f2, -f3, (i2 / f) * f2, f3, this.LJLJL);
    }
}
