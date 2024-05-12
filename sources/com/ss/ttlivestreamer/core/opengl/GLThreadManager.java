package com.ss.ttlivestreamer.core.opengl;

import X.AnonymousClass028;
import X.C25620zW;
import X.X1D;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES10;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.TTLSThreadConfigHelper;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class GLThreadManager {
    public static boolean sFencClientSync = false;
    public static boolean sForceFence = false;
    public static boolean sForceFinish = true;
    public static GLThreadManager sGLThreadManager = null;
    public static int sGLVersion = 2;
    public static String sGPUGLVersion = "";
    public static String sGPURender = "";
    public static String sGPUVendor = "";
    public static boolean sNeedFinish;
    public EGLContext mEGLContext;
    public ArrayList<String> mGlFinishDeviceList;
    public Handler mHandler;
    public int[] mEGLVersion = {0, 0};
    public AtomicInteger mInteger = new AtomicInteger(1);

    public static GLThreadManager get() {
        return get(null, getConfigGLVersion());
    }

    public static native boolean nativeIsEnableGlobalGlContextMutex();

    public static native void nativeLockGlShareContext();

    public static native void nativeSetEnableGlobalGlContextMutex(boolean z);

    public static native void nativeSetForceFence(boolean z, boolean z2);

    public static native void nativeSetForceFinish(boolean z);

    public static native void nativeSetupOpenGlRecycler();

    public static native void nativeUnLockGlShareContext();

    /* loaded from: classes12.dex */
    public class MainGlThread extends HandlerThread {
        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_opengl_GLThreadManager$MainGlThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_core_opengl_GLThreadManager$MainGlThread__run$___twin___() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("thread ");
            LIZ.append(getName());
            LIZ.append(" is runing...");
            AVLog.ioi("GLThreadManager", X1D.LIZIZ(LIZ));
            super.run();
            GlUtil.nativeDetachThreadToOpenGl();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("thread ");
            LIZ2.append(getName());
            LIZ2.append(" is exit.");
            AVLog.ioi("GLThreadManager", X1D.LIZIZ(LIZ2));
            GLTracer.removeTraceStack();
        }

        public Handler getHandler() {
            Looper looper = getLooper();
            GLThreadManager gLThreadManager = GLThreadManager.this;
            if (gLThreadManager.mHandler == null && looper != null) {
                gLThreadManager.mHandler = new Handler(looper);
            }
            return GLThreadManager.this.mHandler;
        }

        public static void com_ss_ttlivestreamer_core_opengl_GLThreadManager$MainGlThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MainGlThread mainGlThread) {
            boolean LIZ;
            try {
                mainGlThread.com_ss_ttlivestreamer_core_opengl_GLThreadManager$MainGlThread__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public MainGlThread(GLThreadManager gLThreadManager, String str) {
            this(str, 0);
        }

        public MainGlThread(String str, int i) {
            super(str, i);
            GLTracer.traceStack(this);
        }
    }

    public static synchronized void dispose() {
        synchronized (GLThreadManager.class) {
            AVLog.iow("GLThreadManager", "GLThreadManager dispose");
            GLThreadManager gLThreadManager = sGLThreadManager;
            if (gLThreadManager != null) {
                gLThreadManager.decrementRef();
            }
        }
    }

    private void initNeedGlFinishDeviceList() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.mGlFinishDeviceList = arrayList;
        arrayList.add("Adreno (TM) 506");
        this.mGlFinishDeviceList.add("Mali-T860");
    }

    public static boolean isNeedFinish() {
        if (sForceFinish || sNeedFinish) {
            return true;
        }
        return false;
    }

    public void addRef() {
        int incrementAndGet = this.mInteger.incrementAndGet();
        if (incrementAndGet < 2) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
            if (AnonymousClass028.LJI(androidRuntimeException, "GLThreadManager.addRef")) {
                throw androidRuntimeException;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addRef ");
        LIZ.append(incrementAndGet);
        AVLog.iow("GLThreadManager", X1D.LIZIZ(LIZ));
    }

    public void decrementRef() {
        Looper looper;
        int decrementAndGet = this.mInteger.decrementAndGet();
        if (decrementAndGet < 0) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
            if (AnonymousClass028.LJI(androidRuntimeException, "GLThreadManager.decrementRef")) {
                throw androidRuntimeException;
            }
        }
        if (decrementAndGet < 1) {
            AVLog.iow("GLThreadManager", "Release GLManager ...");
            Handler handler = this.mHandler;
            if (handler != null && (looper = handler.getLooper()) != null) {
                sGLThreadManager = null;
                looper.quitSafely();
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("decrementRef ");
        LIZ.append(decrementAndGet);
        AVLog.iow("GLThreadManager", X1D.LIZIZ(LIZ));
    }

    public void fillGPUDescription() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.GLThreadManager.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_opengl_GLThreadManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_opengl_GLThreadManager$2__run$___twin___() {
                try {
                    GLThreadManager.sGPUGLVersion = GLES10.glGetString(7938);
                    GLThreadManager.sGPURender = GLES10.glGetString(7937);
                    GLThreadManager.sGPUVendor = GLES10.glGetString(7936);
                    GLThreadManager.sNeedFinish = GLThreadManager.this.isContainVendoOnBlackList(GLThreadManager.sGPURender);
                } catch (Throwable th) {
                    AVLog.ioe("GLThreadManager", th.getMessage(), th);
                }
                AVLog.ioi("GLThreadManager", "GPU version: " + GLThreadManager.sGPUGLVersion);
                AVLog.ioi("GLThreadManager", "GPU Render: " + GLThreadManager.sGPURender);
                AVLog.ioi("GLThreadManager", "GPU Vendor: " + GLThreadManager.sGPUVendor);
                AVLog.ioi("GLThreadManager", "GPU render with finish: " + GLThreadManager.isNeedFinish());
                AVLog.ioi("GLThreadManager", "GPU render with global mutex: " + GLThreadManager.nativeIsEnableGlobalGlContextMutex());
            }

            public static void com_ss_ttlivestreamer_core_opengl_GLThreadManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_core_opengl_GLThreadManager$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static EGLContext getEGLContext() {
        if (get().mEGLContext == null) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Not found shared EGLContext.");
            if (AnonymousClass028.LJI(androidRuntimeException, "GLThreadManager.getEGLContext")) {
                throw androidRuntimeException;
            }
        }
        return get().mEGLContext;
    }

    public static int[] getEGLVersion() {
        return get().mEGLVersion;
    }

    public static Handler getMainGlHandle() {
        return get().mHandler;
    }

    public static long getNativeEGLContext() {
        return toNativeEGLContext(getEGLContext());
    }

    public static boolean isEnableGlobalGlContextMutex() {
        return nativeIsEnableGlobalGlContextMutex();
    }

    public static int getConfigGLVersion() {
        return sGLVersion;
    }

    public static String getGPUGLVersoin() {
        return sGPUGLVersion;
    }

    public static String getGPURender() {
        return sGPURender;
    }

    public static String getGPUVendor() {
        return sGPUVendor;
    }

    public static boolean isEnableForceGLFence() {
        return sForceFence;
    }

    public static boolean isEnableForceGLFinish() {
        return sForceFinish;
    }

    public static void lockSharedGLContext() {
        nativeLockGlShareContext();
    }

    public static void unlockSharedGLContext() {
        nativeUnLockGlShareContext();
    }

    public void finalize() {
        super.finalize();
    }

    public static synchronized void addRefWithEnableAutoGlRecycler(boolean z) {
        synchronized (GLThreadManager.class) {
            if (z) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BUG!, enableAutoGlRecycler: ");
                LIZ.append(z);
                LIZ.append(" sGLThreadManager: ");
                LIZ.append(sGLThreadManager);
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ));
                TTLSSladarBugReportUtils.getInstance().report(androidRuntimeException, "GLThreadManager.addRefWithEnableAutoGlRecycler");
                if (TTLSBuildConfig.canThrowException()) {
                    throw androidRuntimeException;
                }
            }
            AVLog.iow("GLThreadManager", "GLThreadManager start by livecoreImpl initialization");
            GLThreadManager gLThreadManager = sGLThreadManager;
            if (gLThreadManager != null) {
                gLThreadManager.addRef();
            }
        }
    }

    public static void enableForceGLFinish(boolean z) {
        sForceFinish = z;
        nativeSetForceFinish(z);
    }

    public static void enableGlobalGlContextMutex(boolean z) {
        nativeSetEnableGlobalGlContextMutex(z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Using global mutex ");
        LIZ.append(nativeIsEnableGlobalGlContextMutex());
        AVLog.iod("GLThreadManager", X1D.LIZIZ(LIZ));
    }

    public static void setGLVersion(int i) {
        sGLVersion = i;
    }

    public static long toNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext != null) {
            return eGLContext.getNativeHandle();
        }
        return 0L;
    }

    public boolean isContainVendoOnBlackList(String str) {
        ArrayList<String> arrayList = this.mGlFinishDeviceList;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<String> it = this.mGlFinishDeviceList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public GLThreadManager(EGLContext eGLContext, int i) {
        MediaEngineFactory.nativeSetupClassLoader();
        initNeedGlFinishDeviceList();
        setupSharedOpenGlContext(eGLContext, i);
    }

    public static void enableForceGLFence(boolean z, boolean z2) {
        sForceFence = z;
        sFencClientSync = z2;
        nativeSetForceFence(z, z2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableForceGLFence:");
        LIZ.append(z);
        LIZ.append(" , with clientsync:");
        LIZ.append(z2);
        AVLog.iow("GLThreadManager", X1D.LIZIZ(LIZ));
    }

    public static GLThreadManager get(EGLContext eGLContext, int i) {
        if (sGLThreadManager == null) {
            synchronized (GLThreadManager.class) {
                long currentTimeMillis = System.currentTimeMillis();
                if (sGLThreadManager == null) {
                    sGLThreadManager = new GLThreadManager(eGLContext, i);
                } else if (eGLContext != null) {
                    AVLog.iow("GLThreadManager", "OpenGl env already init and ignore shared context");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Create GLThreadManager cost time ");
                LIZ.append(System.currentTimeMillis() - currentTimeMillis);
                LIZ.append(" ms");
                AVLog.ioi("GLThreadManager", X1D.LIZIZ(LIZ));
            }
        }
        return sGLThreadManager;
    }

    private void setupSharedOpenGlContext(EGLContext eGLContext, final int i) {
        final int[] iArr = {0};
        MainGlThread mainGlThread = new MainGlThread("OpenGlMgrThread", TTLSThreadConfigHelper.getPriority("OpenGlMgrThread", 0));
        mainGlThread.start();
        Handler handler = mainGlThread.getHandler();
        this.mHandler = handler;
        if (handler != null) {
            final long nativeEGLContext = toNativeEGLContext(eGLContext);
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.GLThreadManager.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_opengl_GLThreadManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_opengl_GLThreadManager$1__run$___twin___() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Init GLThreadManager with context ");
                    LIZ.append(nativeEGLContext);
                    LIZ.append(" version ");
                    LIZ.append(i);
                    AVLog.ioi("GLThreadManager", X1D.LIZIZ(LIZ));
                    iArr[0] = GlUtil.nativeAttachThreadToOpenGl(nativeEGLContext, i, 0L);
                    GLThreadManager.this.mEGLContext = EGL14.eglGetCurrentContext();
                    int[] iArr2 = {0, 0};
                    if (GLThreadManager.this.mEGLContext != null) {
                        EGL14.eglQueryContext(EGL14.eglGetCurrentDisplay(), GLThreadManager.this.mEGLContext, 12440, iArr2, 0);
                        GLThreadManager.this.mEGLVersion = iArr2;
                        GLThreadManager.nativeSetupOpenGlRecycler();
                        GLThreadManager.this.fillGPUDescription();
                    }
                }

                public static void com_ss_ttlivestreamer_core_opengl_GLThreadManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_core_opengl_GLThreadManager$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.mEGLVersion[0]);
            LIZ.append(".");
            LIZ.append(this.mEGLVersion[1]);
            StringBuilder LIZIZ = C25620zW.LIZIZ("EGLClient version ", X1D.LIZIZ(LIZ), " result:");
            LIZIZ.append(iArr[0]);
            AVLog.ioi("GLThreadManager", X1D.LIZIZ(LIZIZ));
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! not found handler");
        AVLog.ioe("GLThreadManager", androidRuntimeException.getMessage(), androidRuntimeException);
        throw androidRuntimeException;
    }
}
