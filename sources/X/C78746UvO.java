package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.UvO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78746UvO extends AbstractC78749UvR {
    public final /* synthetic */ OPW LIZ;
    public final /* synthetic */ boolean LIZIZ;

    public C78746UvO(OPW opw, boolean z) {
        this.LIZ = opw;
        this.LIZIZ = z;
    }

    @Override // X.AbstractC78749UvR, X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap sourceBitmap, AbstractC78853Ux7 bitmapFactory) {
        float f;
        o.LJIIIZ(sourceBitmap, "sourceBitmap");
        o.LJIIIZ(bitmapFactory, "bitmapFactory");
        int i = this.LIZ.LJLJLJ;
        C81392Vwy<Bitmap> LIZIZ = bitmapFactory.LIZIZ(i, i);
        try {
            Canvas canvas = new Canvas(LIZIZ.LJI());
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            int i2 = this.LIZ.LJLJLJ;
            RectF rectF = new RectF(new Rect(0, 0, i2, i2));
            Path path = new Path();
            this.LIZ.getClass();
            path.addArc(rectF, 0.0f, 360.0f);
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawPath(path, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            float width = this.LIZ.LJLJLJ / sourceBitmap.getWidth();
            float height = this.LIZ.LJLJLJ / sourceBitmap.getHeight();
            if (width < height) {
                width = height;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(width, width);
            canvas.drawBitmap(sourceBitmap, matrix, paint);
            if (this.LIZIZ) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                float width2 = r5.width() / 2.0f;
                Context context = this.LIZ.getContext();
                o.LJIIIIZZ(context, "context");
                if (C26338AVi.LIZJ(context)) {
                    f = r5.width() + this.LIZ.LJLJLLL;
                } else {
                    f = -this.LIZ.LJLJLLL;
                }
                canvas.drawCircle(f, width2, width2, paint);
            }
            C81392Vwy<Bitmap> LIZJ = C81392Vwy.LIZJ(LIZIZ);
            if (LIZJ == null) {
                int i3 = this.LIZ.LJLJLJ;
                LIZJ = bitmapFactory.LIZIZ(i3, i3);
                o.LJIIIIZZ(LIZJ, "bitmapFactory.createBitmap(avatarSize, avatarSize)");
            }
            return LIZJ;
        } finally {
            C81392Vwy.LJ(LIZIZ);
        }
    }
}
