package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCO<V> implements Callable {
    public final /* synthetic */ Bitmap LJLIL;
    public final /* synthetic */ int[] LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ float LJLJJI;

    public MCO(Bitmap bitmap, int[] iArr, boolean z, float f) {
        this.LJLIL = bitmap;
        this.LJLILLLLZI = iArr;
        this.LJLJI = z;
        this.LJLJJI = f;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.LJLIL.getWidth() == 0 || this.LJLIL.getHeight() == 0) {
            return this.LJLIL;
        }
        Bitmap croppedBitmap = this.LJLIL;
        int[] iArr = this.LJLILLLLZI;
        int i = iArr[0];
        int i2 = iArr[1];
        if (croppedBitmap.getWidth() != 0 && croppedBitmap.getHeight() != 0) {
            float width = i / croppedBitmap.getWidth();
            float height = i2 / croppedBitmap.getHeight();
            if (width < height) {
                width = height;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(width, width);
            croppedBitmap = Bitmap.createBitmap(croppedBitmap, 0, 0, croppedBitmap.getWidth(), croppedBitmap.getHeight(), matrix, true);
            o.LJIIIIZZ(croppedBitmap, "createBitmap(this, 0, 0,…th, height, matrix, true)");
        }
        if (!this.LJLJI) {
            int width2 = (croppedBitmap.getWidth() - this.LJLILLLLZI[0]) / 2;
            int height2 = croppedBitmap.getHeight();
            int[] iArr2 = this.LJLILLLLZI;
            int i3 = iArr2[1];
            croppedBitmap = Bitmap.createBitmap(croppedBitmap, width2, (height2 - i3) / 2, iArr2[0], i3);
        }
        o.LJIIIIZZ(croppedBitmap, "croppedBitmap");
        return C56374MAo.LIZ(this.LJLJJI, croppedBitmap, this.LJLILLLLZI);
    }
}
