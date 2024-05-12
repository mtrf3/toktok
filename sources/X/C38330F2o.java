package X;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* renamed from: X.F2o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38330F2o {
    public static String LIZ(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                for (byte b : bArr) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() < 2) {
                        sb.append(0);
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String LIZIZ(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray.length > 0) {
                        messageDigest.update(byteArray, 0, byteArray.length);
                    }
                    byteArrayOutputStream.close();
                    return LIZ(messageDigest.digest());
                } finally {
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String LIZJ(String str) {
        if (str.length() <= 0) {
            return null;
        }
        try {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    for (int read = fileInputStream.read(bArr, 0, 1024); read > 0; read = fileInputStream.read(bArr, 0, 1024)) {
                        messageDigest.update(bArr, 0, read);
                    }
                    fileInputStream.close();
                    return LIZ(messageDigest.digest());
                } finally {
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
