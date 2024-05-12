package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.aVa, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93730aVa {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i2 = options.outWidth * options.outHeight;
        if (i2 > 262144) {
            i = (int) Math.sqrt(i2 / 262144);
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
    }

    public static boolean LIZIZ(Bitmap bitmap, String desDir, String str) {
        o.LJIIIZ(desDir, "desDir");
        if (desDir.length() != 0 && str != null && str.length() != 0) {
            File file = new File(desDir);
            if (!file.exists()) {
                file.mkdirs();
            }
            BufferedOutputStream bufferedOutputStream = null;
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(desDir, str)));
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream2);
                    bufferedOutputStream2.close();
                    C93733aVd.LIZ(bufferedOutputStream2);
                    return true;
                } catch (Exception unused) {
                    bufferedOutputStream = bufferedOutputStream2;
                    C93733aVd.LIZ(bufferedOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    C93733aVd.LIZ(bufferedOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }
}
