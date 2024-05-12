package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.UvN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78745UvN implements VA3 {
    @Override // X.VA3
    public final String getName() {
        return "recommend_effect_processor";
    }

    @Override // X.VA3
    public final W6U getPostprocessorCacheKey() {
        return new C245519kJ("recommend_effect_processor");
    }

    @Override // X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap sourceBitmap, AbstractC78853Ux7 bitmapFactory) {
        o.LJIIIZ(sourceBitmap, "sourceBitmap");
        o.LJIIIZ(bitmapFactory, "bitmapFactory");
        int width = sourceBitmap.getWidth();
        int height = sourceBitmap.getHeight();
        if (width > 100 && height > 100) {
            int LJJIIZ = O6R.LJJIIZ(width * 0.06521739f);
            int LJJIIZ2 = O6R.LJJIIZ(height * 0.06521739f);
            return bitmapFactory.LIZLLL(sourceBitmap, LJJIIZ, LJJIIZ2, width - (LJJIIZ * 2), height - (LJJIIZ2 * 2), null);
        }
        return bitmapFactory.LIZJ(sourceBitmap);
    }
}
