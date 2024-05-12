package X;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8H7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8H7 extends C03I {
    public final void LIZ(Drawable[] drawableArr) {
        Drawable drawable;
        if (drawableArr != null && (drawable = drawableArr[0]) != null) {
            Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
            Rect rect = new Rect();
            getPaint().getTextBounds(getText().toString(), 0, length(), rect);
            int height = (((getHeight() - drawable.getIntrinsicHeight()) / 2) - (rect.top - fontMetricsInt.top)) - (getPaddingTop() / 2);
            drawable.setBounds(0, -height, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() - height);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (!TextUtils.isEmpty(getText())) {
            LIZ(getCompoundDrawables());
            LIZ(getCompoundDrawablesRelative());
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8H7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        a1.LJFF(context, "context");
        C8HI.LIZJ().LIZ(this, attributeSet);
    }
}
