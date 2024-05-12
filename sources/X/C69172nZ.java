package X;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69172nZ {
    public static long LIZ(File file, List nonCleanableFileList, boolean z) {
        o.LJIIIZ(file, "file");
        o.LJIIIZ(nonCleanableFileList, "nonCleanableFileList");
        if (!file.exists() || nonCleanableFileList.contains(file)) {
            return 0L;
        }
        long length = file.length();
        int i = 0;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            o.LJIIIIZZ(listFiles, "file.listFiles()");
            int length2 = listFiles.length;
            int i2 = 0;
            while (i < length2) {
                File childFile = listFiles[i];
                try {
                    o.LJIIIIZZ(childFile, "childFile");
                    length += LIZ(childFile, nonCleanableFileList, z);
                    if (i2 == 0 && childFile.exists()) {
                        i2 = 1;
                    }
                    i++;
                } catch (Throwable unused) {
                    return 0L;
                }
            }
            i = i2;
        }
        if (z && i == 0) {
            C16880lQ.LLLZZIL(file);
        }
        return length;
    }
}
