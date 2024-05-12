package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* loaded from: classes7.dex */
public final class DI1 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ float LIZ;
    public final /* synthetic */ float LIZIZ;
    public final /* synthetic */ float LIZJ;
    public final /* synthetic */ float LIZLLL;
    public final /* synthetic */ int[] LJ;

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        float f = i;
        float f2 = i2;
        return new LinearGradient(f * this.LIZ, f2 * this.LIZIZ, f * this.LIZJ, f2 * this.LIZLLL, this.LJ, (float[]) null, Shader.TileMode.CLAMP);
    }

    public DI1(float f, float f2, float f3, float f4, int[] iArr) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = iArr;
    }
}
