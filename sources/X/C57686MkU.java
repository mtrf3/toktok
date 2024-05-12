package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.MkU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57686MkU {
    public static final C57686MkU LIZ = new C57686MkU();
    public static final int[] LIZIZ = {Color.rgb(33, 33, 33), -16777216};
    public static final ConcurrentHashMap<String, int[]> LIZJ = new ConcurrentHashMap<>();

    public static void LIZ(float[] fArr) {
        boolean z;
        if (fArr.length != 3) {
            return;
        }
        float f = fArr[0];
        if (0.0f <= f && f <= 20.0f) {
            f = 20.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        float f3 = 0.4f;
        if (0.0f <= f2 && f2 <= 0.4f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = 0.4f;
        } else if ((0.4f > f2 || f2 > 0.9f) && 0.9f <= f2 && f2 <= 1.0f) {
            f2 = 0.9f;
        }
        fArr[1] = f2;
        float f4 = fArr[2];
        if (0.0f > f4 || f4 > 0.4f) {
            if ((0.4f <= f4 && f4 <= 0.7f) || 0.7f > f4 || f4 > 1.0f) {
                f3 = f4;
            } else {
                f3 = 0.7f;
            }
        }
        fArr[2] = f3;
        if (50.0f <= f && f <= 90.0f) {
            fArr[2] = Math.min(f3, 0.6f);
        }
    }

    public static int LIZIZ(Bitmap bitmap, Rect rect, Object obj) {
        C81154Vt8 LIZ2 = FlyMainColor.LIZ.LIZ(new C23220ve(bitmap, rect));
        int[] LIZ3 = LIZ2.LIZ();
        int[] LIZIZ2 = LIZ2.LIZIZ();
        if (LIZ3.length == 0) {
            LIZ3 = new int[]{0};
            LIZIZ2 = new int[]{0};
        }
        int i = LIZIZ2[0];
        ArrayList arrayList = new ArrayList(LIZ3.length);
        int length = LIZ3.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new OSZ(Integer.valueOf(LIZ3[i2]), Integer.valueOf(LIZIZ2[i3])));
            i2++;
            i3++;
        }
        int LJJLIIIJL = ORY.LJJLIIIJL(LIZIZ2);
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
        int i5 = iArr[0] / i4;
        int i6 = iArr[1] / i4;
        int i7 = iArr[2] / i4;
        int[] iArr2 = {i5, i6, i7};
        C221018lt.LIZ("TTRecImageUrlToBackgroundManager", "tag = " + obj + " Fetch color = " + V1M.LJJJLIIL(Color.rgb(i5, i6, i7)));
        return Color.rgb(iArr2[0], iArr2[1], iArr2[2]);
    }
}
