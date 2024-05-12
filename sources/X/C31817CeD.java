package X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.CeD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31817CeD {
    public static final void LIZ(File source, File file) {
        o.LJIIIZ(source, "source");
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            String absolutePath = file.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "destDir.absolutePath");
            LIZIZ(fileInputStream, absolutePath);
            o.LJIIIIZZ(file.getAbsolutePath(), "destDir.absolutePath");
        } catch (Exception e) {
            C16880lQ.LLLZZIL(file);
            if (!(e instanceof IOException)) {
                throw new IOException("Error when decompressing zip file.", e);
            }
            throw e;
        }
    }

    public static final void LIZIZ(InputStream inputStream, String str) {
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
                            LIZ2.append(str);
                            LIZ2.append(File.separator);
                            LIZ2.append(nextEntry.getName());
                            new File(X1D.LIZIZ(LIZ2)).mkdirs();
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(str);
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
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                            try {
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
