package X;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.im.core.client.ReportTaskInfoConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.OtZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC63345OtZ<T> implements Runnable, InterfaceC63351Otf {
    public static final java.util.Map<Integer, WeakReference<RunnableC63345OtZ>> LJLLLLLL = new HashMap();
    public static final ConcurrentHashMap<Integer, WeakReference<RunnableC63345OtZ>> LJLZ = new ConcurrentHashMap<>();
    public final InterfaceC63352Otg<T> LJLIL;
    public final InterfaceC63353Oth<T> LJLILLLLZI;
    public T LJLJI;
    public final Executor LJLJJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public long LJLLILLLL;
    public Throwable LJLLJ;
    public Throwable LJLLL;
    public final boolean LJLLLL;
    public final HandlerC63347Otb LJLJJI = new HandlerC63347Otb(C16880lQ.LLJJJJ(), this);
    public final ReportTaskInfoConfig LJLJJLL = C63308Osy.LJI().LIZLLL().LJJJI;
    public final long LJLJL = SystemClock.uptimeMillis();

    public static void LIZIZ() {
        try {
            Iterator it = ((HashMap) LJLLLLLL).values().iterator();
            while (it.hasNext()) {
                RunnableC63345OtZ runnableC63345OtZ = (RunnableC63345OtZ) ((WeakReference) it.next()).get();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Task clean task ");
                LIZ.append(runnableC63345OtZ);
                C63322OtC.LIZ(X1D.LIZIZ(LIZ));
                if (runnableC63345OtZ != null) {
                    runnableC63345OtZ.LJLJJI.removeMessages(100001);
                    runnableC63345OtZ.LJLJJI.removeMessages(100003);
                }
            }
            Iterator<WeakReference<RunnableC63345OtZ>> it2 = LJLZ.values().iterator();
            while (it2.hasNext()) {
                RunnableC63345OtZ runnableC63345OtZ2 = it2.next().get();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Task clean task ");
                LIZ2.append(runnableC63345OtZ2);
                C63322OtC.LIZ(X1D.LIZIZ(LIZ2));
                if (runnableC63345OtZ2 != null) {
                    runnableC63345OtZ2.LJLJJI.removeMessages(100001);
                    runnableC63345OtZ2.LJLJJI.removeMessages(100003);
                }
            }
            ((HashMap) LJLLLLLL).clear();
            LJLZ.clear();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r6 = this;
            X.Otb r1 = r6.LJLJJI
            r0 = 100002(0x186a2, float:1.40133E-40)
            r1.removeMessages(r0)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.LJLJL
            long r0 = r4 - r2
            r6.LJLJLLL = r0
            X.Otg<T> r0 = r6.LJLIL
            if (r0 == 0) goto L26
            java.lang.Object r2 = r0.LIZIZ()     // Catch: java.lang.Exception -> L1b
            goto L27
        L1b:
            r1 = move-exception
            java.lang.String r0 = "Task run"
            X.C63322OtC.LJ(r0, r1)
            r6.LJLLJ = r1
            X.C63337OtR.LJFF(r1)
        L26:
            r2 = 0
        L27:
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.LJLJLJ = r0
            long r0 = r0 - r4
            r6.LJLL = r0
            r6.LJLJI = r2
            X.Otb r0 = r6.LJLJJI
            if (r0 == 0) goto L46
            android.os.Message r1 = android.os.Message.obtain()
            r0 = 100001(0x186a1, float:1.40131E-40)
            r1.what = r0
            r1.obj = r6
            X.Otb r0 = r6.LJLJJI
            r0.sendMessage(r1)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC63345OtZ.LIZJ():void");
    }

    public final void LJIIIIZZ() {
        if (this.LJLJJI != null && this.LJLJJLL.enable == 1) {
            Message obtain = Message.obtain();
            obtain.what = 100002;
            obtain.obj = this;
            this.LJLJJI.sendMessageDelayed(obtain, this.LJLJJLL.timeoutDurationMs);
        }
        try {
            this.LJLJJL.execute(this);
        } catch (Exception e) {
            this.LJLLL = e;
            C63322OtC.LJ("Task start", e);
            C63337OtR.LJFF(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static String LJFF(Throwable th) {
        String stackTraceString = android.util.Log.getStackTraceString(th);
        if (stackTraceString.length() > 2048) {
            return stackTraceString.substring(0, 2048);
        }
        return stackTraceString;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C63323OtD r7) {
        /*
            r6 = this;
            java.util.concurrent.Executor r1 = r6.LJLJJL
            boolean r0 = r1 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r0 == 0) goto L74
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
            java.util.concurrent.BlockingQueue r0 = r1.getQueue()
            int r0 = r0.size()
            long r1 = (long) r0
            java.util.concurrent.Executor r0 = r6.LJLJJL
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0
            long r4 = r0.getTaskCount()
        L19:
            java.util.concurrent.Executor r3 = r6.LJLJJL
            if (r3 != 0) goto L58
        L1d:
            java.lang.String r3 = "unknown"
        L1f:
            java.lang.String r0 = "executor_name"
            r7.LIZ(r3, r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "processor_count"
            r7.LIZ(r3, r0)
            java.lang.String r3 = "work_queue_size"
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r7.LIZ(r0, r3)
            java.lang.String r1 = "task_count"
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r7.LIZ(r0, r1)
            X.Otg<T> r0 = r6.LJLIL
            if (r0 != 0) goto L53
            java.lang.String r1 = "null"
        L4d:
            java.lang.String r0 = "task_name"
            r7.LIZ(r1, r0)
            return
        L53:
            java.lang.String r1 = r0.toString()
            goto L4d
        L58:
            java.util.concurrent.ExecutorService r0 = X.C63346Ota.LIZJ
            if (r3 != r0) goto L5f
            java.lang.String r3 = "default"
            goto L1f
        L5f:
            java.util.concurrent.ExecutorService r0 = X.C63346Ota.LIZIZ
            if (r3 != r0) goto L66
            java.lang.String r3 = "receive"
            goto L1f
        L66:
            java.util.concurrent.ExecutorService r0 = X.C63346Ota.LIZ
            if (r3 != r0) goto L6d
            java.lang.String r3 = "send"
            goto L1f
        L6d:
            java.util.concurrent.ExecutorService r0 = X.C63346Ota.LIZLLL
            if (r3 != r0) goto L1d
            java.lang.String r3 = "common"
            goto L1f
        L74:
            r1 = 0
            r4 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC63345OtZ.LIZ(X.OtD):void");
    }

    public final void LJII(String str) {
        boolean z;
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ(str);
        LIZ(c63323OtD);
        c63323OtD.LIZ(Long.valueOf(this.LJLJLLL), "wait_executor_cost");
        c63323OtD.LIZ(Long.valueOf(this.LJLL), "execute_cost");
        c63323OtD.LIZ(Long.valueOf(this.LJLLI), "wait_main_thread_cost");
        c63323OtD.LIZ(Long.valueOf(this.LJLLILLLL), "execute_callback_cost");
        String str2 = "unknown";
        String str3 = "1";
        if (this.LJLLJ != null) {
            c63323OtD.LIZ("1", "execute_error");
            String message = this.LJLLJ.getMessage();
            if (message == null) {
                message = "unknown";
            }
            c63323OtD.LIZ(message, "error_msg");
            c63323OtD.LIZ(LJFF(this.LJLLJ), "error_stack");
            z = true;
        } else {
            c63323OtD.LIZ(CardStruct.IStatusCode.DEFAULT, "execute_error");
            z = false;
        }
        if (this.LJLLL != null) {
            c63323OtD.LIZ("1", "execute_callback_error");
            String message2 = this.LJLLL.getMessage();
            if (message2 != null) {
                str2 = message2;
            }
            c63323OtD.LIZ(str2, "error_msg");
            c63323OtD.LIZ(LJFF(this.LJLLL), "error_stack");
        } else {
            c63323OtD.LIZ(CardStruct.IStatusCode.DEFAULT, "execute_callback_error");
            if (!z) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
        }
        c63323OtD.LIZ(str3, "has_error");
        c63323OtD.LJFF();
    }

    @Override // X.InterfaceC63351Otf
    public final void handleMsg(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof RunnableC63345OtZ)) {
            return;
        }
        RunnableC63345OtZ runnableC63345OtZ = (RunnableC63345OtZ) obj;
        try {
            switch (message.what) {
                case 100001:
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.LJLLI = uptimeMillis - this.LJLJLJ;
                    if (runnableC63345OtZ.LJLLLL) {
                        LJLZ.remove(Integer.valueOf(runnableC63345OtZ.hashCode()));
                    } else {
                        ((HashMap) LJLLLLLL).remove(Integer.valueOf(runnableC63345OtZ.hashCode()));
                    }
                    InterfaceC63353Oth<T> interfaceC63353Oth = runnableC63345OtZ.LJLILLLLZI;
                    if (interfaceC63353Oth != null) {
                        try {
                            interfaceC63353Oth.LIZLLL(runnableC63345OtZ.LJLJI);
                        } catch (Exception e) {
                            this.LJLLL = e;
                            C63322OtC.LJ("Task handleMsg", e);
                            C63337OtR.LJFF(e);
                        }
                    }
                    this.LJLLILLLL = SystemClock.uptimeMillis() - uptimeMillis;
                    if (this.LJLJJLL.enable == 0) {
                        return;
                    }
                    if (C63337OtR.LIZJ(0.001f, "im_sdk_task_info")) {
                        LJII("im_sdk_task_info");
                    }
                    if (this.LJLL > this.LJLJJLL.executeTooLongMs && C63337OtR.LIZJ(1.0f, "im_sdk_task_execute_too_long")) {
                        LJII("im_sdk_task_execute_too_long");
                    }
                    if (this.LJLLILLLL > this.LJLJJLL.callbackTooLongMs && C63337OtR.LIZJ(1.0f, "im_sdk_task_callback_too_long")) {
                        LJII("im_sdk_task_callback_too_long");
                    }
                    if (this.LJLLJ != null && C63337OtR.LIZJ(1.0f, "im_sdk_task_execute_error")) {
                        LJI("im_sdk_task_execute_error", this.LJLLJ);
                    }
                    if (this.LJLLL == null || !C63337OtR.LIZJ(1.0f, "im_sdk_task_callback_error")) {
                        return;
                    }
                    LJI("im_sdk_task_callback_error", this.LJLLL);
                    return;
                case 100002:
                    this.LJLJJI.removeMessages(100002);
                    if (this.LJLJJLL.enable == 0 || !C63337OtR.LIZJ(1.0f, "im_sdk_task_wait_execute_timeout")) {
                        return;
                    }
                    C63323OtD c63323OtD = new C63323OtD();
                    c63323OtD.LIZJ("im_sdk_task_wait_execute_timeout");
                    LIZ(c63323OtD);
                    c63323OtD.LJFF();
                    return;
                case 100003:
                    LJIIIIZZ();
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJI(String str, Throwable th) {
        String obj;
        C63323OtD LIZJ = C63144OqK.LIZJ(str);
        String message = th.getMessage();
        if (message == null) {
            message = "unknown";
        }
        LIZJ.LIZ(message, "error_msg");
        LIZJ.LIZ(LJFF(th), "error_stack");
        InterfaceC63352Otg<T> interfaceC63352Otg = this.LJLIL;
        if (interfaceC63352Otg == null) {
            obj = "null";
        } else {
            obj = interfaceC63352Otg.toString();
        }
        LIZJ.LIZ(obj, "task_name");
        LIZJ.LJFF();
    }

    public static <T> void LIZLLL(InterfaceC63352Otg<T> interfaceC63352Otg, InterfaceC63353Oth<T> interfaceC63353Oth, Executor executor) {
        boolean z = C63308Osy.LJI().LJ;
        if (z) {
            new RunnableC63345OtZ(interfaceC63352Otg, interfaceC63353Oth, executor, Boolean.valueOf(C63308Osy.LJI().LIZLLL().LJJLI)).LJIIIIZZ();
            return;
        }
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("im_sdk_execute_task_not_login");
        c63323OtD.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Task execute not start, isLogin:");
        LIZ.append(z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
    }

    public static <T> void LJ(InterfaceC63352Otg<T> interfaceC63352Otg, InterfaceC63353Oth<T> interfaceC63353Oth, boolean z) {
        boolean z2 = C63308Osy.LJI().LJ;
        if (z2) {
            new RunnableC63345OtZ(interfaceC63352Otg, interfaceC63353Oth, C63346Ota.LIZIZ(), Boolean.valueOf(C63308Osy.LJI().LIZLLL().LJJLI)).LJIIIIZZ();
            return;
        }
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("im_sdk_execute_task_not_login");
        c63323OtD.LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Task execute not start, isLogin:");
        LIZ.append(z2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (!z || interfaceC63353Oth == null) {
            return;
        }
        interfaceC63353Oth.LIZLLL(null);
    }

    public RunnableC63345OtZ(InterfaceC63352Otg<T> interfaceC63352Otg, InterfaceC63353Oth<T> interfaceC63353Oth, Executor executor, Boolean bool) {
        this.LJLIL = interfaceC63352Otg;
        this.LJLILLLLZI = interfaceC63353Oth;
        this.LJLJJL = executor;
        if (bool.booleanValue()) {
            this.LJLLLL = true;
            LJLZ.put(Integer.valueOf(hashCode()), new WeakReference<>(this));
        } else {
            ((HashMap) LJLLLLLL).put(Integer.valueOf(hashCode()), new WeakReference(this));
        }
    }
}
