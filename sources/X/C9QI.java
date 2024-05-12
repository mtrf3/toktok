package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.9QI, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9QI extends C19K {
    public int LJLJJLL;

    public final int getSelectionMinIndex() {
        return this.LJLJJLL;
    }

    public final void setSelectionMinIndex(int i) {
        this.LJLJJLL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9QI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ku);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        int i3 = this.LJLJJLL;
        if (i <= i3) {
            setSelection(i3);
        }
        super.onSelectionChanged(i, i2);
    }
}
