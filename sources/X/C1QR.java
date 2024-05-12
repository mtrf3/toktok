package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.jvm.internal.o;

/* renamed from: X.1QR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QR implements InterfaceC11750d9 {
    public Canvas LIZ = C11530cn.LIZ;
    public final Rect LIZIZ = new Rect();
    public final Rect LIZJ = new Rect();

    @Override // X.InterfaceC11750d9
    public final void LJFF() {
        C11800dE.LIZ(this.LIZ, false);
    }

    @Override // X.InterfaceC11750d9
    public final void LJIIJ() {
        this.LIZ.restore();
    }

    @Override // X.InterfaceC11750d9
    public final void LJIIL() {
        this.LIZ.save();
    }

    @Override // X.InterfaceC11750d9
    public final void LJIJ() {
        this.LIZ.scale(-1.0f, 1.0f);
    }

    @Override // X.InterfaceC11750d9
    public final void LJIJI() {
        C11800dE.LIZ(this.LIZ, true);
    }

    @Override // X.InterfaceC11750d9
    public final void LJIJJ() {
        this.LIZ.rotate(45.0f);
    }

    @Override // X.InterfaceC11750d9
    public final void LJIILIIL(float[] fArr) {
        float f;
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                if (i == i2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                if (fArr[(i * 4) + i2] == f) {
                    i2++;
                } else {
                    Matrix matrix = new Matrix();
                    float f2 = fArr[2];
                    if (f2 == 0.0f && 1 != 0 && fArr[6] == 0.0f && fArr[10] == 1.0f && fArr[14] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[11] == 0.0f) {
                        float f3 = fArr[0];
                        float f4 = fArr[1];
                        float f5 = fArr[3];
                        float f6 = fArr[4];
                        float f7 = fArr[5];
                        float f8 = fArr[6];
                        float f9 = fArr[7];
                        float f10 = fArr[8];
                        float f11 = fArr[12];
                        float f12 = fArr[13];
                        float f13 = fArr[15];
                        fArr[0] = f3;
                        fArr[1] = f6;
                        fArr[2] = f11;
                        fArr[3] = f4;
                        fArr[4] = f7;
                        fArr[5] = f12;
                        fArr[6] = f5;
                        fArr[7] = f9;
                        fArr[8] = f13;
                        matrix.setValues(fArr);
                        fArr[0] = f3;
                        fArr[1] = f4;
                        fArr[2] = f2;
                        fArr[3] = f5;
                        fArr[4] = f6;
                        fArr[5] = f7;
                        fArr[6] = f8;
                        fArr[7] = f9;
                        fArr[8] = f10;
                        this.LIZ.concat(matrix);
                        return;
                    }
                    "Android does not support arbitrary transforms".toString();
                    throw new IllegalArgumentException("Android does not support arbitrary transforms");
                }
            } while (i2 < 4);
        }
    }

    @Override // X.InterfaceC11750d9
    public final void LIZJ(C10390ax c10390ax, InterfaceC11550cp interfaceC11550cp) {
        this.LIZ.saveLayer(c10390ax.LIZ, c10390ax.LIZIZ, c10390ax.LIZJ, c10390ax.LIZLLL, interfaceC11550cp.LJII(), 31);
    }

    @Override // X.InterfaceC11750d9
    public final void LJI(C10390ax c10390ax, C1QW paint) {
        o.LJIIIZ(paint, "paint");
        LJIIIIZZ(c10390ax.LIZ, c10390ax.LIZIZ, c10390ax.LIZJ, c10390ax.LIZLLL, paint);
    }

    @Override // X.InterfaceC11750d9
    public final void LJIIIZ(InterfaceC11610cv path, int i) {
        Region.Op op;
        o.LJIIIZ(path, "path");
        Canvas canvas = this.LIZ;
        if (path instanceof C1QX) {
            Path path2 = ((C1QX) path).LIZIZ;
            if (i == 0) {
                op = Region.Op.DIFFERENCE;
            } else {
                op = Region.Op.INTERSECT;
            }
            canvas.clipPath(path2, op);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // X.InterfaceC11750d9
    public final void LJIIJJI(C10390ax c10390ax, int i) {
        LIZLLL(c10390ax.LIZ, c10390ax.LIZIZ, c10390ax.LIZJ, c10390ax.LIZLLL, i);
    }

    @Override // X.InterfaceC11750d9
    public final void LJIILJJIL(InterfaceC11610cv path, InterfaceC11550cp interfaceC11550cp) {
        o.LJIIIZ(path, "path");
        Canvas canvas = this.LIZ;
        if (path instanceof C1QX) {
            canvas.drawPath(((C1QX) path).LIZIZ, interfaceC11550cp.LJII());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // X.InterfaceC11750d9
    public final void LJIILLIIL(float f, float f2) {
        this.LIZ.translate(f, f2);
    }

    @Override // X.InterfaceC11750d9
    public final void LIZ(float f, long j, InterfaceC11550cp interfaceC11550cp) {
        this.LIZ.drawCircle(C10370av.LIZLLL(j), C10370av.LJ(j), f, interfaceC11550cp.LJII());
    }

    @Override // X.InterfaceC11750d9
    public final void LJ(InterfaceC12040dc image, long j, InterfaceC11550cp interfaceC11550cp) {
        o.LJIIIZ(image, "image");
        this.LIZ.drawBitmap(C78688UuS.LJ(image), C10370av.LIZLLL(j), C10370av.LJ(j), interfaceC11550cp.LJII());
    }

    @Override // X.InterfaceC11750d9
    public final void LJIIZILJ(long j, long j2, InterfaceC11550cp interfaceC11550cp) {
        this.LIZ.drawLine(C10370av.LIZLLL(j), C10370av.LJ(j), C10370av.LIZLLL(j2), C10370av.LJ(j2), interfaceC11550cp.LJII());
    }

    @Override // X.InterfaceC11750d9
    public final void LIZLLL(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.LIZ;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // X.InterfaceC11750d9
    public final void LJIIIIZZ(float f, float f2, float f3, float f4, InterfaceC11550cp paint) {
        o.LJIIIZ(paint, "paint");
        this.LIZ.drawRect(f, f2, f3, f4, paint.LJII());
    }

    @Override // X.InterfaceC11750d9
    public final void LIZIZ(InterfaceC12040dc image, long j, long j2, long j3, long j4, InterfaceC11550cp interfaceC11550cp) {
        o.LJIIIZ(image, "image");
        Canvas canvas = this.LIZ;
        Bitmap LJ = C78688UuS.LJ(image);
        Rect rect = this.LIZIZ;
        int i = (int) (j >> 32);
        rect.left = i;
        rect.top = C23450w1.LIZJ(j);
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = C23490w5.LIZIZ(j2) + C23450w1.LIZJ(j);
        Rect rect2 = this.LIZJ;
        int i2 = (int) (j3 >> 32);
        rect2.left = i2;
        rect2.top = C23450w1.LIZJ(j3);
        rect2.right = i2 + ((int) (j4 >> 32));
        rect2.bottom = C23490w5.LIZIZ(j4) + C23450w1.LIZJ(j3);
        canvas.drawBitmap(LJ, rect, rect2, interfaceC11550cp.LJII());
    }

    @Override // X.InterfaceC11750d9
    public final void LJII(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC11550cp interfaceC11550cp) {
        this.LIZ.drawRoundRect(f, f2, f3, f4, f5, f6, interfaceC11550cp.LJII());
    }

    @Override // X.InterfaceC11750d9
    public final void LJIILL(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC11550cp interfaceC11550cp) {
        this.LIZ.drawArc(f, f2, f3, f4, f5, f6, false, interfaceC11550cp.LJII());
    }
}
