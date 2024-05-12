package com.ss.ttlivestreamer.core.utils;

import X.C0MT;
import X.C25620zW;
import X.C77275UUl;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TTLSPreInitImpl {
    public final String TAG = "ttls_preinit_logs";
    public final Map<String, SafeHandlerThread> map = new HashMap();

    private final void clearAllThreads() {
        if (this.map.isEmpty()) {
            return;
        }
        synchronized (this) {
            Iterator<Map.Entry<String, SafeHandlerThread>> it = this.map.entrySet().iterator();
            while (it.hasNext()) {
                SafeHandlerThread value = it.next().getValue();
                if (value != null) {
                    value.quitSafely();
                }
            }
            this.map.clear();
        }
    }

    private final void preInitFixedThreads() {
        preInitAllThreads(C77275UUl.LJ("LiveCoreWorkThread", "LiveCoreVideoCaptureThread", "TTLSOesProcessThread", "GLRenderVideoSink", "LiveCoreLogUploadThread", "HardWareEncodeThread", "HwEncoderReadThread", "YuvConvertThread"));
    }

    public final void release() {
        clearAllThreads();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r5.equals("HwEncoderReadThread") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        r3 = com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor.lockThread(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r5.equals("HardWareEncodeThread") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        r3 = com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor.lockGLThread(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r5.equals("YuvConvertThread") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r5.equals("LiveCoreLogUploadThread") != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.ttlivestreamer.core.utils.SafeHandlerThread createThread(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 0
            switch(r0) {
                case -1758037372: goto L72;
                case -748524122: goto L65;
                case 85062947: goto L58;
                case 112730387: goto L4b;
                case 1049073411: goto L3e;
                case 1490675208: goto L35;
                case 1815466592: goto L28;
                case 1834996749: goto L1f;
                default: goto L8;
            }
        L8:
            r3 = r1
        L9:
            boolean r0 = com.ss.ttlivestreamer.core.utils.DebugLogUtils.isEnableDebugLog()
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            if (r3 == 0) goto L19
            java.lang.String r1 = r3.getName()
        L19:
            java.lang.String r0 = " preinited"
            X.C0MT.LJ(r2, r1, r0, r2)
        L1e:
            return r3
        L1f:
            java.lang.String r0 = "HwEncoderReadThread"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
            goto L7a
        L28:
            java.lang.String r0 = "LiveCoreVideoCaptureThread"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
            com.ss.ttlivestreamer.core.opengl.GLThread r3 = com.ss.ttlivestreamer.core.utils.LiveStreamThreadPriorityUtils.getVideoCaptureThread()
            goto L9
        L35:
            java.lang.String r0 = "HardWareEncodeThread"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
            goto L46
        L3e:
            java.lang.String r0 = "YuvConvertThread"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
        L46:
            com.ss.ttlivestreamer.core.opengl.GLThread r3 = com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor.lockGLThread(r5)
            goto L9
        L4b:
            java.lang.String r0 = "GLRenderVideoSink"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
            com.ss.ttlivestreamer.core.opengl.GLThread r3 = com.ss.ttlivestreamer.core.utils.LiveStreamThreadPriorityUtils.getGRKHandlerThread()
            goto L9
        L58:
            java.lang.String r0 = "TTLSOesProcessThread"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
            com.ss.ttlivestreamer.core.opengl.GLThread r3 = com.ss.ttlivestreamer.core.utils.LiveStreamThreadPriorityUtils.getVideoCaptureOesProcessThread()
            goto L9
        L65:
            java.lang.String r0 = "LiveCoreWorkThread"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
            com.ss.ttlivestreamer.core.utils.SafeHandlerThread r3 = com.ss.ttlivestreamer.core.utils.LiveStreamThreadPriorityUtils.getWorkerThread()
            goto L9
        L72:
            java.lang.String r0 = "LiveCoreLogUploadThread"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
        L7a:
            com.ss.ttlivestreamer.core.utils.SafeHandlerThread r3 = com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor.lockThread(r5)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.utils.TTLSPreInitImpl.createThread(java.lang.String):com.ss.ttlivestreamer.core.utils.SafeHandlerThread");
    }

    private final void preInitAllThreads(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (str != null) {
                    preInitThread(str);
                }
            }
        }
    }

    private final SafeHandlerThread preInitThread(String str) {
        SafeHandlerThread safeHandlerThread;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            safeHandlerThread = this.map.get(str);
            if (safeHandlerThread != null) {
                DebugLogUtils.isEnableDebugLog();
            } else {
                safeHandlerThread = createThread(str);
                if (safeHandlerThread != null) {
                    safeHandlerThread.start();
                    safeHandlerThread.getLooper();
                    this.map.put(str, safeHandlerThread);
                }
            }
        }
        return safeHandlerThread;
    }

    public final SafeHandlerThread getPreInitedThread(String name) {
        String str;
        o.LJIIJ(name, "name");
        SafeHandlerThread remove = this.map.remove(name);
        if (DebugLogUtils.isEnableDebugLog()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("obtain preinited name:", name, " obtained:");
            if (remove != null) {
                str = remove.getName();
            } else {
                str = null;
            }
            C0MT.LJ(LIZIZ, str, " success", LIZIZ);
        }
        return remove;
    }

    public final void preInit(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            preInitFixedThreads();
        } else {
            preInitAllThreads(collection);
        }
    }
}
