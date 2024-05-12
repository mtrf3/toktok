package X;

import android.graphics.Bitmap;

/* renamed from: X.Uvc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78760Uvc extends AbstractC32664Crs<C81392Vwy<W5A>> {
    public abstract void LJI(C81392Vwy<Bitmap> c81392Vwy);

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<W5A>> w4w) {
        C81392Vwy<Bitmap> c81392Vwy;
        if (!w4w.LIZIZ()) {
            return;
        }
        C81392Vwy<W5A> result = w4w.getResult();
        if (result != null && (result.LJI() instanceof W5C)) {
            c81392Vwy = ((W5C) result.LJI()).cloneUnderlyingBitmapReference();
        } else {
            c81392Vwy = null;
        }
        try {
            LJI(c81392Vwy);
        } finally {
            C81392Vwy.LJ(c81392Vwy);
            C81392Vwy.LJ(result);
        }
    }
}
