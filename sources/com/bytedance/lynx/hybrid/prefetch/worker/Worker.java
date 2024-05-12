package com.bytedance.lynx.hybrid.prefetch.worker;

import X.C03090Af;
import X.C141335gf;
import X.C16880lQ;
import X.C24550xn;
import X.C37700Equ;
import X.C37713Er7;
import X.C37742Era;
import X.C37750Eri;
import X.C37905EuD;
import X.C38097ExJ;
import X.C38504F9g;
import X.C3C5;
import X.C60726NsQ;
import X.C60737Nsb;
import X.C76800UCe;
import X.C77117UOj;
import X.InterfaceC37632Epo;
import X.InterfaceC37747Erf;
import X.RunnableC37740ErY;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.bytedance.android.monitorV2.jsworker.JsWorkerModule;
import com.bytedance.lynx.hybrid.prefetch.bridge.WorkerBridgeModule;
import com.bytedance.lynx.hybrid.prefetch.bridge.WorkerEnvModule;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.jsbridge.JSModuleWrapper;
import com.bytedance.vmsdk.monitor.VmSdkMonitor;
import com.bytedance.vmsdk.worker.JsWorker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Worker {
    public final JSModuleManager LIZ;
    public final JsWorker LIZIZ;
    public final InterfaceC37747Erf LIZJ;
    public final String LIZLLL;
    public final C24550xn LJ;
    public final C37742Era LJFF;

    public final void LIZIZ() {
        JSModule module;
        JsWorkerModule jsWorkerModule;
        JsWorker jsWorker = this.LIZIZ;
        if (jsWorker != null) {
            jsWorker.terminate();
        }
        JSModuleManager manager = this.LIZ;
        o.LJIIJ(manager, "manager");
        try {
            JSModuleWrapper LIZ = manager.LIZ("hybridMonitor");
            if (LIZ != null && (module = LIZ.getModule()) != null && (module instanceof JsWorkerModule) && (jsWorkerModule = (JsWorkerModule) module) != null) {
                jsWorkerModule.fireAllEvents();
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
        ((C37905EuD) this.LJ.LIZ).LJ();
    }

    public static void LIZ(boolean z) {
        try {
            JSONObject put = new JSONObject().put("use_vmsdk_worker", z);
            if (VmSdkMonitor.LIZ != null) {
                VmSdkMonitor.LIZ.LJIIJ("hybrid-prefetch", put, null, null);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public Worker(InterfaceC37747Erf client, String prefetchUrl, C24550xn c24550xn, C37742Era c37742Era) {
        Object LIZ;
        C60737Nsb c60737Nsb;
        o.LJIIJ(client, "client");
        o.LJIIJ(prefetchUrl, "prefetchUrl");
        this.LIZJ = client;
        this.LIZLLL = prefetchUrl;
        this.LJ = c24550xn;
        this.LJFF = c37742Era;
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        RunnableC37740ErY runnableC37740ErY = new RunnableC37740ErY(this);
        long j = 30000;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("hybrid_lynx_prefetch");
            if (config != null) {
                j = config.optLong("worker_max_execution_duration", 30000L);
            }
        } catch (Exception unused) {
        }
        handler.postDelayed(runnableC37740ErY, j);
        Context context = C37742Era.LIZLLL;
        if (context != null) {
            JSModuleManager jSModuleManager = new JSModuleManager(context);
            try {
                if (jSModuleManager.LIZ("hybridMonitor") == null) {
                    jSModuleManager.LIZIZ("hybridMonitor", JsWorkerModule.class, null);
                }
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
            this.LIZ = jSModuleManager;
            try {
                LIZ = new JsWorker(jSModuleManager, JsWorker.EngineType.QUICKJS, null, false, "hybrid_lynx_prefetch");
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th2) {
                LIZ = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m13isSuccessimpl(LIZ)) {
                JsWorker jsWorker = (JsWorker) LIZ;
                this.LJFF.getClass();
                InterfaceC37747Erf interfaceC37747Erf = this.LIZJ;
                C38504F9g c38504F9g = (C38504F9g) (interfaceC37747Erf instanceof C38504F9g ? interfaceC37747Erf : null);
                if (c38504F9g != null && (c60737Nsb = c38504F9g.LJIIJ) != null) {
                    Object LJI = c60737Nsb.LJI();
                    View view = (View) (LJI instanceof C60726NsQ ? LJI : null);
                    if (view != null) {
                        C37713Er7.LIZ(view, this.LIZ);
                    } else {
                        c60737Nsb.LJII(JSModuleManager.class, this.LIZ);
                        Object LJI2 = c60737Nsb.LJI();
                        View view2 = (View) (LJI2 instanceof C60726NsQ ? LJI2 : null);
                        if (view2 != null) {
                            C37713Er7.LIZ(view2, this.LIZ);
                        }
                    }
                }
                this.LIZ.LIZIZ("bridge", WorkerBridgeModule.class, new C37700Equ(this.LIZLLL, jsWorker, this.LJ));
                this.LIZ.LIZIZ(WorkerEnvModule.NAME, WorkerEnvModule.class, this.LJFF);
                jsWorker.setOnErrorCallback(new InterfaceC37632Epo() { // from class: com.bytedance.lynx.hybrid.prefetch.worker.Worker$$special$$inlined$onSuccess$lambda$1
                    @Override // X.InterfaceC37632Epo
                    public final void LIZ(String e) {
                        InterfaceC37747Erf interfaceC37747Erf2 = Worker.this.LIZJ;
                        o.LJFF(e, "e");
                        interfaceC37747Erf2.onError(e);
                    }
                });
                jsWorker.setOnMessageCallback(new InterfaceC37632Epo() { // from class: com.bytedance.lynx.hybrid.prefetch.worker.Worker$$special$$inlined$onSuccess$lambda$2
                    @Override // X.InterfaceC37632Epo
                    public final void LIZ(String msg) {
                        InterfaceC37747Erf interfaceC37747Erf2 = Worker.this.LIZJ;
                        o.LJFF(msg, "msg");
                        interfaceC37747Erf2.onMessage(msg);
                    }
                });
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Worker create successfully, prefetch url: ");
                LIZ2.append(this.LIZLLL);
                C37750Eri.LIZ(X1D.LIZIZ(LIZ2));
                C38097ExJ.LIZIZ("hybrid_prefetch_worker_start", this.LJFF.LIZJ.LJIIJ, this.LIZLLL, null);
                LIZ(true);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl == null) {
                this.LIZIZ = (JsWorker) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
                return;
            }
            C37750Eri.LIZIZ("Worker create failed:", m10exceptionOrNullimpl, 4);
            LIZ(false);
            StringBuilder LIZ3 = X1D.LIZ();
            throw new RuntimeException(C03090Af.LIZJ(LIZ3, "init JsWorker failed, ", m10exceptionOrNullimpl, LIZ3));
        }
        o.LJIJI("applicationContext");
        throw null;
    }
}
