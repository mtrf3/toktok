package X;

import android.graphics.Bitmap;
import android.util.Pair;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.UOo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77122UOo extends AbstractC32209CkX {
    public final /* synthetic */ W4W LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C77121UOn LIZJ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        int allocationByteCount;
        try {
            if (this.LIZ.LIZIZ() && bitmap != null && !bitmap.isRecycled() && bitmap.getConfig() != null) {
                this.LIZJ.LJ();
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                java.util.Map<String, Pair<Bitmap, Integer>> map = this.LIZJ.LIZ;
                String str = this.LIZIZ;
                if (createBitmap == null) {
                    allocationByteCount = 0;
                } else {
                    allocationByteCount = createBitmap.getAllocationByteCount();
                }
                ((ConcurrentHashMap) map).put(str, new Pair(createBitmap, Integer.valueOf(allocationByteCount)));
            }
        } catch (Throwable unused) {
        }
        this.LIZ.close();
    }

    public C77122UOo(C77121UOn c77121UOn, C81697W4n c81697W4n, String str) {
        this.LIZJ = c77121UOn;
        this.LIZ = c81697W4n;
        this.LIZIZ = str;
    }
}
