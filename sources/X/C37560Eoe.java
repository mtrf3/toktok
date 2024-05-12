package X;

import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.worker.JsWorker;

/* renamed from: X.Eoe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37560Eoe {
    public static volatile C37560Eoe LJI;
    public final android.net.Uri LIZ;
    public final JsWorker LIZIZ;
    public final JSModuleManager LIZJ;
    public volatile boolean LIZLLL;
    public volatile Runnable LJ;
    public volatile Throwable LJFF;

    public final void LIZ(Throwable th) {
        synchronized (this) {
            this.LIZLLL = true;
            this.LJFF = th;
            this.LIZIZ.terminate();
            if (this.LJ != null) {
                this.LJ.run();
            }
        }
    }

    public C37560Eoe(InterfaceC37599EpH interfaceC37599EpH, android.net.Uri uri) {
        this.LIZ = uri;
        JsWorker.EngineType engineType = JsWorker.EngineType.QUICKJS;
        JSModuleManager jSModuleManager = new JSModuleManager(C37509Enp.LIZ);
        this.LIZJ = jSModuleManager;
        this.LIZIZ = new JsWorker(jSModuleManager, engineType, null, false, "PIA");
        interfaceC37599EpH.LIZ(EnumC37644Eq0.Auto, new C37577Eov(uri), new BQ6() { // from class: X.Eoh
            @Override // X.BQ6
            public final void accept(Object obj) {
                C37560Eoe c37560Eoe = C37560Eoe.this;
                InterfaceC37464En6 interfaceC37464En6 = (InterfaceC37464En6) obj;
                c37560Eoe.getClass();
                try {
                    c37560Eoe.LIZIZ.evaluateJavaScript(C37467En9.LIZ(interfaceC37464En6), c37560Eoe.LIZ.toString());
                    synchronized (c37560Eoe) {
                        c37560Eoe.LIZLLL = true;
                        if (c37560Eoe.LJ != null) {
                            c37560Eoe.LJ.run();
                        }
                    }
                } catch (Throwable th) {
                    c37560Eoe.LIZ(th);
                }
            }
        }, new BQ6() { // from class: X.Eor
            @Override // X.BQ6
            public final void accept(Object obj) {
                C37560Eoe.this.LIZ((Throwable) obj);
            }
        });
    }
}
