package X;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.HzV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45877HzV {
    public static String LIZJ(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }

    public static void LIZLLL(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if ("mounted".equals(C16880lQ.LLLLLLLZIL())) {
                    File file = new File(str);
                    if (file.exists()) {
                        C16880lQ.LLLZZIL(file);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void LIZ(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[4096];
            if (outputStream != null) {
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, read);
                    }
                }
                outputStream.flush();
                try {
                    ((FileInputStream) inputStream).close();
                } catch (IOException unused) {
                }
                try {
                    outputStream.close();
                    return;
                } catch (IOException unused2) {
                    return;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to copy input:");
            LIZ.append(inputStream);
            LIZ.append("output:");
            LIZ.append(outputStream);
            throw new IOException(X1D.LIZIZ(LIZ));
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZIZ(android.content.Context r14, java.lang.String r15, java.lang.String r16, java.lang.Boolean r17) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45877HzV.LIZIZ(android.content.Context, java.lang.String, java.lang.String, java.lang.Boolean):android.net.Uri");
    }
}
