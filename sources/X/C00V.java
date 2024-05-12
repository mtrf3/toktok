package X;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: X.00V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00V {
    public final Context LIZ;
    public final String LIZIZ;

    public C00V(Context context, String str) {
        this.LIZ = C16880lQ.LLLLL(context);
        this.LIZIZ = str;
    }

    public final File LIZIZ(InputStream inputStream, C00U c00u) {
        File file = new File(C16880lQ.LLIIIL(this.LIZ), LIZ(this.LIZIZ, c00u, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    public static String LIZ(String str, C00U c00u, boolean z) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lottie_cache_");
        LIZ.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = c00u.tempExtension();
        } else {
            str2 = c00u.extension;
        }
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }
}
