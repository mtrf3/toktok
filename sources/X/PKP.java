package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import defpackage.b1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKP {
    public static long LJIIJJI;
    public static long LJIIL;
    public static long LJIILIIL;
    public static final List<String> LJIILJJIL;
    public static Pattern LJIILL;
    public static String LJIILLIIL;
    public static volatile boolean LJIIZILJ;
    public PLD LIZ;
    public final Context LIZIZ;
    public volatile boolean LIZJ;
    public File LJ;
    public final PKY LJII;
    public long LJIIIIZZ;
    public PLA LJIIIZ;
    public File LJIIJ;
    public long LIZLLL = -1;
    public boolean LJFF = true;
    public final Object LJI = new Object();

    static {
        ArrayList arrayList = new ArrayList();
        LJIILJJIL = arrayList;
        C29822Bn8.LIZJ(arrayList, "kworker", "kswapd", "mmcqd", "dex2oat");
        C29822Bn8.LIZJ(arrayList, "system_server", "lmkd", "zygote", "init");
        C29822Bn8.LIZJ(arrayList, "surfaceflinger", "mediaserver", "audioserver", "adbd");
        C29822Bn8.LIZJ(arrayList, "logd", "irq", "logcat", "rcu");
        arrayList.add("tombstoned");
        arrayList.add("netd");
        arrayList.add("cameraserver");
        LJIILLIIL = "";
        LJIIZILJ = false;
    }

    public static boolean LIZIZ() {
        boolean LJI = C64264PKa.LJI(PK0.LIZ);
        if (LJI) {
            C64269PKf LIZLLL = C64269PKf.LIZLLL();
            LIZLLL.getClass();
            if (SystemClock.uptimeMillis() - LIZLLL.LJIIZILJ <= 2000) {
                return false;
            }
            return LJI;
        }
        return LJI;
    }

    public final File LJII() {
        if (this.LJIIJ == null) {
            File LLIIJLIL = C16880lQ.LLIIJLIL(this.LIZIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("npth/has_anr_signal_");
            LIZ.append(C64264PKa.LIZJ(this.LIZIZ).replaceAll(":", "_"));
            this.LJIIJ = new File(LLIIJLIL, X1D.LIZIZ(LIZ));
        }
        return this.LJIIJ;
    }

    public PKP(Context context) {
        PKY pky = new PKY();
        this.LJII = pky;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = new PLA();
        this.LIZIZ = context;
        String LIZJ = C64264PKa.LIZJ(context);
        context.getPackageName();
        pky.LIZ.LJIILL = LIZJ;
        if (PIX.LIZ) {
            return;
        }
        PIX.LIZ = true;
        PIX.LIZIZ = 100;
        PIX.LJ = 300;
        PIX.LIZJ = new ArrayList();
        PJJ pjj = new PJJ();
        PJA.LIZ.add(pjj);
        if (PJA.LIZIZ) {
            pjj.LIZ();
        }
        PIX.LJFF(PIX.LJ());
    }

    public static void LIZ(PKN pkn) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) PKZ.LJFF.LJ;
        if (copyOnWriteArrayList.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("all_thread_stacks", pkn.LIZ.opt("all_thread_stacks"));
                jSONObject.put("data", pkn.LIZ.optString("data"));
                jSONObject.toString();
            } catch (Throwable unused) {
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC64309PLt) it.next()).LIZ();
                } catch (Throwable th) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                }
            }
        }
    }

    public static String LJFF(long j) {
        long j2 = j - PK0.LIZJ;
        if (j2 < 30000) {
            return "0 - 30s";
        }
        if (j2 < 60000) {
            return "30s - 1min";
        }
        if (j2 < 120000) {
            return "1min - 2min";
        }
        if (j2 < LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            return "2min - 5min";
        }
        if (j2 < 600000) {
            return "5min - 10min";
        }
        if (j2 < 1800000) {
            return "10min - 30min";
        }
        if (j2 < 3600000) {
            return "30min - 1h";
        }
        return "1h - ";
    }

    public static long[] LJI(JSONArray jSONArray) {
        long[] jArr = {0, 0};
        if (jSONArray == null) {
            return jArr;
        }
        long j = 0;
        long j2 = 0;
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                if (JSONObjectProtectorUtils.getInt(JSONArrayProtectorUtils.getJSONObject(jSONArray, i2), "type") == 8) {
                    j += JSONObjectProtectorUtils.getInt(JSONArrayProtectorUtils.getJSONObject(jSONArray, i2), "cpuDuration");
                    j2 += JSONObjectProtectorUtils.getInt(JSONArrayProtectorUtils.getJSONObject(jSONArray, i2), "duration");
                    i++;
                }
            } catch (Throwable unused) {
            }
        }
        if (i > 0) {
            long j3 = i;
            jArr[0] = j / j3;
            jArr[1] = j2 / j3;
        }
        return jArr;
    }

    public static int[] LJIIIIZZ(JSONArray jSONArray) {
        int i;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String optString = jSONArray.optString(i2);
            if (optString != null && !optString.isEmpty()) {
                i = optString.indexOf("utm=");
            } else {
                i = -1;
            }
            if (i > 0) {
                if (LJIILL == null) {
                    LJIILL = PatternProtector.compile("[^0-9]+");
                }
                String[] split = LJIILL.split(optString.substring(i));
                if (split != null && split.length >= 2) {
                    int intValue = Integer.decode(split[1]).intValue();
                    int intValue2 = Integer.decode(split[2]).intValue();
                    return new int[]{intValue, intValue2, intValue + intValue2};
                }
                return null;
            }
        }
        return null;
    }

    public final void LJ(long j) {
        PLA pla = this.LJIIIZ;
        if (pla.LJI != null) {
            return;
        }
        pla.LIZIZ = PIX.LIZ();
        this.LJIIIZ.LJI = PIX.LIZJ();
        this.LJIIIZ.LJFF = PIX.LIZLLL(j);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x02a2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0261 A[Catch: all -> 0x0245, TryCatch #5 {all -> 0x0245, blocks: (B:139:0x0215, B:148:0x0249, B:155:0x0261, B:160:0x0235, B:163:0x0225), top: B:138:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[LOOP:1: B:21:0x0071->B:23:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r37, X.PKY r38) {
        /*
            Method dump skipped, instructions count: 2314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKP.LIZLLL(java.lang.String, X.PKY):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x006e, code lost:
    
        if ((android.os.SystemClock.uptimeMillis() - r2.LJIIZILJ) <= 2000) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        if (r15 == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(long r18, org.json.JSONArray r20) {
        /*
            Method dump skipped, instructions count: 1403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKP.LIZJ(long, org.json.JSONArray):void");
    }

    public final void LJIIJJI(long j, JSONArray jSONArray) {
        try {
            synchronized (PKP.class) {
                while (LJIIZILJ) {
                    try {
                        PKP.class.wait();
                    } catch (Throwable unused) {
                    }
                }
                LJIIZILJ = true;
            }
            LIZJ(j, jSONArray);
            synchronized (PKP.class) {
                LJIIZILJ = false;
                PKP.class.notifyAll();
            }
        } catch (Throwable th) {
            try {
                PJZ.LIZ.getClass();
                PJY.LIZ("NPTH_CATCH", th);
                synchronized (PKP.class) {
                    LJIIZILJ = false;
                    PKP.class.notifyAll();
                }
            } catch (Throwable th2) {
                synchronized (PKP.class) {
                    LJIIZILJ = false;
                    PKP.class.notifyAll();
                    throw th2;
                }
            }
        }
    }

    public final void LJIIL(long j, JSONArray jSONArray) {
        JSONObject jSONObject;
        if (jSONArray == null && !this.LJIIIZ.LJIIJ) {
            if (!Header.LJIIIZ()) {
                File LJJIIZI = C78596Usy.LJJIIZI();
                C64263PJz.LIZ("anr_trace", LJJIIZI.getParentFile().getName());
                long uptimeMillis = SystemClock.uptimeMillis();
                if (NativeTools.LJIILJJIL().LIZIZ(LJJIIZI.getAbsolutePath(), false)) {
                    this.LJIIIZ.LJIIIZ = SystemClock.uptimeMillis() - uptimeMillis;
                }
                C64263PJz.LIZ("after_trace", LJJIIZI.getParentFile().getName());
                try {
                    jSONArray = PK8.LJIIIIZZ(LJJIIZI.getAbsolutePath());
                } catch (IOException unused) {
                    jSONArray = new JSONArray();
                } catch (Throwable th) {
                    jSONArray = new JSONArray();
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th);
                }
            } else {
                jSONArray = new JSONArray();
            }
        }
        PLA pla = this.LJIIIZ;
        pla.LJIIJ = true;
        if (jSONArray != null) {
            try {
                pla.LIZJ = jSONArray;
                pla.LJ = System.currentTimeMillis();
                this.LIZLLL = this.LJIIIZ.LJ;
                LJ(j);
                this.LJIIIZ.LJII = new JSONObject();
                C64264PKa.LJ(this.LIZIZ, this.LJIIIZ.LJII);
                this.LJIIIZ.LJIIIIZZ = LIZIZ();
                this.LJFF = !PKZ.LIZJ();
            } catch (Throwable unused2) {
            }
            try {
                Pair<JSONObject, JSONObject> LJIIJ = LJIIJ(this.LJIIIZ.LIZJ, this.LJII, true);
                PLA pla2 = this.LJIIIZ;
                pla2.LIZ = (JSONObject) LJIIJ.first;
                pla2.LIZLLL = (JSONObject) LJIIJ.second;
            } catch (Throwable unused3) {
            }
            PLA pla3 = this.LJIIIZ;
            if (pla3.LIZ == null) {
                try {
                    jSONObject = C64278PKo.LIZIZ(PKW.LJ(C16880lQ.LLJJJJ().getThread().getStackTrace()));
                } catch (Throwable th2) {
                    PJZ.LIZ.getClass();
                    PJY.LIZ("NPTH_CATCH", th2);
                    jSONObject = null;
                }
                pla3.LIZ = jSONObject;
            }
            PLA pla4 = this.LJIIIZ;
            if (pla4.LIZLLL == null) {
                pla4.LIZLLL = PKW.LIZIZ(null);
            }
            File LJIJ = C78596Usy.LJIJ(PK0.LIZ);
            LJIJ.mkdirs();
            C1XY.LIZJ(LJIJ);
        }
    }

    public static Pair<JSONObject, JSONObject> LJIIJ(JSONArray jSONArray, PKY pky, boolean z) {
        JSONObject jSONObject;
        String str = null;
        if (jSONArray == null) {
            return new Pair<>(null, null);
        }
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        String str2 = null;
        int i = 0;
        boolean z2 = false;
        JSONObject jSONObject2 = null;
        while (i < jSONArray.length()) {
            String optString = jSONArray.optString(i);
            if (TextUtils.isEmpty(optString)) {
                JSONObject LJIIIZ = LJIIIZ(jSONArray4, str, jSONArray2, pky, z);
                if (LJIIIZ != null) {
                    jSONObject2 = LJIIIZ;
                }
                if (jSONArray4.length() > 0) {
                    jSONArray4 = new JSONArray();
                }
            } else {
                if (!z2) {
                    if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                        z2 = true;
                    } else {
                        jSONArray3.put(optString);
                        i++;
                        str2 = null;
                    }
                }
                if (optString.contains(" prio=")) {
                    JSONObject LJIIIZ2 = LJIIIZ(jSONArray4, str, jSONArray2, pky, z);
                    if (LJIIIZ2 != null) {
                        jSONObject2 = LJIIIZ2;
                    }
                    str2 = optString.substring(1, optString.indexOf(34, 1));
                    if (!z || !"main".equals(str2)) {
                        StringBuilder LIZJ = b1.LIZJ(str2, "  (");
                        LIZJ.append(optString.substring(optString.indexOf(34, 2) + 1));
                        LIZJ.append(" )");
                        str2 = X1D.LIZIZ(LIZJ);
                    }
                    if (jSONArray4.length() > 0) {
                        jSONArray4 = new JSONArray();
                    }
                    jSONArray4.put(optString);
                } else {
                    if (TextUtils.isEmpty(str)) {
                        jSONArray3.put(optString);
                    } else {
                        jSONArray4.put(optString);
                    }
                    i++;
                    str2 = null;
                }
            }
            str = str2;
            i++;
            str2 = null;
        }
        if (pky != null) {
            pky.LJI.LIZIZ("max_utm_thread", pky.LJIIIIZZ);
            pky.LJI.LIZIZ("max_stm_thread", pky.LJIIIZ);
            pky.LJI.LIZIZ("max_utm_stm_thread", pky.LJIIJ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("end trace: ");
            LIZ.append(pky.LJIIJ);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJJJLZIJ();
            int[] iArr = pky.LJII;
            iArr[2] = 0;
            iArr[1] = 0;
            iArr[0] = 0;
            pky.LJIIIIZZ = "unknown";
            pky.LJIIIZ = "unknown";
            pky.LJIIJ = "unknown";
        }
        if (jSONArray2.length() > 0) {
            jSONObject = new JSONObject();
            PJC.LJIIJ(jSONObject, "thread_all_count", Integer.valueOf(jSONArray2.length()));
            PJC.LJIIJ(jSONObject, "thread_stacks", jSONArray2);
            LJIIJJI = jSONArray2.length();
        } else {
            jSONObject = null;
        }
        return new Pair<>(jSONObject2, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e A[Catch: all -> 0x018c, TRY_LEAVE, TryCatch #3 {all -> 0x018c, blocks: (B:76:0x0178, B:78:0x017e), top: B:75:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LJIIIZ(org.json.JSONArray r23, java.lang.String r24, org.json.JSONArray r25, X.PKY r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PKP.LJIIIZ(org.json.JSONArray, java.lang.String, org.json.JSONArray, X.PKY, boolean):org.json.JSONObject");
    }
}
