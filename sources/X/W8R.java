package X;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public final class W8R extends W8S {
    public static boolean LJI(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            W58.LJIJI("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        W58.LJIJI("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // X.W8S
    public final Object LIZ(int i) {
        Bitmap bitmap = (Bitmap) super.LIZ(i);
        if (bitmap != null && LJI(bitmap)) {
            bitmap.eraseColor(0);
            return bitmap;
        }
        return null;
    }

    @Override // X.W8S
    public final int LIZJ(Object obj) {
        return W6I.LIZJ((Bitmap) obj);
    }

    @Override // X.W8S
    public final void LJFF(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (LJI(bitmap)) {
            super.LJFF(bitmap);
        }
    }
}
