package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: X.Vub, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81245Vub extends PthreadThread {
    public static boolean LJLJJI;
    public static final C81245Vub LJLJJL = new C81245Vub();
    public static int LJLJJLL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public ArrayBlockingQueue<C81247Vud> LJLIL;
    public final C43051mX<C81247Vud> LJLILLLLZI;
    public boolean LJLJI;

    public C81245Vub() {
        super("live_async_inflater");
        this.LJLIL = new ArrayBlockingQueue<>(50);
        this.LJLILLLLZI = new C43051mX<>(50);
        this.LJLJI = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:33:0x000d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void LIZLLL() {
        /*
            r9 = this;
            int r1 = X.C81245Vub.LJLJJLL     // Catch: java.lang.Throwable -> Ld
            r0 = -20
            if (r1 < r0) goto Ld
            r0 = 19
            if (r1 > r0) goto Ld
            android.os.Process.setThreadPriority(r1)     // Catch: java.lang.Throwable -> Ld
        Ld:
            java.util.concurrent.ArrayBlockingQueue<X.Vud> r0 = r9.LJLIL
            java.lang.Object r4 = r0.take()
            X.Vud r4 = (X.C81247Vud) r4
            boolean r0 = r9.LJLJI
            if (r0 == 0) goto L1f
            r0 = 2000000000(0x77359400, double:9.881312917E-315)
            java.util.concurrent.locks.LockSupport.parkNanos(r0)
        L1f:
            X.Vuc r6 = r4.LIZ
            r5 = 0
            if (r6 == 0) goto Ld
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L6a
            int r0 = r4.LIZLLL     // Catch: java.lang.Exception -> L6a
            if (r0 != 0) goto L4c
            X.Vsg r2 = r6.LIZ     // Catch: java.lang.Exception -> L6a
            int r1 = r4.LIZJ     // Catch: java.lang.Exception -> L6a
            android.view.ViewGroup r0 = r4.LIZIZ     // Catch: java.lang.Exception -> L6a
            android.view.View r0 = X.C16880lQ.LLLLIILL(r2, r1, r0, r5)     // Catch: java.lang.Exception -> L6a
            r4.LJ = r0     // Catch: java.lang.Exception -> L6a
        L38:
            android.view.View r2 = r4.LJ     // Catch: java.lang.Exception -> L6a
            if (r2 == 0) goto L6c
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L6a
            long r0 = r0 - r7
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L6a
            r0 = 2131370635(0x7f0a228b, float:1.8361282E38)
            r2.setTag(r0, r1)     // Catch: java.lang.Exception -> L6a
            goto L6c
        L4c:
            X.Vsg r3 = r6.LIZ     // Catch: java.lang.Exception -> L6a
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper     // Catch: java.lang.Exception -> L6a
            X.Vsg r0 = r6.LIZ     // Catch: java.lang.Exception -> L6a
            android.content.Context r1 = r0.getContext()     // Catch: java.lang.Exception -> L6a
            int r0 = r4.LIZLLL     // Catch: java.lang.Exception -> L6a
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L6a
            android.view.LayoutInflater r2 = r3.cloneInContext(r2)     // Catch: java.lang.Exception -> L6a
            int r1 = r4.LIZJ     // Catch: java.lang.Exception -> L6a
            android.view.ViewGroup r0 = r4.LIZIZ     // Catch: java.lang.Exception -> L6a
            android.view.View r0 = X.C16880lQ.LLLLIILL(r2, r1, r0, r5)     // Catch: java.lang.Exception -> L6a
            r4.LJ = r0     // Catch: java.lang.Exception -> L6a
            goto L38
        L6a:
            if (r6 == 0) goto Ld
        L6c:
            X.Vue r0 = r4.LJFF
            if (r0 == 0) goto L82
            boolean r0 = r0.callBackInMainThread()
            if (r0 != 0) goto L82
            X.Vue r3 = r4.LJFF     // Catch: java.lang.Throwable -> Ld
            android.view.View r2 = r4.LJ     // Catch: java.lang.Throwable -> Ld
            int r1 = r4.LIZJ     // Catch: java.lang.Throwable -> Ld
            android.view.ViewGroup r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> Ld
            r3.onInflateFinished(r2, r1, r0)     // Catch: java.lang.Throwable -> Ld
            goto Ld
        L82:
            android.os.Handler r0 = r6.LIZIZ
            android.os.Message r0 = android.os.Message.obtain(r0, r5, r4)
            r0.sendToTarget()
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81245Vub.LIZLLL():void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            LIZLLL();
            throw null;
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static C81245Vub LJ(int i, boolean z) {
        if (!LJLJJI) {
            LJLJJLL = i;
            if (z) {
                LJLJJL.LJLIL = new ArrayBlockingQueue<>(60);
            }
            LJLJJL.start();
            LJLJJI = true;
        }
        return LJLJJL;
    }
}
