package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.i0;

/* renamed from: X.1K3, reason: invalid class name */
/* loaded from: classes.dex */
public class C1K3 extends ConstraintLayout implements C0RR {
    public C0RP LJLIL;
    public int LJLILLLLZI;

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LJLILLLLZI++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        if (this.LJLIL == null) {
            this.LJLIL = new C0RP();
        }
        return this.LJLIL;
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LJLILLLLZI;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            return super.dispatchApplyWindowInsets(windowInsets);
        } catch (NullPointerException e) {
            e.addSuppressed(new Exception(i0.LJFF("current view ids: ", C0YI.LIZIZ(this))));
            throw e;
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    public C1K3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1K3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
