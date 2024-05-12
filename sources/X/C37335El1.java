package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.HashMap;

/* renamed from: X.El1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37335El1 {
    public static final HashMap<String, Boolean> LIZ = new HashMap<>();
    public static final HashMap<String, OSZ<Integer, Integer>> LIZIZ = new HashMap<>();
    public static final HashMap<String, OSZ<Integer, Integer>> LIZJ = new HashMap<>();
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C37337El3.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C37338El4.LJLIL);
    public static final C37336El2 LJFF = new C37336El2();

    public static Context LIZIZ() {
        return (Context) LIZLLL.getValue();
    }

    public static Bitmap LIZ(int i, int i2, Bitmap bitmap) {
        int i3;
        int i4;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        float f4 = i / i2;
        int i5 = 0;
        if (f3 == f4) {
            return bitmap;
        }
        if (f3 > f4) {
            int i6 = (int) (f2 * f4);
            i5 = (width - i6) / 2;
            width = i6;
            i3 = height;
            i4 = 0;
        } else {
            i3 = (int) (f / f4);
            i4 = (height - i3) / 2;
        }
        return Bitmap.createBitmap(bitmap, i5, i4, width, i3);
    }

    public static void LIZJ(long j, Bitmap bitmap, String str) {
        Bitmap copy;
        try {
            Bitmap LIZ2 = LIZ(C60996Nwm.LJIIJ(LIZIZ()), C60996Nwm.LJFF(LIZIZ()), bitmap);
            if (LIZ2 != null && (copy = LIZ2.copy(Bitmap.Config.ARGB_8888, true)) != null) {
                ((C80932VpY) LJ.getValue()).process(copy);
                C37336El2 c37336El2 = LJFF;
                synchronized (c37336El2) {
                    c37336El2.put(str, copy);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                LIZ3.append(" cost:(");
                LIZ3.append(System.currentTimeMillis() - j);
                LIZ3.append(')');
                H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ3));
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }
}
