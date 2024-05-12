package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.o;

/* renamed from: X.Gh7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42189Gh7 extends AbstractC41806Gaw<C41682GXm, C41679GXj> {
    @Override // X.AbstractC41806Gaw
    public final Object LIZIZ(Object obj, C41805Gav c41805Gav) {
        C41682GXm c41682GXm = (C41682GXm) obj;
        GZX gzx = c41682GXm.LIZLLL;
        VESize vESize = gzx.LIZ;
        float f = 720;
        int i = (int) ((16.0f * f) / 9);
        OSZ<Float, Float> first = gzx.LIZIZ.getFirst();
        float floatValue = first.getFirst().floatValue();
        float floatValue2 = first.getSecond().floatValue();
        Bitmap targetBitmap = Bitmap.createBitmap(720, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(targetBitmap);
        Paint LIZIZ = C6D8.LIZIZ(true);
        if (c41682GXm.LIZJ != null) {
            float f2 = (floatValue / vESize.width) * f;
            float f3 = i;
            float f4 = (floatValue2 / vESize.height) * f3;
            Rect rect = new Rect(0, 0, c41682GXm.LIZJ.getWidth(), c41682GXm.LIZJ.getHeight());
            float f5 = 2;
            float f6 = (f - (f2 * f5)) + f2;
            float f7 = f4 + (f3 - (f5 * f4));
            Rect rect2 = new Rect((int) f2, (int) f4, (int) f6, (int) f7);
            LIZIZ.setShader(null);
            canvas.drawRoundRect(new RectF(rect2), O6R.LJJIIZ(C32151Nz.LJIIZILJ(new Integer(8))), O6R.LJJIIZ(C32151Nz.LJIIZILJ(new Integer(8))), LIZIZ);
            LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(c41682GXm.LIZJ, rect, rect2, LIZIZ);
            c41682GXm.LIZJ.recycle();
            Bitmap bitmap = c41682GXm.LIZLLL.LIZLLL.LJFF;
            if (bitmap == null || !(!bitmap.isRecycled())) {
                bitmap = BitmapFactory.decodeFile(c41682GXm.LIZLLL.LIZLLL.LIZ);
            }
            LIZIZ.setXfermode(null);
            Matrix matrix = new Matrix();
            float f8 = (f * 1.0f) / vESize.width;
            matrix.setScale(f8, f8);
            if (c41682GXm.LIZLLL.LIZLLL.LIZLLL) {
                f2 = f6 - bitmap.getWidth();
            }
            if (c41682GXm.LIZLLL.LIZLLL.LJ != 1) {
                f7 -= bitmap.getHeight();
            }
            matrix.postTranslate(f2, f7);
            canvas.drawBitmap(bitmap, matrix, LIZIZ);
            bitmap.recycle();
        }
        LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        LIZIZ.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i, c41682GXm.LIZIZ.getStartColor(), c41682GXm.LIZIZ.getEndColor(), Shader.TileMode.CLAMP));
        canvas.drawPaint(LIZIZ);
        o.LJIIIIZZ(targetBitmap, "targetBitmap");
        C44729Hgz.LJJJJLI(targetBitmap, c41682GXm.LIZ, Bitmap.CompressFormat.JPEG, 4);
        return new C41679GXj(targetBitmap, c41682GXm.LIZ);
    }
}
