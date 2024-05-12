package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.SJp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71897SJp extends C02Y implements AEZ {
    public final boolean LJLJJL;
    public InterfaceC65784Pro<Boolean> LJLJJLL;
    public final DI0 LJLJL;
    public final DI4 LJLJLJ;
    public final Drawable LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public final int LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C71897SJp(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C71897SJp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final void setShape$___ob_twin___(int i) {
    }

    private final Paint getMaskPaint() {
        return (Paint) this.LJLLJ.getValue();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJJLL;
        if (interfaceC65784Pro == null || !interfaceC65784Pro.invoke().booleanValue()) {
            super.toggle();
        }
    }

    private final void setSize$___ob_twin___(int i) {
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (canvas == null || (drawable = this.LJLJLLL) == null) {
            return;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float f = intrinsicHeight;
        float height = getHeight() / f;
        canvas.save();
        canvas.scale(height, height);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        if (this.LJLLI) {
            getMaskPaint().setColor(this.LJLLILLLL);
            float f2 = intrinsicWidth / 2.0f;
            canvas.drawCircle(f2, f / 2.0f, 0.875f * f2, getMaskPaint());
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void setCheckBoxCheckedColor(int i) {
        this.LJLJL.LIZIZ.setColor(i);
        invalidate();
    }

    public final void setCheckBoxUncheckedColor(int i) {
        this.LJLJLJ.LIZIZ.setColor(i);
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (this.LJLJJL) {
            if (isEnabled()) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            setAlpha(f);
        }
    }

    public final void setInnerMaskVisibility(boolean z) {
        this.LJLLI = z;
        invalidate();
    }

    @Override // X.AEZ
    public void setInterceptToggleListener(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLJJLL = interfaceC65784Pro;
    }

    public final void setShape(int i) {
        float f = Float.MAX_VALUE;
        boolean z = true;
        if (i != 0 && i == 1) {
            f = C32151Nz.LJIIZILJ(4);
            z = false;
        }
        C35580Dxo c35580Dxo = new C35580Dxo(z, f);
        boolean z2 = c35580Dxo.LJLIL;
        float f2 = c35580Dxo.LJLILLLLZI;
        DI0 di0 = this.LJLJL;
        di0.LIZJ.LIZ.reset();
        float f3 = 12.0f;
        if (z2) {
            di0.LIZJ.LJIIIIZZ(12.0f, 24.0f);
            di0.LIZJ.LJIIIZ(12.0f, 12.0f, true, false, 0.0f, -24.0f);
            f3 = 12.0f;
            di0.LIZJ.LJIIIZ(12.0f, 12.0f, false, false, 0.0f, 24.0f);
            di0.LIZJ.LIZLLL();
        } else {
            di0.LIZJ.LIZIZ(new RectF(1.0f, 1.0f, 23.0f, 23.0f), 4.0f, 4.0f, Path.Direction.CW);
        }
        DI4 di4 = this.LJLJLJ;
        di4.LIZJ.LIZ.reset();
        if (z2) {
            di4.LIZJ.LJIIIIZZ(23.25f, f3);
            di4.LIZJ.LJIIIZ(11.25f, 11.25f, true, true, -22.5f, 0.0f);
            di4.LIZJ.LJIIIZ(11.25f, 11.25f, false, true, 22.5f, 0.0f);
            di4.LIZJ.LIZLLL();
        } else {
            di4.LIZJ.LIZIZ(new RectF(1.75f, 1.75f, 22.25f, 22.25f), 3.25f, 3.25f, Path.Direction.CW);
        }
        C78897Uxp.LJJJJJL(this, f2);
        invalidate();
        setShape$___ob_twin___(i);
    }

    public final void setSize(int i) {
        int i2 = 16;
        if (i != 0 && i == 1) {
            i2 = 24;
        }
        this.LJLL = C7MY.LIZIZ(i2);
        setSize$___ob_twin___(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LJLL;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        int i4 = this.LJLL;
        if (i4 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71897SJp(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r0 = r14 & 2
            r3 = 0
            if (r0 == 0) goto L6
            r13 = r3
        L6:
            r1 = 4
            r0 = r14 & 4
            r10 = 0
            if (r0 == 0) goto L9b
            r2 = 2130968872(0x7f040128, float:1.754641E38)
        Lf:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r12, r0)
            r11.<init>(r12, r13, r2)
            X.DI0 r9 = new X.DI0
            r9.<init>()
            r11.LJLJL = r9
            X.DI4 r8 = new X.DI4
            r8.<init>()
            r11.LJLJLJ = r8
            X.DJr r0 = X.C33679DJr.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r11.LJLLJ = r0
            r0 = 5
            int[] r0 = new int[r0]
            r0 = {x009e: FILL_ARRAY_DATA , data: [2130971853, 2130971854, 2130971855, 2130971856, 2130971857} // fill-array
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r13, r0, r2, r10)
            java.lang.String r0 = "context.obtainStyledAttr…heckBox, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r0 = 2
            int r7 = r2.getInt(r0, r10)
            r0 = 3
            int r6 = r2.getInt(r0, r10)
            int r5 = r2.getColor(r10, r10)
            int r4 = r2.getColor(r1, r10)
            r1 = 1
            int r0 = r2.getColor(r1, r10)
            r11.LJLLILLLL = r0
            r2.recycle()
            r11.LJLJJL = r1
            android.graphics.drawable.StateListDrawable r2 = new android.graphics.drawable.StateListDrawable
            r2.<init>()
            int[] r1 = new int[r1]
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r10] = r0
            r2.addState(r1, r9)
            int[] r0 = new int[r10]
            r2.addState(r0, r8)
            r11.LJLJLLL = r2
            android.graphics.Paint r0 = r9.LIZIZ
            r0.setColor(r5)
            android.graphics.Paint r0 = r8.LIZIZ
            r0.setColor(r4)
            r11.setButtonDrawable(r2)
            r11.setShape(r7)
            r11.setSize(r6)
            boolean r0 = r11.isEnabled()
            if (r0 == 0) goto L97
            r0 = 1065353216(0x3f800000, float:1.0)
        L8b:
            r11.setAlpha(r0)
            r0 = 51
            r11.setGravity(r0)
            r11.setBackground(r3)
            return
        L97:
            r0 = 1051595899(0x3eae147b, float:0.34)
            goto L8b
        L9b:
            r2 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71897SJp.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
