package com.bytedance.fly_main_color;

import X.C16880lQ;
import X.C23220ve;
import X.C81154Vt8;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FlyMainColor {
    public static final FlyMainColor LIZ = new FlyMainColor();

    private final native int nCutMainColor(Bitmap bitmap, int[] iArr, int[] iArr2, int[] iArr3);

    private final native int nRGB2OKLCH(int i, int i2, int i3, float[] fArr);

    private final native int nSolveMainColor(int i, int[] iArr, int[] iArr2, int[] iArr3, float f, float f2, float f3, float f4, float f5, float f6, float f7);

    static {
        C16880lQ.LLJJJIL("fly-main-color-lib");
    }

    public static int LIZJ(C81154Vt8 output) {
        o.LJIIIZ(output, "output");
        return LIZ.nSolveMainColor(output.LIZLLL, output.LJ, output.LJFF, output.LJI, output.LJII, output.LJIIIIZZ, output.LJIIIZ, output.LJIIJ, output.LJIIJJI, output.LJIIL, output.LJIILIIL);
    }

    public final C81154Vt8 LIZ(C23220ve c23220ve) {
        int[] iArr;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        Rect rect = (Rect) c23220ve.LIZ;
        if (rect == null) {
            iArr = null;
        } else {
            iArr = new int[]{rect.left, rect.top, rect.right, rect.bottom};
        }
        return new C81154Vt8(nCutMainColor((Bitmap) c23220ve.LIZIZ, iArr, iArr2, iArr3), iArr2, iArr3);
    }

    public final float[] LIZIZ(int i) {
        float[] fArr = new float[3];
        nRGB2OKLCH(Color.red(i), Color.green(i), Color.blue(i), fArr);
        return fArr;
    }
}
