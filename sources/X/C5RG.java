package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* renamed from: X.5RG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RG {
    public int LIZ = -1;

    public final Bitmap LIZ(Context context, Bitmap bitmap, float f, float f2, float f3) {
        boolean z;
        boolean z2;
        int i;
        Bitmap createBitmap;
        float f4;
        float f5;
        o.LJIIIZ(context, "context");
        if (!bitmap.isRecycled()) {
            float f6 = 0.0f;
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (f2 == 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    float f7 = f * f2 * 4;
                    try {
                        i = this.LIZ;
                        if (i == -1) {
                            Point point = new Point();
                            Object LLILL = C16880lQ.LLILL(context, "window");
                            o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
                            ((WindowManager) LLILL).getDefaultDisplay().getRealSize(point);
                            i = point.y * point.x * 6;
                            this.LIZ = i;
                        }
                    } catch (Exception unused) {
                        i = Integer.MAX_VALUE;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("dest size destBitmapSize = ");
                    LIZ.append(f7);
                    LIZ.append(",maxSize=");
                    LIZ.append(i);
                    String message = X1D.LIZIZ(LIZ);
                    o.LJIIIZ(message, "message");
                    if (f7 > i) {
                        int sqrt = ((int) Math.sqrt(i / 4.0d)) - 1;
                        createBitmap = Bitmap.createBitmap(sqrt, sqrt, Bitmap.Config.ARGB_8888);
                        o.LJIIIIZZ(createBitmap, "{\n            val maxWid…nfig.ARGB_8888)\n        }");
                    } else {
                        createBitmap = Bitmap.createBitmap((int) f, (int) f2, Bitmap.Config.ARGB_8888);
                        o.LJIIIIZZ(createBitmap, "{\n            Bitmap.cre…nfig.ARGB_8888)\n        }");
                    }
                    Matrix matrix = new Matrix();
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    if (width * f2 > f * height) {
                        f5 = f2 / height;
                        f6 = (f - (width * f5)) * 0.5f;
                        f4 = 0.0f;
                    } else {
                        float f8 = f / width;
                        f4 = (f2 - (height * f8)) * 0.5f;
                        f5 = f8;
                    }
                    matrix.setScale(f5, f5);
                    matrix.postTranslate(O6R.LJJIIZ(f6), O6R.LJJIIZ(f4));
                    RectF rectF = new RectF(new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()));
                    canvas.drawColor(0);
                    paint.setColor(-16777216);
                    canvas.drawRoundRect(rectF, f3, f3, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, matrix, paint);
                    return createBitmap;
                }
            }
        }
        return bitmap;
    }
}
