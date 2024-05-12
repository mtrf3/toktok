package com.ss.ttlivestreamer.core.opengl;

import X.C16880lQ;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LiveStreamGpuHintSettingsUtils;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;

/* loaded from: classes12.dex */
public class GLThread extends SafeHandlerThread {
    public boolean enableGpuHint;

    public void enableGpuHint() {
        this.enableGpuHint = true;
    }

    @Override // com.ss.ttlivestreamer.core.utils.NativeHandlerThread, android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        com_ss_ttlivestreamer_core_opengl_GLThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void com_ss_ttlivestreamer_core_opengl_GLThread__run$___twin___() {
        GLTracer.traceStack();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("gl thread(");
        LIZ.append(getName());
        LIZ.append(") is runing ...");
        AVLog.ioi("GLThread", X1D.LIZIZ(LIZ));
        super.run();
        if (this.enableGpuHint) {
            LiveStreamGpuHintSettingsUtils.doResetGpuHint();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("gl thread(");
        LIZ2.append(getName());
        LIZ2.append(") is exit ...");
        AVLog.ioi("GLThread", X1D.LIZIZ(LIZ2));
        GlUtil.nativeDetachThreadToOpenGl();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("gl thread(");
        LIZ3.append(getName());
        LIZ3.append(") is exit done");
        AVLog.ioi("GLThread", X1D.LIZIZ(LIZ3));
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager != null) {
            gLThreadManager.decrementRef();
        }
        GLTracer.removeTraceStack();
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager != null) {
            gLThreadManager.addRef();
        }
        if (GlUtil.nativeAttachThreadToOpenGl()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("gl thread(");
            LIZ.append(getName());
            LIZ.append(") is attached to opengl ...");
            AVLog.ioi("GLThread", X1D.LIZIZ(LIZ));
            if (this.enableGpuHint) {
                LiveStreamGpuHintSettingsUtils.sendQualcommCommandIfNeeded(getHandler());
                return;
            }
            return;
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        throw new AndroidRuntimeException("OpenGl thread created failed.");
    }

    public GLThread(String str) {
        super(str);
    }

    public static void com_ss_ttlivestreamer_core_opengl_GLThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(GLThread gLThread) {
        boolean LIZ;
        try {
            gLThread.com_ss_ttlivestreamer_core_opengl_GLThread__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public GLThread(String str, int i) {
        super(str, i);
    }
}
