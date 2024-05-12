package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1KA, reason: invalid class name */
/* loaded from: classes.dex */
public class C1KA extends View implements C0RR {
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

    public C1KA(Context context) {
        super(context);
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    public C1KA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1KA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C1KA(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
