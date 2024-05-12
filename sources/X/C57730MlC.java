package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.MlC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57730MlC implements InterfaceC139755e7 {
    @Override // X.InterfaceC139755e7
    public final OSZ<Integer, Integer> LIZIZ(Bitmap originBitmap) {
        boolean z;
        boolean z2;
        int i;
        o.LJIIIZ(originBitmap, "originBitmap");
        int i2 = 1;
        if (C52569Kk9.LIZ() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int LIZJ = LIZJ(originBitmap, new Rect(0, 0, originBitmap.getWidth(), originBitmap.getHeight()), new C57732MlE(2.0f, 100.0f, 0.01f, 0.3f, 0.4f, 0.6f, 0.0f));
            int height = (int) (originBitmap.getHeight() * 0.5d);
            if (height < 1) {
                height = 1;
            }
            Rect rect = new Rect(0, height, originBitmap.getWidth(), originBitmap.getHeight());
            FlyMainColor flyMainColor = FlyMainColor.LIZ;
            C81154Vt8 LIZ = flyMainColor.LIZ(new C23220ve(originBitmap, rect));
            LIZ.LJII(100.0f);
            LIZ.LJI(2.0f);
            LIZ.LJFF(0.01f, 0.3f, 0.4f, 0.6f, 0.0f);
            Integer LIZLLL = LIZ.LIZLLL();
            if (LIZLLL != null) {
                i = LIZLLL.intValue();
            } else {
                i = -16777216;
            }
            if (flyMainColor.LIZIZ(LIZJ)[1] >= flyMainColor.LIZIZ(i)[1]) {
                return new OSZ<>(Integer.valueOf(LIZJ), Integer.valueOf(i));
            }
            return new OSZ<>(Integer.valueOf(i), Integer.valueOf(LIZJ));
        }
        if (C52569Kk9.LIZ() == 2) {
            C57732MlE c57732MlE = new C57732MlE(1.0f, 10.0f, 0.001f, 0.1f, 0.5f, 0.6f, 0.0f);
            int width = originBitmap.getWidth();
            int height2 = (int) (originBitmap.getHeight() * 0.5d);
            if (height2 < 1) {
                height2 = 1;
            }
            Integer valueOf = Integer.valueOf(LIZJ(originBitmap, new Rect(0, 0, width, height2), c57732MlE));
            int height3 = (int) (originBitmap.getHeight() * 0.5d);
            if (height3 >= 1) {
                i2 = height3;
            }
            return new OSZ<>(valueOf, Integer.valueOf(LIZJ(originBitmap, new Rect(0, i2, originBitmap.getWidth(), originBitmap.getHeight()), c57732MlE)));
        }
        if (C52569Kk9.LIZ() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C57732MlE c57732MlE2 = new C57732MlE(4.0f, 0.0f, 0.001f, 0.12f, 0.6f, 0.7f, 0.0f);
            int width2 = originBitmap.getWidth();
            int height4 = (int) (originBitmap.getHeight() * 0.05d);
            if (height4 < 1) {
                height4 = 1;
            }
            Integer valueOf2 = Integer.valueOf(LIZJ(originBitmap, new Rect(0, 0, width2, height4), c57732MlE2));
            int height5 = (int) (originBitmap.getHeight() * 0.95d);
            if (height5 >= 1) {
                i2 = height5;
            }
            return new OSZ<>(valueOf2, Integer.valueOf(LIZJ(originBitmap, new Rect(0, i2, originBitmap.getWidth(), originBitmap.getHeight()), c57732MlE2)));
        }
        if (C52569Kk9.LIZ() == 4) {
            C57732MlE c57732MlE3 = new C57732MlE(24.0f, 0.0f, 0.0f, 0.2f, 0.55f, 0.85f, 0.08f);
            int width3 = originBitmap.getWidth();
            int height6 = (int) (originBitmap.getHeight() * 0.05d);
            if (height6 < 1) {
                height6 = 1;
            }
            Integer valueOf3 = Integer.valueOf(LIZJ(originBitmap, new Rect(0, 0, width3, height6), c57732MlE3));
            int height7 = (int) (originBitmap.getHeight() * 0.95d);
            if (height7 >= 1) {
                i2 = height7;
            }
            return new OSZ<>(valueOf3, Integer.valueOf(LIZJ(originBitmap, new Rect(0, i2, originBitmap.getWidth(), originBitmap.getHeight()), c57732MlE3)));
        }
        int width4 = originBitmap.getWidth();
        int height8 = (int) (originBitmap.getHeight() * 0.1d);
        if (height8 < 1) {
            height8 = 1;
        }
        Integer valueOf4 = Integer.valueOf(LIZ(originBitmap, new Rect(0, 0, width4, height8)));
        int height9 = originBitmap.getHeight();
        int height10 = (int) (originBitmap.getHeight() * 0.1d);
        if (height10 >= 1) {
            i2 = height10;
        }
        return new OSZ<>(valueOf4, Integer.valueOf(LIZ(originBitmap, new Rect(0, height9 - i2, originBitmap.getWidth(), originBitmap.getHeight()))));
    }

    public static int LIZ(Bitmap bitmap, Rect rect) {
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

    public static int LIZJ(Bitmap bitmap, Rect rect, C57732MlE c57732MlE) {
        C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(new C23220ve(bitmap, rect));
        LIZ.LJII(c57732MlE.LIZIZ);
        LIZ.LJI(c57732MlE.LIZ);
        LIZ.LJFF(c57732MlE.LIZJ, c57732MlE.LIZLLL, c57732MlE.LJ, c57732MlE.LJFF, c57732MlE.LJI);
        Integer LIZJ = LIZ.LIZJ();
        if (LIZJ != null) {
            return LIZJ.intValue();
        }
        return -16777216;
    }
}
