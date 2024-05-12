package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.ASi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26260ASi extends Animation {
    public final View LJLIL;
    public final int LJLILLLLZI;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    public C26260ASi(View view) {
        this.LJLIL = view;
        this.LJLILLLLZI = view.getMeasuredHeight();
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        if (f == 1.0f) {
            this.LJLIL.setVisibility(8);
            this.LJLIL.getLayoutParams().height = this.LJLILLLLZI;
        } else {
            ViewGroup.LayoutParams layoutParams = this.LJLIL.getLayoutParams();
            int i = this.LJLILLLLZI;
            layoutParams.height = i - ((int) (i * f));
            this.LJLIL.requestLayout();
        }
    }
}
