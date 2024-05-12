package X;

import android.graphics.Matrix;
import android.graphics.Path;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.tasm.base.LLog;

/* renamed from: X.VQc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79710VQc {
    public static Matrix LJIIIIZZ;
    public static final double LJIIIZ = Math.sqrt(2.0d);
    public Path LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public VR9[] LJ;
    public double[] LJFF;
    public VQQ LJI;
    public int LJII;

    public C79710VQc(int i) {
        this.LIZIZ = i;
    }

    public C79710VQc(String str, float f) {
        this.LIZIZ = 3;
        try {
            this.LIZ = C07360Qq.LIZLLL(str);
        } catch (RuntimeException unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Create path from data string failed. Check the path string. \n");
            LIZ.append(str);
            LLog.LIZLLL(4, "LynxBasicShape", X1D.LIZIZ(LIZ));
        }
        if (this.LIZ == null) {
            LLog.LIZLLL(4, "LynxBasicShape", "Invalid path data string: " + str);
        } else {
            if (LJIIIIZZ == null) {
                LJIIIIZZ = new Matrix();
            }
            LJIIIIZZ.setScale(f, f);
            this.LIZ.transform(LJIIIIZZ);
        }
    }

    public static double LIZIZ(VR9 vr9, double d) {
        if (vr9 == null) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if (vr9.LIZIZ == 1) {
            return vr9.LIZ * d;
        }
        return vr9.LIZ;
    }

    public static void LIZ(Path path, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        float f7;
        float f8 = -1.0f;
        if (i == 1 || i == 4) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        if (i == 1 || i == 2) {
            f8 = 1.0f;
        }
        double d = 1.5707963267948966d;
        float f9 = (float) ((i - 1) * 1.5707963267948966d);
        while (true) {
            double d2 = f9;
            if (d2 < i * d) {
                double cos = Math.cos(d2) * f7;
                double sin = Math.sin(d2) * f8;
                double pow = (Math.pow(cos, 2.0f / f5) * f7 * f) + f3;
                double pow2 = (Math.pow(sin, 2.0f / f6) * f8 * f2) + f4;
                if (f9 == 0.0f) {
                    path.moveTo((float) pow, (float) pow2);
                } else {
                    path.lineTo((float) pow, (float) pow2);
                }
                f9 = (float) (d2 + 0.01d);
                d = 1.5707963267948966d;
            } else {
                return;
            }
        }
    }
}
