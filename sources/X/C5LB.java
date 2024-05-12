package X;

import android.graphics.BitmapFactory;

/* renamed from: X.5LB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LB {
    public static int[] LIZ(String str) {
        if (!C44687HgJ.LIZIZ(str)) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }
}
