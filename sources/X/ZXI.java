package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes29.dex */
public final class ZXI extends Animation {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        DialogC90914ZmA.LJJII(this.LJLJI, this.LJLIL - ((int) ((r1 - this.LJLILLLLZI) * f)));
    }

    public ZXI(int i, int i2, View view) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = view;
    }
}
