package X;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.CeC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31816CeC {
    public static void LIZ(String str, String str2) {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("../")) {
                    if (nextEntry.isDirectory()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str2);
                        new File(JBR.LJFF(LIZ, File.separator, name, LIZ)).mkdirs();
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str2);
                        File file = new File(JBR.LJFF(LIZ2, File.separator, name, LIZ2));
                        if (file.exists()) {
                            C16880lQ.LLLZZIL(file);
                        } else {
                            file.getParentFile().mkdirs();
                        }
                        file.createNewFile();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    }
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }
}
