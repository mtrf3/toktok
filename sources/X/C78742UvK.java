package X;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: X.UvK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78742UvK implements VA3 {
    public final Context LIZ;

    @Override // X.VA3
    public final String getName() {
        return "blurProcessor";
    }

    @Override // X.VA3
    public final W6U getPostprocessorCacheKey() {
        return new C245519kJ("blur_bitmap_processor");
    }

    public C78742UvK(Context context) {
        this.LIZ = context;
    }

    @Override // X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        float f;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f = 0.6f;
        } else if (width < 200 || height < 200) {
            f = 0.3f;
        } else {
            f = 0.1f;
        }
        int round = Math.round(width * f);
        int round2 = Math.round(height * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        C81392Vwy<Bitmap> LIZIZ = abstractC78853Ux7.LIZIZ(round, round2);
        C80927VpT.LIZ(25, this.LIZ, createScaledBitmap, LIZIZ.LJI());
        createScaledBitmap.recycle();
        return LIZIZ;
    }
}
