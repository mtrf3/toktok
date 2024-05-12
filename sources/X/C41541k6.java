package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.1k6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41541k6 extends AppCompatTextView implements C0RR {
    public C0RP LJLJL;
    public int LJLJLJ;

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LJLJLJ++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        if (this.LJLJL == null) {
            this.LJLJL = new C0RP();
        }
        return this.LJLJL;
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LJLJLJ;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    public C41541k6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C41541k6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
