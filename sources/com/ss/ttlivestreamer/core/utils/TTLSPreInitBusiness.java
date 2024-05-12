package com.ss.ttlivestreamer.core.utils;

import X.C221108m2;
import X.C5H3;
import android.os.Handler;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TTLSPreInitBusiness {
    public static volatile boolean inited;
    public static WeakReference<Object> ref;
    public final String TAG;
    public TTLSPreInitImpl impl;
    public Handler workHandler;
    public SafeHandlerThread workThread;
    public static final Companion Companion = new Companion();
    public static final C5H3 instance$delegate = C221108m2.LIZIZ(TTLSPreInitBusiness$Companion$instance$2.INSTANCE);

    public static final TTLSPreInitBusiness getInstance() {
        return Companion.getInstance();
    }

    private final void preInitInner() {
        TTLSPreInitImpl tTLSPreInitImpl = this.impl;
        if (tTLSPreInitImpl == null) {
            tTLSPreInitImpl = new TTLSPreInitImpl();
            this.impl = tTLSPreInitImpl;
        }
        tTLSPreInitImpl.preInit(null);
        SafeHandlerThread preInitedThread = tTLSPreInitImpl.getPreInitedThread("LiveCoreWorkThread");
        this.workThread = preInitedThread;
        if (preInitedThread != null) {
            this.workHandler = preInitedThread.getHandler();
        }
    }

    public final void preInitAllThreads() {
        synchronized (TTLSPreInitBusinessHelper.class) {
            preInitInner();
            inited = true;
        }
    }

    public TTLSPreInitBusiness() {
        this.TAG = "ttls_preinit_logs";
    }

    /* loaded from: classes12.dex */
    public static final class Companion {
        public static /* synthetic */ void getInstance$annotations() {
        }

        public final TTLSPreInitBusiness getInstance() {
            return (TTLSPreInitBusiness) TTLSPreInitBusiness.instance$delegate.getValue();
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Handler getWorkHandler() {
        return this.workHandler;
    }

    public final SafeHandlerThread getWorkThread() {
        return this.workThread;
    }

    public /* synthetic */ TTLSPreInitBusiness(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void preInitLiveCoreInner(Runnable runnable) {
        Handler handler = this.workHandler;
        if (handler != null) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            runnable.run();
        }
    }

    public final void destroyPreInitInfos(Object obj) {
        synchronized (TTLSPreInitBusinessHelper.class) {
            WeakReference<Object> weakReference = ref;
            if (obj != null ? !(weakReference == null || weakReference.get() != obj) : !(weakReference != null && weakReference.get() != null)) {
                DebugLogUtils.isEnableDebugLog();
                ref = null;
                inited = false;
                TTLSPreInitImpl tTLSPreInitImpl = this.impl;
                if (tTLSPreInitImpl != null) {
                    tTLSPreInitImpl.release();
                }
                this.impl = null;
            }
        }
    }

    public final GLThread getGlThread(String name) {
        o.LJIIJ(name, "name");
        SafeHandlerThread thread = getThread(name);
        if (thread instanceof GLThread) {
            return (GLThread) thread;
        }
        DebugLogUtils.isEnableDebugLog();
        return null;
    }

    public final SafeHandlerThread getThread(String name) {
        SafeHandlerThread safeHandlerThread;
        o.LJIIJ(name, "name");
        if (o.LJ("LiveCoreWorkThread", name) && (safeHandlerThread = this.workThread) != null) {
            this.workThread = null;
            this.workHandler = null;
            return safeHandlerThread;
        }
        TTLSPreInitImpl tTLSPreInitImpl = this.impl;
        if (tTLSPreInitImpl == null) {
            return null;
        }
        return tTLSPreInitImpl.getPreInitedThread(name);
    }

    public final void onLiveStreamCreated(Object obj) {
        o.LJIIJ(obj, "obj");
        synchronized (TTLSPreInitBusinessHelper.class) {
            ref = new WeakReference<>(obj);
        }
    }

    public final void preInitLiveCore(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        synchronized (TTLSPreInitBusinessHelper.class) {
            if (!inited) {
                preInitAllThreads();
            }
            preInitLiveCoreInner(runnable);
        }
    }

    public final void setWorkHandler(Handler handler) {
        this.workHandler = handler;
    }

    public final void setWorkThread(SafeHandlerThread safeHandlerThread) {
        this.workThread = safeHandlerThread;
    }
}
