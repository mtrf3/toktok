package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes5.dex */
public final class AS2 extends Animation {
    public final /* synthetic */ ViewGroup.MarginLayoutParams LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C26251ARz LJLJJI;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.LJLIL;
        int i = this.LJLILLLLZI;
        marginLayoutParams.topMargin = ((int) ((i - r1) * f)) + this.LJLJI;
        ViewGroup viewGroup = this.LJLJJI.LJLJL;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    public AS2(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, C26251ARz c26251ARz) {
        this.LJLIL = marginLayoutParams;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = c26251ARz;
    }
}
