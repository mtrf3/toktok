package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;

/* renamed from: X.1K1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1K1 extends CardView implements C0RR {
    public C0RP LJLJLJ;
    public int LJLJLLL;

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LJLJLLL++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new C0RP();
        }
        return this.LJLJLJ;
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LJLJLLL;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    public C1K1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
