package X;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.aVc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93732aVc {
    public static final List<String> LIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        File LLLLLLLLLL = C16880lQ.LLLLLLLLLL();
        o.LJIIIIZZ(LLLLLLLLLL, "Environment.getExternalStorageDirectory()");
        LIZ2.append(LLLLLLLLLL.getPath());
        LIZ2.append("/VESDK_Demo/");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ);
        LIZ3.append("veimage/");
        X1D.LIZIZ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LIZIZ);
        LIZ4.append("resource/");
        String LIZIZ2 = X1D.LIZIZ(LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LIZIZ2);
        LIZ5.append("filter/");
        X1D.LIZIZ(LIZ5);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(LIZIZ2);
        LIZ6.append("stickers/");
        X1D.LIZIZ(LIZ6);
        LIZ = new ArrayList();
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append(LIZIZ);
        LIZ7.append("object_tracking/");
        X1D.LIZIZ(LIZ7);
        new ArrayList();
        new Formatter(new StringBuilder(), Locale.getDefault());
        int i = 1;
        while (true) {
            List<String> list = LIZ;
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("Filter_0");
            LIZ8.append(i);
            ((ArrayList) list).add(X1D.LIZIZ(LIZ8));
            while (true) {
                i++;
                if (i <= 19) {
                    if (i < 10) {
                        break;
                    }
                    List<String> list2 = LIZ;
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("Filter_");
                    LIZ9.append(i);
                    ((ArrayList) list2).add(X1D.LIZIZ(LIZ9));
                } else {
                    return;
                }
            }
        }
    }

    public static void LIZ(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (file.exists()) {
            if (file.isDirectory()) {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (file2.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles == null || listFiles.length == 0) {
                        return;
                    }
                    for (File file3 : listFiles) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(file2.toString());
                        LIZ2.append(File.separator);
                        o.LJIIIIZZ(file3, "file");
                        LIZ2.append(file3.getName());
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        if (file3.isDirectory()) {
                            LIZ(file3.getAbsolutePath(), LIZIZ);
                        } else {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file3));
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(LIZIZ));
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                            }
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                        }
                    }
                    return;
                }
                throw new Exception("targetFile not exists");
            }
            throw new Exception("sourceFileis Directory not exists");
        }
        throw new Exception("sourceFile not exists");
    }
}
