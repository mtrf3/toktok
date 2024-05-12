package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;

/* renamed from: X.9mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247099mr extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C247099mr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean LJJJI(int i, int i2) {
        return super.LJJJI((int) (i * 0.5d), i2);
    }
}
