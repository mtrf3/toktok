package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.NgW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59988NgW extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public View LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public Animator LJLL;

    public boolean getCanScaleContent() {
        return true;
    }

    public boolean getCanScroll() {
        return false;
    }

    public final View getHeader() {
        return this.LJLJI;
    }

    public final int getHeaderId() {
        return this.LJLIL;
    }

    public final int getScrollOffset() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            android.view.View r6 = r7.LJLJI
            int r0 = r8.getActionMasked()
            r3 = 2
            r2 = 0
            if (r0 == 0) goto L96
            if (r0 == r3) goto L89
        L11:
            r4 = 0
        L12:
            if (r6 == 0) goto Lc5
            int r0 = r8.getActionMasked()
            if (r0 != r3) goto Lc5
            boolean r0 = r7.getCanScroll()
            if (r0 == 0) goto Lc5
            boolean r0 = r7.LJLJLLL
            r3 = 1
            if (r0 != 0) goto L39
            float r1 = r8.getY()
            int r0 = r7.LJLJL
            float r0 = (float) r0
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L39
            r7.LJLJLLL = r3
        L39:
            int r0 = r7.LJLILLLLZI
            int r0 = r0 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            int r0 = r6.getMeasuredHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r5.compareTo(r4)
            if (r0 >= 0) goto L81
            r5 = r4
        L53:
            int r1 = r5.intValue()
            boolean r0 = r7.LJLJLLL
            if (r0 == 0) goto Lc5
            boolean r0 = r7.LJLJLJ
            if (r0 == 0) goto Lad
            int r0 = r7.LJLILLLLZI
            if (r1 != r0) goto L7d
            r7.LJLJLJ = r2
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r8)
            r0.setAction(r2)
            super.dispatchTouchEvent(r0)
            r0.recycle()
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r8)
            super.dispatchTouchEvent(r0)
            r0.recycle()
        L7c:
            return r3
        L7d:
            r7.setScrollOffset(r1)
            goto L7c
        L81:
            int r0 = r5.compareTo(r1)
            if (r0 <= 0) goto L53
            r5 = r1
            goto L53
        L89:
            float r0 = r8.getY()
            int r1 = (int) r0
            int r0 = r7.LJLJJLL
            int r4 = r1 - r0
            r7.LJLJJLL = r1
            goto L12
        L96:
            float r0 = r8.getY()
            int r0 = (int) r0
            r7.LJLJL = r0
            float r0 = r8.getY()
            int r0 = (int) r0
            r7.LJLJJLL = r0
            android.animation.Animator r0 = r7.LJLL
            if (r0 == 0) goto L11
            r0.cancel()
            goto L11
        Lad:
            int r0 = r7.LJLILLLLZI
            if (r1 == r0) goto Lc5
            r7.LJLJLJ = r3
            r7.setScrollOffset(r1)
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r8)
            r0 = 3
            r1.setAction(r0)
            super.dispatchTouchEvent(r1)
            r1.recycle()
            return r3
        Lc5:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r8)
            boolean r0 = super.dispatchTouchEvent(r1)
            r1.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59988NgW.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View child) {
        o.LJIIIZ(child, "child");
        super.onViewAdded(child);
        if (this.LJLIL != -1 && child.getId() == this.LJLIL) {
            if (this.LJLJI == null) {
                this.LJLJI = child;
                return;
            }
            throw new RuntimeException("dup header");
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View child) {
        o.LJIIIZ(child, "child");
        super.onViewRemoved(child);
        if (o.LJ(this.LJLJI, child)) {
            this.LJLJI = null;
        }
    }

    public final void setHeaderId(int i) {
        if (this.LJLIL != i) {
            View findViewById = findViewById(i);
            if (!o.LJ(this.LJLJI, findViewById)) {
                this.LJLJI = findViewById;
                requestLayout();
            }
            this.LJLIL = i;
        }
    }

    public final void setScrollOffset(int i) {
        if (this.LJLILLLLZI != i) {
            this.LJLILLLLZI = i;
            requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59988NgW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LJLJJI = i;
        this.LJLJJL = i2;
        super.onMeasure(i, i2);
    }

    public static final /* synthetic */ void LIZ(C59988NgW c59988NgW, View view, int i, int i2) {
        c59988NgW.measureChild(view, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r9 = r10.getPaddingLeft()
            int r9 = r9 + r12
            int r8 = r10.getPaddingTop()
            int r8 = r8 + r13
            int r0 = r10.getPaddingRight()
            int r14 = r14 - r0
            int r0 = r10.getPaddingBottom()
            int r15 = r15 - r0
            r1 = 0
            int r0 = r10.getChildCount()
            X.FvF r0 = X.C78842Uww.LJJ(r1, r0)
            java.util.Iterator r7 = r0.iterator()
        L21:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lbe
            r0 = r7
            X.4kU r0 = (X.AbstractC118224kU) r0
            int r0 = r0.nextInt()
            android.view.View r5 = r10.getChildAt(r0)
            int r1 = r5.getVisibility()
            r0 = 8
            if (r1 == r0) goto L21
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            kotlin.jvm.internal.o.LJII(r6, r0)
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r4 = r5.getMeasuredWidth()
            int r3 = r5.getMeasuredHeight()
            int r1 = r6.gravity
            r0 = -1
            if (r1 != r0) goto L55
            r1 = 8388659(0x800033, float:1.1755015E-38)
        L55:
            int r0 = r10.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = r0 & 7
            r2 = r0 & 112(0x70, float:1.57E-43)
            r0 = 1
            if (r1 == r0) goto Lac
            r0 = 5
            if (r1 == r0) goto Lb8
            r1 = r9
        L68:
            r0 = 16
            if (r2 == r0) goto L9a
            r0 = 80
            if (r2 == r0) goto La6
            int r2 = r6.topMargin
            int r2 = r2 + r8
        L73:
            int r4 = r4 + r1
            int r3 = r3 + r2
            android.view.View r0 = r10.LJLJI
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 == 0) goto L8a
            int r6 = r10.LJLILLLLZI
            int r0 = r5.getMeasuredHeight()
            int r6 = r6 - r0
            int r2 = r2 + r6
        L85:
            int r3 = r3 + r6
        L86:
            r5.layout(r1, r2, r4, r3)
            goto L21
        L8a:
            android.view.View r0 = r10.LJLJI
            if (r0 == 0) goto L86
            int r0 = r10.LJLILLLLZI
            int r2 = r2 + r0
            boolean r0 = r10.getCanScaleContent()
            if (r0 != 0) goto L86
            int r6 = r10.LJLILLLLZI
            goto L85
        L9a:
            int r0 = r15 - r8
            int r0 = r0 - r3
            int r2 = r0 / 2
            int r2 = r2 + r8
            int r0 = r6.topMargin
            int r2 = r2 + r0
            int r0 = r6.bottomMargin
            goto Laa
        La6:
            int r2 = r15 - r3
            int r0 = r6.bottomMargin
        Laa:
            int r2 = r2 - r0
            goto L73
        Lac:
            int r0 = r14 - r9
            int r0 = r0 - r4
            int r1 = r0 / 2
            int r1 = r1 + r9
            int r0 = r6.leftMargin
            int r1 = r1 + r0
            int r0 = r6.rightMargin
            goto Lbc
        Lb8:
            int r1 = r14 - r4
            int r0 = r6.rightMargin
        Lbc:
            int r1 = r1 - r0
            goto L68
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59988NgW.onLayout(boolean, int, int, int, int):void");
    }
}
