package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.YAc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86938YAc extends Animation {
    public final /* synthetic */ YAY LJLIL;

    public C86938YAc(YAY yay) {
        this.LJLIL = yay;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i;
        YAY yay = this.LJLIL;
        int i2 = yay.LJLJJI;
        if (i2 != yay.LJLZ) {
            i = i2 + ((int) ((r0 - i2) * f));
        } else {
            i = 0;
        }
        View view = yay.LJLIL;
        if (view != null) {
            int top = i - view.getTop();
            int top2 = this.LJLIL.LJLIL.getTop();
            if (top + top2 < 0) {
                top = -top2;
            }
            this.LJLIL.setTargetOffsetTopAndBottom(top);
        }
    }
}
