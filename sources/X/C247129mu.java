package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.9mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247129mu extends RecyclerView {
    public float LLLF;
    public float LLLFF;

    public final float getFlingXRatio() {
        return this.LLLF;
    }

    public final float getFlingYRatio() {
        return this.LLLFF;
    }

    public final void setFlingXRatio(float f) {
        this.LLLF = f;
    }

    public final void setFlingYRatio(float f) {
        this.LLLFF = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C247129mu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LLLF = 1.0f;
        this.LLLFF = 1.0f;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean LJJJI(int i, int i2) {
        return super.LJJJI((int) (i * this.LLLF), (int) (i2 * this.LLLFF));
    }
}
