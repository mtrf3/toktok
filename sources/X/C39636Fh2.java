package X;

import android.content.Context;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.Fh2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39636Fh2 {
    public static File LIZ(Context context, String str) {
        File file;
        File file2 = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(file2);
        List<String> list = C39639Fh5.LIZJ;
        ((CopyOnWriteArrayList) list).add(C0F0.LIZJ("base apk:", file2));
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        int i = 0;
        if (strArr != null && strArr.length != 0) {
            int length = strArr.length;
            while (i < length) {
                String str2 = strArr[i];
                ((CopyOnWriteArrayList) C39639Fh5.LIZJ).add(i0.LJFF("splitDir:", str2));
                arrayList.add(new File(str2));
                i++;
            }
        } else {
            ((CopyOnWriteArrayList) list).add("list files");
            File parentFile = file2.getParentFile();
            parentFile.setReadable(true);
            File[] listFiles = parentFile.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                int length2 = listFiles.length;
                while (i < length2) {
                    File file3 = listFiles[i];
                    List<String> list2 = C39639Fh5.LIZJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("splitDir:");
                    LIZ.append(file3.getAbsolutePath());
                    ((CopyOnWriteArrayList) list2).add(X1D.LIZIZ(LIZ));
                    if (file3.isFile() && file3.getName().endsWith(".apk")) {
                        arrayList.add(file3);
                    }
                    i++;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            file = null;
            if (!it.hasNext()) {
                break;
            }
            file = (File) it.next();
            ZipFile zipFile = new ZipFile(file);
            ZipEntry entry = zipFile.getEntry(str);
            zipFile.close();
            if (entry != null && file != null) {
                break;
            }
        }
        return file;
    }
}
