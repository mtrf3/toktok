package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes29.dex */
public final class ZXS extends Animation {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.LJLIL;
        int i2 = this.LJLILLLLZI;
        View view = this.LJLJI;
        int i3 = i2 + ((int) ((i - i2) * f));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i3;
        view.setLayoutParams(layoutParams);
    }

    public ZXS(int i, int i2, View view) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = view;
    }
}
