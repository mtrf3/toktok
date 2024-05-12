package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes7.dex */
public final class FT9 {
    public static final FTA LIZ = new FTA();

    public static int LIZLLL() {
        int i = -1;
        try {
            int LIZJ = LIZJ("/sys/devices/system/cpu/possible");
            if (LIZJ == -1) {
                LIZJ = LIZJ("/sys/devices/system/cpu/present");
            }
            if (LIZJ == -1) {
                i = new File("/sys/devices/system/cpu/").listFiles(LIZ).length;
                return i;
            }
            return LIZJ;
        } catch (NullPointerException | SecurityException unused) {
            return i;
        }
    }

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    public static int LIZJ(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        ?? fileInputStream;
        int i = -1;
        BufferedReader bufferedReader3 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused2) {
            bufferedReader2 = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader2.readLine();
            if (readLine != null && readLine.matches("0-[\\d]+$")) {
                i = CastIntegerProtector.parseInt(readLine.substring(2)) + 1;
            }
            LIZ(fileInputStream);
        } catch (IOException unused3) {
            bufferedReader3 = bufferedReader2;
            bufferedReader2 = bufferedReader3;
            bufferedReader3 = fileInputStream;
            LIZ(bufferedReader3);
            LIZ(bufferedReader2);
            return i;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader3 = bufferedReader2;
            bufferedReader = bufferedReader3;
            bufferedReader3 = fileInputStream;
            LIZ(bufferedReader3);
            LIZ(bufferedReader);
            throw th;
        }
        LIZ(bufferedReader2);
        return i;
    }

    public static int LIZIZ(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return CastIntegerProtector.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }
}
