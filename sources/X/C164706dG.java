package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;

/* renamed from: X.6dG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164706dG extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164706dG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!canScrollVertically(-1)) {
            LJLJJI();
        }
        if (!canScrollVertically(1)) {
            LJLJJI();
        }
    }
}
