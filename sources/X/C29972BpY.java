package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.BpY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29972BpY {
    public static Bitmap LIZ(Bitmap bitmap, int i) {
        o.LJIIIZ(bitmap, "bitmap");
        Bitmap result = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(result);
        Paint LIZIZ = C6D8.LIZIZ(true);
        Rect rect = new Rect(0, 0, i, i);
        RectF rectF = new RectF(rect);
        float f = i / 2;
        canvas.drawARGB(0, 0, 0, 0);
        LIZIZ.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, LIZIZ);
        LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (Rect) null, rect, LIZIZ);
        LIZIZ.setColor(ColorProtector.parseColor("#ffffff"));
        LIZIZ.setStyle(Paint.Style.STROKE);
        LIZIZ.setStrokeWidth(C15380j0.LIZ(1.3f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, LIZIZ);
        o.LJIIIIZZ(result, "result");
        return result;
    }
}
