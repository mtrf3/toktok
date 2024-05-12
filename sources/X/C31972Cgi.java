package X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.Cgi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31972Cgi {
    public static String LIZ(File file, String str) {
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        Boolean bool = Boolean.FALSE;
        String str2 = "";
        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(File.separator);
            LIZ.append(nextEntry.getName());
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (!nextEntry.getName().contains("__MACOSX") && !nextEntry.getName().contains(".DS_Store") && !nextEntry.getName().contains("../")) {
                if (!nextEntry.isDirectory()) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(LIZIZ));
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.close();
                } else {
                    File file3 = new File(LIZIZ);
                    if (!bool.booleanValue()) {
                        bool = Boolean.TRUE;
                        str2 = nextEntry.getName();
                    }
                    file3.mkdirs();
                }
            }
            zipInputStream.closeEntry();
        }
        zipInputStream.close();
        return str2;
    }
}
