package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;

/* renamed from: X.COm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31256COm extends RunnableC31065CHd {
    public boolean LLLIIIIL;

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (canScrollVertically(-1)) {
            return 1.0f;
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (!this.LLLIIIIL && canScrollVertically(1)) {
            return 1.0f;
        }
        return 0.0f;
    }

    public final boolean getPendingScroll() {
        return this.LLLIIIIL;
    }

    public final void setPendingScroll(boolean z) {
        this.LLLIIIIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31256COm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
