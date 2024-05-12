package com.facebook.imageutils;

import X.W58;
import android.media.ExifInterface;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class HeifExifUtil {

    /* loaded from: classes15.dex */
    public static class HeifExifUtilAndroidN {
        public static int getOrientation(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                if (W58.LIZ.LJIIIIZZ(3)) {
                    W58.LIZ.d("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e);
                    return 0;
                }
                return 0;
            }
        }
    }

    public static int LIZ(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.getOrientation(inputStream);
        }
        W58.LIZJ("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
