package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class T5T extends C19K {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public T5T(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    private final void setTuxFont$___ob_twin___(int i) {
    }

    @Override // android.view.View
    public final void dispatchWindowFocusChanged(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.dispatchWindowFocusChanged(z);
                return;
            } catch (SecurityException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        super.dispatchWindowFocusChanged(z);
    }

    public final void setTuxFont(int i) {
        T5V LIZIZ = UYR.LIZIZ(i, true);
        setTextSize(1, LIZIZ.LJLIL);
        Typeface LIZIZ2 = C61589OFd.LIZIZ(LIZIZ.LJLJI);
        if (LIZIZ2 != null) {
            setTypeface(LIZIZ2);
        }
        setLetterSpacing(LIZIZ.LJLJJI);
        setTuxFont$___ob_twin___(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T5T(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bqy}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ditText, defStyleAttr, 0)");
        int i2 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        setTuxFont(i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.onFocusChanged(z, i, rect);
                return;
            } catch (SecurityException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        super.onFocusChanged(z, i, rect);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ T5T(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r0 = r4 & 4
            if (r0 == 0) goto L10
            r0 = 2130968878(0x7f04012e, float:1.7546422E38)
        Lc:
            r1.<init>(r2, r3, r0)
            return
        L10:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5T.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
