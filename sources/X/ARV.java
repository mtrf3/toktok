package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes5.dex */
public final class ARV extends C011602u implements AEZ {
    public int LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public int LLILLJJLI;
    public CharSequence LLILLL;
    public boolean LLILZ;
    public final boolean LLILZIL;
    public InterfaceC65784Pro<Boolean> LLILZLL;
    public InterfaceC65784Pro<C76800UCe> LLIZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ARV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C011602u, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LLILZLL;
        if (interfaceC65784Pro == null || !interfaceC65784Pro.invoke().booleanValue()) {
            super.toggle();
        }
    }

    public final CharSequence getAccessibilityLabel() {
        return this.LLILLL;
    }

    public final boolean getEnableTouch$tux_theme_release() {
        return this.LLILZ;
    }

    private final void setCheckedThumbColor(int i) {
        this.LLILIL = i;
        C07820Sk.LJII(getThumbDrawable(), LJFF(i, this.LLILL));
    }

    private final void setCheckedTrackColor(int i) {
        this.LLILLIZIL = i;
        C07820Sk.LJII(getTrackDrawable(), LJFF(i, this.LLILLJJLI));
    }

    private final void setUncheckedThumbColor(int i) {
        this.LLILL = i;
        C07820Sk.LJII(getThumbDrawable(), LJFF(this.LLILIL, i));
    }

    private final void setUncheckedTrackColor(int i) {
        this.LLILLJJLI = i;
        C07820Sk.LJII(getTrackDrawable(), LJFF(this.LLILLIZIL, i));
    }

    @Override // X.C011602u, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (!this.LLILZ) {
            if (this.LLIZ != null && !isEnabled()) {
                if (motionEvent != null && motionEvent.getAction() == 1 && (interfaceC65784Pro = this.LLIZ) != null) {
                    interfaceC65784Pro.invoke();
                }
                return true;
            }
            if (isEnabled() && motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (valueOf.intValue() == 0) {
                    setPressed(true);
                } else if (valueOf.intValue() == 1) {
                    setPressed(false);
                }
            }
            return !isEnabled();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAccessibilityLabel(CharSequence charSequence) {
        this.LLILLL = charSequence;
        setContentDescription(charSequence);
    }

    @Override // X.C011602u, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CharSequence textOff;
        super.setChecked(z);
        if (isChecked()) {
            textOff = getTextOn();
        } else {
            textOff = getTextOff();
        }
        h0.LJJII(this, textOff);
    }

    public final void setDisableListener$tux_theme_release(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LLIZ = interfaceC65784Pro;
    }

    public final void setEnableTouch$tux_theme_release(boolean z) {
        this.LLILZ = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (this.LLILZIL) {
            if (isEnabled()) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            setAlpha(f);
        }
    }

    @Override // X.AEZ
    public void setInterceptToggleListener(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LLILZLL = interfaceC65784Pro;
    }

    public final ColorStateList LJFF(int i, int i2) {
        int i3;
        int i4;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.e_, context);
        if (LJI != null) {
            i3 = C07290Qj.LJIIIZ(LJI.intValue(), i);
        } else {
            i3 = i;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI2 = C79045V0n.LJI(R.attr.e_, context2);
        if (LJI2 != null) {
            i4 = C07290Qj.LJIIIZ(LJI2.intValue(), i2);
        } else {
            i4 = i2;
        }
        return new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed, android.R.attr.state_checked}, new int[]{android.R.attr.state_pressed, -16842912}, new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{i3, i4, i, i2});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ARV(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r0 = r8 & 2
            if (r0 == 0) goto L5
            r7 = 0
        L5:
            r4 = 4
            r0 = r8 & 4
            r3 = 0
            if (r0 == 0) goto L7b
            r1 = 2130968903(0x7f040147, float:1.7546473E38)
        Le:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r5.<init>(r6, r7, r1)
            r2 = 1
            r5.LLILZ = r2
            int[] r0 = new int[r4]
            r0 = {x007e: FILL_ARRAY_DATA , data: [2130971858, 2130971859, 2130972009, 2130972010} // fill-array
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r0, r1, r3)
            java.lang.String r0 = "context.obtainStyledAttr…xSwitch, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.getColor(r3, r3)
            r5.setCheckedThumbColor(r0)
            r0 = 2
            int r0 = r1.getColor(r0, r3)
            r5.setUncheckedThumbColor(r0)
            int r0 = r1.getColor(r2, r3)
            r5.setCheckedTrackColor(r0)
            r0 = 3
            int r0 = r1.getColor(r0, r3)
            r5.setUncheckedTrackColor(r0)
            r1.recycle()
            r5.LLILZIL = r2
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L77
            r0 = 1065353216(0x3f800000, float:1.0)
        L52:
            r5.setAlpha(r0)
            int r2 = r5.LLILIL
            int r0 = r5.LLILL
            android.graphics.drawable.Drawable r1 = r5.getThumbDrawable()
            android.content.res.ColorStateList r0 = r5.LJFF(r2, r0)
            X.C07820Sk.LJII(r1, r0)
            int r2 = r5.LLILLIZIL
            int r0 = r5.LLILLJJLI
            android.graphics.drawable.Drawable r1 = r5.getTrackDrawable()
            android.content.res.ColorStateList r0 = r5.LJFF(r2, r0)
            X.C07820Sk.LJII(r1, r0)
            r5.setBackgroundColor(r3)
            return
        L77:
            r0 = 1051595899(0x3eae147b, float:0.34)
            goto L52
        L7b:
            r1 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARV.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
