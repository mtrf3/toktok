package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.MlD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57731MlD {
    public static GradientDrawable LIZ(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = (int) (bitmap.getHeight() * 0.1d);
        if (height < 1) {
            height = 1;
        }
        Integer valueOf = Integer.valueOf(LIZIZ(bitmap, new Rect(0, 0, width, height)));
        int height2 = bitmap.getHeight();
        int height3 = (int) (bitmap.getHeight() * 0.1d);
        if (height3 < 1) {
            height3 = 1;
        }
        OSZ osz = new OSZ(valueOf, Integer.valueOf(LIZIZ(bitmap, new Rect(0, height2 - height3, bitmap.getWidth(), bitmap.getHeight()))));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue()});
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    public static int LIZIZ(Bitmap bitmap, Rect rect) {
        System.nanoTime();
        C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(new C23220ve(bitmap, rect));
        int[] LIZ2 = LIZ.LIZ();
        int[] LIZIZ = LIZ.LIZIZ();
        if (LIZ2.length == 0) {
            LIZ2 = new int[]{0};
            LIZIZ = new int[]{0};
        }
        int i = LIZIZ[0];
        ArrayList arrayList = new ArrayList(LIZ2.length);
        int length = LIZ2.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new OSZ(Integer.valueOf(LIZ2[i2]), Integer.valueOf(LIZIZ[i3])));
            i2++;
            i3++;
        }
        int LJJLIIIJL = ORY.LJJLIIIJL(LIZIZ);
        int[] iArr = new int[3];
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            int intValue = ((Number) osz.getFirst()).intValue();
            int intValue2 = ((Number) osz.getSecond()).intValue();
            if (Math.abs(intValue2 - i) / (i * 1.0f) < 0.1f || i4 / LJJLIIIJL < 0.65f) {
                iArr[0] = (((intValue >> 16) & 255) * intValue2) + iArr[0];
                iArr[1] = (((intValue >> 8) & 255) * intValue2) + iArr[1];
                iArr[2] = ((intValue & 255) * intValue2) + iArr[2];
                i4 += intValue2;
            }
        }
        float[] fArr = new float[3];
        ColorProtector.RGBToHSV(iArr[0] / i4, iArr[1] / i4, iArr[2] / i4, fArr);
        float f = fArr[2];
        if (0.0f <= f && f <= 0.5f) {
            f += 0.1f;
        }
        return Color.HSVToColor(new float[]{fArr[0], fArr[1], f});
    }
}
