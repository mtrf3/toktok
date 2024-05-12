package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.a1;

/* renamed from: X.5SW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SW extends RelativeLayout {
    public TextView LJLIL;
    public TextView LJLILLLLZI;

    public static Float LIZ(TextView textView) {
        TextPaint paint;
        if (textView != null && (paint = textView.getPaint()) != null) {
            return Float.valueOf(paint.measureText(textView.getText().toString()) + textView.getPaddingLeft() + textView.getPaddingRight());
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5SW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
