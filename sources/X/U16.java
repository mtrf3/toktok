package X;

import android.graphics.Bitmap;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class U16 {
    public static final U16 LIZ = new U16();
    public static final HashMap<String, Bitmap> LIZIZ = new HashMap<>();
    public static final String LIZJ = "lottie_";

    public static Bitmap LIZ(String str) {
        Bitmap bitmap = LIZIZ.get(LIZJ(str));
        if (bitmap != null) {
            return bitmap.copy(Bitmap.Config.ARGB_8888, false);
        }
        return null;
    }

    public static String LIZJ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        return JBR.LJFF(LIZ2, LIZJ, str, LIZ2);
    }

    public final synchronized boolean LIZIZ(String str) {
        boolean z;
        Bitmap bitmap;
        HashMap<String, Bitmap> hashMap = LIZIZ;
        z = false;
        if (hashMap.containsKey(LIZJ(str)) && (bitmap = hashMap.get(LIZJ(str))) != null) {
            if (!bitmap.isRecycled()) {
                z = true;
            }
        }
        return z;
    }
}
