package X;

import android.graphics.Bitmap;

/* renamed from: X.UvH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78739UvH implements VA3 {
    public final int LIZ;
    public final float LIZIZ;

    @Override // X.VA3
    public final String getName() {
        return "blurProcessor";
    }

    @Override // X.VA3
    public final W6U getPostprocessorCacheKey() {
        return new C245519kJ("blur_bitmap_processor");
    }

    public C78739UvH(float f) {
        this.LIZIZ = f;
        this.LIZ = 5;
    }

    public C78739UvH(int i, float f) {
        this.LIZIZ = f;
        this.LIZ = i;
    }

    @Override // X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        float f;
        int i;
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
        if (this.LIZIZ != 0.0f) {
            float f2 = round;
            float f3 = round2;
            if (Math.abs((f2 / f3) - this.LIZ) > 0.2f) {
                float f4 = this.LIZIZ;
                int i2 = (int) (f2 / f4);
                if (i2 > round2) {
                    i = (int) (f3 * f4);
                    i2 = round2;
                } else {
                    i = round;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (round - i) >> 1, (round2 - i2) >> 1, i, i2);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                round = i;
                round2 = i2;
            }
        }
        C81392Vwy<Bitmap> LIZIZ = abstractC78853Ux7.LIZIZ(round, round2);
        C61673OIj.LIZ(createScaledBitmap, LIZIZ.LJI(), this.LIZ);
        createScaledBitmap.recycle();
        return LIZIZ;
    }
}
