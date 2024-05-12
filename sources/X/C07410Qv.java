package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0Qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07410Qv {
    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static File LIZLLL(Context context) {
        File LLIIIL = C16880lQ.LLIIIL(context);
        if (LLIIIL == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(".font");
        LIZ.append(Process.myPid());
        LIZ.append("-");
        LIZ.append(Process.myTid());
        LIZ.append("-");
        String LIZIZ = X1D.LIZIZ(LIZ);
        for (int i = 0; i < 100; i++) {
            File file = new File(LLIIIL, KMP.LJ(LIZIZ, i));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean LIZJ(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        LIZ(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                LIZ(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                LIZ(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static ByteBuffer LJ(Context context, android.net.Uri uri) {
        try {
            ParcelFileDescriptor LIZ = C07400Qu.LIZ(context.getContentResolver(), uri, "r", null);
            if (LIZ == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(LIZ.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    LIZ.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean LIZIZ(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean LIZJ = LIZJ(file, inputStream);
                LIZ(inputStream);
                return LIZJ;
            } catch (Throwable th) {
                th = th;
                LIZ(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }
}
