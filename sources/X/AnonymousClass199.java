package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.199, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass199 extends C009401y {
    public int LIZIZ;

    public AnonymousClass199() {
        this.LIZ = 8388627;
    }

    public AnonymousClass199(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
    }

    public AnonymousClass199(AnonymousClass199 anonymousClass199) {
        super((C009401y) anonymousClass199);
        this.LIZIZ = anonymousClass199.LIZIZ;
    }

    public AnonymousClass199(C009401y c009401y) {
        super(c009401y);
    }

    public AnonymousClass199(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AnonymousClass199(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
