package com.google.android.play.core.assetpacks;

import X.C16880lQ;
import X.C36662EaA;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class b2 {
    public static final Pattern LIZ = PatternProtector.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static List<File> LIZ(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.a2
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                return b2.LIZ.matcher(str).matches();
            }
        });
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            fileArr = new File[listFiles.length];
            for (File file3 : listFiles) {
                int parseInt = CastIntegerProtector.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr[parseInt] != null) {
                    throw new m0("Metadata folder ordering corrupt.");
                }
                fileArr[parseInt] = file3;
            }
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    e2 LIZ2 = new g0(fileInputStream).LIZ();
                    if (LIZ2.LIZ == null) {
                        throw new m0("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, LIZ2.LIZ);
                    if (!file5.exists()) {
                        throw new m0(C16880lQ.LLLZ("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        C36662EaA.LIZ(th, th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
