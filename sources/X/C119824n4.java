package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.4n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119824n4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(int i, Bitmap bitmap) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-16777216);
            float f = i;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), f, f, paint);
            canvas.drawRect(new Rect(width - i, 0, width, i), paint);
            canvas.drawRect(new Rect(0, height - i, i, height), paint);
            canvas.drawRect(new Rect(width - i, height - i, width, height), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            Rect rect = new Rect(0, 0, width, height);
            canvas.drawBitmap(bitmap, rect, rect, paint);
            o.LJIIIIZZ(createBitmap, "{\n            val width …  paintingBoard\n        }");
            return createBitmap;
        } catch (Exception unused) {
            return bitmap;
        }
    }
}
