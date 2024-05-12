package com.ss.ttm.player;

import X.C16880lQ;
import X.P4X;
import X.P4Y;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes9.dex */
public final class DummySurface extends Surface {
    public static int SetOutputSurfaceExceptionCounter = 0;
    public static volatile int SetOutputSurfaceExceptionLimit = 1;
    public static int SetOutputSurfaceExceptionOtherCounter = 0;
    public static volatile int SetOutputSurfaceExceptionOtherLimit = 1;
    public static int secureMode;
    public static boolean secureModeInitialized;
    public volatile boolean cached;
    public boolean hasSetOutputSurfaceException;
    public boolean hasSetOutputSurfaceExceptionOther;
    public final boolean secure;
    public final P4X thread;
    public boolean threadReleased;
    public static final ConcurrentLinkedQueue<DummySurface> caches = new ConcurrentLinkedQueue<>();
    public static volatile boolean useDummySurfaceCaches = false;
    public static volatile int cacheMode = 0;

    public static DummySurface LIZIZ() {
        DummySurface poll;
        boolean z = false;
        if (useDummySurfaceCaches && (poll = caches.poll()) != null) {
            poll.cached = false;
            return poll;
        }
        P4X p4x = new P4X();
        p4x.start();
        Handler handler = new Handler(p4x.getLooper(), p4x);
        p4x.LJLILLLLZI = handler;
        p4x.LJLIL = new P4Y(handler);
        synchronized (p4x) {
            p4x.LJLILLLLZI.obtainMessage(1, 0, 0).sendToTarget();
            while (p4x.LJLJJL == null && p4x.LJLJJI == null && p4x.LJLJI == null) {
                try {
                    p4x.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            C16880lQ.LLLLIIIILLL().interrupt();
        }
        RuntimeException runtimeException = p4x.LJLJJI;
        if (runtimeException == null) {
            Error error = p4x.LJLJI;
            if (error == null) {
                DummySurface dummySurface = p4x.LJLJJL;
                dummySurface.getClass();
                return dummySurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Surface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void release() {
        /*
            r5 = this;
            boolean r0 = com.ss.ttm.player.DummySurface.useDummySurfaceCaches
            r3 = 2
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L19
            java.util.concurrent.ConcurrentLinkedQueue<com.ss.ttm.player.DummySurface> r0 = com.ss.ttm.player.DummySurface.caches
            int r0 = r0.size()
            if (r0 > r3) goto L19
            boolean r0 = r5.secure
            if (r0 != 0) goto L19
            boolean r0 = r5.isValid()
            if (r0 != 0) goto L20
        L19:
            super.release()
            X.P4X r1 = r5.thread
            monitor-enter(r1)
            goto L60
        L20:
            int r0 = com.ss.ttm.player.DummySurface.cacheMode
            if (r0 != r2) goto L29
            boolean r0 = r5.hasSetOutputSurfaceException
            if (r0 == 0) goto L29
            goto L19
        L29:
            int r0 = com.ss.ttm.player.DummySurface.cacheMode
            if (r0 != r3) goto L32
            boolean r0 = r5.hasSetOutputSurfaceExceptionOther
            if (r0 == 0) goto L32
            goto L19
        L32:
            int r1 = com.ss.ttm.player.DummySurface.cacheMode
            r0 = 3
            if (r1 != r0) goto L49
            boolean r0 = r5.hasSetOutputSurfaceException
            if (r0 == 0) goto L49
            int r0 = com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionCounter
            int r1 = r0 + 1
            com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionCounter = r1
            int r0 = com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionLimit
            if (r1 < r0) goto L75
            useCaches(r4)
            goto L19
        L49:
            int r1 = com.ss.ttm.player.DummySurface.cacheMode
            r0 = 4
            if (r1 != r0) goto L75
            boolean r0 = r5.hasSetOutputSurfaceExceptionOther
            if (r0 == 0) goto L75
            int r0 = com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionOtherCounter
            int r1 = r0 + 1
            com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionOtherCounter = r1
            int r0 = com.ss.ttm.player.DummySurface.SetOutputSurfaceExceptionOtherLimit
            if (r1 < r0) goto L75
            useCaches(r4)
            goto L19
        L60:
            boolean r0 = r5.threadReleased     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L70
            X.P4X r0 = r5.thread     // Catch: java.lang.Throwable -> L72
            android.os.Handler r0 = r0.LJLILLLLZI     // Catch: java.lang.Throwable -> L72
            r0.getClass()
            r0.sendEmptyMessage(r3)     // Catch: java.lang.Throwable -> L72
            r5.threadReleased = r2     // Catch: java.lang.Throwable -> L72
        L70:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            return
        L72:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r0
        L75:
            boolean r0 = r5.cached
            if (r0 != 0) goto L80
            java.util.concurrent.ConcurrentLinkedQueue<com.ss.ttm.player.DummySurface> r0 = com.ss.ttm.player.DummySurface.caches
            r0.add(r5)
            r5.cached = r2
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.DummySurface.release():void");
    }

    public static void useCaches(boolean z) {
        useDummySurfaceCaches = z;
        cacheMode = 0;
        if (useDummySurfaceCaches) {
            return;
        }
        while (true) {
            ConcurrentLinkedQueue<DummySurface> concurrentLinkedQueue = caches;
            if (!concurrentLinkedQueue.isEmpty()) {
                DummySurface poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    poll.release();
                }
            } else {
                return;
            }
        }
    }

    public final void LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.hasSetOutputSurfaceExceptionOther = true;
        } else {
            this.hasSetOutputSurfaceException = true;
            this.hasSetOutputSurfaceExceptionOther = true;
        }
    }

    public DummySurface(P4X p4x, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = p4x;
        this.secure = z;
    }
}
