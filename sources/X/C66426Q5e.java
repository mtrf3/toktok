package X;

import android.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Q5e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66426Q5e {
    public final Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ C66426Q5e(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZIZ = fragment;
    }

    public /* synthetic */ C66426Q5e(androidx.fragment.app.Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = fragment;
    }

    public final int LIZ(int i, int i2) {
        if (i < 0 || i > 3) {
            return 0;
        }
        int i3 = (int) (((float[]) this.LIZ)[i] * i2);
        int i4 = i % 2;
        Object obj = this.LIZIZ;
        if (i3 > ((int[]) obj)[i4]) {
            i3 = ((int[]) obj)[i4];
        }
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public /* synthetic */ C66426Q5e(float f, float f2, float f3, float f4, int i, int i2) {
        this.LIZ = r4;
        this.LIZIZ = r3;
        float[] fArr = {f, f2, f3, f4};
        int[] iArr = {i, i2};
    }
}
