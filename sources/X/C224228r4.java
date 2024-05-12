package X;

import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;

/* renamed from: X.8r4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224228r4 {
    public final C224218r3 LIZ;
    public final OcrLocation LIZIZ;

    public final double LIZ() {
        return this.LIZ.LIZLLL() + (this.LIZ.LIZJ() * this.LIZIZ.yMax) + this.LIZ.LJIIJJI;
    }

    public final double LIZIZ() {
        double d = this.LIZIZ.xMax;
        C224218r3 c224218r3 = this.LIZ;
        double d2 = c224218r3.LJIIJ;
        double d3 = (1 - d2) / 2;
        c224218r3.getClass();
        return d3 + (d * d2) + LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public final double LIZJ() {
        double d = this.LIZIZ.xMin;
        C224218r3 c224218r3 = this.LIZ;
        double d2 = c224218r3.LJIIJ;
        double d3 = (1 - d2) / 2;
        c224218r3.getClass();
        return d3 + (d * d2) + LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public final boolean LJ() {
        C224218r3 c224218r3 = this.LIZ;
        if (((Rect) ListProtector.get(c224218r3.LJII, 1)).left / c224218r3.LIZLLL < LIZIZ()) {
            C224218r3 c224218r32 = this.LIZ;
            if (((Rect) ListProtector.get(c224218r32.LJII, 1)).top / c224218r32.LIZJ < LIZ()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJFF() {
        if (this.LIZ.LIZLLL() + (this.LIZ.LIZJ() * this.LIZIZ.yMin) + this.LIZ.LJIIJJI >= ((Rect) ListProtector.get(r5.LJII, 0)).bottom / r5.LIZJ) {
            return false;
        }
        return true;
    }

    public final boolean LJI() {
        if (LIZJ() < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || 1.0d < LIZIZ()) {
            return true;
        }
        return false;
    }

    public final boolean LJII() {
        double LIZJ = LIZJ();
        C224218r3 c224218r3 = this.LIZ;
        if (LIZJ >= ((Rect) ListProtector.get(c224218r3.LJII, 3)).right / c224218r3.LIZLLL) {
            return false;
        }
        C224218r3 c224218r32 = this.LIZ;
        if (((Rect) ListProtector.get(c224218r32.LJII, 3)).top / c224218r32.LIZJ >= LIZ()) {
            return false;
        }
        return true;
    }

    public final boolean LJIIIIZZ() {
        double LIZJ = LIZJ();
        C224218r3 c224218r3 = this.LIZ;
        if (LIZJ >= ((Rect) ListProtector.get(c224218r3.LJII, 2)).right / c224218r3.LIZLLL) {
            return false;
        }
        C224218r3 c224218r32 = this.LIZ;
        if (((Rect) ListProtector.get(c224218r32.LJII, 2)).top / c224218r32.LIZJ >= LIZ()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n [StickerLocation] start ");
        LIZ.append(LIZJ());
        LIZ.append(", top ");
        LIZ.append(this.LIZ.LIZLLL() + (this.LIZ.LIZJ() * this.LIZIZ.yMin) + this.LIZ.LJIIJJI);
        LIZ.append(", end ");
        LIZ.append(LIZIZ());
        LIZ.append(", bottom ");
        LIZ.append(LIZ());
        return X1D.LIZIZ(LIZ);
    }

    public C224228r4(C224218r3 c224218r3, OcrLocation ocrLocation) {
        this.LIZ = c224218r3;
        this.LIZIZ = ocrLocation;
    }

    public static double LIZLLL(C224228r4 c224228r4, double d, double d2, double d3, double d4, int i) {
        double d5 = d2;
        if ((i & 1) != 0) {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if ((i & 2) != 0) {
            d5 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        double d6 = 1.0d;
        if ((i & 4) != 0) {
            d3 = 1.0d;
        }
        if ((i & 8) == 0) {
            d6 = d4;
        }
        OcrLocation ocrLocation = c224228r4.LIZIZ;
        double d7 = ocrLocation.yMin;
        C224218r3 c224218r3 = c224228r4.LIZ;
        double d8 = c224218r3.LJIIJJI;
        double d9 = 2;
        double d10 = 1;
        double d11 = (((d5 * d9) - (d8 * d9)) - d10) / ((d7 * d9) - d10);
        double d12 = (((d6 * d9) - (d8 * d9)) - d10) / ((ocrLocation.yMax * d9) - d10);
        int i2 = 0;
        double d13 = ocrLocation.xMin;
        c224218r3.getClass();
        double d14 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX * d9;
        double d15 = c224228r4.LIZIZ.xMax;
        c224228r4.LIZ.getClass();
        double[] dArr = {d12, (((d * d9) - d14) - d10) / ((d13 * d9) - d10), (((d3 * d9) - d14) - d10) / ((d9 * d15) - d10)};
        do {
            d11 = Math.min(d11, dArr[i2]);
            i2++;
        } while (i2 < 3);
        return d11;
    }
}
