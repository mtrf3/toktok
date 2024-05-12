package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;

/* renamed from: X.9ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247109ms extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C247109ms(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean LJJJI(int i, int i2) {
        int max;
        if (i > 0) {
            max = Math.min(i, 5000);
        } else {
            max = Math.max(i, -5000);
        }
        return super.LJJJI(max, i2);
    }
}
