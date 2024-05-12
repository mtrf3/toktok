package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1K9, reason: invalid class name */
/* loaded from: classes.dex */
public class C1K9 extends C011602u implements C0RR {
    public C0RP LLILIL;
    public int LLILL;

    @Override // X.C0RR
    public final void LJJJJIZL() {
        this.LLILL++;
    }

    @Override // X.C0RR
    public C0RP getCacheHelper() {
        if (this.LLILIL == null) {
            this.LLILIL = new C0RP();
        }
        return this.LLILIL;
    }

    @Override // X.C0RR
    public int getCallCount() {
        return this.LLILL;
    }

    @Override // X.C0RR
    public final void LJJIIZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0RQ.LIZ(this, layoutParams);
    }

    public C1K9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1K9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.ax3);
    }
}
