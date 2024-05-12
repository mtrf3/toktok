package X;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.o;

/* renamed from: X.Vo6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80842Vo6 extends Animation {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL = 0.0f;
    public final boolean LJLJJLL = false;
    public Camera LJLJL;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation t) {
        o.LJIIIZ(t, "t");
        float f2 = this.LJLIL;
        float LIZIZ = C06420Na.LIZIZ(this.LJLILLLLZI, f2, f, f2);
        float f3 = this.LJLJI;
        float f4 = this.LJLJJI;
        Camera camera = this.LJLJL;
        Matrix matrix = t.getMatrix();
        o.LJIIIIZZ(matrix, "t.matrix");
        if (camera != null) {
            camera.save();
        }
        if (this.LJLJJLL) {
            if (camera != null) {
                camera.translate(0.0f, 0.0f, this.LJLJJL * f);
                camera.rotateX(LIZIZ);
                camera.getMatrix(matrix);
                camera.restore();
            }
        } else if (camera != null) {
            camera.translate(0.0f, 0.0f, (1.0f - f) * this.LJLJJL);
            camera.rotateX(LIZIZ);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f3, -f4);
        matrix.postTranslate(f3, f4);
    }

    public C80842Vo6(float f, float f2, float f3, float f4) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = f3;
        this.LJLJJI = f4;
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.LJLJL = new Camera();
    }
}
