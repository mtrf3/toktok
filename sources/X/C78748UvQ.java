package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* renamed from: X.UvQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78748UvQ extends AbstractC78749UvR {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final InterfaceC78716Uuu LJIIJJI;

    @Override // X.AbstractC78749UvR, X.VA3
    public final String getName() {
        return "ShadowPostProcessor";
    }

    @Override // X.AbstractC78749UvR, X.VA3
    public final W6U getPostprocessorCacheKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        sb.append(this.LIZIZ);
        sb.append(this.LJ);
        sb.append(this.LJFF);
        sb.append(this.LIZJ);
        sb.append(this.LIZLLL);
        sb.append(this.LJIIJJI);
        sb.append(this.LJI);
        sb.append(this.LJII);
        sb.append(this.LJIIIIZZ);
        sb.append(this.LJIIIZ);
        sb.append(this.LJIIJ);
        return new C245519kJ(sb.toString());
    }

    public final Bitmap LIZIZ(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        int i;
        RectF rectF;
        int i2 = this.LIZ;
        if (i2 == 0 || (i = this.LIZIZ) == 0) {
            return bitmap;
        }
        Bitmap LJI = abstractC78853Ux7.LJ(i2, i, bitmap.getConfig()).LJI();
        Matrix matrix = new Matrix();
        Canvas canvas = new Canvas(LJI);
        canvas.translate(this.LIZJ, this.LJFF);
        canvas.clipRect(0, 0, i2 - this.LIZLLL, i - this.LJ);
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint(1);
        float f = (i2 - this.LIZJ) - this.LIZLLL;
        float f2 = (i - this.LJFF) - this.LJ;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        InterfaceC78716Uuu interfaceC78716Uuu = this.LJIIJJI;
        if (interfaceC78716Uuu == InterfaceC78716Uuu.LJJJLZIJ) {
            matrix.setScale(f / width, f2 / height);
            matrix.postTranslate(0.0f, 0.0f);
            rectF = new RectF(0.0f, 0.0f, f + 0.0f, f2 + 0.0f);
        } else if (interfaceC78716Uuu == InterfaceC78716Uuu.LJJL) {
            float f3 = f / width;
            float f4 = f2 / height;
            if (f3 > f4) {
                float f5 = width * f4;
                float LIZ = C1I0.LIZ(f, f5, 2.0f, 0.0f);
                rectF = new RectF(LIZ, 0.0f, f5 + LIZ, f2 + 0.0f);
                matrix.setScale(f4, f4);
                matrix.postTranslate(LIZ, 0.0f);
            } else {
                float f6 = height * f3;
                float LIZ2 = C1I0.LIZ(f2, f6, 2.0f, 0.0f);
                rectF = new RectF(0.0f, LIZ2, f + 0.0f, f6 + LIZ2);
                matrix.setScale(f3, f3);
                matrix.postTranslate(0.0f, LIZ2);
            }
        } else if (interfaceC78716Uuu == InterfaceC78716Uuu.LJJLIIIJILLIZJL) {
            float f7 = f / width;
            float f8 = f2 / height;
            if (f7 > f8) {
                rectF = new RectF(0.0f, 0.0f, f + 0.0f, f2 + 0.0f);
                matrix.setScale(f7, f7);
                matrix.postTranslate(0.0f, ((f2 - (height * f7)) / 2.0f) + 0.0f);
            } else {
                rectF = new RectF(0.0f, 0.0f, f + 0.0f, f2 + 0.0f);
                matrix.setScale(f8, f8);
                matrix.postTranslate(((f - (width * f8)) / 2.0f) + 0.0f, 0.0f);
            }
        } else {
            rectF = new RectF(0.0f, 0.0f, f, f2);
            matrix.setTranslate(Math.round((f - width) * 0.5f), Math.round((f2 - height) * 0.5f));
        }
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        paint.setFilterBitmap(true);
        canvas.drawRect(rectF, paint);
        return LJI;
    }

    @Override // X.AbstractC78749UvR, X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        Bitmap.Config config = bitmap.getConfig();
        int i = this.LIZ;
        int i2 = this.LIZIZ;
        if (config == null) {
            config = AbstractC78749UvR.FALLBACK_BITMAP_CONFIGURATION;
        }
        C81392Vwy<Bitmap> LJ = abstractC78853Ux7.LJ(i, i2, config);
        try {
            if (this.LIZ == 0 || this.LIZIZ == 0 || (this.LJIIIZ == 0 && this.LJIIIIZZ == 0 && this.LJIIJ == 0)) {
                process(LJ.LJI(), bitmap);
                return C81392Vwy.LIZJ(LJ);
            }
            Bitmap LIZIZ = LIZIZ(bitmap, abstractC78853Ux7);
            Canvas canvas = new Canvas(LJ.LJI());
            if (this.LJIIIIZZ != 0) {
                Paint paint = new Paint();
                paint.setFlags(3);
                paint.setColorFilter(new PorterDuffColorFilter(this.LJIIIIZZ, PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(LIZIZ, this.LJI, this.LJII, paint);
            }
            if (this.LJIIIZ != 0) {
                NativeBlurFilter.iterativeBoxBlur(LJ.LJI(), 3, this.LJIIIZ);
            }
            canvas.drawBitmap(LIZIZ, 0.0f, 0.0f, (Paint) null);
            if (this.LJIIJ != 0) {
                NativeBlurFilter.iterativeBoxBlur(LJ.LJI(), 3, this.LJIIJ);
            }
            return C81392Vwy.LIZJ(LJ);
        } finally {
            C81392Vwy.LJ(LJ);
        }
    }

    public C78748UvQ(int i, int i2, int i3, int i4, int i5, int i6, InterfaceC78716Uuu interfaceC78716Uuu, int i7, int i8, int i9, int i10, int i11) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LJFF = i4;
        this.LIZLLL = i5;
        this.LJ = i6;
        this.LJIIJJI = interfaceC78716Uuu;
        this.LJI = i7;
        this.LJII = i8;
        this.LJIIIIZZ = i9;
        this.LJIIIZ = i10;
        this.LJIIJ = i11;
    }
}
