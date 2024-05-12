package com.bytedance.crash;

import X.C16880lQ;
import X.C1B6;
import X.C39153FYf;
import X.C48292IxM;
import X.C64214PIc;
import X.C64221PIj;
import X.C64222PIk;
import X.C64241PJd;
import X.C64257PJt;
import X.C64264PKa;
import X.C64267PKd;
import X.C64269PKf;
import X.C64272PKi;
import X.C64280PKq;
import X.C64303PLn;
import X.C78596Usy;
import X.C78685UuP;
import X.F85;
import X.InterfaceC63984P9g;
import X.InterfaceC64299PLj;
import X.InterfaceC64309PLt;
import X.InterfaceC64312PLw;
import X.InterfaceC64313PLx;
import X.InterfaceC64314PLy;
import X.InterfaceC64315PLz;
import X.PIX;
import X.PJA;
import X.PJC;
import X.PJG;
import X.PJN;
import X.PJP;
import X.PJR;
import X.PJT;
import X.PJY;
import X.PJZ;
import X.PK0;
import X.PK3;
import X.PK6;
import X.PKB;
import X.PKE;
import X.PKF;
import X.PKP;
import X.PKR;
import X.PKU;
import X.PKZ;
import X.PLD;
import X.PLF;
import X.PLQ;
import X.PLR;
import X.PM0;
import X.RunnableC64249PJl;
import X.X1D;
import Y.ARunnableS12S1100000_11;
import Y.ARunnableS16S1000000_11;
import Y.ARunnableS47S0100000_11;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.heaptracker.NativeHeapTracker;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.npth_fd_track.FDNativeTools;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.vmMonitor.NativeVMMonitor;
import com.bytedance.crash.vmMonitor.VMMonitor;
import com.bytedance.librarian.Librarian;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Npth {
    public static boolean sInit;

    public static void clean() {
        try {
            C64241PJd.LIZ();
        } catch (Throwable unused) {
        }
    }

    public static boolean hasCrashWhenNativeCrash() {
        return PKR.LJII;
    }

    public static boolean isRunning() {
        if (SystemClock.uptimeMillis() - PLD.LIZJ <= LivePlayEnforceIntervalSetting.DEFAULT) {
            return true;
        }
        return false;
    }

    public static void setAlogWriteAddr(long j) {
    }

    public static void setScriptStackCallback(InterfaceC64314PLy interfaceC64314PLy) {
    }

    public static void stopEnsure() {
        PKZ.LJII = true;
    }

    public static void stopUpload() {
        PKZ.LJI = true;
    }

    public static void openANRMonitor() {
        if (PKZ.LIZ) {
            C48292IxM.LIZJ(PK0.LIZ).LJII();
            PKZ.LIZJ = true;
        }
    }

    public static void openJavaCrashMonitor() {
        if (PKZ.LIZ && !PKZ.LIZIZ) {
            Context context = PK0.LIZ;
            PKR LJ = PKR.LJ();
            LJ.LIZIZ = new PK3(context, true);
            LJ.LIZJ = new PK3(context, false);
        }
    }

    public static boolean openNativeCrashMonitor() {
        if (PKZ.LIZ && !PKZ.LIZLLL) {
            boolean LJIJ = NativeImpl.LJIJ(PK0.LIZ);
            PKZ.LIZLLL = LJIJ;
            if (!LJIJ) {
                PKZ.LJ = true;
            }
        }
        return PKZ.LIZLLL;
    }

    public static void startFdTracker() {
        Context context = PK0.LIZ;
        C64264PKa.LIZJ(context);
        C64267PKd c64267PKd = new C64267PKd(context, new File(C78596Usy.LJJIIJ(context), i0.LJFF("npth/FDTracker/", PK0.LIZJ())));
        C78685UuP.LJJJLZIJ();
        C64303PLn.LIZ.LIZ();
        if (c64267PKd.LIZJ) {
            C78685UuP.LJJJLZIJ();
            return;
        }
        Context context2 = c64267PKd.LIZ;
        C78685UuP.LJJJLZIJ();
        if (!FDNativeTools.LIZ) {
            try {
                Librarian.LJFF(context2, "npth_fd_tracker");
                FDNativeTools.LIZ = true;
            } catch (Throwable unused) {
            }
        }
        if (!FDNativeTools.LIZ) {
            C78685UuP.LJJJLZIJ();
            return;
        }
        if (c64267PKd.LIZIZ != 0) {
            C78685UuP.LJJJLZIJ();
        } else {
            if (FDNativeTools.LIZJ(new String[]{c64267PKd.LJI, c64267PKd.LJII, String.valueOf(Build.VERSION.SDK_INT), String.valueOf(c64267PKd.LJIIIIZZ)}) == 0) {
                c64267PKd.LIZIZ = 1;
                c64267PKd.LIZJ = true;
                new C64280PKq(c64267PKd).start();
                return;
            }
            C78685UuP.LJJJLZIJ();
        }
    }

    public static void stopAnr() {
        if (PKZ.LIZ) {
            PKP pkp = (PKP) C48292IxM.LIZJ(PK0.LIZ).LIZ;
            if (pkp.LIZJ) {
                pkp.LIZJ = false;
                PLD pld = pkp.LIZ;
                if (pld != null) {
                    pld.LIZIZ = true;
                }
                if (PIX.LIZ) {
                    PIX.LIZ = false;
                }
                pkp.LIZ = null;
            }
            PKZ.LIZJ = false;
        }
    }

    public static JSONObject getActivityGroups() {
        C64272PKi.LIZ().getClass();
        return C64272PKi.LIZJ();
    }

    public static JSONArray getActivityLifeCycleEvents() {
        C64272PKi.LIZ().getClass();
        return C64272PKi.LIZIZ();
    }

    public static JSONArray getMapSizeTrace() {
        return C64222PIk.LIZ().LIZIZ();
    }

    public static JSONArray getMapSizeTraceTime() {
        List<Long> list = C64222PIk.LIZ().LIZIZ;
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public static long getVmMonitorDumpInfoCrashAddr() {
        VMMonitor.LIZJ().getClass();
        NativeVMMonitor.LJI().getClass();
        return NativeVMMonitor.LJII();
    }

    public static boolean hasCrash() {
        return PKZ.LIZJ();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return PKZ.LIZLLL();
    }

    public static ConfigManager getConfigManager() {
        return PK0.LJIIIIZZ;
    }

    public static boolean isANREnable() {
        return PKZ.LIZJ;
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return PKZ.LIZIZ;
    }

    public static boolean isNativeCrashEnable() {
        return PKZ.LIZLLL;
    }

    public static boolean isStopUpload() {
        return PKZ.LJI;
    }

    public static void addImportTags(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            PK0.LJIIIZ.addImportTags(map);
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            ((ConcurrentHashMap) PK0.LJIIIZ.LJLIL).putAll(map);
        }
    }

    public static void customActivityName(F85 f85) {
        C64269PKf.LIZLLL().LJIJJ = f85;
    }

    public static void dumpHprof(String str) {
        NativeTools.LJIILJJIL().LJI(str);
    }

    public static int dumpVMMonitorInfoCrash(int i) {
        return VMMonitor.LIZJ().dumpInfoCrash(i);
    }

    public static void enableGwpAsan(boolean z) {
        if (!NativeTools.LJIILJJIL().LJJIIZ()) {
            C78685UuP.LJIJJLI();
            return;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            if ((z || PK0.LJII() || "true".equals(null)) && !PJA.LIZLLL()) {
                startGwpAsan(true);
            }
        }
    }

    public static long getFileSize(String str) {
        NativeTools.LJIILJJIL().getClass();
        return NativeTools.LJIJJ(str);
    }

    public static long getFolderSize(String str) {
        NativeTools.LJIILJJIL().getClass();
        return NativeTools.LJIJJLI(str);
    }

    public static void registerANRCallback(InterfaceC64309PLt interfaceC64309PLt) {
        ((CopyOnWriteArrayList) PKZ.LJFF.LJ).add(interfaceC64309PLt);
    }

    public static void registerHprofCallback(IOOMCallback iOOMCallback) {
        ((CopyOnWriteArrayList) PKZ.LJFF.LIZLLL).add(iOOMCallback);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        ((CopyOnWriteArrayList) PKZ.LJFF.LIZJ).add(iOOMCallback);
    }

    public static void removeImportTag(String str) {
        PK0.LJIIIZ.addImportTag(str, null);
    }

    public static void removeTag(String str) {
        ((ConcurrentHashMap) PK0.LJIIIZ.LJLIL).remove(str);
    }

    public static void reportDartError(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C64214PIc.LIZ().LIZ(new PK6(System.currentTimeMillis(), str, null, null));
            } catch (Throwable unused) {
            }
        }
    }

    public static void reportError(Throwable th) {
        if (!PK0.LJIIIIZZ.isReportErrorEnable() || th == null) {
            return;
        }
        C64214PIc.LIZ().LIZ(new ARunnableS47S0100000_11(th, 137));
    }

    public static void setAlogFlushAddr(long j) {
    }

    public static void setAlogFlushV2Addr(long j) {
        NativeImpl.LJIILJJIL(j);
    }

    public static void setAlogLogDirAddr(long j) {
    }

    public static void setApplication(Application application) {
        if (application != null) {
            PK0.LIZIZ = application;
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            PK0.LJ = str;
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        PK0.LJIIIZ.mFilter = iCrashFilter;
    }

    public static void setCurProcessName(String str) {
        C64264PKa.LIZ = str;
    }

    public static void setEncryptImpl(InterfaceC63984P9g interfaceC63984P9g) {
        PK0.LJIIIIZZ.setEncryptImpl(interfaceC63984P9g);
    }

    public static void setFixDumpStack(boolean z) {
        PK0.LJIJJLI = z;
    }

    public static void setLogcatImpl(InterfaceC64312PLw interfaceC64312PLw) {
    }

    public static void setNpthStartEventDelayTime(long j) {
        PK0.LJIJ = j;
    }

    public static void setOpenNewAnrMonitor(boolean z) {
        PK0.LJI = z;
    }

    public static void setRequestIntercept(PM0 pm0) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        if (r7 > r9) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void startGwpAsan(boolean r10) {
        /*
            android.content.Context r6 = X.PK0.LIZ
            com.bytedance.crash.gwpasan.GwpAsan r5 = new com.bytedance.crash.gwpasan.GwpAsan
            java.io.File r4 = X.C78596Usy.LJIJJ(r6)
            org.json.JSONObject r1 = X.PJA.LJI()
            java.lang.String r0 = "gwp_asan_set_init_param"
            java.lang.String r3 = "custom_event_settings"
            java.lang.String r2 = "npth_simple_setting"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r0}
            org.json.JSONArray r0 = X.PJC.LIZJ(r1, r0)
            r5.<init>(r10, r6, r4, r0)
            boolean r0 = com.bytedance.crash.gwpasan.GwpAsan.LJIIIIZZ
            if (r0 == 0) goto L25
            X.C78685UuP.LJJJLZIJ()
        L24:
            return
        L25:
            android.content.Context r0 = X.PK0.LIZ
            java.io.File r4 = new java.io.File
            java.lang.String r1 = X.C78596Usy.LJJIIJ(r0)
            java.lang.String r0 = "npth/configCrash/"
            r4.<init>(r1, r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L47
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L47
            java.lang.String r0 = "cfgclose"
            boolean r0 = com.bytedance.crash.gwpasan.GwpAsan.LIZJ(r4, r0)
            if (r0 == 0) goto L47
            goto L24
        L47:
            r0 = 0
            com.bytedance.crash.gwpasan.GwpAsan.LJIIIZ = r0
            boolean r0 = X.PK0.LJII()
            r4 = 1
            if (r0 != 0) goto L5a
            java.lang.String r1 = "true"
            r0 = 0
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L68
        L5a:
            X.C78685UuP.LJJJLZIJ()
            com.bytedance.crash.gwpasan.GwpAsan.LJIIIZ = r4
        L5f:
            X.PKm r0 = new X.PKm
            r0.<init>(r5)
            r0.start()
            goto L24
        L68:
            android.content.Context r0 = X.PK0.LIZ
            java.io.File r4 = X.C78596Usy.LJIJJ(r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L7a
            boolean r0 = r4.isDirectory()
            if (r0 != 0) goto L7d
        L7a:
            r4.mkdirs()
        L7d:
            long r9 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r0
            java.lang.String r0 = "gwpfile"
            boolean r0 = com.bytedance.crash.gwpasan.GwpAsan.LIZJ(r4, r0)
            if (r0 == 0) goto L5f
            java.io.File r0 = com.bytedance.crash.gwpasan.GwpAsan.LJIILJJIL     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = X.PK8.LJ(r0)     // Catch: java.lang.Throwable -> Ld0
            long r7 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = "coredump_gwpasan_check_time"
            java.lang.String[] r0 = new java.lang.String[]{r3, r2, r0}     // Catch: java.lang.Throwable -> Ld0
            r6 = 7
            int r0 = X.PJA.LJIIIIZZ(r6, r0)     // Catch: java.lang.Throwable -> Ld0
            if (r0 <= r6) goto La4
            goto La5
        La4:
            r6 = r0
        La5:
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto Lc5
            long r3 = r9 - r7
            int r0 = r6 * 24
            int r0 = r0 * 3600
            long r1 = (long) r0     // Catch: java.lang.Throwable -> Ld0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb9
        Lb4:
            X.C78685UuP.LJJJLZIJ()
            goto L24
        Lb9:
            long r3 = r9 - r7
            int r0 = r6 * 24
            int r0 = r0 * 3600
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc5
            goto Lca
        Lc5:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L5f
            goto Lb4
        Lca:
            java.io.File r0 = com.bytedance.crash.gwpasan.GwpAsan.LJIILJJIL     // Catch: java.lang.Throwable -> Ld0
            X.PK8.LIZJ(r0)     // Catch: java.lang.Throwable -> Ld0
            goto L5f
        Ld0:
            r1 = move-exception
            X.PJY r0 = X.PJZ.LIZ
            r0.getClass()
            java.lang.String r0 = "NPTH_CATCH"
            X.PJY.LIZ(r0, r1)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.Npth.startGwpAsan(boolean):void");
    }

    public static void startMonitorScene(String str) {
        VMMonitor.LIZJ().LJI(1);
        if (str != null) {
            str.equals("");
        }
    }

    public static void startNativeHeapTracker(JSONArray jSONArray) {
        Context context = PK0.LIZ;
        new NativeHeapTracker(jSONArray, C64264PKa.LIZJ(context), new File(C78596Usy.LJJIIJ(context), "npth/NativeHeapTracker"), context).LIZLLL();
    }

    public static void startNativeVMMonitor(int i) {
        VMMonitor LIZJ = VMMonitor.LIZJ();
        LIZJ.getClass();
        if (i == 0 || !C64264PKa.LJII(PK0.LIZ)) {
            return;
        }
        if (NativeTools.LJIILJJIL().LJJIIZ()) {
            C78685UuP.LJIJJLI();
            return;
        }
        new PLR(LIZJ).start();
        C64303PLn.LIZ.LIZ();
        ByteHook.init();
        VMMonitor.LJII = new PLQ();
        VMMonitor.LJIIIIZZ = new PLQ();
        C78685UuP.LJIJJLI();
        Context context = PK0.LIZ;
        String LIZJ2 = PK0.LIZJ();
        String absolutePath = C78596Usy.LJJIII(context, LIZJ2).getAbsolutePath();
        String absolutePath2 = C78596Usy.LJIJI(context, LIZJ2).getAbsolutePath();
        File LJJII = C78596Usy.LJJII(context);
        File file = new File(C78596Usy.LJJIIJ(context), "npth/tmpFiles");
        if ((LJJII.exists() || LJJII.mkdirs()) && (file.exists() || file.mkdirs())) {
            NativeVMMonitor LJI = NativeVMMonitor.LJI();
            String absolutePath3 = file.getAbsolutePath();
            boolean LJIIIIZZ = Header.LJIIIIZZ();
            LJI.getClass();
            int LJIIIIZZ2 = NativeVMMonitor.LJIIIIZZ(i, absolutePath, LJIIIIZZ, absolutePath2, absolutePath3);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VMMonitor: init Native ret: ");
            LIZ.append(LJIIIIZZ2);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJIJJLI();
            if (LJIIIIZZ2 > 0) {
                if ((i & 1) != 0 && (LJIIIIZZ2 & 1) != 0) {
                    NativeVMMonitor.LJI().getClass();
                    LIZJ.LJFF = Math.max(0, NativeVMMonitor.LJ(7));
                    JSONArray LIZJ3 = PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "mmap_water_config");
                    if (LIZJ3 != null && LIZJ3.length() != 0) {
                        try {
                            LIZJ.LJI = LIZJ3.optInt(0) * 1024;
                            LIZJ.LJ = LIZJ3.optInt(1) * 1024;
                        } catch (Throwable unused) {
                        }
                    }
                    LIZJ.LIZ = new String[8];
                    try {
                        if (PJG.LIZIZ(PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "enable_api_level")) && PJG.LIZJ(PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "enable_device_brand"))) {
                            JSONArray LIZJ4 = PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "mmap_monitor_params");
                            LIZJ.LIZIZ = LIZJ4;
                            if (LIZJ4 == null || LIZJ4.length() <= 0) {
                                String[] strArr = LIZJ.LIZ;
                                strArr[0] = "dmabuf";
                                strArr[1] = "1048576";
                                strArr[2] = "1";
                                strArr[3] = "1";
                                strArr[4] = "5";
                            } else {
                                LIZJ.LIZ[0] = LIZJ.LIZIZ.optString(0);
                                LIZJ.LIZ[1] = VMMonitor.LJFF(LIZJ.LIZIZ.optString(1));
                                LIZJ.LIZ[2] = LIZJ.LIZIZ.optString(2);
                                LIZJ.LIZ[3] = LIZJ.LIZIZ.optString(3);
                                LIZJ.LIZ[4] = LIZJ.LIZIZ.optString(4);
                            }
                            C78685UuP.LJJJLZIJ();
                            NativeVMMonitor LJI2 = NativeVMMonitor.LJI();
                            String[] strArr2 = LIZJ.LIZ;
                            LJI2.getClass();
                            if (NativeVMMonitor.LIZ(strArr2) >= 0) {
                                VMMonitor.LJII.LIZ = true;
                                LIZJ.LJI(0);
                            }
                        }
                    } catch (Throwable th) {
                        PJZ.LIZ.getClass();
                        PJY.LIZ("NPTH_CATCH", th);
                    }
                    C78685UuP.LJIJJLI();
                }
                if ((i & 2) == 0 || (LJIIIIZZ2 & 2) == 0) {
                    return;
                }
                JSONArray LIZJ5 = PJC.LIZJ(PJA.LJI(), "custom_event_settings", "npth_simple_setting", "mprotect_monitor_prots");
                LIZJ.LIZJ = LIZJ5;
                if (LIZJ5 == null) {
                    return;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < LIZJ.LIZJ.length(); i3++) {
                    i2 |= 1 << LIZJ.LIZJ.optInt(i3);
                }
                NativeVMMonitor.LJI().getClass();
                if (NativeVMMonitor.LJIIIZ(i2) != 0) {
                    return;
                }
                VMMonitor.LJIIIIZZ.LIZ = true;
                VMMonitor.LJII(1);
                return;
            }
        }
        C78685UuP.LJIJJLI();
    }

    public static int startOptMtkBuffer(int i) {
        return NativeImpl.LJIIJJI(Build.VERSION.SDK_INT, i);
    }

    public static void stopMonitorScene(String str) {
        VMMonitor LIZJ = VMMonitor.LIZJ();
        LIZJ.getClass();
        PLQ plq = VMMonitor.LJII;
        if (plq == null || plq.LJI != 1 || plq.LJFF == 5) {
            return;
        }
        VMMonitor.LJIIIIZZ();
        LIZJ.LIZLLL = VMMonitor.LIZLLL();
        VMMonitor.LJIIIZ();
        C64272PKi.LIZ().getClass();
        Application application = PK0.LIZIZ;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(C64272PKi.LJ);
        }
        LIZJ.LIZIZ();
    }

    public static void reportError(String str) {
        if (!PK0.LJIIIIZZ.isReportErrorEnable() || str == null) {
            return;
        }
        C64214PIc.LIZ().LIZ(new ARunnableS16S1000000_11(str, 5));
    }

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            PK0.LJIIIZ.LIZ(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            PK0.LJIIIZ.LIZ(attachUserData, crashType);
        }
    }

    public static void addImportTag(String str, String str2) {
        PK0.LJIIIZ.addImportTag(str, str2);
    }

    public static void addTag(String str, String str2) {
        PKU pku = PK0.LJIIIZ;
        if (str2 == null) {
            ((ConcurrentHashMap) pku.LJLIL).remove(str);
        } else {
            ((ConcurrentHashMap) pku.LJLIL).put(str, str2);
        }
    }

    public static void addUserCrashInfoCallback(InterfaceC64299PLj interfaceC64299PLj, CrashType crashType) {
        if (interfaceC64299PLj != null) {
            PK0.LJIIIZ.addUserCrashInfoCallback(interfaceC64299PLj, crashType);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            init(context, iCommonParams, true, false, false);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            PK0.LJFF = true;
            init(context, iCommonParams, true, false, true, true);
        }
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        PLF plf = PKZ.LJFF;
        plf.getClass();
        if (crashType == CrashType.ALL) {
            plf.LIZ.addMulti(iCrashCallback, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
        } else {
            plf.LIZ.add(crashType, iCrashCallback);
        }
    }

    public static void registerCrashInfoCallback(C39153FYf c39153FYf, CrashType crashType) {
        PLF plf = PKZ.LJFF;
        plf.getClass();
        if (crashType == CrashType.ALL) {
            plf.LIZIZ.addMulti(c39153FYf, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
        } else {
            plf.LIZIZ.add(crashType, c39153FYf);
        }
    }

    public static void registerSdk(int i, String str) {
        if (PK0.LJIIJ == null) {
            synchronized (PK0.class) {
                if (PK0.LJIIJ == null) {
                    PK0.LJIIJ = new ConcurrentHashMap<>();
                }
            }
        }
        PK0.LJIIJ.put(Integer.valueOf(i), str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            PKU pku = PK0.LJIIIZ;
            synchronized (pku) {
                if (crashType == CrashType.ALL) {
                    pku.removeAll(attachUserData);
                } else {
                    pku.removeInList(crashType, attachUserData);
                }
            }
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            PKU pku = PK0.LJIIIZ;
            synchronized (pku) {
                if (crashType == CrashType.ALL) {
                    pku.removeAll(attachUserData);
                } else {
                    pku.removeInList(crashType, attachUserData);
                }
            }
        }
    }

    public static void removeCrashInfoCallback(InterfaceC64299PLj interfaceC64299PLj, CrashType crashType) {
        if (interfaceC64299PLj != null) {
            PK0.LJIIIZ.removeUserCrashInfoCallback(interfaceC64299PLj, crashType);
        }
    }

    public static void setAnrInfoFileObserver(String str, InterfaceC64313PLx interfaceC64313PLx) {
        C64214PIc.LIZ().LIZ(new ARunnableS12S1100000_11(interfaceC64313PLx, str, 1));
    }

    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            PK0.LJIIIZ.LIZ(attachUserData, crashType);
        }
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        PLF plf = PKZ.LJFF;
        plf.getClass();
        if (crashType == CrashType.ALL) {
            plf.LIZ.removeAll(iCrashCallback);
        } else {
            plf.LIZ.removeInList(crashType, iCrashCallback);
        }
    }

    public static void unregisterHprofCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        ((CopyOnWriteArrayList) PKZ.LJFF.LIZLLL).remove(iOOMCallback);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        ((CopyOnWriteArrayList) PKZ.LJFF.LIZJ).remove(iOOMCallback);
    }

    public static void registerSdk(String str, String str2) {
        PJC.LJIIJ(PK0.LJIIJJI, str, str2);
    }

    public static void enableALogCollector(String str, PKE pke, PKF pkf) {
        if (!TextUtils.isEmpty(str) && C1B6.LIZIZ(str)) {
            PKB LIZJ = PKB.LIZJ();
            LIZJ.LIZ = str;
            LIZJ.LIZIZ = pke;
            LIZJ.LIZJ = pkf;
            if (!LIZJ.LIZLLL) {
                LIZJ.LIZLLL = true;
            }
        }
    }

    public static void reportGameException(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        C64214PIc.LIZ().LIZ(new RunnableC64249PJl(str, str2, str3));
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i, String str) {
        synchronized (Npth.class) {
            PK0.LJFF = true;
            PK0.LJIILL = i;
            PK0.LJIILLIIL = str;
            init(context, iCommonParams, true, true, true, true);
        }
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, InterfaceC64315PLz interfaceC64315PLz) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C64214PIc.LIZ().LIZ(new PK6(System.currentTimeMillis(), str, map, map2));
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z, z, z2, z3);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z, z2, z3, z4, 0L);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (Npth.class) {
            Application application = PK0.LIZIZ;
            if (application == null) {
                if (context instanceof Application) {
                    application = (Application) context;
                    if (application.getBaseContext() == null) {
                        throw new IllegalArgumentException("Param 'application' have not called 'super.attachBaseContext()', please using 'baseContext' param and invoking 'Npth.setApplication(Application)' before init");
                    }
                } else {
                    application = (Application) C16880lQ.LLLLL(context);
                    if (application != null) {
                        if (application.getBaseContext() != null) {
                            context = application.getBaseContext();
                        }
                    } else {
                        throw new IllegalArgumentException("Couldn't obtain Application instance before 'super.attachBaseContext()', please invoking 'Npth.setApplication(Application)' before init.");
                    }
                }
            }
            init(application, context, iCommonParams, z, z2, z3, z4, j);
        }
    }

    public static synchronized void init(Application application, Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (Npth.class) {
            SystemClock.uptimeMillis();
            if (sInit) {
                return;
            }
            sInit = true;
            if (!PK0.LJIJI) {
                PK0.LJI(application, context);
                PK0.LJII = new C64257PJt(PK0.LIZ, iCommonParams, PK0.LIZIZ());
                PK0.LJIJI = true;
            }
            new C64221PIj();
            PKZ.LJ(application, context, z, z2, z3, z4);
            C64214PIc.LIZ().LIZ(new ARunnableS47S0100000_11(context, 21));
            PKZ.LJIIIIZZ = new PJR();
            PKZ.LJIIIZ = new PJP();
            PKZ.LJIIJJI = new PJN();
            PKZ.LJIIJ = new PJT();
        }
    }
}
