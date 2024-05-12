package com.ss.ttlivestreamer.core.opengl;

import X.C16880lQ;
import X.C77800Ug8;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class GLTracer {
    public static boolean sEnableGlTracer;
    public static volatile GLTracer sGlTracer;
    public List<StackInfo> threads = new ArrayList();

    /* loaded from: classes11.dex */
    public static class StackInfo {
        public String stack;
        public Thread thread;
        public String time;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StackInfo{thread=");
            LIZ.append(this.thread);
            LIZ.append(", time='");
            LIZ.append(this.time);
            LIZ.append(", createStack=");
            return C77800Ug8.LIZJ(LIZ, this.stack, '\'', '}', LIZ);
        }

        public StackInfo(Thread thread, StackTraceElement[] stackTraceElementArr) {
            this.thread = thread;
            if (stackTraceElementArr != null) {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("    at ");
                    LIZ.append(stackTraceElement.getClassName());
                    LIZ.append(".");
                    LIZ.append(stackTraceElement.getMethodName());
                    LIZ.append("(");
                    LIZ.append(stackTraceElement.getFileName());
                    LIZ.append(" :");
                    LIZ.append(stackTraceElement.getLineNumber());
                    LIZ.append(")");
                    sb.append(X1D.LIZIZ(LIZ));
                    sb.append("\n");
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("\n");
                LIZ2.append(sb.toString());
                this.stack = X1D.LIZIZ(LIZ2);
            } else {
                this.stack = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            this.time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        }
    }

    public static void checkAndDump() {
        checkAndDump(12);
    }

    public static GLTracer getWithLock() {
        if (sGlTracer == null) {
            sGlTracer = new GLTracer();
        }
        return sGlTracer;
    }

    public static void abort() {
        dump();
        TTLSSladarBugReportUtils.getInstance().report(new AndroidRuntimeException("GLTracer abort."), "GLTracer.abort");
    }

    public static void dump() {
        if (DebugLogUtils.isEnableDebugLog() || sEnableGlTracer) {
            synchronized (GLTracer.class) {
                Iterator<StackInfo> it = getWithLock().threads.iterator();
                while (it.hasNext()) {
                    AVLog.ioe("GLTracer", it.next().toString());
                }
            }
        }
    }

    public static void removeTraceStack() {
        if (DebugLogUtils.isEnableDebugLog() || sEnableGlTracer) {
            synchronized (GLTracer.class) {
                synchronized (GLTracer.class) {
                    Iterator<StackInfo> it = getWithLock().threads.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        StackInfo next = it.next();
                        if (next.thread == C16880lQ.LLLLIIIILLL()) {
                            getWithLock().threads.remove(next);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("RemoveTrackStack remain ");
                            LIZ.append(getWithLock().threads.size());
                            AVLog.iow("GLTracer", X1D.LIZIZ(LIZ));
                            break;
                        }
                    }
                }
            }
        }
    }

    public static int size() {
        int size;
        if (DebugLogUtils.isEnableDebugLog() || sEnableGlTracer) {
            synchronized (GLTracer.class) {
                size = getWithLock().threads.size();
            }
            return size;
        }
        return 0;
    }

    public static void traceStack() {
        traceStack(C16880lQ.LLLLIIIILLL());
    }

    public static void checkAndDump(int i) {
        if ((DebugLogUtils.isEnableDebugLog() || sEnableGlTracer) && size() > i) {
            dump();
        }
    }

    public static void setEnableGlTracer(boolean z) {
        sEnableGlTracer = z;
    }

    public static void traceStack(Thread thread) {
        if (DebugLogUtils.isEnableDebugLog() || sEnableGlTracer) {
            synchronized (GLTracer.class) {
                getWithLock().threads.add(new StackInfo(thread, C16880lQ.LLLLIIIILLL().getStackTrace()));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AddTrackStack with threadName[");
                LIZ.append(thread.getName());
                LIZ.append("] current size ");
                LIZ.append(getWithLock().threads.size());
                AVLog.iow("GLTracer", X1D.LIZIZ(LIZ));
                int size = size();
                if (size > 12) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Too more GL thread with ");
                    LIZ2.append(size);
                    LIZ2.append(" VS ");
                    LIZ2.append(12);
                    AVLog.ioe("GLTracer", X1D.LIZIZ(LIZ2));
                    abort();
                }
            }
        }
    }
}
