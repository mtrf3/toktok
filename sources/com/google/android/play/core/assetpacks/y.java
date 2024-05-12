package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C16880lQ;
import X.C36662EaA;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class y {
    public static final C13T LIZJ = new C13T("AssetPackStorage");
    public final Context LIZ;
    public final v1 LIZIZ;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14L);
        timeUnit.toMillis(28L);
    }

    public y(Context context, v1 v1Var) {
        this.LIZ = context;
        this.LIZIZ = v1Var;
    }

    public static boolean LJFF(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= LJFF(file2);
            }
        } else {
            z = true;
        }
        return C16880lQ.LLLZZIL(file) && true == z;
    }

    public final File LJ() {
        return new File(C16880lQ.LLIIJLIL(this.LIZ), "assetpacks");
    }

    public final File LJIIIIZZ(int i, String str, String str2, long j) {
        return new File(new File(new File(LIZLLL(i, j, str), "_slices"), "_unverified"), str2);
    }

    public final File LJIIIZ(int i, String str, String str2, long j) {
        return new File(new File(new File(LIZLLL(i, j, str), "_slices"), "_verified"), str2);
    }

    public final List<File> LIZJ() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e) {
            LIZJ.LIZJ("Could not process directory while scanning installed packs. %s", 6, new Object[]{e});
        }
        if (LJ().exists() && LJ().listFiles() != null) {
            for (File file : LJ().listFiles()) {
                if (!file.getCanonicalPath().equals(new File(LJ(), "_tmp").getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public static void LIZ(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long LIZIZ = LIZIZ(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(LIZIZ)) && !file2.getName().equals("stale.tmp")) {
                LJFF(file2);
            }
        }
    }

    public final c0 LJI(String str) {
        int length;
        File file = new File(LJ(), str);
        if (!file.exists()) {
            LIZJ.LIZJ("Pack not found with pack name: %s", 3, new Object[]{str});
        } else {
            File file2 = new File(file, String.valueOf(this.LIZIZ.LIZ()));
            if (!file2.exists()) {
                LIZJ.LIZJ("Pack not found with pack name: %s app version: %s", 3, new Object[]{str, Integer.valueOf(this.LIZIZ.LIZ())});
            } else {
                File[] listFiles = file2.listFiles();
                if (listFiles == null || (length = listFiles.length) == 0) {
                    LIZJ.LIZJ("No pack version found for pack name: %s app version: %s", 3, new Object[]{str, Integer.valueOf(this.LIZIZ.LIZ())});
                } else if (length > 1) {
                    LIZJ.LIZJ("Multiple pack versions found for pack name: %s app version: %s", 6, new Object[]{str, Integer.valueOf(this.LIZIZ.LIZ())});
                } else {
                    String canonicalPath = listFiles[0].getCanonicalPath();
                    if (canonicalPath != null) {
                        File file3 = new File(canonicalPath, "assets");
                        if (!file3.isDirectory()) {
                            LIZJ.LIZJ("Failed to find assets directory: %s", 6, new Object[]{file3});
                            return null;
                        }
                        return new c0(0, canonicalPath, file3.getCanonicalPath());
                    }
                }
            }
        }
        return null;
    }

    public static long LIZIZ(File file, boolean z) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            LIZJ.LIZJ("Multiple pack versions found, using highest version code.", 5, new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(CastLongProtector.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException unused) {
            LIZJ.getClass();
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) ListProtector.get(arrayList, arrayList.size() - 1)).longValue();
    }

    public final File LIZLLL(int i, long j, String str) {
        return new File(new File(new File(new File(LJ(), "_tmp"), str), String.valueOf(i)), String.valueOf(j));
    }

    public final File LJII(int i, long j, String str) {
        return new File(new File(new File(LJ(), str), String.valueOf(i)), String.valueOf(j));
    }

    public final int LJIIJ(int i, long j, String str) {
        File file = new File(new File(LIZLLL(i, j, str), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return CastIntegerProtector.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new m0("Merge checkpoint file corrupt.", e);
                }
            }
            throw new m0("Merge checkpoint file corrupt.");
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
