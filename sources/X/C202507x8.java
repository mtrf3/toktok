package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;

/* renamed from: X.7x8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202507x8 extends C202467x4 {
    public final int LJLLI;

    @Override // X.C77869UhF, X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C202467x4
    public final void LJI(boolean z) {
        super.LJI(z);
        if (!z && getLayoutParams().width != this.LJLLI) {
            getLayoutParams().width = this.LJLLI;
            getLayoutParams().height = this.LJLLI;
            requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202507x8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int LIZIZ;
        a1.LJFF(context, "context");
        if (C208088Eq.LIZIZ()) {
            if (C8D3.LIZIZ()) {
                LIZIZ = C7MY.LIZIZ(30);
            } else {
                LIZIZ = C7MY.LIZIZ(32);
            }
        } else {
            LIZIZ = C7MY.LIZIZ(24);
        }
        this.LJLLI = LIZIZ;
    }
}
