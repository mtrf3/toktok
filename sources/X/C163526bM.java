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
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.6bM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163526bM {
    public static void LIZ(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        o.LJIIIZ(view, "view");
        C163536bN c163536bN = new C163536bN();
        c163536bN.LJI[0] = i;
        c163536bN.LIZIZ = i2;
        c163536bN.LIZJ = i3;
        c163536bN.LIZLLL = i4;
        c163536bN.LJ = i5;
        c163536bN.LJFF = i6;
        final int i7 = c163536bN.LIZ;
        final int[] iArr = c163536bN.LJI;
        final int i8 = c163536bN.LIZIZ;
        final int i9 = c163536bN.LIZJ;
        final int i10 = c163536bN.LIZLLL;
        final int i11 = c163536bN.LJ;
        final int i12 = c163536bN.LJFF;
        Drawable drawable = new Drawable(i7, iArr, i8, i9, i10, i11, i12) { // from class: X.5Jv
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
                    int i13 = this.LIZJ;
                    canvas.drawRoundRect(rectF5, i13, i13, this.LJI);
                    RectF rectF6 = this.LJIIIIZZ;
                    o.LJI(rectF6);
                    int i14 = this.LIZJ;
                    canvas.drawRoundRect(rectF6, i14, i14, this.LJII);
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
            public final void setAlpha(int i13) {
                this.LJI.setAlpha(i13);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJI.setColorFilter(colorFilter);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setBounds(int i13, int i14, int i15, int i16) {
                super.setBounds(i13, i14, i15, i16);
                int i17 = this.LIZLLL;
                int i18 = this.LJ;
                int i19 = this.LJFF;
                this.LJIIIIZZ = new RectF((i13 + i17) - i18, (i14 + i17) - i19, (i15 - i17) - i18, (i16 - i17) - i19);
            }

            {
                this.LIZ = i7;
                this.LIZIZ = iArr;
                this.LIZJ = i8;
                this.LIZLLL = i10;
                this.LJ = i11;
                this.LJFF = i12;
                Paint paint = new Paint();
                this.LJI = paint;
                paint.setColor(0);
                paint.setAntiAlias(true);
                paint.setShadowLayer(i10, i11, i12, i9);
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
