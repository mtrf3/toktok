package X;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.o;

/* renamed from: X.aVd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93733aVd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static boolean LIZIZ(String path) {
        o.LJIIIZ(path, "path");
        if (path.length() == 0) {
            return false;
        }
        if (new File(path).exists()) {
            return true;
        }
        return false;
    }

    public static long LIZJ(File file) {
        long j = 0;
        try {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return 0L;
                }
                for (File it : listFiles) {
                    o.LJIIIIZZ(it, "it");
                    j += LIZJ(it);
                }
                return j;
            }
            return 0 + file.length();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String LIZLLL(String path) {
        FileInputStream fileInputStream;
        o.LJIIIZ(path, "path");
        try {
            StringBuilder sb = new StringBuilder();
            try {
                fileInputStream = new FileInputStream(new File(path));
            } catch (IOException unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                FileChannel channel = fileInputStream.getChannel();
                o.LJIIIIZZ(channel, "inputStream.channel");
                ByteBuffer allocate = ByteBuffer.allocate(1024);
                o.LJIIIIZZ(allocate, "ByteBuffer.allocate(1024)");
                CharBuffer allocate2 = CharBuffer.allocate(1024);
                o.LJIIIIZZ(allocate2, "CharBuffer.allocate(1024)");
                CharsetDecoder newDecoder = Charset.forName("UTF-8").newDecoder();
                o.LJIIIIZZ(newDecoder, "Charset.forName(\"UTF-8\").newDecoder()");
                while (channel.read(allocate) != -1) {
                    allocate.flip();
                    allocate2.clear();
                    if (channel.position() < channel.size()) {
                        newDecoder.decode(allocate, allocate2, false);
                    } else {
                        newDecoder.decode(allocate, allocate2, true);
                        newDecoder.flush(allocate2);
                    }
                    allocate.compact();
                    allocate2.flip();
                    char[] cArr = new char[allocate2.remaining()];
                    allocate2.get(cArr, 0, allocate2.remaining());
                    sb.append(cArr);
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
                LIZ(fileInputStream);
                throw th;
            }
            LIZ(fileInputStream);
            return sb.toString();
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("readFile error ");
            LIZ2.append(e.getMessage());
            C94034aaU.LIZJ("FileUtils::", X1D.LIZIZ(LIZ2));
            return null;
        }
    }
}
