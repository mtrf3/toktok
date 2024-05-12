package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142645im {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(Bitmap bitmap, Bitmap bitmap2, C142655in c142655in) {
        ArrayList arrayList = new ArrayList();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-16777216);
        paint.setStrokeWidth(bitmap.getWidth() * 0.0053f);
        float width = H7I.LIZ * bitmap.getWidth();
        float f = width / 0.75f;
        float width2 = bitmap.getWidth() * 0.042666666f;
        Bitmap createBitmap = Bitmap.createBitmap((int) width, (int) f, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f2 = width * 0.15f;
        canvas.drawRoundRect(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight(), f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap2, (Rect) null, new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), paint);
        if (c142655in.LIZ) {
            paint.setStyle(Paint.Style.FILL);
            paint.setXfermode(null);
            Bitmap ltrOuter = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(ltrOuter);
            RectF rectF = new RectF(width2, width2, width2 + width, width2 + f);
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas2.drawBitmap(createBitmap, (Rect) null, rectF, paint);
            paint.setStyle(Paint.Style.STROKE);
            canvas2.drawRoundRect(rectF, f2, f2, paint);
            o.LJIIIIZZ(ltrOuter, "ltrOuter");
            arrayList.add(ltrOuter);
        }
        if (c142655in.LIZIZ) {
            paint.setXfermode(null);
            paint.setStyle(Paint.Style.FILL);
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas3 = new Canvas(createBitmap2);
            RectF rectF2 = new RectF((createBitmap2.getWidth() - width2) - width, width2, createBitmap2.getWidth() - width2, f + width2);
            canvas3.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas3.drawBitmap(createBitmap, (Rect) null, rectF2, paint);
            paint.setStyle(Paint.Style.STROKE);
            canvas3.drawRoundRect(rectF2, f2, f2, paint);
            arrayList.add(createBitmap2);
        }
        return arrayList;
    }
}
