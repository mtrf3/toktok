package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.6DU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DU {
    public static void LIZ(C1547965r view, int i, int i2, int i3, int i4) {
        o.LJIIIZ(view, "view");
        C6DV c6dv = new C6DV();
        c6dv.LJI[0] = i;
        c6dv.LIZIZ = i2;
        c6dv.LIZJ = i3;
        c6dv.LIZLLL = i4;
        c6dv.LJ = 0;
        c6dv.LJFF = 0;
        final int i5 = c6dv.LIZ;
        final int[] iArr = c6dv.LJI;
        final int i6 = c6dv.LIZIZ;
        final int i7 = c6dv.LIZJ;
        final int i8 = c6dv.LIZLLL;
        final int i9 = c6dv.LJ;
        final int i10 = c6dv.LJFF;
        Drawable drawable = new Drawable(i5, iArr, i6, i7, i8, i9, i10) { // from class: X.5Ju
            public static final /* synthetic */ int LJIIIZ = 0;
            public final int LIZ;
            public final int[] LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public final int LJ;
            public final int LJFF;
            public final Paint LJI;
            public final Paint LJII;
            public RectF LJIIIIZZ;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                o.LJIIIZ(canvas, "canvas");
                int[] iArr2 = this.LIZIZ;
                if (iArr2 != null) {
                    if (iArr2.length == 1) {
                        this.LJII.setColor(iArr2[0]);
                    } else {
                        Paint paint = this.LJII;
                        RectF rectF = this.LJIIIIZZ;
                        o.LJI(rectF);
                        float f = rectF.left;
                        RectF rectF2 = this.LJIIIIZZ;
                        o.LJI(rectF2);
                        float f2 = 2;
                        float height = rectF2.height() / f2;
                        RectF rectF3 = this.LJIIIIZZ;
                        o.LJI(rectF3);
                        float f3 = rectF3.right;
                        RectF rectF4 = this.LJIIIIZZ;
                        o.LJI(rectF4);
                        paint.setShader(new LinearGradient(f, height, f3, rectF4.height() / f2, this.LIZIZ, (float[]) null, Shader.TileMode.CLAMP));
                    }
                }
                if (this.LIZ == 1) {
                    RectF rectF5 = this.LJIIIIZZ;
                    o.LJI(rectF5);
                    int i11 = this.LIZJ;
                    canvas.drawRoundRect(rectF5, i11, i11, this.LJI);
                    RectF rectF6 = this.LJIIIIZZ;
                    o.LJI(rectF6);
                    int i12 = this.LIZJ;
                    canvas.drawRoundRect(rectF6, i12, i12, this.LJII);
                    return;
                }
                RectF rectF7 = this.LJIIIIZZ;
                o.LJI(rectF7);
                float centerX = rectF7.centerX();
                RectF rectF8 = this.LJIIIIZZ;
                o.LJI(rectF8);
                float centerY = rectF8.centerY();
                RectF rectF9 = this.LJIIIIZZ;
                o.LJI(rectF9);
                float width = rectF9.width();
                RectF rectF10 = this.LJIIIIZZ;
                o.LJI(rectF10);
                float f4 = 2;
                canvas.drawCircle(centerX, centerY, Math.min(width, rectF10.height()) / f4, this.LJI);
                RectF rectF11 = this.LJIIIIZZ;
                o.LJI(rectF11);
                float centerX2 = rectF11.centerX();
                RectF rectF12 = this.LJIIIIZZ;
                o.LJI(rectF12);
                float centerY2 = rectF12.centerY();
                RectF rectF13 = this.LJIIIIZZ;
                o.LJI(rectF13);
                float width2 = rectF13.width();
                RectF rectF14 = this.LJIIIIZZ;
                o.LJI(rectF14);
                canvas.drawCircle(centerX2, centerY2, Math.min(width2, rectF14.height()) / f4, this.LJII);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i11) {
                this.LJI.setAlpha(i11);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJI.setColorFilter(colorFilter);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setBounds(int i11, int i12, int i13, int i14) {
                super.setBounds(i11, i12, i13, i14);
                int i15 = this.LIZLLL;
                int i16 = this.LJ;
                int i17 = this.LJFF;
                this.LJIIIIZZ = new RectF((i11 + i15) - i16, (i12 + i15) - i17, (i13 - i15) - i16, (i14 - i15) - i17);
            }

            {
                this.LIZ = i5;
                this.LIZIZ = iArr;
                this.LIZJ = i6;
                this.LIZLLL = i8;
                this.LJ = i9;
                this.LJFF = i10;
                Paint paint = new Paint();
                this.LJI = paint;
                paint.setColor(0);
                paint.setAntiAlias(true);
                paint.setShadowLayer(i8, i9, i10, i7);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                Paint paint2 = new Paint();
                this.LJII = paint2;
                paint2.setAntiAlias(true);
            }
        };
        view.setLayerType(1, null);
        C16300kU.LJIILLIIL(view, drawable);
    }
}
