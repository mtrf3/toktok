package X;

import Y.ARunnableS21S0000000_15;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.OkHttp3Instrumentation;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.socialbase.downloader.service.IDownloadMultiProcService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.X3g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84212X3g {
    public static volatile Context LIZ;
    public static volatile C84222X3q LIZIZ;
    public static volatile X3F LIZJ;
    public static volatile X37 LIZLLL;
    public static volatile X34 LJ;
    public static volatile X3R LJFF;
    public static volatile InterfaceC84217X3l LJI;
    public static volatile InterfaceC48252Iwi LJII;
    public static volatile C48249Iwf LJIIIIZZ;
    public static volatile C48250Iwg LJIIIZ;
    public static volatile ExecutorService LJIIJ;
    public static volatile ExecutorService LJIIJJI;
    public static volatile ExecutorService LJIIL;
    public static volatile ExecutorService LJIILIIL;
    public static volatile ExecutorService LJIILJJIL;
    public static volatile ExecutorService LJIILL;
    public static volatile ExecutorService LJIILLIIL;
    public static volatile PThreadPoolExecutor LJIIZILJ;
    public static volatile ExecutorService LJIJ;
    public static volatile PThreadScheduledThreadPoolExecutor LJIJI;
    public static volatile PThreadPoolExecutor LJIJJ;
    public static volatile X3N LJIJJLI;
    public static volatile C75806Tp4 LJIL;
    public static volatile VE0 LJJ;
    public static volatile InterfaceC84207X3b LJJI;
    public static volatile C84216X3k LJJIIJ;
    public static volatile InterfaceC84214X3i LJJIIJZLJL;
    public static int LJJIJ;
    public static final int LJJIJIIJI;
    public static final int LJJIJIIJIL;
    public static final int LJJIJIL;
    public static final int LJJIJL;
    public static int LJJIJLIJ;
    public static boolean LJJIL;
    public static final List<InterfaceC84218X3m> LJJIZ;
    public static final List<InterfaceC84219X3n> LJJJ;
    public static boolean LJJJI;
    public static final boolean LJJJIL;
    public static C1FP LJJJJ;
    public static volatile boolean LJJJJI;
    public static volatile List<InterfaceC84163X1j> LJJIFFI = new CopyOnWriteArrayList();
    public static volatile boolean LJJII = false;
    public static volatile C64600PWy LJJIII = null;
    public static final List<InterfaceC84183X2d> LJJIIZ = new ArrayList();
    public static boolean LJJIIZI = false;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        LJJIJIIJI = availableProcessors;
        LJJIJIIJIL = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        LJJIJIL = availableProcessors;
        LJJIJL = availableProcessors;
        LJJIJLIJ = 32768;
        LJJIZ = new ArrayList();
        LJJJ = new ArrayList();
        LJJJI = true;
        LJJJIL = true;
        LJJJJI = false;
        IDownloadMultiProcService iDownloadMultiProcService = (IDownloadMultiProcService) X41.LIZ(IDownloadMultiProcService.class);
        if (iDownloadMultiProcService != null) {
            iDownloadMultiProcService.registerIndependentServiceCreator();
        }
    }

    public static C64601PWz LIZ() {
        C64601PWz c64601PWz = new C64601PWz();
        int optInt = X4H.LIZIZ().optInt("connect_timeout", 30000);
        int optInt2 = X4H.LIZIZ().optInt("io_timeout", 30000);
        long j = optInt;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c64601PWz.connectTimeout(j, timeUnit);
        long j2 = optInt2;
        c64601PWz.readTimeout(j2, timeUnit);
        c64601PWz.writeTimeout(j2, timeUnit);
        c64601PWz.retryOnConnectionFailure(true);
        c64601PWz.followRedirects(true);
        c64601PWz.protocols(Collections.singletonList(EnumC64572PVw.HTTP_1_1));
        if (LJIJ != null) {
            c64601PWz.dispatcher(new C64588PWm(LJIJ));
        }
        return c64601PWz;
    }

    public static synchronized Context LJ() {
        Context context;
        synchronized (C84212X3g.class) {
            context = LIZ;
        }
        return context;
    }

    public static ExecutorService LJFF() {
        if (LJIIJ == null) {
            synchronized (C84212X3g.class) {
                if (LJIIJ == null) {
                    int i = LJJIJIIJI;
                    PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38899FOl("DownloadThreadPool-cpu-fixed"));
                    try {
                        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable unused) {
                    }
                    LJIIJ = pThreadPoolExecutor;
                }
            }
        }
        return LJIIJ;
    }

    public static ExecutorService LJI() {
        if (LJIILL == null) {
            synchronized (C84212X3g.class) {
                if (LJIILL == null) {
                    int i = LJJIJL;
                    PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38899FOl("DownloadThreadPool-db-fixed"));
                    try {
                        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable unused) {
                    }
                    LJIILL = pThreadPoolExecutor;
                }
            }
        }
        return LJIILL;
    }

    public static InterfaceC84220X3o LJII() {
        if (LJJIIJ == null) {
            synchronized (C84212X3g.class) {
                if (LJJIIJ == null) {
                    LJJIIJ = new C84216X3k();
                }
            }
        }
        return LJJIIJ;
    }

    public static InterfaceC48252Iwi LJIIIIZZ() {
        if (LJIIIZ == null) {
            synchronized (C84212X3g.class) {
                if (LJIIIZ == null) {
                    LJIIIZ = new C48250Iwg();
                }
            }
        }
        return LJIIIZ;
    }

    public static InterfaceC84217X3l LJIIIZ() {
        if (LJIIIIZZ == null) {
            synchronized (C84212X3g.class) {
                if (LJIIIIZZ == null) {
                    LJIIIIZZ = new C48249Iwf();
                }
            }
        }
        return LJIIIIZZ;
    }

    public static InterfaceC84211X3f LJIIJ() {
        if (LIZIZ == null) {
            synchronized (C84212X3g.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C84222X3q();
                }
            }
        }
        return LIZIZ;
    }

    public static C64600PWy LJIIJJI() {
        if (LJJIII == null) {
            synchronized (C84212X3g.class) {
                if (LJJIII == null) {
                    LJJIII = OkHttp3Instrumentation.build(LIZ());
                }
            }
        }
        return LJJIII;
    }

    public static X3D LJIIL() {
        if (LIZJ == null) {
            synchronized (C84212X3g.class) {
                if (LIZJ == null) {
                    LIZJ = new X3F();
                }
            }
        }
        return LIZJ;
    }

    public static synchronized void LJIILJJIL() {
        synchronized (C84212X3g.class) {
        }
    }

    public static InterfaceC84204X2y LJIILLIIL() {
        if (LJ == null) {
            synchronized (C84212X3g.class) {
                if (LJ == null) {
                    ((X3J) LJFF).getClass();
                    LJ = new X34();
                }
            }
        }
        return LJ;
    }

    public static ExecutorService LJIIZILJ() {
        if (LJIIL == null) {
            synchronized (C84212X3g.class) {
                if (LJIIL == null) {
                    int i = LJJIJIL;
                    PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38899FOl("DownloadThreadPool-mix-fixed"));
                    try {
                        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable unused) {
                    }
                    LJIIL = pThreadPoolExecutor;
                }
            }
        }
        return LJIIL;
    }

    public static ExecutorService LJIJ() {
        if (LJIIZILJ == null) {
            synchronized (C84212X3g.class) {
                if (LJIIZILJ == null) {
                    PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38899FOl("DownloadThreadPool-segment-fixed"));
                    try {
                        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable unused) {
                    }
                    LJIIZILJ = pThreadPoolExecutor;
                }
            }
        }
        return LJIIZILJ;
    }

    public static InterfaceC84214X3i LJIJI() {
        if (LJJIIJZLJL == null) {
            synchronized (C84212X3g.class) {
                if (LJJIIJZLJL == null) {
                    LJJIIJZLJL = new C84215X3j();
                }
            }
        }
        return LJJIIJZLJL;
    }

    public static synchronized void LJJIFFI() {
        synchronized (C84212X3g.class) {
            if (!LJJII) {
                if (LJFF != null) {
                    try {
                        Intent intent = new Intent(LJ(), (Class<?>) DownloadHandleService.class);
                        intent.setAction("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY");
                        C16880lQ.LLLL(LJ(), intent);
                        if (!X4P.LJIIL()) {
                            LJJIIJZLJL(new ARunnableS21S0000000_15(0));
                        }
                        LJJII = true;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static int[] LJIILL(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        return new int[]{1, 0};
                    }
                    return new int[]{2};
                }
                return new int[]{0, 1};
            }
            return new int[]{1};
        }
        return new int[]{0};
    }

    public static void LJIJJ(EnumC35469Dw1 enumC35469Dw1) {
        List<InterfaceC84218X3m> list = LJJIZ;
        synchronized (list) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                InterfaceC84218X3m interfaceC84218X3m = (InterfaceC84218X3m) it.next();
                if (interfaceC84218X3m != null) {
                    if (enumC35469Dw1 == EnumC35469Dw1.SYNC_START) {
                        interfaceC84218X3m.onStart();
                    } else if (enumC35469Dw1 == EnumC35469Dw1.SYNC_SUCCESS) {
                        interfaceC84218X3m.onSuccess();
                    }
                }
            }
            if (enumC35469Dw1 == EnumC35469Dw1.SYNC_SUCCESS) {
                ((ArrayList) LJJIZ).clear();
            }
        }
    }

    public static void LJIJJLI(DownloadTask downloadTask) {
        List<InterfaceC84219X3n> list = LJJJ;
        synchronized (list) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                InterfaceC84219X3n interfaceC84219X3n = (InterfaceC84219X3n) it.next();
                if (interfaceC84219X3n != null) {
                    interfaceC84219X3n.LIZ();
                }
            }
        }
    }

    public static synchronized void LJIL(Context context) {
        synchronized (C84212X3g.class) {
            if (context != null) {
                if (LIZ == null) {
                    LIZ = C16880lQ.LLLLL(context);
                    C84221X3p.LIZ.LIZ(LIZ);
                }
            }
        }
    }

    public static void LJJ(C84213X3h c84213X3h) {
        boolean z;
        if (c84213X3h != null) {
            Context context = c84213X3h.LIZ;
            if (context != null) {
                LJIL(context);
            }
            InterfaceC84217X3l interfaceC84217X3l = c84213X3h.LIZIZ;
            boolean z2 = true;
            if (interfaceC84217X3l != null) {
                LJI = interfaceC84217X3l;
                if (LJI != null) {
                    z = true;
                } else {
                    z = false;
                }
                LJJIL = z;
            }
            ExecutorService executorService = c84213X3h.LJFF;
            if (executorService != null) {
                LJIIJ = executorService;
            }
            ExecutorService executorService2 = c84213X3h.LJI;
            if (executorService2 != null) {
                LJIIJJI = executorService2;
            }
            ExecutorService executorService3 = c84213X3h.LJII;
            if (executorService3 != null) {
                LJIIL = executorService3;
            }
            ExecutorService executorService4 = c84213X3h.LJIIIIZZ;
            if (executorService4 != null) {
                LJIILIIL = executorService4;
            }
            ExecutorService executorService5 = c84213X3h.LJIIIZ;
            if (executorService5 != null) {
                LJIILJJIL = executorService5;
            }
            ExecutorService executorService6 = c84213X3h.LJIIJ;
            if (executorService6 != null) {
                LJIILL = executorService6;
            }
            ExecutorService executorService7 = c84213X3h.LJIIJJI;
            if (executorService7 != null) {
                LJIILLIIL = executorService7;
            }
            ExecutorService executorService8 = c84213X3h.LJIIL;
            if (executorService8 != null) {
                LJIJ = executorService8;
            }
            if (!((ArrayList) c84213X3h.LIZLLL).isEmpty()) {
                LJJI(c84213X3h.LIZLLL);
            }
            InterfaceC84207X3b interfaceC84207X3b = c84213X3h.LJ;
            if (interfaceC84207X3b != null) {
                LJJI = interfaceC84207X3b;
                X4H.LIZJ();
            }
            InterfaceC84214X3i interfaceC84214X3i = c84213X3h.LJIILIIL;
            if (interfaceC84214X3i != null) {
                LJJIIJZLJL = interfaceC84214X3i;
                if (LJJIIJZLJL.LIZIZ()) {
                    InterfaceC84217X3l tTNetDownloadHttpService = LJJIIJZLJL.getTTNetDownloadHttpService();
                    if (tTNetDownloadHttpService != null) {
                        LJI = tTNetDownloadHttpService;
                    }
                    if (LJI == null) {
                        z2 = false;
                    }
                    LJJIL = z2;
                    InterfaceC48252Iwi LIZJ2 = LJJIIJZLJL.LIZJ();
                    if (LIZJ2 != null) {
                        LJII = LIZJ2;
                    }
                } else {
                    InterfaceC84217X3l LJIIIZ2 = LJIIIZ();
                    if (LJIIIZ2 != null) {
                        LJI = LJIIIZ2;
                    }
                    if (LJI == null) {
                        z2 = false;
                    }
                    LJJIL = z2;
                    InterfaceC48252Iwi LJIIIIZZ2 = LJIIIIZZ();
                    if (LJIIIIZZ2 != null) {
                        LJII = LJIIIIZZ2;
                    }
                }
            }
            LJJJI = c84213X3h.LJIILJJIL;
            VE0 ve0 = c84213X3h.LIZJ;
            if (ve0 != null) {
                LJJ = ve0;
            }
        }
    }

    public static void LJJI(List<InterfaceC84183X2d> list) {
        List<InterfaceC84183X2d> list2 = LJJIIZ;
        if (((ArrayList) list2).isEmpty()) {
            synchronized (list2) {
                ((ArrayList) list2).addAll(list);
            }
        }
    }

    public static void LJJII(X3J x3j) {
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Creator: ");
            LIZ2.append(x3j);
            C65210PiY.LIZIZ("DownloadComponentManager", "setIndependentServiceCreator", X1D.LIZIZ(LIZ2));
        }
        LJFF = x3j;
    }

    public static void LJJIII(Runnable runnable) {
        LJFF().execute(runnable);
    }

    public static void LJJIIJ(Runnable runnable) {
        if (!X4Q.LJIJJLI()) {
            runnable.run();
        } else {
            LJI().execute(runnable);
        }
    }

    public static void LJJIIJZLJL(Runnable runnable) {
        ExecutorService LJFF2;
        if (LJIIJJI != null) {
            LJFF2 = LJIIJJI;
        } else {
            LJFF2 = LJFF();
        }
        LJFF2.execute(runnable);
    }

    public static void LJJIIZI(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (LJIJJ == null) {
            synchronized (C84212X3g.class) {
                if (LJIJJ == null) {
                    LJIJJ = new PThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC38899FOl("DownloadThreadPool-Single"));
                }
            }
        }
        LJIJJ.execute(runnable);
    }

    public static int LJIILIIL(String str, String str2) {
        return ((IDownloadIdGeneratorService) X41.LIZ(IDownloadIdGeneratorService.class)).generate(str, str2);
    }

    public static void LJJIIZ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (LJIJI == null) {
            synchronized (C84212X3g.class) {
                if (LJIJI == null) {
                    LJIJI = new PThreadScheduledThreadPoolExecutor(1, new ThreadFactoryC38899FOl("DownloadThreadPool-Schedule"));
                }
            }
        }
        LJIJI.schedule(runnable, j, timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.X5J LIZLLL(java.lang.String r17, java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader> r18, int r19, boolean r20, com.ss.android.socialbase.downloader.model.DownloadInfo r21) {
        /*
            r0 = 2
            r9 = r19
            if (r0 != r9) goto L19
            X.Iwi r0 = X.C84212X3g.LJII
            if (r0 == 0) goto L14
        L9:
            r12 = 0
            r5 = 0
            r1 = 0
            r4 = r17
            r11 = r21
            if (r20 == 0) goto L2a
            goto L26
        L14:
            X.Iwi r0 = LJIIIIZZ()
            goto L1e
        L19:
            r0 = 1
            if (r9 != r0) goto L21
            X.Iwi r0 = X.C84212X3g.LJII
        L1e:
            if (r0 == 0) goto L58
            goto L9
        L21:
            X.Iwi r0 = LJIIIIZZ()
            goto L1e
        L26:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
        L2a:
            r3 = r18
            X.X5J r3 = r0.mo33LIZ(r4, r3)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L42
            if (r20 == 0) goto L3d
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            java.lang.String r8 = "head"
            r10 = r5
            X.X4R.LIZIZ(r3, r4, r5, r6, r8, r9, r10, r11)
        L3d:
            return r3
        L3e:
            r0 = move-exception
            r19 = r12
            goto L45
        L42:
            r19 = move-exception
            throw r19     // Catch: java.lang.Throwable -> L44
        L44:
            r0 = move-exception
        L45:
            if (r20 == 0) goto L57
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r1
            java.lang.String r17 = "head"
            r13 = r4
            r14 = r12
            r18 = r9
            r20 = r11
            X.X4R.LIZIZ(r12, r13, r14, r15, r17, r18, r19, r20)
        L57:
            throw r0
        L58:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "httpService not exist, netLib = "
            java.lang.String r0 = X.KMP.LJ(r0, r9)
            r1.<init>(r0)
            r0 = 1022(0x3fe, float:1.432E-42)
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84212X3g.LIZLLL(java.lang.String, java.util.List, int, boolean, com.ss.android.socialbase.downloader.model.DownloadInfo):X.X5J");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.X5F LIZJ(int r10, java.lang.String r11, java.lang.String r12, java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader> r13, int r14, boolean r15, com.ss.android.socialbase.downloader.model.DownloadInfo r16) {
        /*
            r0 = 2
            r9 = r14
            if (r0 != r9) goto L18
            X.X3l r0 = X.C84212X3g.LJI
            if (r0 == 0) goto L13
        L8:
            r3 = 0
            r10 = 0
            r1 = 0
            r5 = r12
            r4 = r11
            r11 = r16
            if (r15 == 0) goto L2e
            goto L25
        L13:
            X.X3l r0 = LJIIIZ()
            goto L1d
        L18:
            r0 = 1
            if (r9 != r0) goto L20
            X.X3l r0 = X.C84212X3g.LJI
        L1d:
            if (r0 == 0) goto L51
            goto L8
        L20:
            X.X3l r0 = LJIIIZ()
            goto L1d
        L25:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            goto L2e
        L2a:
            r0 = move-exception
            goto L46
        L2c:
            r10 = move-exception
            goto L40
        L2e:
            X.X5F r3 = r0.LIZ(r4, r13)     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L43
            if (r15 == 0) goto L3e
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            java.lang.String r8 = "get"
            X.X4R.LIZIZ(r3, r4, r5, r6, r8, r9, r10, r11)
        L3e:
            return r3
        L3f:
            r10 = move-exception
        L40:
            throw r10     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            goto L44
        L43:
            r0 = move-exception
        L44:
            if (r15 == 0) goto L50
        L46:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            java.lang.String r8 = "get"
            X.X4R.LIZIZ(r3, r4, r5, r6, r8, r9, r10, r11)
        L50:
            throw r0
        L51:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "httpService not exist, netLib = "
            java.lang.String r0 = X.KMP.LJ(r0, r9)
            r1.<init>(r0)
            r0 = 1022(0x3fe, float:1.432E-42)
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84212X3g.LIZJ(int, java.lang.String, java.lang.String, java.util.List, int, boolean, com.ss.android.socialbase.downloader.model.DownloadInfo):X.X5F");
    }

    public static X5F LIZIZ(boolean z, int i, String str, String str2, List<HttpHeader> list, int i2, boolean z2, DownloadInfo downloadInfo) {
        X5F LIZJ2;
        JSONObject LJIIIZ2;
        if (!TextUtils.isEmpty(str2)) {
            list.add(new HttpHeader("ss_d_request_host_ip_114", str2));
            if (downloadInfo == null || (LJIIIZ2 = X4H.LJFF(downloadInfo.getId(), null).LJIIIZ("segment_config")) == null || LJIIIZ2.optInt("enable_ttnet_ip_request", 0) <= 0) {
                i2 = 1;
            }
        } else if (!z) {
            i2 = 2;
        }
        Exception e = null;
        for (int i3 : LJIILL(i2)) {
            try {
                LIZJ2 = LIZJ(i, str, str2, list, i3, z2, downloadInfo);
            } catch (Exception e2) {
                e = e2;
                if (downloadInfo == null) {
                    continue;
                } else if (!downloadInfo.isExpiredRedownload()) {
                    continue;
                } else if (((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getTTNetHandler().LIZLLL(e) != 304) {
                    continue;
                } else if (X4Q.LJIIZILJ(list)) {
                    throw e;
                }
            }
            if (LIZJ2 != null) {
                return LIZJ2;
            }
        }
        if (e == null) {
            return null;
        }
        throw e;
    }
}
