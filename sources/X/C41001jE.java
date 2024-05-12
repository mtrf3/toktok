package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.1jE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41001jE extends C8ID {
    public int LJLJI;

    @Override // X.C8ID, android.view.View
    public void setVisibility(int i) {
        if (getContext() != null) {
            super.setVisibility(i);
            this.LJLJI = i;
        }
    }

    public C41001jE(Context context, AttributeSet attributeSet) {
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
