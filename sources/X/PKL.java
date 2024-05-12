package X;

import Y.ARunnableS15S0101000_11;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.heaptracker.NativeHeapTracker;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKL {
    public static final String[] LJIIIIZZ = {"G.0", "G.1", "G.2", "G.3", "G.4", "G.5"};
    public static final String[] LJIIIZ = {"lock", "logEventStack"};
    public static final String[] LJIIJ = {"header.bin", "javastack.txt"};
    public static final String[] LJIIJJI = {"maps_oom.txt", "maps_base.txt", "map_size.txt"};
    public static volatile PKL LJIIL;
    public static File LJIILIIL;
    public final Context LIZ;
    public HashMap<String, C64266PKc> LIZLLL;
    public volatile boolean LJ;
    public final List<File> LIZIZ = new ArrayList();
    public int LIZJ = -1;
    public final ARunnableS47S0100000_11 LJFF = new ARunnableS47S0100000_11(this, 86);
    public final ARunnableS47S0100000_11 LJI = new ARunnableS47S0100000_11(this, 87);
    public final ARunnableS15S0101000_11 LJII = new ARunnableS15S0101000_11(this, 7);

    public final void LJIJJ() {
        this.LJ = true;
        NativeImpl.LJIILLIIL();
        ConcurrentLinkedQueue<PL6> concurrentLinkedQueue = PL6.LIZ;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        Iterator<PL6> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            try {
                it.next().getClass();
            } catch (Throwable unused) {
            }
        }
    }

    public static PKL LJIIJJI() {
        if (LJIIL == null) {
            synchronized (PKL.class) {
                if (LJIIL == null) {
                    LJIIL = new PKL(PK0.LIZ);
                }
            }
        }
        return LJIIL;
    }

    public static boolean LJIIL() {
        try {
            File file = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/configCrash/");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (file.exists() && file.isDirectory() && LIZLLL(file, "cfgclose")) {
                long lastModified = LJIILIIL.lastModified() / 1000;
                if (currentTimeMillis >= lastModified && currentTimeMillis - lastModified >= 604800) {
                    PK8.LIZJ(LJIILIIL);
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
            return false;
        }
    }

    public final void LJIIJ() {
        if (this.LJ || PKZ.LJI) {
            return;
        }
        if (C48008Ism.LIZJ(this.LIZ)) {
            LJIILIIL();
        } else {
            C64214PIc.LIZ().LIZJ(this.LJFF, 5000L);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:129|(2:130|131)|(5:135|(7:137|138|139|(1:141)|(4:323|324|(3:327|328|(1:330))|326)(1:143)|(27:148|(1:150)|151|152|(1:317)(3:(1:156)(1:315)|157|(4:163|(1:165)|166|(3:308|309|310)(1:168)))|169|170|171|(2:301|302)(1:173)|174|175|176|177|178|179|180|181|(1:183)(1:291)|(1:185)(1:290)|186|187|188|(1:190)|191|(2:193|(3:195|(1:197)(1:199)|198))|(16:211|212|(6:264|265|(3:270|271|(1:273)(2:274|275))|276|271|(0)(0))|214|215|(1:217)(2:259|260)|218|219|220|(3:222|223|224)(1:252)|225|(3:227|(2:229|(1:244))(1:245)|231)(3:246|247|248)|232|233|234|(1:238))(3:201|202|203)|204)(3:319|320|321)|207)(2:341|342)|205|206|207)|345|346|347|205|206|207|127) */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x033f, code lost:
    
        if (r16 < r1.LIZIZ) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x05fe, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04b6 A[Catch: all -> 0x05cc, TryCatch #21 {all -> 0x05cc, blocks: (B:275:0x04b2, B:273:0x04b6, B:214:0x04b9, B:281:0x04a7, B:265:0x0487, B:267:0x0493, B:270:0x049a), top: B:274:0x04b2, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKL.LJIILIIL():void");
    }

    public PKL(Context context) {
        this.LIZ = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZJ(X.PKM r12) {
        /*
            X.PKz r0 = r12.LIZ
            r6 = 0
            if (r0 == 0) goto L12
            X.PKw r0 = r0.LIZIZ
            boolean r0 = r0.LIZ()
        Lb:
            r5 = 0
            if (r0 != 0) goto L14
            r12.LJIILIIL()
            return r5
        L12:
            r0 = 0
            goto Lb
        L14:
            X.PKU r0 = X.PK0.LJIIIZ
            com.bytedance.crash.ICrashFilter r2 = r0.getCrashFilter()
            java.lang.String r4 = "NPTH_CATCH"
            if (r2 == 0) goto L35
            java.lang.String r1 = r12.LIZLLL()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = ""
            boolean r0 = r2.onNativeCrashFilter(r1, r0)     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L35
            r0 = 0
            goto L36
        L2c:
            r1 = move-exception
            X.PJY r0 = X.PJZ.LIZ
            r0.getClass()
            X.PJY.LIZ(r4, r1)
        L35:
            r0 = 1
        L36:
            if (r0 != 0) goto L3c
            r12.LJIILIIL()
            return r5
        L3c:
            java.lang.String r9 = "header"
            java.lang.String r10 = "update_version_code"
            X.PKN r3 = new X.PKN     // Catch: java.lang.Throwable -> Ld6
            r3.<init>()     // Catch: java.lang.Throwable -> Ld6
            r12.LJIIIIZZ(r3)     // Catch: java.lang.Throwable -> Ld6
            r12.LJI(r3)     // Catch: java.lang.Throwable -> Ld6
            r12.LIZJ(r3)     // Catch: java.lang.Throwable -> Ld6
            X.PKz r0 = r12.LIZ     // Catch: java.lang.Throwable -> Ld6
            X.PKX r0 = r0.LIZ     // Catch: java.lang.Throwable -> Ld6
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LJI     // Catch: java.lang.Throwable -> Ld6
            X.PKM.LJIIL(r3, r0)     // Catch: java.lang.Throwable -> Ld6
            r12.LJII(r3)     // Catch: java.lang.Throwable -> Ld6
            r12.LJIIJJI(r3)     // Catch: java.lang.Throwable -> Ld6
            X.PKz r0 = r12.LIZ     // Catch: java.lang.Throwable -> Ld6
            java.io.File r0 = r0.LIZJ     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> Ld6
            android.content.Context r0 = X.PK0.LIZ     // Catch: java.lang.Throwable -> Ld6
            java.io.File r0 = X.C78596Usy.LJIJI(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            org.json.JSONArray r1 = X.C78897Uxp.LJIJJLI(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "logcat"
            r3.LJIIJJI(r0, r1)     // Catch: java.lang.Throwable -> Ld6
            r12.LJIIJ(r3)     // Catch: java.lang.Throwable -> Ld6
            r12.LJIIIZ(r3)     // Catch: java.lang.Throwable -> Ld6
            org.json.JSONObject r1 = r3.LIZ     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = "filters"
            org.json.JSONObject r11 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L97
            X.PKU r8 = X.PK0.LJIIIZ     // Catch: java.lang.Throwable -> L97
            org.json.JSONObject r1 = r3.LIZ     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = "app_start_time"
            long r0 = r1.optLong(r0)     // Catch: java.lang.Throwable -> L97
            org.json.JSONObject r7 = r3.LIZ     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "process_name"
            java.lang.String r2 = r7.optString(r2)     // Catch: java.lang.Throwable -> L97
            r8.getImportTags(r11, r0, r2)     // Catch: java.lang.Throwable -> L97
        L97:
            X.PKz r0 = r12.LIZ     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto Lac
            X.PKw r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r0 = r0.LIZ     // Catch: java.lang.Throwable -> Ld6
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Ld6
        La1:
            java.lang.Object r1 = r0.get(r10)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Ld6
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Ld6
            goto Lae
        Lac:
            r0 = r5
            goto La1
        Lae:
            if (r0 != 0) goto Ld3
            java.lang.Long r0 = java.lang.Long.decode(r1)     // Catch: java.lang.Throwable -> Ld3
            long r1 = r0.longValue()     // Catch: java.lang.Throwable -> Ld3
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto Ld3
            org.json.JSONObject r0 = r3.LIZ     // Catch: java.lang.Throwable -> Ld3
            org.json.JSONObject r0 = r0.optJSONObject(r9)     // Catch: java.lang.Throwable -> Ld3
            r0.put(r10, r1)     // Catch: java.lang.Throwable -> Ld3
            org.json.JSONObject r0 = r3.LIZ     // Catch: java.lang.Throwable -> Ld3
            org.json.JSONObject r1 = r0.optJSONObject(r9)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "version_get_time"
            r1.put(r0, r6)     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            org.json.JSONObject r5 = r3.LIZ     // Catch: java.lang.Throwable -> Ld6
            goto Ldf
        Ld6:
            r1 = move-exception
            X.PJY r0 = X.PJZ.LIZ
            r0.getClass()
            X.PJY.LIZ(r4, r1)
        Ldf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKL.LIZJ(X.PKM):org.json.JSONObject");
    }

    public static void LJ(File file) {
        String[] list = file.list();
        if (list == null || list.length <= 10) {
            return;
        }
        try {
            Arrays.sort(list);
            int i = 0;
            for (String str : list) {
                i++;
                if (i > 10) {
                    PK8.LIZJ(new File(file, str));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJFF(boolean z) {
        if (PKZ.LJI) {
            return;
        }
        if (z) {
            if (this.LIZLLL == null) {
                HashMap<String, C64266PKc> hashMap = new HashMap<>();
                this.LIZLLL = hashMap;
                try {
                    LJIILLIIL(hashMap);
                    LJIILL(this.LIZLLL);
                    try {
                        PKZ.LIZ(PJC.LJFF(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "gwp_asan_monitor_path"));
                    } catch (Throwable th) {
                        PJZ.LIZ.getClass();
                        PJY.LIZ("NPTH_CATCH", th);
                    }
                    LJIIZILJ(this.LIZLLL, null);
                    PK8.LIZJ(new File(C78596Usy.LJJIIJ(this.LIZ), "npth/CrashLogSimple"));
                    LJIJ(this.LIZLLL, null);
                    ((PJR) PKZ.LJIIIIZZ).getClass();
                    File[] listFiles = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/NativeHeapTracker").listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (!file.isFile()) {
                                try {
                                    NativeHeapTracker.LJIIIZ(file);
                                } catch (Throwable th2) {
                                    PJZ.LIZ.getClass();
                                    PJY.LIZ("NPTH_CATCH", th2);
                                }
                            }
                        }
                    }
                    PKZ.LIZ(PJC.LJFF(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "gwp_asan_monitor_path"));
                    PKV.LIZLLL();
                    PKZ.LIZIZ();
                    PKQ.LJIIIIZZ(false);
                } catch (Throwable th3) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th3);
                }
                if (this.LIZLLL.isEmpty()) {
                    LJIJJ();
                } else {
                    LJIIJ();
                }
            }
            PK8.LIZJ(new File(C78596Usy.LJJIIJ(this.LIZ), "npth/alogCrash"));
            LJII(true);
            return;
        }
        LJII(false);
    }

    public final void LJII(boolean z) {
        Context context = this.LIZ;
        if (C78596Usy.LJLJJL == null) {
            if (context == null) {
                context = PK0.LIZ;
            }
            C78596Usy.LJLJJL = new File(C78596Usy.LJJIIJ(context), "npth/asan");
        }
        File[] listFiles = C78596Usy.LJLJJL.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        PKM pkm = new PKM(this.LIZ);
        ArrayList arrayList = new ArrayList();
        Context context2 = this.LIZ;
        if (C78596Usy.LJLJJL == null) {
            if (context2 == null) {
                context2 = PK0.LIZ;
            }
            C78596Usy.LJLJJL = new File(C78596Usy.LJJIIJ(context2), "npth/asan");
        }
        LJI(C78596Usy.LJLJJL, arrayList);
        File[] listFiles2 = C78596Usy.LJIL(this.LIZ).listFiles();
        if (listFiles2.length != 0) {
            for (int i = 0; i < listFiles2.length && i < 5; i++) {
                ((ArrayList) this.LIZIZ).addAll(arrayList);
                if (!((ArrayList) this.LIZIZ).isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    LJIIIIZZ(C78596Usy.LJIL(this.LIZ), arrayList2);
                    if (arrayList2.size() == 0) {
                        for (int i2 = 0; i2 < ((ArrayList) this.LIZIZ).size(); i2++) {
                            LJIIIZ(pkm, (File) ListProtector.get(this.LIZIZ, i2), C78596Usy.LJIL(this.LIZ), z);
                        }
                    } else if (arrayList2.size() > 0) {
                        for (int i3 = 0; i3 < ((ArrayList) this.LIZIZ).size(); i3++) {
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                if (((String) ListProtector.get(arrayList2, i4)).equals(((File) ListProtector.get(this.LIZIZ, i3)).getName())) {
                                    ListProtector.remove(this.LIZIZ, i3);
                                }
                            }
                        }
                        if (((ArrayList) this.LIZIZ).size() > 0) {
                            for (int i5 = 0; i5 < ((ArrayList) this.LIZIZ).size(); i5++) {
                                LJIIIZ(pkm, (File) ListProtector.get(this.LIZIZ, i5), C78596Usy.LJIL(this.LIZ), z);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            LJIIIZ(pkm, (File) ListProtector.get(arrayList, i6), C78596Usy.LJIL(this.LIZ), z);
        }
    }

    public final void LJIILL(HashMap<String, C64266PKc> hashMap) {
        File[] listFiles = new File(C78596Usy.LJIIZILJ(this.LIZ), "asdawd").listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (!file.isDirectory()) {
                    PK8.LIZJ(file);
                } else if (file.getName().endsWith("G")) {
                    String name = file.getName();
                    if (hashMap.get(name) == null) {
                        hashMap.put(name, new C64266PKc(name));
                    }
                } else {
                    PK8.LIZJ(file);
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
                PK8.LIZJ(file);
            }
        }
    }

    public final void LJIILLIIL(HashMap<String, C64266PKc> hashMap) {
        File[] listFiles = C78596Usy.LJIIZILJ(this.LIZ).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (!file.getName().equals("asdawd")) {
                    if (!file.isDirectory()) {
                        PK8.LIZJ(file);
                    } else if (file.getName().endsWith("G")) {
                        String name = file.getName();
                        LJIJI(file);
                        if (hashMap.get(name) == null) {
                            hashMap.put(name, new C64266PKc(name));
                        }
                    } else {
                        PK8.LIZJ(file);
                    }
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
                PK8.LIZJ(file);
            }
        }
    }

    public final void LJIJI(File file) {
        File file2 = new File(C78596Usy.LJJII(this.LIZ).getAbsolutePath(), file.getName());
        if (!file2.exists()) {
            return;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            PK8.LIZJ(file2);
            return;
        }
        for (File file3 : listFiles) {
            String absolutePath = file.getAbsolutePath();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("predump_");
            LIZ.append(file3.getName());
            file3.renameTo(new File(absolutePath, X1D.LIZIZ(LIZ)));
        }
        PK8.LIZJ(file2);
    }

    public static boolean LIZLLL(File file, String str) {
        for (File file2 : file.listFiles()) {
            try {
                if (!file2.isDirectory() && file2.getName().startsWith(str) && file2.length() >= 0) {
                    LJIILIIL = file2.getAbsoluteFile();
                    return true;
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
            }
        }
        return false;
    }

    public static void LJI(File file, List list) {
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file2 = listFiles[i];
            try {
                if (file2.isDirectory()) {
                    LJI(file2, list);
                } else {
                    ((ArrayList) list).add(file2);
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
                PK8.LIZJ(file2);
            }
        }
    }

    public static void LJIIIIZZ(File file, List list) {
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file2 = listFiles[i];
            try {
                if (file2.isDirectory()) {
                    LJIIIIZZ(file2, list);
                } else if (file2.getName().contains("asan_report.")) {
                    ((ArrayList) list).add(file2.getName());
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
                PK8.LIZJ(file2);
            }
        }
    }

    public static void LJIIZILJ(HashMap<String, C64266PKc> hashMap, FilenameFilter filenameFilter) {
        File[] listFiles;
        File file;
        if (filenameFilter == null) {
            listFiles = C78596Usy.LJIJJLI(PK0.LIZ).listFiles();
        } else {
            listFiles = C78596Usy.LJIJJLI(PK0.LIZ).listFiles(filenameFilter);
        }
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, Collections.reverseOrder());
        int i = 0;
        for (int i2 = 0; i2 < listFiles.length && i < 5; i2++) {
            File file2 = listFiles[i2];
            try {
                if (file2.getName().contains("deleted") || new File(file2, "deleted").exists()) {
                    PK8.LIZJ(file2);
                } else {
                    if (file2.isFile()) {
                        file = file2;
                    } else {
                        file = new File(file2, "lock");
                    }
                    if (file.exists()) {
                        try {
                            int LJJIIZI = NativeTools.LJIILJJIL().LJJIIZI(file.getAbsolutePath());
                            if (LJJIIZI > 0) {
                                NativeTools.LJIILJJIL().LJJIJL(LJJIIZI);
                            }
                        } catch (Throwable th) {
                            PJZ.LIZ.getClass();
                            PJY.LIZ("NPTH_CATCH", th);
                        }
                    }
                    PKR LJ = PKR.LJ();
                    if (!LJ.LJFF.containsKey(file2.getName())) {
                        if (file2.isFile()) {
                            PK8.LIZJ(file2);
                        } else if (LIZIZ(hashMap, file2, file2.getName())) {
                            i++;
                        }
                    }
                }
            } catch (Throwable th2) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th2);
            }
        }
    }

    public static void LJIJ(HashMap<String, C64266PKc> hashMap, FilenameFilter filenameFilter) {
        File[] listFiles;
        if (filenameFilter == null) {
            listFiles = C78596Usy.LJIL(PK0.LIZ).listFiles();
        } else {
            listFiles = C78596Usy.LJIL(PK0.LIZ).listFiles(filenameFilter);
        }
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (!file.isDirectory() || file.getName().contains("deleted") || new File(file, "deleted").exists()) {
                    PK8.LIZJ(file);
                } else if (file.getName().endsWith("G")) {
                    String name = file.getName();
                    C64266PKc c64266PKc = hashMap.get(name);
                    if (c64266PKc == null) {
                        c64266PKc = new C64266PKc(name);
                        hashMap.put(name, c64266PKc);
                    }
                    ((ArrayList) c64266PKc.LIZJ).add(new PLI(file, CrashType.NATIVE));
                } else {
                    PK8.LIZJ(file);
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
                PK8.LIZJ(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.util.HashMap<java.lang.String, X.C64266PKc> r9, java.io.File r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "G"
            boolean r0 = r11.endsWith(r0)
            r3 = 0
            if (r0 == 0) goto Lb9
            java.lang.String r0 = "_"
            java.lang.String[] r6 = r11.split(r0)
            int r1 = r6.length
            r0 = 5
            if (r1 >= r0) goto L17
            X.PK8.LIZJ(r10)
            return r3
        L17:
            r0 = r6[r3]     // Catch: java.lang.Throwable -> La0
            long r1 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> La0
            r0 = 4
            r0 = r6[r0]     // Catch: java.lang.Throwable -> La0
            long r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> La0
            r0 = 2
            r5 = r6[r0]
            r8 = 1
            r7 = r6[r8]
            r7.getClass()
            int r6 = r7.hashCode()
            r0 = -1109843021(0xffffffffbdd923b3, float:-0.10602512)
            if (r6 == r0) goto L94
            r0 = 96741(0x179e5, float:1.35563E-40)
            if (r6 == r0) goto L88
            r0 = 3254818(0x31aa22, float:4.560971E-39)
            if (r6 == r0) goto L7c
        L40:
            r7 = 0
        L41:
            java.lang.Object r6 = r9.get(r5)
            X.PKc r6 = (X.C64266PKc) r6
            if (r6 != 0) goto L51
            X.PKc r6 = new X.PKc
            r6.<init>(r5)
            r9.put(r5, r6)
        L51:
            X.PLI r5 = new X.PLI
            r5.<init>(r10, r1, r7)
            r5.LIZJ = r3
            X.PLI r0 = r6.LIZLLL
            if (r0 == 0) goto L64
            long r3 = r0.LIZIZ
            long r1 = r5.LIZIZ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L74
        L64:
            if (r7 == 0) goto L74
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.ANR
            if (r7 == r0) goto L74
            java.lang.String r0 = "ignore"
            boolean r0 = r11.contains(r0)
            if (r0 != 0) goto L74
            r6.LIZLLL = r5
        L74:
            java.util.List<X.PLI> r0 = r6.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r5)
            return r8
        L7c:
            java.lang.String r0 = "java"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L85
            goto L40
        L85:
            com.bytedance.crash.CrashType r7 = com.bytedance.crash.CrashType.JAVA
            goto L41
        L88:
            java.lang.String r0 = "anr"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L91
            goto L40
        L91:
            com.bytedance.crash.CrashType r7 = com.bytedance.crash.CrashType.ANR
            goto L41
        L94:
            java.lang.String r0 = "launch"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L9d
            goto L40
        L9d:
            com.bytedance.crash.CrashType r7 = com.bytedance.crash.CrashType.LAUNCH
            goto L41
        La0:
            X.PK8.LIZJ(r10)
            X.PJY r2 = X.PJZ.LIZ
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "err format crashTime:"
            java.lang.String r0 = defpackage.i0.LJFF(r0, r11)
            r1.<init>(r0)
            r2.getClass()
            java.lang.String r0 = "NPTH_CATCH"
            X.PJY.LIZ(r0, r1)
            return r3
        Lb9:
            X.PK8.LIZJ(r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKL.LIZIZ(java.util.HashMap, java.io.File, java.lang.String):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:38|(1:40)|41|(21:139|140|44|45|46|48|49|50|51|52|(1:54)(1:133)|55|(1:57)(1:132)|58|59|60|(1:62)|63|(2:65|(3:67|(1:69)(1:71)|70))|72|(11:79|80|81|(3:98|99|(4:101|102|103|(2:105|106)))|83|84|85|87|(1:89)|90|91)(2:122|(3:124|125|126)(1:127)))|43|44|45|46|48|49|50|51|52|(0)(0)|55|(0)(0)|58|59|60|(0)|63|(0)|72|(3:74|76|78)(1:129)|79|80|81|(0)|83|84|85|87|(0)|90|91) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01bf, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148 A[Catch: all -> 0x023a, TryCatch #10 {all -> 0x023a, blocks: (B:60:0x0140, B:62:0x0148, B:63:0x0152, B:65:0x0156, B:67:0x0166, B:70:0x016f, B:72:0x0171, B:74:0x017c, B:76:0x018b, B:122:0x0199, B:125:0x01a9, B:79:0x01ae), top: B:59:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156 A[Catch: all -> 0x023a, TryCatch #10 {all -> 0x023a, blocks: (B:60:0x0140, B:62:0x0148, B:63:0x0152, B:65:0x0156, B:67:0x0166, B:70:0x016f, B:72:0x0171, B:74:0x017c, B:76:0x018b, B:122:0x0199, B:125:0x01a9, B:79:0x01ae), top: B:59:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022c A[Catch: all -> 0x0234, TryCatch #7 {all -> 0x0234, blocks: (B:85:0x0210, B:89:0x022c, B:90:0x022f), top: B:84:0x0210 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(X.C64266PKc r34, boolean r35, X.C64250PJm r36) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKL.LJIJJLI(X.PKc, boolean, X.PJm):void");
    }

    public static JSONObject LJIILJJIL(String str, JSONObject jSONObject, String str2, boolean z) {
        boolean z2;
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        } else if (z) {
            jSONObject.remove("header");
        }
        String str3 = null;
        String optString = optJSONObject.optString("sdk_version_name", null);
        if (optString == null) {
            optString = "3.1.7-rc.51.oversea";
        }
        PKN.LJIILIIL(optString, "filters", "sdk_version", jSONObject);
        JSONArray optJSONArray = jSONObject.optJSONArray("logcat");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            jSONObject.put("logcat", C78897Uxp.LJIJJLI(C78596Usy.LJIJI(PK0.LIZ, str)));
        }
        PKN.LJIILIIL("true", "filters", "has_dump", jSONObject);
        PKN.LJIILIIL(String.valueOf(Header.LJIIIIZZ()), "filters", "is_64_devices", jSONObject);
        PKN.LJIILIIL(String.valueOf(NativeTools.LJIILJJIL().LJJIIZ()), "filters", "is_64_runtime", jSONObject);
        PKN.LJIILIIL(String.valueOf(Header.LJIIIZ()), "filters", "is_x86_devices", jSONObject);
        PKN.LJIILIIL(String.valueOf(PKM.LIZIZ()), "filters", "is_root", jSONObject);
        PKN.LJIILIIL(String.valueOf(PC9.LIZIZ()), "filters", "is_hm_os", jSONObject);
        try {
            str3 = System.getProperty("os.version");
        } catch (Throwable unused) {
        }
        PKN.LJIILIIL(str3, "filters", "kernel_version", jSONObject);
        jSONObject.put("launch_did", C37214Ej4.LIZJ(PK0.LIZ));
        jSONObject.put("crash_uuid", str2);
        jSONObject.put("jiffy", PLY.LIZ());
        jSONObject.put("has_dump", "true");
        if (jSONObject.opt("storage") == null) {
            PKN.LJIJJLI(jSONObject, PIW.LIZ());
        }
        if (optJSONObject.has("params_err")) {
            PKN.LJIILIIL(optJSONObject.optString("params_err"), "filters", "params_err", jSONObject);
        }
        C64254PJq.LIZ(jSONObject);
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("event_type", "start_crash");
            Object remove = jSONObject.remove("data");
            if (remove != null) {
                jSONObject.put("stack", remove);
            }
            jSONObject2.put("data", new JSONArray().put(jSONObject));
            jSONObject2.put("header", optJSONObject);
            return jSONObject2;
        }
        jSONObject.put("isJava", 1);
        return jSONObject;
    }

    public final void LJIIIZ(PKM pkm, File file, File file2, boolean z) {
        if (file.exists() && file2.exists()) {
            File file3 = new File(file2, PK0.LJ());
            if (!file3.exists()) {
                file3.mkdir();
            }
            pkm.LIZIZ = new C39620Fgm(file.getPath());
            pkm.LIZ = new C64289PKz(file3);
            file3.getName();
            if (C78596Usy.LJIL(this.LIZ).listFiles() == null) {
                throw new NullPointerException("array-length");
            }
            PK8.LIZ(Integer.MAX_VALUE, file, new File(file3, file.getName()), false);
            try {
                PKN pkn = new PKN();
                pkm.LJI(pkn);
                pkm.LJFF(pkn);
                PKM.LJIIL(pkn, pkm.LIZIZ.LIZJ);
                pkm.LJIIIZ(pkn);
                File file4 = new File(pkm.LIZ.LIZJ, "upload.json");
                JSONObject jSONObject = pkn.LIZ;
                Header header = new Header();
                header.LJI(pkn.LIZ.optJSONObject("header"));
                pkn.LJIIZILJ(header);
                Header.LIZ(header);
                PKN LIZIZ = Header.LIZIZ(pkn.LIZ.optLong("app_start_time", 0L), pkn.LIZ.optLong("crash_time", 0L), pkn.LIZ.optString("process_name"));
                if (PJC.LJII(header.LIZ)) {
                    pkn.LJIJ(LIZIZ.LJIIIIZZ().LIZ);
                } else {
                    PJC.LIZIZ(header.LIZ, LIZIZ.LJIIIIZZ().LIZ);
                }
                PJC.LIZIZ(pkn.LJII(), LIZIZ.LJII());
                if (header.LIZ.has("params_err")) {
                    PKN.LJIILIIL(header.LIZ.optString("params_err"), "filters", "params_err", pkn.LIZ);
                }
                PK8.LJIILLIIL(file4, jSONObject);
                if (jSONObject != null && jSONObject.length() != 0) {
                    if (z && jSONObject.length() != 0) {
                        File file5 = new File(file3, "dump.zip");
                        C64248PJk.LIZIZ().getClass();
                        try {
                            if (C63986P9i.LJIIJ(CrashType.ASAN.getName(), C63986P9i.LJFF(PK0.LJIIIIZZ.getAsanReportUploadUrl(), jSONObject.optJSONObject("header")), jSONObject.toString(), null, new PK7(file5, true), new PK7(PJ7.LIZIZ(), false), new PK7(file3, true)).LIZ()) {
                                PK8.LIZJ(file);
                                if (!pkm.LJIILIIL()) {
                                    C64250PJm.LJIIIIZZ(file3);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Throwable unused) {
                            C78685UuP.LJLIL();
                            return;
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
            }
            pkm.LJIILIIL();
        }
    }

    public static PKA LIZ(File file, CrashType crashType, String str, long j, long j2) {
        boolean z;
        PKA pka = null;
        try {
            if (file.isFile()) {
                PK8.LIZJ(file);
            } else {
                if (crashType == CrashType.LAUNCH) {
                    z = true;
                } else {
                    z = false;
                }
                if (crashType == null || new File(file, file.getName()).exists() || crashType == CrashType.ANR) {
                    return PK8.LIZLLL(new File(file, file.getName()).getAbsolutePath());
                }
                pka = PK8.LJIIJ(file, crashType);
                JSONObject jSONObject = pka.LIZIZ;
                if (jSONObject != null) {
                    jSONObject.put("crash_time", j);
                    jSONObject.put("app_start_time", j2);
                    try {
                        JSONObject LJIILJJIL = LJIILJJIL(str, jSONObject, file.getName(), z);
                        try {
                            JSONObject optJSONObject = LJIILJJIL.optJSONObject("filters");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                                LJIILJJIL.put("filters", optJSONObject);
                            }
                            PK0.LJIIIZ.getImportTags(optJSONObject, j2, LJIILJJIL.optString("process_name"));
                        } catch (Throwable unused) {
                        }
                        pka.LIZIZ = LJIILJJIL;
                    } catch (Throwable unused2) {
                    }
                } else {
                    PK8.LIZJ(file);
                }
            }
        } catch (Throwable th) {
            PK8.LIZJ(file);
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
        return pka;
    }
}
