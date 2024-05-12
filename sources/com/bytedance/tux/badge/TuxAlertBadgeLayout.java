package com.bytedance.tux.badge;

import X.C26338AVi;
import X.C32151Nz;
import X.C72769ShB;
import X.C78977Uz7;
import X.O6R;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TuxAlertBadgeLayout extends FrameLayout {
    public static final int LJLLJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
    public final C72769ShB LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public View LJLL;
    public int LJLLI;
    public int LJLLILLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TuxAlertBadgeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public static /* synthetic */ void getMaxCount$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }

    public final void LIZIZ() {
        this.LJLJL = false;
        invalidate();
    }

    public final void LIZJ() {
        this.LJLJL = true;
        invalidate();
    }

    public final void LIZLLL() {
        C72769ShB c72769ShB = this.LJLIL;
        String LJJJLZIJ = C78977Uz7.LJJJLZIJ(getVariant(), getMaxCount(), getCount());
        c72769ShB.getClass();
        o.LJIIIZ(LJJJLZIJ, "<set-?>");
        c72769ShB.LJFF = LJJJLZIJ;
        this.LJLIL.LIZ();
        requestLayout();
    }

    public int getDotSize() {
        return this.LJLIL.LIZJ;
    }

    public final int getAttachTo() {
        return this.LJLJJL;
    }

    public int getCount() {
        return this.LJLJI;
    }

    public int getMaxCount() {
        return this.LJLJJI;
    }

    public final int getOffsetX() {
        return this.LJLJLJ;
    }

    public final int getOffsetY() {
        return this.LJLJLLL;
    }

    public int getVariant() {
        return this.LJLILLLLZI;
    }

    public final void LIZ(View view) {
        if (view.getVisibility() == 8) {
            this.LJLLI = LiveLayoutPreloadThreadPriority.DEFAULT;
            this.LJLLILLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
            return;
        }
        this.LJLLI = view.getLeft() + this.LJLLI;
        this.LJLLILLLL = view.getTop() + this.LJLLILLLL;
        Object parent = view.getParent();
        if (!o.LJ(parent, this)) {
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            LIZ((View) parent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (!this.LJLJJLL || !this.LJLJL) {
            return;
        }
        canvas.save();
        canvas.translate(this.LJLLI, this.LJLLILLLL);
        this.LJLIL.draw(canvas);
        canvas.restore();
    }

    public final void setAttachTo(int i) {
        View findViewById;
        this.LJLJJL = i;
        if (i == -1) {
            findViewById = null;
        } else {
            findViewById = findViewById(i);
        }
        this.LJLL = findViewById;
        requestLayout();
    }

    public void setCount(int i) {
        this.LJLJI = i;
        LIZLLL();
    }

    public void setDotSize(int i) {
        C72769ShB c72769ShB = this.LJLIL;
        c72769ShB.LIZJ = i;
        if (c72769ShB.LJFF.length() == 0) {
            requestLayout();
        }
    }

    public void setMaxCount(int i) {
        this.LJLJJI = i;
        LIZLLL();
    }

    public final void setOffsetX(int i) {
        this.LJLJLJ = i;
        requestLayout();
    }

    public final void setOffsetY(int i) {
        this.LJLJLLL = i;
        requestLayout();
    }

    public final void setTopmost(boolean z) {
        this.LJLJJLL = z;
        invalidate();
    }

    public void setVariant(int i) {
        this.LJLILLLLZI = i;
        LIZLLL();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LJLIL.LIZ();
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TuxAlertBadgeLayout(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r0 = r8 & 2
            if (r0 == 0) goto L5
            r7 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r2 = 0
            r5.<init>(r6, r7, r2)
            r4 = -1
            r5.LJLJJL = r4
            r3 = 1
            r5.LJLJL = r3
            r0 = 60
            X.ShB r0 = X.C78977Uz7.LJJIJIIJI(r6, r7, r0)
            r5.LJLIL = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x0062: FILL_ARRAY_DATA , data: [2130971838, 2130971839, 2130971840, 2130971841, 2130971842, 2130971843, 2130971844, 2130971845} // fill-array
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r0, r2, r2)
            r0 = 7
            int r0 = r1.getInt(r0, r2)
            r5.setVariant(r0)
            int r0 = r1.getInt(r3, r2)
            r5.setCount(r0)
            r0 = 3
            int r0 = r1.getInt(r0, r2)
            r5.setMaxCount(r0)
            int r0 = r1.getResourceId(r2, r4)
            r5.setAttachTo(r0)
            r0 = 6
            boolean r0 = r1.getBoolean(r0, r2)
            r5.setTopmost(r0)
            r0 = 4
            int r0 = r1.getDimensionPixelOffset(r0, r2)
            r5.setOffsetX(r0)
            r0 = 5
            int r0 = r1.getDimensionPixelOffset(r0, r2)
            r5.setOffsetY(r0)
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.badge.TuxAlertBadgeLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        o.LJIIIZ(canvas, "canvas");
        boolean drawChild = super.drawChild(canvas, view, j);
        if (!this.LJLJJLL && o.LJ(view, this.LJLL) && this.LJLJL) {
            canvas.save();
            canvas.translate(this.LJLLI, this.LJLLILLLL);
            this.LJLIL.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        View attachView = this.LJLL;
        if (attachView == null) {
            if (getChildCount() == 0) {
                return;
            }
            attachView = getChildAt(0);
            this.LJLL = attachView;
        }
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        o.LJIIIIZZ(attachView, "attachView");
        LIZ(attachView);
        C72769ShB c72769ShB = this.LJLIL;
        int i10 = c72769ShB.LJ;
        int i11 = c72769ShB.LIZLLL;
        if (getVariant() == 0) {
            if (C26338AVi.LIZLLL(this)) {
                i6 = this.LJLLI - (i10 / 2);
                i7 = this.LJLJLJ;
                i8 = i6 - i7;
            } else {
                width = attachView.getWidth() + (this.LJLLI - (i10 / 2));
                i5 = this.LJLJLJ;
                i8 = width + i5;
            }
        } else if (C26338AVi.LIZLLL(this)) {
            i6 = this.LJLLI - LJLLJ;
            i7 = this.LJLJLJ;
            i8 = i6 - i7;
        } else {
            width = ((attachView.getWidth() + this.LJLLI) - i10) + LJLLJ;
            i5 = this.LJLJLJ;
            i8 = width + i5;
        }
        if (getVariant() == 0) {
            i9 = this.LJLLILLLL - (i11 / 2);
        } else {
            i9 = this.LJLLILLLL - LJLLJ;
        }
        int i12 = i9 + this.LJLJLLL;
        this.LJLLI = i8;
        this.LJLLILLLL = i12;
    }
}
