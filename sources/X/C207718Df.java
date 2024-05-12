package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8Df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207718Df extends AbstractC207708De {
    public final float getValue() {
        return getRatingValue();
    }

    public final void setValue(float f) {
        setRatingValue(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207718Df(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.kd);
        a1.LJFF(context, "context");
        setRatingSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
        setRatingSpacing(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
        setRatingEnableTouch(false);
        setHasOffset(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bt1}, R.attr.kd, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tingBar, defStyleAttr, 0)");
        setValue(obtainStyledAttributes.getFloat(0, 0.0f));
        obtainStyledAttributes.recycle();
    }
}
