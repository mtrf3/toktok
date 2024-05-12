package X;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public final class W8I extends W8J<Bitmap> implements WB5 {
    @Override // X.W8J
    public final int LJIIIIZZ(int i) {
        return i;
    }

    @Override // X.W8J
    public final int LJIIJ(int i) {
        return i;
    }

    @Override // X.W8J
    public final Bitmap LIZIZ(int i) {
        try {
            C29220BdQ.LIZIZ = i;
            C29220BdQ.LIZ = C16880lQ.LLLLIIIILLL().getName();
            return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        } catch (OutOfMemoryError e) {
            throw e;
        }
    }

    @Override // X.W8J
    public final void LJFF(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        bitmap2.recycle();
    }

    @Override // X.W8J
    public final int LJIIIZ(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return bitmap2.getAllocationByteCount();
    }

    @Override // X.W8J
    public final Bitmap LJIIJJI(W8N<Bitmap> w8n) {
        Bitmap bitmap = (Bitmap) super.LJIIJJI(w8n);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // X.W8J
    public final boolean LJIILIIL(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        if (!bitmap2.isRecycled() && bitmap2.isMutable()) {
            return true;
        }
        return false;
    }

    public W8I(WB6 wb6, W9W w9w, C78937UyT c78937UyT) {
        super(wb6, w9w, c78937UyT);
        wb6.LIZ(this);
        c78937UyT.LJFF();
    }
}
