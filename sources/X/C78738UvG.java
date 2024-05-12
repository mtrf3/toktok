package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

/* renamed from: X.UvG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78738UvG extends AbstractC78749UvR {
    public C245519kJ LIZ;
    public final boolean LIZIZ = true;

    @Override // X.AbstractC78749UvR, X.VA3
    public final W6U getPostprocessorCacheKey() {
        if (this.LIZ == null) {
            if (this.LIZIZ) {
                this.LIZ = new C245519kJ("RoundAsCirclePostprocessor#AntiAliased");
            } else {
                this.LIZ = new C245519kJ("RoundAsCirclePostprocessor");
            }
        }
        return this.LIZ;
    }

    @Override // X.AbstractC78749UvR
    public final void process(Bitmap bitmap) {
        NativeRoundingFilter.toCircle(bitmap, this.LIZIZ);
    }
}
