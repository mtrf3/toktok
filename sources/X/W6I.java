package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class W6I {
    public static final C43051mX<ByteBuffer> LIZ = new C43051mX<>(12);

    public static C79023Uzr LIZ(InputStream inputStream) {
        inputStream.getClass();
        C43051mX<ByteBuffer> c43051mX = LIZ;
        ByteBuffer LIZIZ = c43051mX.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = LIZIZ.array();
            ColorSpace colorSpace = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (Build.VERSION.SDK_INT >= 26) {
                colorSpace = options.outColorSpace;
            }
            C79023Uzr c79023Uzr = new C79023Uzr(options.outWidth, options.outHeight, colorSpace);
            c43051mX.LIZ(LIZIZ);
            return c79023Uzr;
        } catch (Throwable th) {
            LIZ.LIZ(LIZIZ);
            throw th;
        }
    }

    public static int LIZIZ(Bitmap.Config config) {
        int i = C84Q.LIZ[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        if (i == 5) {
            return 8;
        }
        throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    public static int LIZJ(Bitmap bitmap) {
        if (bitmap == 0) {
            return 0;
        }
        try {
            bitmap = bitmap.getAllocationByteCount();
            return bitmap;
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
