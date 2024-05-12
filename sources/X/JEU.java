package X;

import android.animation.ValueAnimator;
import android.graphics.Point;

/* loaded from: classes9.dex */
public final class JEU implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ JEG LJLILLLLZI;
    public final /* synthetic */ Point LJLJI;
    public final /* synthetic */ int LJLJJI;

    public JEU(boolean z, JEG jeg, Point point, int i) {
        this.LJLIL = z;
        this.LJLILLLLZI = jeg;
        this.LJLJI = point;
        this.LJLJJI = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (this.LJLIL) {
            JEG jeg = this.LJLILLLLZI;
            Point point = this.LJLJI;
            jeg.LJI(new Point(point.x - ((int) (this.LJLJJI * floatValue)), point.y));
        } else {
            JEG jeg2 = this.LJLILLLLZI;
            Point point2 = this.LJLJI;
            jeg2.LJI(new Point(point2.x + ((int) (this.LJLJJI * floatValue)), point2.y));
        }
    }
}
