package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.Eja, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37246Eja {
    public static final C37246Eja LIZ = new C37246Eja();

    public static File LIZIZ(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        return C36871EdX.LIZIZ(filePath, false);
    }

    public static File LIZJ(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        return C36871EdX.LIZIZ(filePath, true);
    }

    public static void LIZLLL(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        C36871EdX.LJ(filePath);
    }

    public static byte[] LJ(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        if (filePath.startsWith("content://")) {
            android.net.Uri parse = UriProtector.parse(filePath);
            return C36871EdX.LIZLLL(C268513p.LIZLLL(EF7.LIZIZ(), parse), C268613q.LJIIIZ(EF7.LIZIZ(), parse), filePath);
        }
        File file = new File(filePath);
        return C36871EdX.LIZLLL(new FileInputStream(file), file.length(), file.getName());
    }

    public static boolean LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1B6.LIZIZ(str);
    }

    public static String LJI(String filePath) {
        FileInputStream fileInputStream;
        String str;
        o.LJIIIZ(filePath, "filePath");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(filePath);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            fileInputStream = fileInputStream2;
        }
        try {
            str = Integer.toHexString((((((fileInputStream.read() << 8) ^ fileInputStream.read()) << 8) ^ fileInputStream.read()) << 8) ^ fileInputStream.read());
            try {
                fileInputStream.close();
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            C16880lQ.LLLLIIL(e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e4) {
                    C16880lQ.LLLLIIL(e4);
                }
            }
            str = "";
            o.LJIIIIZZ(str, "readFileMagicNumber(filePath)");
            return str;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    C16880lQ.LLLLIIL(e5);
                }
            }
            throw th;
        }
        o.LJIIIIZZ(str, "readFileMagicNumber(filePath)");
        return str;
    }

    public static boolean LIZ(InputStream in, OutputStream outputStream) {
        o.LJIIIZ(in, "in");
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        while (true) {
            try {
                try {
                    int read = in.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        C36871EdX.LIZ(in);
                        C36871EdX.LIZ(outputStream);
                        return true;
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    C36871EdX.LIZ(in);
                    C36871EdX.LIZ(outputStream);
                    return false;
                }
            } catch (Throwable th) {
                C36871EdX.LIZ(in);
                C36871EdX.LIZ(outputStream);
                throw th;
            }
        }
    }
}
