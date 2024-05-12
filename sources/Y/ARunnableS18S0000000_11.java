package Y;

import X.C09970aH;
import X.C10060aQ;
import X.C15280iq;
import X.C16880lQ;
import X.C25620zW;
import X.C39223FaN;
import X.C40392FtE;
import X.C40453FuD;
import X.C40883G2t;
import X.C43862HJi;
import X.C45439HsR;
import X.C61491OBj;
import X.C64212PIa;
import X.C64214PIc;
import X.C64241PJd;
import X.C64264PKa;
import X.C65077PgP;
import X.C65200PiO;
import X.C65254PjG;
import X.C65263PjP;
import X.C65264PjQ;
import X.C65265PjR;
import X.C65266PjS;
import X.C65271PjX;
import X.C65272PjY;
import X.C65275Pjb;
import X.C65276Pjc;
import X.C65277Pjd;
import X.C65284Pjk;
import X.C77412UZs;
import X.C78596Usy;
import X.C78685UuP;
import X.InterfaceC64073PCr;
import X.PJ5;
import X.PJ7;
import X.PJA;
import X.PJD;
import X.PJZ;
import X.PK0;
import X.PK8;
import X.PKO;
import X.PKQ;
import X.PMQ;
import X.PRZ;
import X.QM6;
import X.QM7;
import X.QM8;
import X.QOW;
import X.QST;
import X.QTK;
import X.R4D;
import X.X1D;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.common.graphics.GraphicsMonitor;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.monitor.collector.LockMonitorManager;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.net.impl.CronetLibraryLoader;
import com.twitter.sdk.android.core.TwitterSession;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS18S0000000_11 implements Runnable {
    public final int $t;

    public static final void run$2(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
    }

    public static final void run$32(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            default:
                return;
        }
    }

    public static void LIZ$0() {
        File file;
        String[] list;
        if (!C64264PKa.LJII(PK0.LIZ) || (list = (file = new File(C78596Usy.LJJIIJ(PK0.LIZ), "npth/ProcessTrack/")).list()) == null || list.length <= 25) {
            return;
        }
        Arrays.sort(list);
        for (int i = 0; i < list.length - 25; i++) {
            PK8.LIZJ(new File(file, list[i]));
        }
    }

    public static void LIZ$1() {
        try {
            if (!GraphicsMonitor.isPause) {
                GraphicsMonitor.openStatistical();
                Thread.sleep(GraphicsMonitor.sCollectWindow);
                GraphicsMonitor.closeStatistical();
                GraphicsMonitor.gpuLoadDataOnce = GraphicsMonitor.getStatisticOnceData();
                Iterator<PMQ> it = GraphicsMonitor.graphicsUpdateListeners.iterator();
                while (it.hasNext()) {
                    it.next().LIZ();
                }
                return;
            }
            GraphicsMonitor.gpuLoadDataOnce = -1.0d;
        } catch (Throwable unused) {
        }
    }

    public static void LIZ$3() {
        int i = PJ5.LIZIZ;
        if (i > 0) {
            PJ5.LIZIZ = i - 1;
            C78685UuP.LJJJLL();
            if (C64264PKa.LJII(PK0.LIZ)) {
                try {
                    IConfigManager LIZ = PJ5.LIZ();
                    if (LIZ != null) {
                        JSONObject jSONObject = new JSONObject(LIZ.queryConfig());
                        PJ5.LIZIZ = 0;
                        PJA.LJIILJJIL(PJ5.LIZJ(PK0.LIZIZ().LIZ(), jSONObject), true);
                        C78685UuP.LJJJLL();
                    }
                } catch (JSONException unused) {
                } catch (Throwable unused2) {
                    PJ5.LIZIZ = 0;
                }
            } else {
                PJ7.LIZLLL();
                if (PJ7.LIZIZ) {
                    PJ5.LIZIZ = 0;
                }
            }
        }
        if (PJ5.LIZIZ > 0) {
            if (C64264PKa.LJII(PK0.LIZ)) {
                C64214PIc.LIZ().LIZJ(PJ5.LIZ, LivePlayEnforceIntervalSetting.DEFAULT);
            } else {
                C64214PIc.LIZ().LIZJ(PJ5.LIZ, 60000L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        if (0 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        r6 = ((java.util.concurrent.CopyOnWriteArrayList) X.PC2.LIZ).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r6.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        r5 = (X.InterfaceC64047PBr) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        if (r4.isValid() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        if (X.C78248UnM.LJIIJ() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0085, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("monitorable invalid. ignored. ");
        r1.append(r4);
        X.X1D.LIZIZ(r1);
        r0 = X.C64028PAy.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        if (r0 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        r0.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007b, code lost:
    
        r5.LIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009c, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("monitorableHandler ");
        r1.append(r5);
        r1.append(" handle monitorable ");
        r1.append(r4);
        r1.append("failed.");
        X.C64028PAy.LIZJ("APM-Monitor", X.X1D.LIZIZ(r1), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00be, code lost:
    
        r2 = ((java.util.concurrent.CopyOnWriteArrayList) X.PC2.LIZJ).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ca, code lost:
    
        if (r2.hasNext() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d2, code lost:
    
        ((X.PC1) r2.next()).LIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d6, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00db, code lost:
    
        if (X.C78248UnM.LJIIJ() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        X.C64028PAy.LIZJ("APM-Monitor", "MonitorableHandleListener throws a Throwable", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ$4() {
        /*
        L0:
            java.util.concurrent.BlockingQueue<X.PBg> r0 = X.PC2.LIZLLL     // Catch: java.lang.Throwable -> Le3
            java.util.concurrent.LinkedTransferQueue r0 = (java.util.concurrent.LinkedTransferQueue) r0     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r4 = r0.take()     // Catch: java.lang.Throwable -> Le3
            X.PBg r4 = (X.InterfaceC64036PBg) r4     // Catch: java.lang.Throwable -> Le3
            java.util.List<X.PC3> r0 = X.PC2.LIZIZ     // Catch: java.lang.Throwable -> Le3
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch: java.lang.Throwable -> Le3
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> Le3
            r5 = 0
        L13:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r3 = "APM-Monitor"
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> Le3
            X.PC3 r2 = (X.PC3) r2     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r2.LIZ()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L13
            r5 = 1
            boolean r0 = X.C78248UnM.LJIIJ()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L0
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = "monitorable intercepted by "
            r1.append(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L51
            r1.append(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = " content: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L51
            r1.append(r4)     // Catch: java.lang.Throwable -> L51
            X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L51
            X.PAa r0 = X.C64028PAy.LIZ     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L0
            r0.LIZ()     // Catch: java.lang.Throwable -> L51
            goto L0
        L51:
            r1 = move-exception
            boolean r0 = X.C78248UnM.LJIIJ()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto L13
            java.lang.String r0 = "interceptor throws a Throwable"
            X.C64028PAy.LIZJ(r3, r0, r1)     // Catch: java.lang.Throwable -> Le3
            goto L13
        L5e:
            if (r5 == 0) goto L61
            goto L0
        L61:
            java.util.List<X.PBr> r0 = X.PC2.LIZ     // Catch: java.lang.Throwable -> Le3
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch: java.lang.Throwable -> Le3
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> Le3
        L69:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto Lbe
            java.lang.Object r5 = r6.next()     // Catch: java.lang.Throwable -> Le3
            X.PBr r5 = (X.InterfaceC64047PBr) r5     // Catch: java.lang.Throwable -> Le3
            boolean r0 = r4.isValid()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L7f
            r5.LIZ(r4)     // Catch: java.lang.Throwable -> L9c
            goto L69
        L7f:
            boolean r0 = X.C78248UnM.LJIIJ()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L69
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = "monitorable invalid. ignored. "
            r1.append(r0)     // Catch: java.lang.Throwable -> L9c
            r1.append(r4)     // Catch: java.lang.Throwable -> L9c
            X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L9c
            X.PAa r0 = X.C64028PAy.LIZ     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L69
            r0.LIZ()     // Catch: java.lang.Throwable -> L9c
            goto L69
        L9c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r0 = "monitorableHandler "
            r1.append(r0)     // Catch: java.lang.Throwable -> Le3
            r1.append(r5)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r0 = " handle monitorable "
            r1.append(r0)     // Catch: java.lang.Throwable -> Le3
            r1.append(r4)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r0 = "failed."
            r1.append(r0)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Le3
            X.C64028PAy.LIZJ(r3, r0, r2)     // Catch: java.lang.Throwable -> Le3
            goto L69
        Lbe:
            java.util.List<X.PC1> r0 = X.PC2.LIZJ     // Catch: java.lang.Throwable -> Le3
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch: java.lang.Throwable -> Le3
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> Le3
        Lc6:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto L0
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> Le3
            X.PC1 r0 = (X.PC1) r0     // Catch: java.lang.Throwable -> Le3
            r0.LIZ(r4)     // Catch: java.lang.Throwable -> Ld6
            goto Lc6
        Ld6:
            r1 = move-exception
            boolean r0 = X.C78248UnM.LJIIJ()     // Catch: java.lang.Throwable -> Le3
            if (r0 == 0) goto Lc6
            java.lang.String r0 = "MonitorableHandleListener throws a Throwable"
            X.C64028PAy.LIZJ(r3, r0, r1)     // Catch: java.lang.Throwable -> Le3
            goto Lc6
        Le3:
            r2 = move-exception
            java.lang.String r1 = "APM"
            java.lang.String r0 = "Oh, Damn it!!!"
            X.C64028PAy.LIZJ(r1, r0, r2)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS18S0000000_11.LIZ$4():void");
    }

    public static void LIZ$5() {
        File file = PKQ.LIZJ;
        file.mkdirs();
        if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_all_worker") == 1) {
            PKQ.LIZ();
            PKQ.LJIIJ = true;
        }
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || !str.contains("aries")) {
            String str2 = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str2) || !str2.contains("yteDance")) {
                NativeTools.LJIILJJIL().LJJIJIL(System.currentTimeMillis(), file.getAbsolutePath(), new File(PKQ.LIZJ, "pid_tid").getAbsolutePath());
                return;
            }
        }
        if (!PKQ.LJIIJ) {
            PKQ.LIZ();
            PKQ.LJIIJ = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ$6() {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS18S0000000_11.LIZ$6():void");
    }

    public static void LIZ$2() {
        try {
            StackTraceElement[] stackTrace = C16880lQ.LLJJJJ().getThread().getStackTrace();
            if (C09970aH.LJII() && stackTrace != null) {
                new TimeoutException("main thread task execute more than 100 ms").setStackTrace(stackTrace);
            }
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("\tat ");
                LIZ.append(stackTraceElement.getClassName());
                sb.append(X1D.LIZIZ(LIZ));
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append("(");
                sb.append(stackTraceElement.getFileName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(")\n");
            }
            new IllegalStateException(sb.toString()).getStackTrace();
        } catch (Throwable th) {
            C10060aQ.LIZ.LIZIZ(th, "block_deal_exception");
        }
    }

    public ARunnableS18S0000000_11(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            PRZ.LIZ("boot_finish").LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        try {
            String LJIIIIZZ = C45439HsR.LJIIIIZZ(C16880lQ.LLJJJJ().getThread().getStackTrace());
            BlockingQueue<String> blockingQueue = LockMonitorManager.sStackBlockingQueue;
            synchronized (blockingQueue) {
                if (blockingQueue.size() != 0) {
                    blockingQueue.clear();
                }
                blockingQueue.put(LJIIIIZZ);
            }
        } catch (Throwable unused) {
        }
    }

    public static final void run$11(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            C15280iq.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            C15280iq.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            C15280iq.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            C15280iq.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            CronetLibraryLoader.LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        Application application;
        C65263PjP c65263PjP = C65263PjP.LJI;
        c65263PjP.LIZ.LIZIZ();
        c65263PjP.LIZIZ.LIZIZ();
        c65263PjP.LIZ();
        C43862HJi c43862HJi = c65263PjP.LJ;
        C65264PjQ c65264PjQ = c65263PjP.LIZ;
        C65254PjG LIZ = c65263PjP.LIZ();
        C65266PjS c65266PjS = C65265PjR.LIZ().LIZIZ;
        String str = "";
        if (TextUtils.isEmpty("")) {
            str = "https://syndication.twitter.com";
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("TwitterKit/", "3.0", " (Android ");
        LIZIZ.append(Build.VERSION.SDK_INT);
        LIZIZ.append(") ");
        LIZIZ.append("TwitterCore");
        LIZIZ.append("/");
        LIZIZ.append("3.2.0.11");
        C65284Pjk.LIZ = new C65200PiO(c43862HJi, c65264PjQ, LIZ, c65266PjS, new C65077PgP(str, X1D.LIZIZ(LIZIZ)));
        C65277Pjd<TwitterSession> c65277Pjd = c65263PjP.LIZJ;
        C65272PjY c65272PjY = C65265PjR.LIZ().LJ;
        c65277Pjd.getClass();
        C65275Pjb c65275Pjb = new C65275Pjb(c65277Pjd);
        C65271PjX c65271PjX = c65272PjY.LIZ;
        if (c65271PjX != null && (application = c65271PjX.LIZIZ) != null) {
            C65276Pjc c65276Pjc = new C65276Pjc(c65275Pjb);
            application.registerActivityLifecycleCallbacks(c65276Pjc);
            ((HashSet) c65271PjX.LIZ).add(c65276Pjc);
        }
    }

    public static final void run$18(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        try {
            Iterator it = C64241PJd.LIZLLL.entrySet().iterator();
            while (it.hasNext()) {
                List list = (List) ((Map.Entry) it.next()).getValue();
                if (list != null && !list.isEmpty()) {
                    list.clear();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static final void run$20(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            C64241PJd.LJ().LJII();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            C64214PIc.LIZ().LIZLLL.removeCallbacks(aRunnableS18S0000000_11);
            if (PJ7.LIZ(null)) {
                PJ5.LIZIZ = 40;
                C64214PIc.LIZ().LIZ(PJ5.LIZ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        QM7 qm7 = new QM7();
        qm7.LIZJ("share_sdk_read_time_out");
        qm7.LIZLLL();
        QM6.LJ(new QM8("", "time out", false, 8));
    }

    public static final void run$23(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        C40883G2t c40883G2t = new C40883G2t();
        c40883G2t.LIZLLL("previous_uid", R4D.LJ);
        C40453FuD.LIZIZ((Bundle) c40883G2t.LIZ, new C40392FtE(true));
    }

    public static final void run$24(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("alpha-play-");
            LIZ2.append(LLLLIIIILLL.getName());
            LLLLIIIILLL.setName(X1D.LIZIZ(LIZ2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            List list = C61491OBj.LJLJLJ;
            if (list != null) {
                Iterator it = ((CopyOnWriteArrayList) list).iterator();
                while (it.hasNext()) {
                    ((InterfaceC64073PCr) it.next()).LIZ();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            File file = PKO.LIZ;
            synchronized (PKO.class) {
                PKO.LIZ = null;
                PKO.LJIIIZ = null;
                PKO.LIZIZ = null;
            }
            PK8.LIZJ(file);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            if (NativeTools.LJIILJJIL().LJJI()) {
                PK8.LIZJ(PKO.LJIIIZ());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        try {
            new C64212PIa().start();
        } catch (Throwable unused) {
        }
    }

    public static final void run$29(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        try {
            LIZ$4();
            throw null;
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$3(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            QTK.LJJJLZIJ().LJJLIIJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            PRZ.LIZ("app_launch").LJ();
            PRZ.LIZ("app_launch").LJIIL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            PRZ.LIZ("app_launch").LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            PKO.LJI();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            PKO.LJI();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            QST.LIZIZ(201, System.currentTimeMillis() - QST.LIZLLL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            if (QOW.LJIIIIZZ) {
                QOW.LIZIZ.LJII(2, QOW.LIZLLL);
            } else {
                QOW.LIZIZ.LJII(1, QOW.LIZLLL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            PJD.LIZIZ("npthStart", null, C77412UZs.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            PKQ.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        try {
            NativeTools.LJIILJJIL().LJIILIIL();
        } catch (Throwable th) {
            try {
                PJZ.LIZIZ(th, "NPTH_ANR_MONITOR_ERROR");
            } catch (Throwable unused) {
            }
        }
    }

    public static final void run$9(ARunnableS18S0000000_11 aRunnableS18S0000000_11) {
        boolean LIZ;
        try {
            NativeTools.LJIILJJIL().LJJIIJZLJL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS18S0000000_11(JSONObject jSONObject, int i) {
        this.$t = i;
    }
}
