package com.bytedance.helios.sdk.appops;

import X.C16880lQ;
import X.C66059PwF;
import X.C66076PwW;
import X.HandlerThreadC64418PPy;
import X.ORY;
import X.RunnableC66054PwA;
import android.app.AppOpsManager;
import android.app.AsyncNotedAppOp;
import android.app.SyncNotedAppOp;
import android.content.Context;
import com.bytedance.helios.api.consumer.ApmEvent;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AppOpsMonitor {
    public static final String[] LJ = {"android:camera", "android:record_audio"};
    public static AppOpsMonitor LJFF;
    public final AppOpsManager LIZ;
    public final Context LIZIZ;
    public final AppOpsMonitor$mOpActiveListener$1 LIZJ = new AppOpsManager.OnOpActiveChangedListener() { // from class: com.bytedance.helios.sdk.appops.AppOpsMonitor$mOpActiveListener$1
        @Override // android.app.AppOpsManager.OnOpActiveChangedListener
        public void onOpActiveChanged(String op, int i, String packageName, boolean z) {
            String str;
            String str2;
            o.LJIIIZ(op, "op");
            o.LJIIIZ(packageName, "packageName");
            Throwable th = new Throwable();
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.post(new RunnableC66054PwA(op, th, z));
            if (ORY.LJJIJIIJIL(op, AppOpsMonitor.LJ)) {
                if (o.LJ(op, "android:camera")) {
                    if (z) {
                        str2 = "open";
                    } else {
                        str2 = "close";
                    }
                    String LJFF2 = i0.LJFF("ops_", str2);
                    ApmEvent apmEvent = new ApmEvent("helios_av_statistics");
                    apmEvent.LIZ(LJFF2, "camera");
                    C66059PwF.LIZIZ(apmEvent);
                    return;
                }
                if (!o.LJ(op, "android:record_audio")) {
                    return;
                }
                if (z) {
                    str = "start";
                } else {
                    str = "stop";
                }
                String LJFF3 = i0.LJFF("ops_", str);
                ApmEvent apmEvent2 = new ApmEvent("helios_av_statistics");
                apmEvent2.LIZ(LJFF3, "audio");
                C66059PwF.LIZIZ(apmEvent2);
            }
        }
    };
    public final AppOpsMonitor$mOnOpNotedCallback$1 LIZLLL = new AppOpsManager.OnOpNotedCallback() { // from class: com.bytedance.helios.sdk.appops.AppOpsMonitor$mOnOpNotedCallback$1
        @Override // android.app.AppOpsManager.OnOpNotedCallback
        public void onAsyncNoted(AsyncNotedAppOp asyncOp) {
            o.LJIIIZ(asyncOp, "asyncOp");
            String op = asyncOp.getOp();
            o.LJIIIIZZ(op, "asyncOp.op");
            C66076PwW.LIZ(2, op, new Throwable());
        }

        @Override // android.app.AppOpsManager.OnOpNotedCallback
        public void onNoted(SyncNotedAppOp op) {
            o.LJIIIZ(op, "op");
            String op2 = op.getOp();
            o.LJIIIIZZ(op2, "op.op");
            C66076PwW.LIZ(0, op2, new Throwable());
        }

        @Override // android.app.AppOpsManager.OnOpNotedCallback
        public void onSelfNoted(SyncNotedAppOp op) {
            o.LJIIIZ(op, "op");
            String op2 = op.getOp();
            o.LJIIIIZZ(op2, "op.op");
            C66076PwW.LIZ(1, op2, new Throwable());
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.helios.sdk.appops.AppOpsMonitor$mOpActiveListener$1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.helios.sdk.appops.AppOpsMonitor$mOnOpNotedCallback$1] */
    public AppOpsMonitor(Context context) {
        this.LIZIZ = C16880lQ.LLLLL(context);
        Object LLILL = C16880lQ.LLILL(context, "appops");
        if (LLILL != null) {
            this.LIZ = (AppOpsManager) LLILL;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.AppOpsManager");
    }
}
