package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AVS extends View {
    public final C72769ShB LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AVS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public static /* synthetic */ void getMaxCount$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }

    public final void LIZ() {
        C72769ShB c72769ShB = this.LJLIL;
        String LJJJLZIJ = C78977Uz7.LJJJLZIJ(getVariant(), getMaxCount(), getCount());
        c72769ShB.getClass();
        o.LJIIIZ(LJJJLZIJ, "<set-?>");
        c72769ShB.LJFF = LJJJLZIJ;
        invalidate();
        requestLayout();
    }

    public int getDotSize() {
        return this.LJLIL.LIZJ;
    }

    public int getCount() {
        return this.LJLJI;
    }

    public int getMaxCount() {
        return this.LJLJJI;
    }

    public int getVariant() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJLIL.draw(canvas);
    }

    public final void setBadgeBackgroundColor(int i) {
        C72769ShB c72769ShB = this.LJLIL;
        c72769ShB.LIZIZ = i;
        c72769ShB.invalidateSelf();
        invalidate();
    }

    public void setCount(int i) {
        this.LJLJI = i;
        LIZ();
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
        LIZ();
    }

    public void setVariant(int i) {
        this.LJLILLLLZI = i;
        LIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LJLIL.LIZ();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.LJLIL.LJ, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LJLIL.LIZLLL, 1073741824));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AVS(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r0 = r8 & 2
            if (r0 == 0) goto L5
            r7 = 0
        L5:
            r0 = r8 & 4
            r3 = 0
            if (r0 == 0) goto L5a
            r1 = 2130968865(0x7f040121, float:1.7546396E38)
        Ld:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r5.<init>(r6, r7, r1)
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x005c: FILL_ARRAY_DATA , data: [2130968964, 2130968965, 2130968966, 2130971839, 2130971840, 2130971841, 2130971845} // fill-array
            android.content.res.TypedArray r4 = r6.obtainStyledAttributes(r7, r0, r1, r3)
            java.lang.String r0 = "this"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r2 = X.O6R.LJJIIZ(r0)
            r1 = -1
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.ShB r0 = X.C78977Uz7.LJJIJ(r4, r3, r1, r0, r2)
            r5.LJLIL = r0
            r0 = 6
            int r0 = r4.getInt(r0, r3)
            r5.setVariant(r0)
            r0 = 3
            int r0 = r4.getInt(r0, r3)
            r5.setCount(r0)
            r0 = 5
            int r0 = r4.getInt(r0, r3)
            r5.setMaxCount(r0)
            r4.recycle()
            r5.LIZ()
            return
        L5a:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVS.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
