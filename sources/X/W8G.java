package X;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public final class W8G extends AbstractC78853Ux7 {
    public final WB5 LIZ;

    public W8G(WB5 wb5) {
        this.LIZ = wb5;
    }

    @Override // X.AbstractC78853Ux7
    public final C81392Vwy<Bitmap> LJ(int i, int i2, Bitmap.Config config) {
        boolean z;
        int i3 = i * i2;
        Bitmap bitmap = this.LIZ.get(W6I.LIZIZ(config) * i3);
        if (bitmap.getAllocationByteCount() >= W6I.LIZIZ(config) * i3) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        bitmap.reconfigure(i, i2, config);
        return C81392Vwy.LJIILIIL(bitmap, this.LIZ);
    }
}
