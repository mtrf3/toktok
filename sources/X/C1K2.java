package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1K2, reason: invalid class name */
/* loaded from: classes.dex */
public class C1K2 extends C02Y implements C0RR {
    public C0RP LJLJJL;
    public int LJLJJLL;

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LJLJJLL++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        if (this.LJLJJL == null) {
            this.LJLJJL = new C0RP();
        }
        return this.LJLJJL;
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LJLJJLL;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    public C1K2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1K2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.aqk);
    }
}
