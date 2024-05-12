package X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.CeE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31818CeE {
    public static final void LIZ(InputStream inputStream, String destDir) {
        o.LJIIIZ(inputStream, "inputStream");
        o.LJIIIZ(destDir, "destDir");
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name != null && name.length() != 0) {
                        String name2 = nextEntry.getName();
                        o.LJIIIIZZ(name2, "name");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("..");
                        LIZ.append(File.separator);
                        if (s.LJJJLZIJ(name2, X1D.LIZIZ(LIZ), false)) {
                            continue;
                        } else if (nextEntry.isDirectory()) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(destDir);
                            LIZ2.append(File.separator);
                            LIZ2.append(nextEntry.getName());
                            new File(X1D.LIZIZ(LIZ2)).mkdirs();
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(destDir);
                            LIZ3.append(File.separator);
                            LIZ3.append(nextEntry.getName());
                            File file = new File(X1D.LIZIZ(LIZ3));
                            File parentFile = file.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            } else if (file.exists()) {
                                C16880lQ.LLLZZIL(file);
                            } else {
                                file.createNewFile();
                            }
                            long size = nextEntry.getSize();
                            if (size <= 0 || size > 32768) {
                                size = 32768;
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                            try {
                                byte[] bArr = new byte[(int) size];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    } else {
                                        bufferedOutputStream.write(bArr, 0, read);
                                    }
                                }
                                bufferedOutputStream.flush();
                                AnonymousClass636.LJFF(bufferedOutputStream, null);
                            } finally {
                            }
                        }
                    }
                } else {
                    AnonymousClass636.LJFF(zipInputStream, null);
                    return;
                }
            } finally {
            }
        }
    }
}
