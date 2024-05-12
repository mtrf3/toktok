package X;

import kotlin.jvm.internal.o;

/* renamed from: X.13L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13L {
    public final int LIZ;
    public final Float[] LIZIZ;

    public C13L(int i) {
        this.LIZ = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.LIZIZ = fArr;
    }

    public final float LIZ(C13L a) {
        o.LJIIIZ(a, "a");
        int i = this.LIZ;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += a.LIZIZ[i2].floatValue() * this.LIZIZ[i2].floatValue();
        }
        return f;
    }
}
