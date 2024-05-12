package X;

import Y.ARunnableS17S0110000_11;
import Y.ARunnableS18S0000000_11;
import Y.ARunnableS47S0100000_11;
import android.os.Build;
import android.os.Process;
import com.bytedance.crash.util.NativeTools;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKQ {
    public static boolean LIZ;
    public static File LIZIZ;
    public static File LIZJ;
    public static File LIZLLL;
    public static LinkedList<C64273PKj> LJ;
    public static C64311PLv<Integer, C64273PKj> LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static final ConcurrentLinkedQueue<InterfaceC64310PLu> LJIIIIZZ = new ConcurrentLinkedQueue<>();
    public static volatile boolean LJIIIZ = false;
    public static boolean LJIIJ = false;
    public static final Object LJIIJJI = new Object();

    public static void LIZ() {
        if (LJII) {
            return;
        }
        LJII = true;
        if (!PK0.LJI && PLD.LIZLLL) {
            File file = LIZJ;
            C78685UuP.LJJJLL();
            new PthreadThread(new ARunnableS47S0100000_11(file, 127), "worker_anr_monitor").start();
        }
    }

    public static void LIZIZ() {
        File file = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/killHistory");
        LIZJ = file;
        file.mkdirs();
        LIZLLL = new File(LIZJ, "kill_info");
        File file2 = LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("proc/");
        LIZ2.append(Process.myPid());
        File file3 = new File(file2, X1D.LIZIZ(LIZ2));
        LIZIZ = file3;
        file3.mkdirs();
        try {
            PK8.LJIILJJIL(new File(file3, "cmd"), C64264PKa.LIZJ(PK0.LIZ), false);
            PK8.LJIILJJIL(new File(file3, "app_start_time"), String.valueOf(PK0.LIZJ), false);
        } catch (IOException unused) {
            C78685UuP.LJJ();
        } catch (Throwable unused2) {
        }
    }

    public static JSONArray LIZLLL() {
        long currentTimeMillis;
        File[] listFiles = new File(LIZJ, "proc/").listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (File file : listFiles) {
            long LIZJ2 = LIZJ(-1L, file.getName());
            if (LIZJ2 >= 0 && NativeTools.LJIILJJIL().LJJIJIIJI((int) LIZJ2)) {
                JSONObject jSONObject = new JSONObject();
                PJC.LJIIJ(jSONObject, "pid", Long.valueOf(LIZJ2));
                try {
                    currentTimeMillis = LIZJ(System.currentTimeMillis(), PK8.LJ(new File(file, "app_start_time")));
                } catch (IOException unused) {
                    currentTimeMillis = System.currentTimeMillis();
                }
                PJC.LJIIJ(jSONObject, "start_time", Long.valueOf(currentTimeMillis));
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public static void LJI() {
        if (LJIIIZ) {
            return;
        }
        synchronized (LJIIJJI) {
            if (LJIIIZ) {
                return;
            }
            LJIIIZ = true;
            C78685UuP.LJJJLZIJ();
            File[] listFiles = new File(LIZJ, "proc/").listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                long LIZJ2 = LIZJ(-1L, file.getName());
                if (LIZJ2 != -1 && LIZJ2 != Process.myPid()) {
                    int i = (int) LIZJ2;
                    if (!NativeTools.LJIILJJIL().LJJIJIIJI(i)) {
                        LJFF(i, null);
                    }
                }
            }
            C64214PIc.LIZ().LIZ(new ARunnableS18S0000000_11(35));
        }
    }

    public static PK7 LJ(JSONArray jSONArray) {
        File file;
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        LJI();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("pid");
                long optLong = optJSONObject.optLong("start_time");
                if (optInt > 0 && optLong > 0) {
                    File LIZJ2 = C64263PJz.LIZJ(optLong);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(C77123UOp.LJJIII().format(new Date(optLong)));
                    LIZ2.append("_");
                    LIZ2.append(optInt);
                    String[] list = LIZJ2.list(new C64296PLg(X1D.LIZIZ(LIZ2)));
                    if (list == null || list.length == 0) {
                        file = new File(LIZJ, KMP.LJ("proc/", optInt));
                        if (!file.exists()) {
                        }
                    } else {
                        file = new File(LIZJ2, list[0]);
                    }
                    arrayList.add(file);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        File[] fileArr = new File[arrayList.size()];
        arrayList.toArray(fileArr);
        return new PK7(fileArr, false);
    }

    public static void LJIIIIZZ(boolean z) {
        int LJIIIIZZ2;
        int length;
        if (Build.VERSION.SDK_INT < 30 || PKZ.LJI || PKZ.LJII) {
            return;
        }
        if (LJI && !z) {
            return;
        }
        LJI = true;
        LinkedList<C64273PKj> linkedList = LJ;
        if (linkedList == null) {
            LJ = new LinkedList<>();
            LJFF = new C64311PLv<>();
            long currentTimeMillis = System.currentTimeMillis();
            File file = LIZLLL;
            if (!file.exists()) {
                linkedList = LJ;
            } else {
                String[] list = file.list();
                if (list == null || list.length == 0) {
                    linkedList = LJ;
                } else {
                    Arrays.sort(list);
                    if (list.length == 0 || list.length <= (LJIIIIZZ2 = PJA.LJIIIIZZ(5, "custom_event_settings", "npth_simple_setting", "kill_history_limit"))) {
                        length = 0;
                    } else {
                        Arrays.sort(list);
                        for (int i = 0; i < list.length - LJIIIIZZ2; i++) {
                            PK8.LIZJ(new File(LIZLLL, list[i]));
                        }
                        length = list.length - LJIIIIZZ2;
                    }
                    for (int i2 = length; i2 < list.length && i2 < length + 5; i2++) {
                        String str = list[i2];
                        File file2 = new File(file, str);
                        C64273PKj LJII2 = LJII(str, file2, currentTimeMillis);
                        if (LJII2 == null) {
                            PK8.LIZJ(file2);
                        } else {
                            LJ.add(LJII2);
                            Iterator<PLW> it = LJII2.LIZJ.iterator();
                            while (it.hasNext()) {
                                LJFF.add(Integer.valueOf((int) it.next().LIZ), LJII2);
                            }
                        }
                    }
                    linkedList = LJ;
                }
            }
        }
        if (!PKS.LIZIZ) {
            PKS.LIZIZ = true;
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    PKS.LIZJ();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        C64214PIc.LIZ().LIZ(new ARunnableS17S0110000_11(linkedList, z, 9));
    }

    public static long LIZJ(long j, String str) {
        try {
            return Long.decode(str).longValue();
        } catch (Throwable unused) {
            return j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012a A[EDGE_INSN: B:78:0x012a->B:46:0x012a BREAK  A[LOOP:0: B:11:0x0086->B:77:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(int r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKQ.LJFF(int, java.lang.String):void");
    }

    public static C64273PKj LJII(String str, File file, long j) {
        try {
            long longValue = Long.decode(str).longValue();
            if (j - longValue < 1000) {
                return null;
            }
            try {
                return new C64273PKj(longValue, file, new File(file, "info.txt"));
            } catch (Throwable unused) {
                PK8.LIZJ(file);
                return null;
            }
        } catch (Throwable unused2) {
            PK8.LIZJ(file);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:29|30|(1:34))|36|(11:59|60|39|(4:51|52|(1:54)(1:57)|55)|41|(1:50)|43|44|45|46|47)|38|39|(0)|41|(0)|43|44|45|46|47) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(X.C64273PKj r19, java.io.File r20, long r21, java.io.File r23) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKQ.LJIIIZ(X.PKj, java.io.File, long, java.io.File):void");
    }
}
