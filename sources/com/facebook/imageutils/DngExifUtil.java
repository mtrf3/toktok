package com.facebook.imageutils;

import X.C16880lQ;
import X.W58;
import android.media.ExifInterface;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class DngExifUtil {
    public static final String LIZ = C16880lQ.LJLLJ(DngExifUtil.class);

    /* loaded from: classes15.dex */
    public static class DngExifUtilAndroidN {
        public static int getOrientation(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                String str = DngExifUtil.LIZ;
                if (W58.LIZ.LJIIIIZZ(3)) {
                    W58.LIZ.d(str, "Failed reading Dng Exif orientation -> ignoring", e);
                    return 0;
                }
                return 0;
            }
        }
    }

    public static int LIZ(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return DngExifUtilAndroidN.getOrientation(inputStream);
        }
        W58.LIZJ(LIZ, "Trying to read Dng Exif information before Android N -> ignoring");
        return 0;
    }
}
