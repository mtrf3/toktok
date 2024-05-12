package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H6W {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(Context context, android.net.Uri uri) {
        InputStream inputStream;
        o.LJIIIZ(context, "context");
        InputStream inputStream2 = null;
        try {
            if (!C268613q.LJIIJJI(context, uri)) {
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            inputStream = C268513p.LIZLLL(context, uri);
            try {
                BitmapFactory.decodeStream(inputStream, null, options);
                inputStream.close();
                int i = options.outWidth;
                int i2 = options.outHeight;
                int i3 = 1;
                while (true) {
                    if (i / 2 >= 1080 || i2 / 2 >= 1080) {
                        i /= 2;
                        i2 /= 2;
                        i3 *= 2;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i3;
                        options2.inPurgeable = true;
                        options2.inPreferredConfig = Bitmap.Config.RGB_565;
                        inputStream = C268513p.LIZLLL(context, uri);
                        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options2);
                        inputStream.close();
                        return decodeStream;
                    }
                }
            } catch (Exception unused) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception unused4) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
