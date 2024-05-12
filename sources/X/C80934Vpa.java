package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.jvm.internal.o;

/* renamed from: X.Vpa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80934Vpa implements InterfaceC80940Vpg {
    public final int LIZ = 16;

    @Override // X.InterfaceC80940Vpg
    public final String getKey() {
        return "ScaledMosaic-Transform";
    }

    @Override // X.InterfaceC80940Vpg
    public final C80935Vpb LIZ(Bitmap bitmap, InterfaceC80941Vph interfaceC80941Vph) {
        return LIZIZ(bitmap, interfaceC80941Vph);
    }

    public final C80935Vpb LIZIZ(Bitmap sourceBitmap, InterfaceC80941Vph factory) {
        o.LJIIIZ(sourceBitmap, "sourceBitmap");
        o.LJIIIZ(factory, "factory");
        int width = sourceBitmap.getWidth();
        int height = sourceBitmap.getHeight();
        int i = this.LIZ;
        int i2 = width / i;
        int i3 = height / i;
        C80939Vpf c80939Vpf = (C80939Vpf) factory;
        C80935Vpb c80935Vpb = new C80935Vpb(c80939Vpf.LIZ.LJ(i, i, sourceBitmap.getConfig()));
        int i4 = this.LIZ;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.LIZ;
            for (int i7 = 0; i7 < i6; i7++) {
                Bitmap LJI = c80935Vpb.LIZ.LJI();
                o.LJIIIIZZ(LJI, "mosaicBitmapReference.bitmap");
                LJI.setPixel(i5, i7, sourceBitmap.getPixel(i5 * i2, i7 * i3));
            }
        }
        Bitmap LJI2 = c80935Vpb.LIZ.LJI();
        AbstractC78853Ux7 abstractC78853Ux7 = c80939Vpf.LIZ;
        abstractC78853Ux7.getClass();
        AbstractC78853Ux7.LIZ(width, height);
        Matrix matrix = new Matrix();
        int width2 = LJI2.getWidth();
        int height2 = LJI2.getHeight();
        matrix.setScale(width / width2, height / height2);
        return new C80935Vpb(abstractC78853Ux7.LIZLLL(LJI2, 0, 0, width2, height2, matrix));
    }
}
