package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aWr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93809aWr {
    public final String LIZ;
    public final EnumC93808aWq LIZIZ;

    public static Bitmap LIZ(Bitmap bitmap) {
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            LJI.LIZ(C94654akU.LJLIL);
        }
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = bitmap.getWidth();
        if (min <= width) {
            width = min;
        }
        int height = bitmap.getHeight();
        if (min > height) {
            min = height;
        }
        return Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width) / 2, (bitmap.getHeight() - min) / 2, width, min);
    }

    public static Bitmap LIZIZ(Bitmap bitmap) {
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            LJI.LIZ(C94655akV.LJLIL);
        }
        List<Integer> list = C93811aWt.LIZ;
        int intValue = ((Number) ListProtector.get(list, V0Q.Default.nextInt(0, list.size()))).intValue();
        Paint paint = new Paint();
        paint.setColor(intValue);
        int i = (int) 162.5f;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, bitmap.getConfig());
        float max = (115.0f / Math.max(bitmap.getWidth(), bitmap.getHeight())) * 1.0f;
        Matrix matrix = new Matrix();
        float f = 2;
        matrix.postScale(max, max, 0.0f, 0.0f);
        matrix.postTranslate(((162.0f - (bitmap.getWidth() * max)) * 1.0f) / f, ((162.0f - (bitmap.getHeight() * max)) * 1.0f) / f);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRect(0.0f, 0.0f, 162.0f, 162.0f, paint);
        canvas.drawBitmap(bitmap, matrix, paint);
        return createBitmap;
    }

    public static boolean LIZJ(Bitmap bitmap) {
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return false;
        }
        int i = (int) 4278190080L;
        if ((bitmap.getPixel(0, 0) & i) != 0 && (bitmap.getPixel(bitmap.getWidth() - 1, 0) & i) != 0 && (bitmap.getPixel(0, bitmap.getHeight() - 1) & i) != 0 && (bitmap.getPixel(bitmap.getWidth() - 1, bitmap.getHeight() - 1) & i) != 0 && (bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) & i) != 0) {
            return false;
        }
        return true;
    }

    public C93809aWr(String str, EnumC93808aWq iconStrategy) {
        o.LJIIIZ(iconStrategy, "iconStrategy");
        this.LIZ = str;
        this.LIZIZ = iconStrategy;
    }
}
