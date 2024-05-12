package X;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: X.EzX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38235EzX {
    public static final byte[] LIZ = {80, 75, 3, 4};
    public static final byte[] LIZIZ = {80, 75, 5, 6};

    public static boolean LIZ(File file) {
        boolean LIZ2;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return C16880lQ.LLLZZIL(file);
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile()) {
                    if (listFiles[i].canWrite()) {
                        LIZ2 = C16880lQ.LLLZZIL(listFiles[i]);
                    } else {
                        z = false;
                    }
                } else {
                    LIZ2 = LIZ(listFiles[i]);
                }
                z &= LIZ2;
            }
        }
        return z & C16880lQ.LLLZZIL(file);
    }

    public static boolean LIZIZ(File file) {
        if (!file.exists() || file.length() == 0) {
            return false;
        }
        return true;
    }

    public static String LIZJ(String str) {
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        if (sb.length() != 0) {
                            sb.append("\n");
                        }
                        sb.append(readLine);
                    } else {
                        C63081OpJ.LJII(bufferedReader2);
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C63081OpJ.LJII(bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
