package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.HlL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44999HlL {
    public static Bitmap LIZ(Bitmap bitmap) {
        EnumC45000HlM enumC45000HlM;
        Rect rect;
        try {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
            Point point = new Point(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            if (bitmap.getWidth() > bitmap.getHeight()) {
                enumC45000HlM = EnumC45000HlM.HORIZONTAL;
            } else {
                enumC45000HlM = EnumC45000HlM.VERTICAL;
            }
            int i = min * 2;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(new Rect(0, 0, i, i));
            float min2 = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (enumC45000HlM == EnumC45000HlM.HORIZONTAL) {
                int i2 = point.x;
                rect = new Rect(i2 - min, 0, i2 + min, i);
            } else {
                int i3 = point.y;
                rect = new Rect(0, i3 - min, i, i3 + min);
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return createBitmap;
        } catch (Exception unused) {
            return bitmap;
        } catch (OutOfMemoryError unused2) {
            return null;
        }
    }
}
