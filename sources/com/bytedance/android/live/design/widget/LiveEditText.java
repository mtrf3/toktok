package com.bytedance.android.live.design.widget;

import X.C2HQ;
import X.C41531k5;
import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class LiveEditText extends C41531k5 {
    public boolean LJLJLJ;
    public C2HQ LJLJLLL;

    public LiveEditText() {
        throw null;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        LLLLZLLIL(i);
    }

    public LiveEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!this.LJLJLJ) {
            this.LJLJLJ = true;
            C2HQ c2hq = new C2HQ(this);
            this.LJLJLLL = c2hq;
            c2hq.LLLLZLLLI(attributeSet, R.attr.are, 0);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, this.LJLJLLL.LLLZ(f));
    }
}
