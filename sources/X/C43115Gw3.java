package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.BitmapUtils;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Gw3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43115Gw3 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("feedback");
        LIZ2.append(File.separator);
        LIZ2.append("upload");
        File LJIIJ = C39579Fg7.LJIIJ(X1D.LIZIZ(LIZ2));
        if (LJIIJ != null) {
            String path = LJIIJ.getPath();
            o.LJIIIIZZ(path, "file.path");
            return path;
        }
        return "";
    }

    public static void LIZJ(int i) {
        if (i > 0) {
            C39579Fg7.LJIJJLI(LIZ());
        }
    }

    public static String LIZIZ(String fileName, File file, int i) {
        o.LJIIIZ(fileName, "fileName");
        int min = Math.min(i, 720);
        if (min > 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i2 = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(fileName, options);
                int i3 = options.outWidth;
                if (i3 > min) {
                    int i4 = options.outHeight;
                    int i5 = (i4 * min) / i3;
                    if (i5 != 0 && (i3 > min || i4 > i5)) {
                        int i6 = i3 >> 1;
                        int i7 = i4 >> 1;
                        while (i6 / i2 > min && i7 / i2 > i5) {
                            i2 <<= 1;
                        }
                    }
                    options.inSampleSize = i2;
                    options.inJustDecodeBounds = false;
                    Bitmap decodeFile = BitmapFactory.decodeFile(fileName, options);
                    o.LJIIIIZZ(decodeFile, "decodeFile(fileName, option)");
                    Bitmap rotateBitmap = BitmapUtils.rotateBitmap(decodeFile, BitmapUtils.readPictureDegree(fileName));
                    o.LJIIIIZZ(rotateBitmap, "rotateBitmap(resizeBitmap, degree)");
                    String LIZ2 = LIZ();
                    if (BitmapUtils.saveBitmapToSD(rotateBitmap, LIZ2, file.getName())) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LIZ2);
                        LIZ3.append(File.separator);
                        LIZ3.append(file.getName());
                        fileName = X1D.LIZIZ(LIZ3);
                    }
                    rotateBitmap.recycle();
                }
            } catch (Throwable unused) {
            }
        }
        return fileName;
    }
}
