package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Vu7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81215Vu7 extends View {
    public final List<String> LJLIL;
    public Paint LJLILLLLZI;
    public final Rect LJLJI;
    public InterfaceC54639LcR LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLILLLLZI == null) {
            Paint paint = new Paint();
            Context context = getContext();
            o.LJIIIIZZ(context, "this@QuickIndexBar.context");
            Integer LJI = C79045V0n.LJI(R.attr.gx, context);
            if (LJI != null) {
                paint.setColor(LJI.intValue());
            }
            paint.setTextSize(O6R.LJJIIZ(C32151Nz.LJJIII(11)));
            this.LJLILLLLZI = paint;
        }
        Paint paint2 = this.LJLILLLLZI;
        if (paint2 == null) {
            return;
        }
        int i = 0;
        for (String str : this.LJLIL) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = str;
                float measureText = (this.LJLJJLL / 2.0f) - (paint2.measureText(str2) / 2.0f);
                paint2.getTextBounds(str2, 0, str2.length(), this.LJLJI);
                int height = this.LJLJI.height();
                float f = this.LJLJJL;
                float f2 = (i * f) + (height / 2.0f) + (f / 2.0f) + this.LJLJLLL;
                if (canvas != null) {
                    canvas.drawText(str2, measureText, f2, paint2);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r1 != 2) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r1 = r5.getAction()
            r3 = 1
            if (r1 == 0) goto L15
            if (r1 == r3) goto L11
            r0 = 2
            if (r1 == r0) goto L15
        L10:
            return r3
        L11:
            r0 = -1
            r4.LJLJLJ = r0
            goto L10
        L15:
            float r1 = r5.getY()
            int r0 = r4.LJLJLLL
            float r0 = (float) r0
            float r1 = r1 - r0
            float r0 = r4.LJLJJL
            float r1 = r1 / r0
            int r2 = (int) r1
            if (r2 < 0) goto L10
            java.util.List<java.lang.String> r0 = r4.LJLIL
            int r0 = r0.size()
            if (r2 >= r0) goto L10
            int r0 = r4.LJLJLJ
            if (r2 == r0) goto L10
            X.LcR r1 = r4.LJLJJI
            if (r1 == 0) goto L3e
            java.util.List<java.lang.String> r0 = r4.LJLIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.w(r0)
        L3e:
            r4.LJLJLJ = r2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81215Vu7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLetterUpdateListener$nearby_release(InterfaceC54639LcR listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81215Vu7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C47261Igj.LJJIJIL("▲", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#");
        this.LJLJI = new Rect();
        this.LJLJL = C7MY.LIZIZ(14);
        this.LJLJLJ = 5;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJJLL = getMeasuredWidth();
        float measuredHeight = (getMeasuredHeight() * 1.0f) / this.LJLIL.size();
        this.LJLJJL = measuredHeight;
        int i5 = this.LJLJL;
        if (measuredHeight > i5) {
            this.LJLJJL = i5;
            this.LJLJLLL = (int) (((getMeasuredHeight() * 1.0f) - (this.LJLJJL * this.LJLIL.size())) / 2);
        }
    }
}
