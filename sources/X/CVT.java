package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public class CVT extends C8ID implements C0RR {
    public int LJLJI;
    public C0RP LJLJJI;
    public int LJLJJL;

    public CVT() {
        throw null;
    }

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LJLJJL++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        if (this.LJLJJI == null) {
            this.LJLJJI = new C0RP();
        }
        return this.LJLJJI;
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LJLJJL;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    @Override // X.C8ID, android.view.View
    public void setVisibility(int i) {
        if (getContext() != null) {
            super.setVisibility(i);
            this.LJLJI = i;
        }
    }

    public CVT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setVisibility(getVisibility());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view != this) {
            if (i != 0) {
                super.setVisibility(8);
            } else {
                super.setVisibility(this.LJLJI);
            }
        }
    }
}
