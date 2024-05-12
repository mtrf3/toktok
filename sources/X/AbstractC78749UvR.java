package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;

/* renamed from: X.UvR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78749UvR implements VA3 {
    public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = Bitmap.Config.ARGB_8888;

    @Override // X.VA3
    public String getName() {
        return "Unknown postprocessor";
    }

    @Override // X.VA3
    public W6U getPostprocessorCacheKey() {
        return null;
    }

    public void process(Bitmap bitmap) {
    }

    public static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.copyBitmap(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // X.VA3
    public C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        C81392Vwy<Bitmap> LJ = abstractC78853Ux7.LJ(width, height, config);
        try {
            process(LJ.LJI(), bitmap);
            return C81392Vwy.LIZJ(LJ);
        } finally {
            C81392Vwy.LJ(LJ);
        }
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }

    public C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7, java.util.Map<String, String> map) {
        return process(bitmap, abstractC78853Ux7);
    }
}
