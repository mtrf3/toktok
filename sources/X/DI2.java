package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* loaded from: classes7.dex */
public final class DI2 extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ int[] LIZ;

    public DI2(int[] iArr) {
        this.LIZ = iArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i, int i2) {
        float f = i * 0.0f;
        float f2 = i2;
        return new LinearGradient(f, f2 * 0.0f, f, f2 * 1.0f, this.LIZ, (float[]) null, Shader.TileMode.CLAMP);
    }
}
