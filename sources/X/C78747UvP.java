package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* renamed from: X.UvP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78747UvP extends AbstractC78749UvR {
    public final int LIZ;
    public final int LIZIZ;
    public C245519kJ LIZJ;

    @Override // X.AbstractC78749UvR, X.VA3
    public final W6U getPostprocessorCacheKey() {
        if (this.LIZJ == null) {
            this.LIZJ = new C245519kJ(C16880lQ.LLLZI(null, "i%dr%d", new Object[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ)}));
        }
        return this.LIZJ;
    }

    public C78747UvP(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        this.LIZ = 3;
        this.LIZIZ = i;
    }

    @Override // X.AbstractC78749UvR
    public final void process(Bitmap bitmap) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, this.LIZ, this.LIZIZ);
    }
}
