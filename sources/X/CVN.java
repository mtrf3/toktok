package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class CVN extends CVM implements C0RR {
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
        super.callSuperSetLayoutParams(layoutParams);
    }

    @Override // X.CVM
    public final void callSuperSetLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    public CVN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
