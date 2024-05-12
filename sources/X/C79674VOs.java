package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.VOs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79674VOs extends Animation {
    public final View LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return false;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.LJLIL.setAlpha((this.LJLJI * f) + this.LJLILLLLZI);
    }

    public C79674VOs(float f, float f2, View view) {
        this.LJLIL = view;
        this.LJLILLLLZI = f;
        this.LJLJI = f2 - f;
    }
}
