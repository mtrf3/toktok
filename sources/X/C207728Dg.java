package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8Dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207728Dg extends AbstractC207708De {
    public InterfaceC207738Dh LJLLI;

    public final int getValue() {
        return (int) getRatingValue();
    }

    public final InterfaceC207738Dh getOnValueChangeListener() {
        return this.LJLLI;
    }

    @Override // X.AbstractC207708De
    public final void LIZ(float f) {
        InterfaceC207738Dh interfaceC207738Dh = this.LJLLI;
        if (interfaceC207738Dh != null) {
            interfaceC207738Dh.LIZ(this, (int) f);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        setAlpha(f);
        super.setEnabled(z);
    }

    public final void setOnValueChangeListener(InterfaceC207738Dh interfaceC207738Dh) {
        this.LJLLI = interfaceC207738Dh;
    }

    public final void setValue(int i) {
        setRatingValue(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207728Dg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ke);
        a1.LJFF(context, "context");
        setRatingSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
        setRatingSpacing(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
        setRatingEnableTouch(true);
        setHasOffset(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bt3}, R.attr.ke, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ngInput, defStyleAttr, 0)");
        setValue(obtainStyledAttributes.getInt(0, 0));
        obtainStyledAttributes.recycle();
    }
}
