package X;

import android.graphics.Bitmap;

/* renamed from: X.CkX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32209CkX extends AbstractC32664Crs<C81392Vwy<W5A>> {
    public abstract void LJI(Bitmap bitmap);

    @Override // X.AbstractC32664Crs
    public void LJFF(W4W<C81392Vwy<W5A>> w4w) {
        Bitmap bitmap;
        if (!w4w.LIZIZ()) {
            return;
        }
        C81392Vwy<W5A> result = w4w.getResult();
        if (result != null && (result.LJI() instanceof W5B)) {
            bitmap = ((W5B) result.LJI()).getUnderlyingBitmap();
        } else {
            bitmap = null;
        }
        try {
            LJI(bitmap);
        } finally {
            C81392Vwy.LJ(result);
        }
    }
}
