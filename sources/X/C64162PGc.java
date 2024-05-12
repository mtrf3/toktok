package X;

import android.app.Application;
import android.app.usage.StorageStatsManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.Pair;
import defpackage.i0;
import java.io.File;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PGc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64162PGc {
    public static final C64162PGc LJIILJJIL = new C64162PGc();
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public volatile boolean LJ;
    public List<String> LJFF;
    public List<String> LJI;
    public List<String> LJII;
    public boolean LJIIIIZZ;
    public PGG LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-3220905972517894163"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static Pair LJIIIZ() {
        UUID fromString;
        try {
            int i = Build.VERSION.SDK_INT;
            long j = 0;
            if (i >= 26) {
                StorageStatsManager storageStatsManager = (StorageStatsManager) C16880lQ.LLIZ("storagestats", C78248UnM.LJLJJI);
                StorageManager storageManager = (StorageManager) C16880lQ.LLIZ("storage", C78248UnM.LJLJJI);
                Iterator<StorageVolume> it = storageManager.getStorageVolumes().iterator();
                long j2 = 0;
                while (it.hasNext()) {
                    String uuid = it.next().getUuid();
                    if (uuid == null) {
                        fromString = StorageManager.UUID_DEFAULT;
                    } else {
                        fromString = UUID.fromString(uuid);
                    }
                    j += storageStatsManager.getTotalBytes(fromString);
                    j2 += storageManager.getAllocatableBytes(fromString);
                }
                return new Pair(Long.valueOf(((j / 1000) / 1000) * 1024 * 1024), Long.valueOf(((j2 / 1000) / 1000) * 1024 * 1024));
            }
            if (i >= 24) {
                List<StorageVolume> storageVolumes = ((StorageManager) C16880lQ.LLIZ("storage", C78248UnM.LJLJJI)).getStorageVolumes();
                if (C78915Uy7.LJIJJ(storageVolumes)) {
                    return null;
                }
                long j3 = 0;
                for (StorageVolume storageVolume : storageVolumes) {
                    File file = (File) LIZLLL(storageVolume, LJIIL(storageVolume.getClass(), "getPathFile", new Class[0]), new Object[0]);
                    j += file.getTotalSpace();
                    j3 += file.getFreeSpace();
                }
                return new Pair(Long.valueOf(((j / 1000) / 1000) * 1024 * 1024), Long.valueOf(((j3 / 1000) / 1000) * 1024 * 1024));
            }
            StorageManager storageManager2 = (StorageManager) C16880lQ.LLIZ("storage", C78248UnM.LJLJJI);
            long j4 = 0;
            for (Object obj : (List) LIZLLL(storageManager2, LJIIL(storageManager2.getClass(), "getVolumes", new Class[0]), new Object[0])) {
                File file2 = (File) LIZLLL(obj, LJIIL(obj.getClass(), "getPathFile", new Class[0]), new Object[0]);
                j4 += file2.getFreeSpace();
                j += file2.getFreeSpace();
            }
            return new Pair(Long.valueOf(j), Long.valueOf(j4));
        } catch (Throwable unused) {
            return new Pair(Long.valueOf(new StatFs(Environment.getRootDirectory().getPath()).getTotalBytes() + new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes()), Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes()));
        }
    }

    public final long LJI() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Application application = C78248UnM.LJLJJI;
                String packageName = application.getPackageName();
                return ((StorageStatsManager) C16880lQ.LLILL(application, "storagestats")).queryStatsForUid(((StorageManager) C16880lQ.LLILL(application, "storage")).getUuidForPath(new File(application.getDataDir().getParent(), packageName)), C16880lQ.LLLLLLLLL(application.getPackageManager(), packageName, 128).uid).getAppBytes();
            } catch (Throwable unused) {
            }
        }
        try {
            long LJIIIIZZ = LJIIIIZZ(new File(C16880lQ.LLLLLLLLL(C78248UnM.LJLJJI.getPackageManager(), C78248UnM.LJLJJI.getPackageName(), 0).sourceDir).getParentFile());
            long j = 0;
            for (File file : C16880lQ.LLLLJI(C78248UnM.LJLJJI).getExternalMediaDirs()) {
                j += LJIIIIZZ(file);
            }
            return LJIIIIZZ + j + this.LJIIJ + this.LJIIJJI;
        } catch (Exception unused2) {
            return 0L;
        }
    }

    public static JSONArray LJFF(C65548Po0 c65548Po0) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((ArrayList) c65548Po0.LIZIZ()).iterator();
        while (it.hasNext()) {
            JSONObject LIZLLL = ((C64167PGh) it.next()).LIZLLL();
            if (LIZLLL != null) {
                jSONArray.put(LIZLLL);
            }
        }
        return jSONArray;
    }

    public static long LJIIIIZZ(File file) {
        File[] listFiles;
        long length;
        long j = 0;
        try {
            listFiles = file.listFiles();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    length = LJIIIIZZ(file2);
                } else {
                    length = file2.length();
                }
                j += length;
            }
            return j;
        }
        return 0L;
    }

    public final void LIZJ(List<C64166PGg> list) {
        if (C78915Uy7.LJIJJ(list)) {
            return;
        }
        for (C64166PGg c64166PGg : list) {
            if (TextUtils.equals(c64166PGg.LIZ, this.LIZ)) {
                this.LJIIJ = c64166PGg.LIZJ;
            } else if (TextUtils.equals(c64166PGg.LIZ, this.LIZJ)) {
                this.LJIIJJI = c64166PGg.LIZJ;
            } else if (TextUtils.equals(c64166PGg.LIZ, this.LIZIZ)) {
                this.LJIIL = c64166PGg.LIZJ;
            } else if (TextUtils.equals(c64166PGg.LIZ, this.LIZLLL)) {
                this.LJIILIIL = c64166PGg.LIZJ;
            }
        }
    }

    public final String LJII(String str) {
        if (!C78915Uy7.LJIJJ(this.LJII) && str != null) {
            Iterator<String> it = this.LJII.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (str.startsWith(next)) {
                    if (next != null && str != null) {
                        return i0.LJFF(next, str.substring(next.length()).replaceAll("[^/]", "*"));
                    }
                }
            }
        }
        return null;
    }

    public final boolean LJIIJ(File file) {
        if (!C78915Uy7.LJIJJ(this.LJFF)) {
            return this.LJFF.contains(file.getAbsolutePath());
        }
        return false;
    }

    public final boolean LJIIJJI(C64163PGd c64163PGd) {
        Iterator<String> it = this.LJFF.iterator();
        while (it.hasNext()) {
            if (c64163PGd.LIZ.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final List<String> LJIILIIL(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (C78915Uy7.LJIJJ(list)) {
            return arrayList;
        }
        for (String str : list) {
            if (str.contains("internal")) {
                arrayList.add(str.replace("internal", this.LIZ));
            } else if (str.contains("external")) {
                arrayList.add(str.replace("external", this.LIZJ));
            }
        }
        return arrayList;
    }

    public final long LIZ(File file, List<C64163PGd> list) {
        long j = 0;
        if (file != null && file.exists() && !LJIIJ(file)) {
            if (file.isFile()) {
                long length = file.length();
                if (length < this.LJIIIZ.LIZLLL) {
                    return length;
                }
                C64163PGd c64163PGd = new C64163PGd(this);
                c64163PGd.LIZLLL = false;
                c64163PGd.LIZ = file.getAbsolutePath();
                c64163PGd.LIZIZ = length;
                ((ArrayList) list).add(c64163PGd);
                return length;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                C64163PGd c64163PGd2 = new C64163PGd(this);
                c64163PGd2.LIZLLL = file.isDirectory();
                c64163PGd2.LIZ = file.getAbsolutePath();
                ArrayList arrayList = new ArrayList();
                c64163PGd2.LJFF = arrayList;
                ((ArrayList) list).add(c64163PGd2);
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists() && !LJIIJ(file2)) {
                        j += LIZ(file2, arrayList);
                    }
                }
                c64163PGd2.LIZIZ = j;
            }
        }
        return j;
    }

    public final JSONArray LJ(long j, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            BigDecimal bigDecimal = new BigDecimal(j);
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C64163PGd c64163PGd = (C64163PGd) it.next();
                if (LJIIJJI(c64163PGd)) {
                    c64163PGd.LIZJ = 0.0f;
                } else {
                    c64163PGd.LIZJ = (float) new BigDecimal(c64163PGd.LIZIZ).divide(bigDecimal, 4, 4).doubleValue();
                }
                List<C64163PGd> list2 = c64163PGd.LJFF;
                if (list2 != null) {
                    ArrayList arrayList2 = (ArrayList) list2;
                    if (arrayList2.size() > 0) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            C64163PGd c64163PGd2 = (C64163PGd) it2.next();
                            if (LJIIJJI(c64163PGd2)) {
                                c64163PGd2.LIZJ = 0.0f;
                            } else {
                                c64163PGd2.LIZJ = (float) new BigDecimal(c64163PGd2.LIZIZ).divide(bigDecimal, 4, 4).doubleValue();
                            }
                        }
                    }
                }
                jSONArray.put(c64163PGd.LIZIZ());
            }
            return jSONArray;
        }
        return null;
    }

    public static Method LJIIL(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public final List<C64166PGg> LIZIZ(String str, C65548Po0<C64167PGh> c65548Po0, C65548Po0<C64167PGh> c65548Po02, C65548Po0<C64167PGh> c65548Po03, List<String> list) {
        long j;
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        C64166PGg c64166PGg = new C64166PGg(this);
        c64166PGg.LIZ = str;
        c64166PGg.LIZIZ = new C64166PGg(this);
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        ArrayList arrayList2 = (ArrayList) list;
        if (arrayList2.contains(file.getAbsolutePath())) {
            arrayList.add(c64166PGg);
            arrayList2.remove(file.getAbsolutePath());
        }
        c64166PGg.LIZLLL = listFiles.length;
        LinkedList linkedList = new LinkedList();
        linkedList.offer(c64166PGg);
        while (!linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i = 0; i < size; i++) {
                C64166PGg c64166PGg2 = (C64166PGg) linkedList.poll();
                if (c64166PGg2 != null) {
                    String str2 = c64166PGg2.LIZ;
                    File file2 = new File(str2);
                    if (!file2.exists() || LJIIJ(file2)) {
                        c64166PGg2.LIZIZ.LIZLLL--;
                    } else if (file2.isFile()) {
                        long length = file2.length();
                        if (length < 0 || length > 17179869184L) {
                            j = 0;
                        } else {
                            j = 0;
                            c65548Po0.LIZ(new C64167PGh(this, str2, length, 1));
                        }
                        C64166PGg c64166PGg3 = c64166PGg2.LIZIZ;
                        if (c64166PGg3 != null) {
                            c64166PGg3.LIZ(length, c65548Po03, c65548Po02);
                            if (!c64166PGg2.LIZIZ.LJFF) {
                                long currentTimeMillis = System.currentTimeMillis() - file2.lastModified();
                                if (currentTimeMillis >= this.LJIIIZ.LJIIIIZZ && currentTimeMillis < 62899200000L && currentTimeMillis > j && length >= 104857600 && length <= 17179869184L) {
                                    c65548Po03.LIZ(new C64168PGi(this, str2, size, 0, currentTimeMillis));
                                }
                            }
                        }
                    } else {
                        if (arrayList2.contains(file2.getAbsolutePath())) {
                            arrayList.add(c64166PGg2);
                            arrayList2.remove(file2.getAbsolutePath());
                        }
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 == null || listFiles2.length == 0) {
                            c64166PGg2.LIZIZ.LIZ(0L, c65548Po03, c65548Po02);
                        } else {
                            c64166PGg2.LIZLLL = listFiles2.length;
                            for (File file3 : listFiles2) {
                                C64166PGg c64166PGg4 = new C64166PGg(this);
                                c64166PGg4.LIZIZ = c64166PGg2;
                                c64166PGg4.LIZ = file3.getAbsolutePath();
                                if (file3.isDirectory() && !c64166PGg2.LJFF) {
                                    long currentTimeMillis2 = System.currentTimeMillis() - file3.lastModified();
                                    if (currentTimeMillis2 >= this.LJIIIZ.LJIIIIZZ && currentTimeMillis2 < 62899200000L && currentTimeMillis2 > 0) {
                                        c64166PGg4.LJFF = true;
                                    }
                                }
                                linkedList.offer(c64166PGg4);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
