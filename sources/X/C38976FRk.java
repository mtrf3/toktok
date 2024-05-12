package X;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.FRk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38976FRk {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static void LIZ(String str, List list) {
        ZipOutputStream zipOutputStream;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        String LJFF = JBR.LJFF(LIZ, File.separator, "dump.xzip", LIZ);
        ZipOutputStream zipOutputStream2 = null;
        File file = 0;
        zipOutputStream2 = null;
        zipOutputStream2 = null;
        try {
            try {
                try {
                    zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(LJFF)));
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    file = new File((String) it.next());
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(file.getName());
                            LIZ2.append(File.separator);
                            LIZIZ(file, X1D.LIZIZ(LIZ2), zipOutputStream);
                        } else {
                            LIZIZ(file, "", zipOutputStream);
                        }
                    }
                }
                zipOutputStream.flush();
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                zipOutputStream2 = file;
            } catch (Exception e3) {
                e = e3;
                zipOutputStream2 = zipOutputStream;
                C16880lQ.LLLLIIL(e);
                if (zipOutputStream2 != null) {
                    zipOutputStream2.closeEntry();
                    zipOutputStream2.close();
                    zipOutputStream2 = zipOutputStream2;
                }
            }
        } finally {
            th = th;
            if (zipOutputStream2 == null) {
            }
            try {
                zipOutputStream.closeEntry();
                zipOutputStream.close();
            } catch (IOException e4) {
                C16880lQ.LLLLIIL(e4);
                throw th;
            }
        }
    }

    public static void LIZIZ(File file, String str, ZipOutputStream zipOutputStream) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(file.getName());
                        String str2 = File.separator;
                        LIZ.append(str2);
                        LIZ.append(file2.getName());
                        LIZ.append(str2);
                        str = X1D.LIZIZ(LIZ);
                        LIZIZ(file2, str, zipOutputStream);
                    } else {
                        LIZIZ(file2, str, zipOutputStream);
                    }
                }
            }
            return;
        }
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(file.getName());
        zipOutputStream.putNextEntry(new ZipEntry(X1D.LIZIZ(LIZ2)));
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                bufferedInputStream.close();
                return;
            }
        }
    }
}
