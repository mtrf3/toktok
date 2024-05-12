package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.jvm.internal.o;

/* renamed from: X.UvL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78743UvL extends AbstractC78749UvR {
    @Override // X.AbstractC78749UvR, X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap sourceBitmap, AbstractC78853Ux7 bitmapFactory) {
        int width;
        o.LJIIIZ(sourceBitmap, "sourceBitmap");
        o.LJIIIZ(bitmapFactory, "bitmapFactory");
        if (sourceBitmap.getWidth() >= sourceBitmap.getHeight()) {
            width = sourceBitmap.getHeight();
        } else {
            width = sourceBitmap.getWidth();
        }
        int i = (int) (width / 1.2d);
        int i2 = (width - i) / 2;
        return C81392Vwy.LIZJ(bitmapFactory.LIZJ(Bitmap.createBitmap(sourceBitmap, i2, i2, i, i, (Matrix) null, false)));
    }
}
