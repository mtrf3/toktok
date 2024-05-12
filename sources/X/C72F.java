package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

/* renamed from: X.72F, reason: invalid class name */
/* loaded from: classes4.dex */
public class C72F extends C224738rt {
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public C72E LJLZ;

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        C72E c72e;
        super.onWindowFocusChanged(z);
        this.LJLLLL = z;
        if (z && this.LJLLLLLL && (c72e = this.LJLZ) != null) {
            c72e.LIZ();
        }
    }

    public void setFocusChangeListener(C72E c72e) {
        this.LJLZ = c72e;
    }

    public C72F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.T5T, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.LJLLLLLL = z;
        C72E c72e = this.LJLZ;
        if (c72e != null && z && this.LJLLLL) {
            c72e.LIZ();
        }
    }
}
