package com.ss.ttlivestreamer.core.utils;

import X.C15O;
import X.X1D;
import android.os.Process;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class SafeHandlerThreadPoolExecutor {
    public static JSONObject mSafeModeWhiteList;
    public static final List<SafeHandlerThread> mSafeHandlerThreadList = new ArrayList();
    public static boolean mThreadPoolMode = false;
    public static boolean mUsingNativeThread = false;
    public static boolean mCheckLeakWhenRef0 = true;
    public static long mThreadAliveTimeMs = 0;
    public static AtomicInteger mRefInUse = new AtomicInteger(0);

    /* renamed from: com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor$2 */
    /* loaded from: classes12.dex */
    public final class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$2__run$___twin___() {
            SafeHandlerThread.this.release();
        }

        public AnonymousClass2() {
        }

        public static void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
            boolean LIZ;
            try {
                anonymousClass2.com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$2__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor$3 */
    /* loaded from: classes12.dex */
    public final class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$3__run$___twin___() {
            List<SafeHandlerThread> list = SafeHandlerThreadPoolExecutor.mSafeHandlerThreadList;
            synchronized (list) {
                list.remove(SafeHandlerThread.this);
            }
        }

        public AnonymousClass3() {
        }

        public static void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
            boolean LIZ;
            try {
                anonymousClass3.com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$3__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor$4 */
    /* loaded from: classes12.dex */
    public final class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$4__run$___twin___() {
            SafeHandlerThreadPoolExecutor.unlockThreadInner(SafeHandlerThread.this);
        }

        public AnonymousClass4() {
        }

        public static void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
            boolean LIZ;
            try {
                anonymousClass4.com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$4__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public static void checkMemoryLeak() {
        if (mRefInUse.get() != 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Checking Memory Leak.Pool size: ");
        List<SafeHandlerThread> list = mSafeHandlerThreadList;
        LIZ.append(list.size());
        AVLog.ioi("SafeHandlerThreadPoolExecutor", X1D.LIZIZ(LIZ));
        synchronized (list) {
            for (SafeHandlerThread safeHandlerThread : list) {
                if (safeHandlerThread.isThreadAlive() && !safeHandlerThread.isLocked()) {
                    safeHandlerThread.getHandler().postDelayed(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$2__run$___twin___() {
                            SafeHandlerThread.this.release();
                        }

                        public AnonymousClass2() {
                        }

                        public static void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                            boolean LIZ2;
                            try {
                                anonymousClass2.com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$2__run$___twin___();
                            } finally {
                                if (LIZ2) {
                                }
                            }
                        }
                    }, 500L);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("BUG, ThreadListError,name:");
                    LIZ2.append(safeHandlerThread.getName());
                    LIZ2.append(",alive:");
                    LIZ2.append(safeHandlerThread.isThreadAlive());
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ2));
                    TTLSSladarBugReportUtils.getInstance().report(androidRuntimeException, "SafeHandlerThreadPoolExecutor.checkMemoryLeak");
                    if (TTLSBuildConfig.canThrowException()) {
                        throw androidRuntimeException;
                    }
                }
            }
            mSafeHandlerThreadList.clear();
        }
    }

    public static boolean usingNativeThread() {
        return mUsingNativeThread;
    }

    /* renamed from: com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor$1 */
    /* loaded from: classes12.dex */
    public final class AnonymousClass1 implements SafeHandlerThread.IDispatchInterceptMainException {
        public final /* synthetic */ JSONArray val$whiteList;

        public AnonymousClass1(JSONArray jSONArray) {
            r1 = jSONArray;
        }

        @Override // com.ss.ttlivestreamer.core.utils.SafeHandlerThread.IDispatchInterceptMainException
        public boolean dispatchInterceptMainException(String str, Throwable th) {
            try {
                String message = th.getMessage();
                if (message != null) {
                    int length = r1.length();
                    for (int i = 0; i < length; i++) {
                        if (message.contains(r1.get(i).toString())) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public static GLThread lockGLThread(String str) {
        return lockGLThread(str, 0);
    }

    public static SafeHandlerThread lockThread(String str) {
        return lockThread(str, 0);
    }

    public static void unlockThread(SafeHandlerThread safeHandlerThread) {
        if (safeHandlerThread == null) {
            return;
        }
        if (!mThreadPoolMode || mUsingNativeThread) {
            safeHandlerThread.release();
        } else if (safeHandlerThread.isThreadAlive()) {
            safeHandlerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor.4
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$4__run$___twin___() {
                    SafeHandlerThreadPoolExecutor.unlockThreadInner(SafeHandlerThread.this);
                }

                public AnonymousClass4() {
                }

                public static void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                    boolean LIZ;
                    try {
                        anonymousClass4.com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$4__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            TTLSSladarBugReportUtils.getInstance().report(new AndroidRuntimeException("BUG, thread has been dead."), "SafeHandlerThreadPoolExecutor.unlockThread");
        }
    }

    public static void unlockThreadInner(SafeHandlerThread safeHandlerThread) {
        if (safeHandlerThread.isLocked()) {
            safeHandlerThread.unlock(new Runnable() { // from class: com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$3__run$___twin___() {
                    List<SafeHandlerThread> list = SafeHandlerThreadPoolExecutor.mSafeHandlerThreadList;
                    synchronized (list) {
                        list.remove(SafeHandlerThread.this);
                    }
                }

                public AnonymousClass3() {
                }

                public static void com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_ttlivestreamer_core_utils_SafeHandlerThreadPoolExecutor$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            int decrementAndGet = mRefInUse.decrementAndGet();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unlockThread ");
            LIZ.append(safeHandlerThread.getName());
            LIZ.append(" with refCnt:");
            LIZ.append(decrementAndGet);
            AVLog.ioi("SafeHandlerThreadPoolExecutor", X1D.LIZIZ(LIZ));
            if (decrementAndGet < 0) {
                TTLSSladarBugReportUtils.getInstance().report(new AndroidRuntimeException("BUG"), "SafeHandlerThreadPoolExecutor.unlockThreadInner@1");
            }
            if (mCheckLeakWhenRef0) {
                checkMemoryLeak();
                return;
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BUG! release thread again. name:");
        LIZ2.append(safeHandlerThread.getName());
        TTLSSladarBugReportUtils.getInstance().report(new AndroidRuntimeException(X1D.LIZIZ(LIZ2)), "SafeHandlerThreadPoolExecutor.unlockThreadInner@2");
    }

    public static void enableSafeMode(SafeHandlerThread safeHandlerThread, String str) {
        JSONArray optJSONArray;
        JSONObject jSONObject = mSafeModeWhiteList;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str)) != null) {
            safeHandlerThread.enableSafeMode(new SafeHandlerThread.IDispatchInterceptMainException() { // from class: com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor.1
                public final /* synthetic */ JSONArray val$whiteList;

                public AnonymousClass1(JSONArray optJSONArray2) {
                    r1 = optJSONArray2;
                }

                @Override // com.ss.ttlivestreamer.core.utils.SafeHandlerThread.IDispatchInterceptMainException
                public boolean dispatchInterceptMainException(String str2, Throwable th) {
                    try {
                        String message = th.getMessage();
                        if (message != null) {
                            int length = r1.length();
                            for (int i = 0; i < length; i++) {
                                if (message.contains(r1.get(i).toString())) {
                                    return true;
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return false;
                }
            });
        }
    }

    public static /* synthetic */ void lambda$lockThread$0(String str, int i) {
        Process.setThreadPriority(TTLSThreadConfigHelper.getPriority(str, i));
    }

    public static GLThread lockGLThread(String str, int i) {
        if (!mThreadPoolMode || mUsingNativeThread) {
            return new GLThread(str, TTLSThreadConfigHelper.getPriority(str, i));
        }
        return (GLThread) lockThread(str, i, true);
    }

    public static SafeHandlerThread lockThread(String str, int i) {
        if (!mThreadPoolMode || mUsingNativeThread) {
            return new SafeHandlerThread(str, TTLSThreadConfigHelper.getPriority(str, i));
        }
        return lockThread(str, i, false);
    }

    public static SafeHandlerThread lockThread(String str, int i, boolean z) {
        SafeHandlerThread safeHandlerThread;
        List<SafeHandlerThread> list = mSafeHandlerThreadList;
        synchronized (list) {
            Iterator<SafeHandlerThread> it = list.iterator();
            safeHandlerThread = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SafeHandlerThread next = it.next();
                if (next != null) {
                    if (z) {
                        if (next instanceof GLThread) {
                            if (!next.isLocked() && next.isAlive() && (safeHandlerThread = next.lock()) != null) {
                                safeHandlerThread.setThreadName(str);
                                ThreadUtils.invokeAtFrontUninterruptibly(next.mHandler, new C15O(i, 1, str));
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("Get Thread from ThreadPool, name:");
                                LIZ.append(str);
                                LIZ.append(", isGL:");
                                LIZ.append(z);
                                AVLog.ioi("SafeHandlerThreadPoolExecutor", X1D.LIZIZ(LIZ));
                                break;
                            }
                        }
                    } else if (!(next instanceof GLThread)) {
                        if (!next.isLocked()) {
                            safeHandlerThread.setThreadName(str);
                            ThreadUtils.invokeAtFrontUninterruptibly(next.mHandler, new C15O(i, 1, str));
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Get Thread from ThreadPool, name:");
                            LIZ2.append(str);
                            LIZ2.append(", isGL:");
                            LIZ2.append(z);
                            AVLog.ioi("SafeHandlerThreadPoolExecutor", X1D.LIZIZ(LIZ2));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (safeHandlerThread == null) {
            int priority = TTLSThreadConfigHelper.getPriority(str, i);
            if (z) {
                safeHandlerThread = new GLThread(str, priority);
            } else {
                safeHandlerThread = new SafeHandlerThread(str, priority);
            }
            safeHandlerThread.start();
            safeHandlerThread.setAliveTimeMs(mThreadAliveTimeMs);
            safeHandlerThread.lock();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Create new Thread, name:");
            LIZ3.append(str);
            LIZ3.append(", isGL:");
            LIZ3.append(z);
            AVLog.ioi("SafeHandlerThreadPoolExecutor", X1D.LIZIZ(LIZ3));
            List<SafeHandlerThread> list2 = mSafeHandlerThreadList;
            synchronized (list2) {
                list2.add(safeHandlerThread);
            }
        }
        int incrementAndGet = mRefInUse.incrementAndGet();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("lock thread with refCnt:");
        LIZ4.append(incrementAndGet);
        AVLog.ioi("SafeHandlerThreadPoolExecutor", X1D.LIZIZ(LIZ4));
        enableSafeMode(safeHandlerThread, str);
        return safeHandlerThread;
    }

    public static void setThreadPoolMode(boolean z, boolean z2, long j, JSONObject jSONObject, boolean z3) {
        mThreadPoolMode = z;
        mUsingNativeThread = z2;
        mThreadAliveTimeMs = j;
        mSafeModeWhiteList = jSONObject;
        mCheckLeakWhenRef0 = z3;
    }
}
