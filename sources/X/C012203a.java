package X;

import android.R;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: X.03a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C012203a {
    public final TextView LIZ;
    public final C0FD LIZIZ;

    public C012203a(TextView textView) {
        this.LIZ = textView;
        this.LIZIZ = new C0FD(textView);
    }

    public final InputFilter[] LIZ(InputFilter[] inputFilterArr) {
        return this.LIZIZ.LIZ.LIZ(inputFilterArr);
    }

    public final void LIZJ(boolean z) {
        this.LIZIZ.LIZ.LIZJ(z);
    }

    public final void LIZLLL(boolean z) {
        this.LIZIZ.LIZ.LIZLLL(z);
    }

    public final void LIZIZ(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.LIZ.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance, com.zhiliaoapp.musically.R.attr.wg, com.zhiliaoapp.musically.R.attr.wh, com.zhiliaoapp.musically.R.attr.wi, com.zhiliaoapp.musically.R.attr.wj, com.zhiliaoapp.musically.R.attr.wk, com.zhiliaoapp.musically.R.attr.aa4, com.zhiliaoapp.musically.R.attr.aa5, com.zhiliaoapp.musically.R.attr.aa6, com.zhiliaoapp.musically.R.attr.aa7, com.zhiliaoapp.musically.R.attr.aa9, com.zhiliaoapp.musically.R.attr.aa_, com.zhiliaoapp.musically.R.attr.aaa, com.zhiliaoapp.musically.R.attr.aab, com.zhiliaoapp.musically.R.attr.ab9, com.zhiliaoapp.musically.R.attr.ad7, com.zhiliaoapp.musically.R.attr.ae9, com.zhiliaoapp.musically.R.attr.aei, com.zhiliaoapp.musically.R.attr.akp, com.zhiliaoapp.musically.R.attr.aog, com.zhiliaoapp.musically.R.attr.bhl, com.zhiliaoapp.musically.R.attr.bih}, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            LIZLLL(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
