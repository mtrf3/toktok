package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;

/* renamed from: X.6SO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SO extends RecyclerView {
    public float LLLF;
    public float LLLFF;
    public float LLLFFI;
    public float LLLFZ;

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return this.LLLFZ;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return this.LLLF;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return this.LLLFF;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return this.LLLFFI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6SO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLF = C32151Nz.LJIIZILJ(10);
        this.LLLFF = C32151Nz.LJIIZILJ(10);
        this.LLLFFI = C32151Nz.LJIIZILJ(10);
        this.LLLFZ = C32151Nz.LJIIZILJ(10);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
