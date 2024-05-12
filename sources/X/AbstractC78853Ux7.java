package X;

import android.graphics.Bitmap;

/* renamed from: X.Ux7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78853Ux7 {
    public abstract C81392Vwy<Bitmap> LJ(int i, int i2, Bitmap.Config config);

    public final C81392Vwy<Bitmap> LIZJ(Bitmap bitmap) {
        return LIZLLL(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), null);
    }

    public static void LIZ(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJFF("width must be > 0", z);
        if (i2 <= 0) {
            z2 = false;
        }
        C32151Nz.LJFF("height must be > 0", z2);
    }

    public final C81392Vwy<Bitmap> LIZIZ(int i, int i2) {
        return LJ(i, i2, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C81392Vwy LIZLLL(android.graphics.Bitmap r15, int r16, int r17, int r18, int r19, android.graphics.Matrix r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC78853Ux7.LIZLLL(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix):X.Vwy");
    }
}
