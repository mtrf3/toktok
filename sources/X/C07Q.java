package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: X.07Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07Q {
    public final EdgeEffect LIZ;

    public final void LIZIZ() {
        this.LIZ.finish();
    }

    public final boolean LIZLLL() {
        return this.LIZ.isFinished();
    }

    public final boolean LJI() {
        this.LIZ.onRelease();
        return this.LIZ.isFinished();
    }

    public C07Q(Context context) {
        this.LIZ = new EdgeEffect(context);
    }

    public static float LIZJ(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C07P.LIZIZ(edgeEffect);
        }
        return 0.0f;
    }

    public final boolean LIZ(Canvas canvas) {
        return this.LIZ.draw(canvas);
    }

    public final void LJ(float f) {
        this.LIZ.onPull(f);
    }

    public final void LJII(int i, int i2) {
        this.LIZ.setSize(i, i2);
    }

    public static float LJFF(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C07P.LIZJ(edgeEffect, f, f2);
        }
        C07O.LIZ(edgeEffect, f, f2);
        return f;
    }
}
