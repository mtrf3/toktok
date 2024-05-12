package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* renamed from: X.T5h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74073T5h extends C74072T5g {
    public Drawable LJZI;

    public void setVerifiedDrawable(Drawable drawable) {
        this.LJZI = drawable;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LJZI) {
            return true;
        }
        return false;
    }

    public C74073T5h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C74073T5h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
