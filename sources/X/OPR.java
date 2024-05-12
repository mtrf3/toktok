package X;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class OPR {
    public static void LIZ(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            C16880lQ.LLLZZIL(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x003a: MOVE (r4 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:16777274), block:B:21:0x003a */
    public static byte[] LIZIZ(File file) {
        BufferedInputStream bufferedInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        if (!file.exists()) {
            return null;
        }
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    bufferedInputStream.read(bArr, 0, length);
                    bufferedInputStream.close();
                    C78685UuP.LJIIIIZZ(bufferedInputStream);
                    return bArr;
                } catch (FileNotFoundException e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                    C78685UuP.LJIIIIZZ(bufferedInputStream);
                    return null;
                } catch (IOException e2) {
                    e = e2;
                    C16880lQ.LLLLIIL(e);
                    C78685UuP.LJIIIIZZ(bufferedInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                C78685UuP.LJIIIIZZ(closeable2);
                throw th;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            bufferedInputStream = null;
        } catch (IOException e4) {
            e = e4;
            bufferedInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C78685UuP.LJIIIIZZ(closeable2);
            throw th;
        }
    }
}
