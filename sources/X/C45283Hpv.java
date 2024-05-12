package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.ByteArrayOutputStream;

/* renamed from: X.Hpv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45283Hpv {
    public static int LIZ = 0;
    public static long LIZIZ = 0;

    public static byte[] LIZ(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap LIZJ(int i, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int byteCount = bitmap2.getByteCount();
        LIZ++;
        if (i < byteCount) {
            float sqrt = (float) Math.sqrt((i + LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) / byteCount);
            if (LIZ > 10 || LIZIZ > 52428800) {
                sqrt *= 0.99f;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(sqrt, sqrt);
            bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            LIZIZ += bitmap2.getByteCount();
            if (bitmap2.getByteCount() > i) {
                return LIZJ(i - 2, bitmap2);
            }
        }
        LIZIZ = 0L;
        LIZ = 0;
        return bitmap2;
    }

    public static Bitmap LJ(float f, Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap LIZIZ(byte[] bArr, int i, int i2, float f) {
        new BitmapFactory.Options().inJustDecodeBounds = true;
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return LJ(f, BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options));
    }

    public static Bitmap LIZLLL(Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (i + i3 > bitmap.getWidth()) {
            StringBuilder LIZJ = C06460Ne.LIZJ("startX + width > originBitmap.getWidth() startX is ", i, " startY is ", i2, " width is ");
            C15890jp.LIZIZ(LIZJ, i3, " height is ", i4, " image.width is ");
            LIZJ.append(bitmap.getWidth());
            LIZJ.append(" image.height is ");
            LIZJ.append(bitmap.getHeight());
            X1D.LIZIZ(LIZJ);
            return null;
        }
        if (i2 + i4 > bitmap.getHeight()) {
            StringBuilder LIZJ2 = C06460Ne.LIZJ("startY + height > originBitmap.getHeight() startX is ", i, " startY is ", i2, " width is ");
            C15890jp.LIZIZ(LIZJ2, i3, " height is ", i4, " image.width is ");
            LIZJ2.append(bitmap.getWidth());
            LIZJ2.append(" image.height is ");
            LIZJ2.append(bitmap.getHeight());
            X1D.LIZIZ(LIZJ2);
            return null;
        }
        if (i < 0) {
            StringBuilder LIZJ3 = C06460Ne.LIZJ("startX < 0 startX is ", i, " startY is ", i2, " width is ");
            C15890jp.LIZIZ(LIZJ3, i3, " height is ", i4, " image.width is ");
            LIZJ3.append(bitmap.getWidth());
            LIZJ3.append(" image.height is ");
            LIZJ3.append(bitmap.getHeight());
            X1D.LIZIZ(LIZJ3);
            return null;
        }
        if (i2 < 0) {
            StringBuilder LIZJ4 = C06460Ne.LIZJ("startY < 0 startX is ", i, " startY is ", i2, " width is ");
            C15890jp.LIZIZ(LIZJ4, i3, " height is ", i4, " image.width is ");
            LIZJ4.append(bitmap.getWidth());
            LIZJ4.append(" image.height is ");
            LIZJ4.append(bitmap.getHeight());
            X1D.LIZIZ(LIZJ4);
            return null;
        }
        if (i3 < 0) {
            StringBuilder LIZJ5 = C06460Ne.LIZJ("width < 0 startX is ", i, " startY is ", i2, " width is ");
            C15890jp.LIZIZ(LIZJ5, i3, " height is ", i4, " image.width is ");
            LIZJ5.append(bitmap.getWidth());
            LIZJ5.append(" image.height is ");
            LIZJ5.append(bitmap.getHeight());
            X1D.LIZIZ(LIZJ5);
            return null;
        }
        if (i4 < 0) {
            StringBuilder LIZJ6 = C06460Ne.LIZJ("height < 0 startX is ", i, " startY is ", i2, " width is ");
            C15890jp.LIZIZ(LIZJ6, i3, " height is ", i4, " image.width is ");
            LIZJ6.append(bitmap.getWidth());
            LIZJ6.append(" image.height is ");
            LIZJ6.append(bitmap.getHeight());
            X1D.LIZIZ(LIZJ6);
            return null;
        }
        return Bitmap.createBitmap(bitmap, i, i2, i3, i4);
    }
}
