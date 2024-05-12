package X;

import Y.IDComparatorS39S0000000_11;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.refcache.FileLocker;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.QBc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66580QBc {
    public static volatile boolean LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static File LIZLLL;
    public static File LJ;

    public static java.util.Set<String> LJIIL() {
        ICacheService iCacheService;
        File LLIIJI;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        try {
            iCacheService = AVExternalServiceImpl.LIZ().configService().cacheConfig();
        } catch (Exception unused) {
            iCacheService = null;
        }
        if (iCacheService != null) {
            if (C78939UyV.LJJIJ()) {
                hashSet2.addAll(iCacheService.allowList());
            } else {
                hashSet2.addAll(iCacheService.draftAllowList());
            }
            hashSet2.addAll(iCacheService.tempVideoFile());
            hashSet2.addAll(iCacheService.originSoundFile());
            hashSet2.add(iCacheService.mvRootDir());
        }
        hashSet.addAll(hashSet2);
        if (LIZIZ == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLLLLLLLLL().getAbsolutePath());
            LIZ2.append("/DCIM/Camera/");
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        hashSet.add(new File(LIZIZ).getAbsolutePath());
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C16880lQ.LLIIJI(EF7.LIZIZ(), null));
        LIZ3.append("/splashad");
        hashSet.add(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        Context LIZIZ2 = EF7.LIZIZ();
        if (Environment.isExternalStorageEmulated()) {
            LLIIJI = C16880lQ.LLIIJLIL(LIZIZ2);
        } else {
            LLIIJI = C16880lQ.LLIIJI(LIZIZ2, null);
            if (LLIIJI != null) {
                C39579Fg7.LJFF(LLIIJI);
            } else {
                LLIIJI = C16880lQ.LLIIJLIL(LIZIZ2);
            }
        }
        LIZ4.append(LLIIJI.getPath());
        LIZ4.append("/LiveWallpaper");
        hashSet.add(X1D.LIZIZ(LIZ4));
        C65560PoC c65560PoC = new C65560PoC(hashSet, new C66587QBj());
        C65560PoC c65560PoC2 = new C65560PoC(hashSet, new C66588QBk());
        HashSet hashSet3 = new HashSet();
        hashSet3.addAll(hashSet);
        hashSet3.addAll(c65560PoC);
        hashSet3.addAll(c65560PoC2);
        return hashSet3;
    }

    public static File LJIILIIL() {
        File file = LIZLLL;
        if (file != null) {
            return file;
        }
        File LJI = P8H.LJI(EF7.LIZIZ(), EnumC47429IjR.PREFER_SD_CARD);
        if (LJI == null) {
            File LJIIJJI = C39579Fg7.LJIIJJI();
            LIZLLL = LJIIJJI;
            return LJIIJJI;
        }
        File file2 = new File(LJI, "picture");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        LIZLLL = file2;
        return file2;
    }

    public static void LIZIZ(int i) {
        File[] fileArr;
        UC7.LIZLLL("clearDuetFiles ", i);
        File[] fileArr2 = null;
        try {
            ICacheService cacheConfig = AVExternalServiceImpl.LIZ().configService().cacheConfig();
            if (cacheConfig != null) {
                int i2 = i * 2;
                try {
                    fileArr = cacheConfig.tempDuetFile();
                } catch (Throwable unused) {
                    fileArr = null;
                }
                LIZLLL(LJIL(fileArr, i2 * 2));
                try {
                    fileArr2 = cacheConfig.rawDuetFile();
                } catch (Throwable unused2) {
                }
                LJ(LJIL(fileArr2, i));
            }
        } catch (Exception unused3) {
        }
    }

    public static void LIZLLL(List<File> list) {
        if (list != null && list.size() > 0) {
            for (File file : list) {
                if (file != null && file.exists()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("del:");
                    LIZ2.append(file.getAbsolutePath());
                    X1D.LIZIZ(LIZ2);
                    if (FileLocker.getStatus(file.getAbsolutePath()) >= 0) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(file.getAbsolutePath());
                        LIZ3.append(" in use");
                        X1D.LIZIZ(LIZ3);
                    } else {
                        C16880lQ.LLLZZIL(file);
                    }
                }
            }
        }
    }

    public static void LJ(List<File> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Set<String> LJIIL = LJIIL();
        for (File file : list) {
            if (file != null && file.exists()) {
                if (!((HashSet) LJIIL).contains(file.getAbsolutePath())) {
                    if (FileLocker.getStatus(file.getAbsolutePath()) >= 0) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(file.getAbsolutePath());
                        LIZ2.append(" in use");
                        X1D.LIZIZ(LIZ2);
                    } else {
                        C16880lQ.LLLZZIL(file);
                    }
                }
            }
        }
    }

    public static File LJFF(Context context) {
        File file = LJ;
        if (file != null) {
            return file;
        }
        File LJII = P8H.LJII(context, EnumC47429IjR.PREFER_SD_CARD);
        if (LJII == null) {
            try {
                LJ = C16880lQ.LLIIJI(context, "logs");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (LJ == null) {
                LJ = new File(C16880lQ.LLIIJLIL(context), "logs");
            }
            if (!LJ.exists()) {
                LJ.mkdirs();
            }
            return LJ;
        }
        File file2 = new File(LJII, "logs");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        LJ = file2;
        return file2;
    }

    public static long LJI(List<File> list) {
        long j = 0;
        if (list != null && list.size() > 0) {
            for (File file : list) {
                if (file != null && file.exists()) {
                    j += file.length();
                }
            }
        }
        return j;
    }

    public static long LJII(List<File> list) {
        long j = 0;
        if (list != null && list.size() > 0) {
            java.util.Set<String> LJIIL = LJIIL();
            for (File file : list) {
                if (file != null && file.exists()) {
                    if (!((HashSet) LJIIL).contains(file.getAbsolutePath())) {
                        if (FileLocker.getStatus(file.getAbsolutePath()) >= 0) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(file.getAbsolutePath());
                            LIZ2.append(" in use");
                            X1D.LIZIZ(LIZ2);
                        } else {
                            j += file.length();
                        }
                    }
                }
            }
        }
        return j;
    }

    public static String LJIILJJIL(Context context) {
        String path;
        if (context == null) {
            return "";
        }
        String str = LIZJ;
        if (str != null && !str.isEmpty()) {
            return LIZJ;
        }
        File LJII = P8H.LJII(context, EnumC47429IjR.PREFER_PRIVATE);
        if (LJII != null) {
            path = LJII.getPath();
        } else if (C16880lQ.LLIIJI(context, null) == null) {
            path = C16880lQ.LLLLLLLLLL().getPath();
        } else {
            path = C16880lQ.LLIIJI(context, null).getPath();
        }
        String LJFF = i0.LJFF(path, "/share/");
        LIZJ = LJFF;
        return LJFF;
    }

    public static String LJIILL(Context context) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIILJJIL(context));
        LIZ2.append("out");
        LIZ2.append("/");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJIILLIIL(Context context) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIILJJIL(context));
        LIZ2.append("pic");
        LIZ2.append("/");
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJIIZILJ(Context context) {
        String path;
        String LJFF;
        File parentFile;
        StringBuilder LIZ2 = X1D.LIZ();
        if (context == null) {
            LJFF = "";
        } else {
            File LLIIIL = C16880lQ.LLIIIL(context);
            if (LLIIIL != null && (parentFile = LLIIIL.getParentFile()) != null) {
                path = parentFile.getPath();
            } else if (C16880lQ.LLIIJI(context, null) == null) {
                path = C16880lQ.LLLLLLLLLL().getPath();
            } else {
                path = C16880lQ.LLIIJI(context, null).getPath();
            }
            LJFF = i0.LJFF(path, "/share/");
        }
        return C025908h.LIZIZ(LIZ2, LJFF, "tmp", "/", LIZ2);
    }

    public static String LJIJ(Context context) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIILJJIL(context));
        LIZ2.append("tmp");
        LIZ2.append("/");
        return X1D.LIZIZ(LIZ2);
    }

    public static List<File> LJJ(int i) {
        File cacheFile = C47242IgQ.LIZ().LJIIL(EnumC47317Ihd.VideoCache).getCacheFile();
        if (cacheFile != null && cacheFile.exists()) {
            return LJIJJLI(cacheFile, i);
        }
        return null;
    }

    public static void LIZ(int i, Context context) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("clearDraftsV2 ");
        LIZ2.append(i);
        X1D.LIZIZ(LIZ2);
        if (C16880lQ.LLIIJLIL(context) != null) {
            LJ(LJIIIZ(C16880lQ.LLIIJLIL(context), i));
        }
        try {
            if (C16880lQ.LLIIJI(context, null) != null) {
                LJ(LJIIIZ(C16880lQ.LLIIJI(context, null), i));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZJ(int i, Context context) {
        try {
            Boolean cleanShareFiles = C2YJ.LIZIZ.LIZ.getCleanShareFiles();
            if (cleanShareFiles != null && cleanShareFiles.booleanValue()) {
                i = 0;
            }
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
        }
        LIZLLL(LJIJI(i, context));
        File file = new File(LJIILJJIL(context));
        File file2 = new File(C16880lQ.LLIIJI(context, null), "share");
        if (file2.exists() && !TextUtils.equals(file2.getAbsolutePath(), file.getAbsolutePath())) {
            LJJI(file2, i);
        }
        File LJIIIZ = P8H.LJIIIZ(context);
        if (LJIIIZ != null) {
            File file3 = new File(LJIIIZ, "share");
            if (file3.exists() && !TextUtils.equals(file3.getAbsolutePath(), file3.getAbsolutePath())) {
                LJJI(file3, i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static List LJIIIIZZ(int i, Context context) {
        ICacheService iCacheService;
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (C16880lQ.LLIIJLIL(context) != null) {
            arrayList2.addAll(LJIJJ(C16880lQ.LLIIJLIL(context), i));
        }
        String str = null;
        try {
            if (C16880lQ.LLIIJI(context, null) != null) {
                arrayList2.addAll(LJIJJ(C16880lQ.LLIIJI(context, null), i));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            iCacheService = AVExternalServiceImpl.LIZ().configService().cacheConfig();
        } catch (Exception unused) {
            iCacheService = null;
        }
        if (iCacheService == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            try {
                str = iCacheService.compatMusDraftDir();
            } catch (Exception unused2) {
            }
            if (str != null) {
                File file = new File(str);
                if (file.exists()) {
                    ArrayList arrayList3 = new ArrayList();
                    LJIIJ(file, arrayList3);
                    arrayList.addAll(arrayList3);
                }
            }
        }
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public static List<File> LJIIIZ(File file, int i) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(file.getAbsolutePath());
        File file2 = new File(JBR.LJFF(LIZ2, File.separator, "cache", LIZ2));
        if (file2.exists() && (listFiles = file2.listFiles(new C66586QBi())) != null && listFiles.length > 0) {
            arrayList.addAll(LJIL(listFiles, i));
        }
        return arrayList;
    }

    public static void LJIIJ(File file, List<File> list) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            ((ArrayList) list).add(file);
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return;
        }
        for (File file2 : listFiles) {
            LJIIJ(file2, list);
        }
    }

    public static List LJIIJJI(int i, Context context) {
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        File file = null;
        if (LLIIJLIL != null && LLIIJLIL.exists()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LLIIJLIL.getAbsolutePath());
            file = new File(JBR.LJFF(LIZ2, File.separator, "music/download", LIZ2));
        }
        ArrayList arrayList = new ArrayList();
        if (file != null && file.exists()) {
            arrayList.addAll(LJIJJLI(file, i));
        }
        File LLIIJLIL2 = C16880lQ.LLIIJLIL(context);
        if (LLIIJLIL2 != null && LLIIJLIL2.exists()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LLIIJLIL2.getAbsolutePath());
            File file2 = new File(JBR.LJFF(LIZ3, File.separator, "music/rhythm", LIZ3));
            if (file2.exists()) {
                arrayList.addAll(LJIJJLI(file2, i));
            }
        }
        return arrayList;
    }

    public static List LJIJI(int i, Context context) {
        ArrayList arrayList = new ArrayList();
        File file = new File(LJIILL(context));
        if (file.exists()) {
            arrayList.addAll(LJIJJLI(file, i));
            arrayList.addAll(LJIJJLI(new File(LJIJ(context)), i));
            arrayList.addAll(LJIJJLI(new File(LJIILLIIL(context)), i));
        }
        return arrayList;
    }

    public static List<File> LJIJJ(File file, int i) {
        ICacheService iCacheService;
        File[] fileArr;
        File[] fileArr2;
        File[] fileArr3;
        List<File> LJIL;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            File[] fileArr4 = null;
            try {
                iCacheService = AVExternalServiceImpl.LIZ().configService().cacheConfig();
            } catch (Throwable unused) {
                iCacheService = null;
            }
            if (iCacheService == null) {
                return Collections.EMPTY_LIST;
            }
            try {
                fileArr = iCacheService.rawVideoFile();
            } catch (Exception unused2) {
                fileArr = null;
            }
            if (fileArr != null && (LJIL = LJIL(fileArr, i * 2)) != null) {
                arrayList.addAll(LJIL);
            }
            try {
                fileArr2 = iCacheService.voiceFile();
            } catch (Exception unused3) {
                fileArr2 = null;
            }
            List<File> LJIL2 = LJIL(fileArr2, i);
            if (LJIL2 != null) {
                arrayList.addAll(LJIL2);
            }
            try {
                fileArr3 = iCacheService.outputFile();
            } catch (Exception unused4) {
                fileArr3 = null;
            }
            List<File> LJIL3 = LJIL(fileArr3, i);
            if (LJIL3 != null) {
                arrayList.addAll(LJIL3);
            }
            try {
                fileArr4 = iCacheService.synthesisFile();
            } catch (Exception unused5) {
            }
            List<File> LJIL4 = LJIL(fileArr4, i);
            if (LJIL4 != null) {
                arrayList.addAll(LJIL4);
            }
            File file2 = new File(C58131Mrf.LIZIZ.getDownloadDir());
            if (file2.exists() && LJIJJLI(file2, i * 2) != null) {
                arrayList.addAll(LJIL4);
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public static List<File> LJIJJLI(File file, int i) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            List asList = Arrays.asList(listFiles);
            Collections.sort(asList, new IDComparatorS39S0000000_11(14));
            if (asList.size() > i) {
                return asList.subList(0, asList.size() - i);
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static List<File> LJIL(File[] fileArr, int i) {
        if (fileArr != null && fileArr.length > 0) {
            List asList = Arrays.asList(fileArr);
            Collections.sort(asList, new IDComparatorS39S0000000_11(13));
            if (asList.size() > i) {
                return asList.subList(0, asList.size() - i);
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static void LJJI(File file, int i) {
        LIZLLL(LJIJJLI(new File(file, "out"), i));
        LIZLLL(LJIJJLI(new File(file, "tmp"), i));
        LIZLLL(LJIJJLI(new File(file, "pic"), i));
    }

    public static void LJJIFFI(File[] fileArr, java.util.Set<String> set) {
        if (fileArr == null || fileArr.length == 0) {
            return;
        }
        for (File file : fileArr) {
            if (!LIZ) {
                return;
            }
            if (file != null && file.exists()) {
                String absolutePath = file.getAbsolutePath();
                if (TextUtils.isEmpty(absolutePath)) {
                    return;
                }
                if (file.isFile()) {
                    if (!((HashSet) set).contains(absolutePath) && (absolutePath.endsWith(".mp4") || absolutePath.endsWith(".mp3") || absolutePath.endsWith(".wav") || absolutePath.endsWith("-concat-v") || absolutePath.endsWith("-concat-a") || absolutePath.endsWith("_synthetise"))) {
                        C39579Fg7.LJIL(absolutePath);
                    }
                } else {
                    HashSet hashSet = (HashSet) set;
                    if (!hashSet.contains(file.getName()) && !hashSet.contains(file.getAbsolutePath())) {
                        LJJIFFI(file.listFiles(), set);
                        if (file.length() == 0) {
                            C16880lQ.LLLZZIL(file);
                        }
                    }
                }
            }
        }
    }
}
