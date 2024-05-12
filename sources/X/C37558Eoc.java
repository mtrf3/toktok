package X;

import Y.ARunnableS15S0101000_11;
import Y.ARunnableS9S0101000_5;
import Y.ARunnableS9S0201000_6;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.pia.core.setting.Settings;
import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.pia.core.worker.binding.BaseModule;
import com.bytedance.pia.core.worker.network.WorkerDelegate;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.monitor.VmSdkMonitor;
import com.bytedance.vmsdk.worker.JsWorker;
import com.google.gson.m;
import org.json.JSONObject;

/* renamed from: X.Eoc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37558Eoc implements InterfaceC37489EnV {
    public final C37607EpP<String> LIZ = new C37607EpP<>();
    public final C37607EpP<String> LIZIZ;
    public final C37607EpP<m> LIZJ;
    public final C37607EpP<m> LIZLLL;
    public final BaseModule LJ;
    public final String LJFF;
    public final String LJI;
    public final android.net.Uri LJII;
    public final String LJIIIIZZ;
    public final android.net.Uri LJIIIZ;
    public final InterfaceC37599EpH LJIIJ;
    public final String LJIIJJI;
    public final JsWorker LJIIL;
    public final JSModuleManager LJIILIIL;
    public final java.util.Map<String, ?> LJIILJJIL;
    public final C37449Emr LJIILL;
    public final C37463En5 LJIILLIIL;
    public final BQ6<m> LJIIZILJ;
    public final C37560Eoe LJIJ;
    public InterfaceC37489EnV LJIJI;
    public EnumC37570Eoo LJIJJ;

    @Override // X.InterfaceC37489EnV
    public final void release() {
        LJI(null);
    }

    public final boolean LIZ() {
        if (this.LJIJJ != EnumC37570Eoo.Terminate && this.LJIIL.isRunning()) {
            return true;
        }
        return false;
    }

    public final void LJFF() {
        this.LJIILLIIL.LJIILJJIL.LIZ(System.currentTimeMillis(), "pia_request_worker_start");
        if (this.LJIJJ != EnumC37570Eoo.Create) {
            return;
        }
        this.LJIJJ = EnumC37570Eoo.Fetching;
        Tracing.Event LJII = LJII(EventName.WorkerScriptRequestStart);
        LJII.args.put("url", this.LJII.toString());
        LJII.LIZ();
        C37560Eoe c37560Eoe = this.LJIJ;
        if (c37560Eoe != null) {
            ARunnableS15S0101000_11 aRunnableS15S0101000_11 = new ARunnableS15S0101000_11(1, this, 4);
            synchronized (c37560Eoe) {
                if (c37560Eoe.LIZLLL) {
                    aRunnableS15S0101000_11.run();
                } else {
                    c37560Eoe.LJ = aRunnableS15S0101000_11;
                }
            }
            return;
        }
        String str = this.LJIIIIZZ;
        if (str != null) {
            LIZLLL(Boolean.TRUE, str);
        } else {
            this.LJIJI = this.LJIIJ.LIZ(EnumC37644Eq0.Auto, new InterfaceC37454Emw() { // from class: X.Eop
                @Override // X.InterfaceC37454Emw
                public final /* synthetic */ java.util.Map getRequestHeaders() {
                    return null;
                }

                @Override // X.InterfaceC37454Emw
                public final /* synthetic */ boolean isForMainFrame() {
                    return false;
                }

                @Override // X.InterfaceC37454Emw
                public final android.net.Uri getUrl() {
                    return C37558Eoc.this.LJII;
                }
            }, new BQ6() { // from class: X.Eoi
                @Override // X.BQ6
                public final void accept(Object obj) {
                    boolean z;
                    C37558Eoc c37558Eoc = C37558Eoc.this;
                    InterfaceC37464En6 interfaceC37464En6 = (InterfaceC37464En6) obj;
                    c37558Eoc.getClass();
                    try {
                        String LIZ = C37467En9.LIZ(interfaceC37464En6);
                        if (interfaceC37464En6.LJIIIZ() == EnumC37644Eq0.Offline) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c37558Eoc.LIZLLL(Boolean.valueOf(z), LIZ);
                    } catch (Throwable th) {
                        c37558Eoc.LIZJ(th);
                    }
                }
            }, new BQ6() { // from class: X.Eos
                @Override // X.BQ6
                public final void accept(Object obj) {
                    C37558Eoc.this.LIZJ((Throwable) obj);
                }
            });
        }
    }

    public C37558Eoc(final C37561Eof c37561Eof) {
        String str;
        C37560Eoe c37560Eoe;
        final C37607EpP<String> c37607EpP = new C37607EpP<>();
        this.LIZIZ = c37607EpP;
        this.LIZJ = new C37607EpP<>();
        this.LIZLLL = new C37607EpP<>();
        if (Settings.LIZ().isWorkerEnabled) {
            if (TextUtils.isEmpty(c37561Eof.LIZIZ)) {
                this.LJFF = "Worker";
            } else {
                this.LJFF = c37561Eof.LIZIZ;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[");
            String LJFF = JBR.LJFF(LIZ, this.LJFF, "] ", LIZ);
            this.LJI = LJFF;
            C37463En5 c37463En5 = c37561Eof.LIZ;
            this.LJIILLIIL = c37463En5;
            LJII(EventName.WorkerEnvironmentInitializeStart).LIZ();
            try {
                if (!TextUtils.isEmpty(c37561Eof.LIZJ)) {
                    if (c37561Eof.LIZJ.startsWith("javascript:")) {
                        str = c37561Eof.LIZJ.substring(11);
                        this.LJII = android.net.Uri.EMPTY;
                    } else {
                        this.LJII = android.net.Uri.parse(c37561Eof.LIZJ);
                        str = null;
                    }
                    JsWorker.EngineType engineType = JsWorker.EngineType.QUICKJS;
                    android.net.Uri uri = this.LJII;
                    synchronized (C37560Eoe.class) {
                        if (C37560Eoe.LJI != null && C37560Eoe.LJI.LIZ.equals(uri)) {
                            c37560Eoe = C37560Eoe.LJI;
                            C37560Eoe.LJI = null;
                        } else {
                            c37560Eoe = null;
                        }
                    }
                    this.LJIJ = c37560Eoe;
                    if (c37560Eoe == null) {
                        JSModuleManager jSModuleManager = new JSModuleManager(C37463En5.LJIILLIIL);
                        this.LJIILIIL = jSModuleManager;
                        try {
                            this.LJIIL = new JsWorker(jSModuleManager, engineType, null, false, "PIA");
                            Boolean bool = Boolean.TRUE;
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("use_vmsdk_worker", bool);
                                if (VmSdkMonitor.LIZ != null) {
                                    VmSdkMonitor.LIZ.LJIIJ("pia_worker", jSONObject, null, null);
                                }
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable th) {
                            Boolean bool2 = Boolean.FALSE;
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("use_vmsdk_worker", bool2);
                                if (VmSdkMonitor.LIZ != null) {
                                    VmSdkMonitor.LIZ.LJIIJ("pia_worker", jSONObject2, null, null);
                                }
                            } catch (Throwable unused2) {
                            }
                            c37561Eof.LIZ.LJII.LIZIZ("worker", -3, android.util.Log.getStackTraceString(th));
                            throw new C37572Eoq(th);
                        }
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LJFF);
                        LIZ2.append("consume warmup worker.");
                        C37238EjS.LJFF(X1D.LIZIZ(LIZ2));
                        this.LJIIL = c37560Eoe.LIZIZ;
                        this.LJIILIIL = c37560Eoe.LIZJ;
                    }
                    this.LJIIIZ = c37561Eof.LIZLLL;
                    this.LJIIJ = c37561Eof.LJ;
                    this.LJIIIIZZ = str;
                    this.LJIIZILJ = c37561Eof.LJII;
                    this.LJIILJJIL = c37561Eof.LJIIJ;
                    this.LJIJJ = EnumC37570Eoo.Create;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c37463En5.LJIIJ);
                    sb.append("PIANativeWorker ");
                    if (c37561Eof.LJIIIIZZ) {
                        sb.append(" PIAWarmup");
                    }
                    if (c37560Eoe != null) {
                        sb.append(" WarmupWorker");
                    }
                    String sb2 = sb.toString();
                    this.LJIIJJI = sb2;
                    C37449Emr c37449Emr = c37561Eof.LJFF;
                    this.LJIILL = c37449Emr;
                    C37562Eog c37562Eog = new C37562Eog(this);
                    c37449Emr.getClass();
                    C37613EpV.LIZJ(new ARunnableS9S0201000_6(1, c37449Emr, c37562Eog, 6));
                    this.LJIILIIL.LIZIZ(BaseModule.NAME, BaseModule.class, this);
                    BaseModule baseModule = (BaseModule) this.LJIILIIL.LIZ(BaseModule.NAME).getModule();
                    this.LJ = baseModule;
                    baseModule.setMessageHandle(new BQ6() { // from class: X.Eok
                        @Override // X.BQ6
                        public final void accept(Object obj) {
                            C37558Eoc c37558Eoc = C37558Eoc.this;
                            ReadableMap readableMap = (ReadableMap) obj;
                            if (readableMap != null) {
                                c37558Eoc.LIZJ.LIZ(C37697Eqr.LIZLLL(readableMap));
                            } else {
                                c37558Eoc.getClass();
                            }
                        }
                    });
                    baseModule.setBridgeMessageHandle(new BQ6() { // from class: X.Eol
                        @Override // X.BQ6
                        public final void accept(Object obj) {
                            C37558Eoc c37558Eoc = C37558Eoc.this;
                            ReadableMap readableMap = (ReadableMap) obj;
                            if (readableMap != null) {
                                c37558Eoc.LIZLLL.LIZ(C37697Eqr.LIZLLL(readableMap));
                            } else {
                                c37558Eoc.getClass();
                            }
                        }
                    });
                    if (c37561Eof.LJIIIZ) {
                        String str2 = C37513Ent.LIZ;
                        if (!TextUtils.isEmpty(str2)) {
                            this.LJIIL.evaluateJavaScript(str2);
                        } else {
                            c37561Eof.LIZ.LJII.LIZ(-4, "worker");
                            throw new RuntimeException("Polyfill load failed!");
                        }
                    }
                    if (Settings.LIZ().isVanillaFetchEnabled) {
                        if (c37561Eof.LJI != null) {
                            this.LJIIL.setWorkerDelegate(new WorkerDelegate(LJFF, sb2, c37561Eof.LJI, c37561Eof.LJ));
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(LJFF);
                            LIZ3.append("Initialize Fetch-API successfully");
                            C37238EjS.LJFF(X1D.LIZIZ(LIZ3));
                        } else {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append(LJFF);
                            LIZ4.append("Initialize Fetch-API failed (Reason: 'Retrofit is null')");
                            C37238EjS.LIZIZ(X1D.LIZIZ(LIZ4));
                        }
                    }
                    this.LJIIL.setOnErrorCallback(new InterfaceC37632Epo() { // from class: X.Eoj
                        @Override // X.InterfaceC37632Epo
                        public final void LIZ(String str3) {
                            C37558Eoc c37558Eoc = C37558Eoc.this;
                            C37561Eof c37561Eof2 = c37561Eof;
                            c37558Eoc.getClass();
                            c37561Eof2.LIZ.LJII.LIZIZ("worker", -7, str3);
                            c37558Eoc.LIZ.LIZ(str3);
                        }
                    });
                    this.LJIIL.setOnMessageCallback(new InterfaceC37632Epo() { // from class: X.Eow
                        @Override // X.InterfaceC37632Epo
                        public final void LIZ(String str3) {
                            C37607EpP.this.LIZ(str3);
                        }
                    });
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(LJFF);
                    LIZ5.append("Worker create successfully (URL: ");
                    LIZ5.append(c37561Eof.LIZLLL);
                    LIZ5.append(")");
                    C37238EjS.LJFF(X1D.LIZIZ(LIZ5));
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append(LJFF);
                    LIZ6.append("Create PIA worker (UserAgent: '");
                    LIZ6.append(sb2);
                    LIZ6.append("', RuntimeType: ");
                    LIZ6.append(engineType);
                    LIZ6.append(", URL: ");
                    LIZ6.append(this.LJII);
                    LIZ6.append(", Debuggable: ");
                    LIZ6.append(engineType == JsWorker.EngineType.V8);
                    LIZ6.append(")");
                    C37238EjS.LJFF(X1D.LIZIZ(LIZ6));
                    return;
                }
                c37561Eof.LIZ.LJII.LIZIZ("worker", -2, "script url is empty.");
                throw new C37394Ely(-10001);
            } finally {
            }
        } else {
            c37561Eof.LIZ.LJII.LIZ(-1, "worker");
            throw new C37407EmB();
        }
    }

    public final void LIZIZ(String str) {
        if (!TextUtils.isEmpty(str) && LIZ()) {
            this.LJIIL.evaluateJavaScript(str);
        }
    }

    public final void LIZJ(Throwable th) {
        this.LJIILLIIL.LJIILJJIL.LIZ(System.currentTimeMillis(), "pia_request_worker_end");
        C37477EnJ c37477EnJ = this.LJIILLIIL.LJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("url=");
        LIZ.append(this.LJII);
        LIZ.append(", error=");
        LIZ.append(android.util.Log.getStackTraceString(th));
        c37477EnJ.LIZIZ("worker", -6, X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJI);
        LIZ2.append("PIA worker fails to fetch script(URL:");
        LIZ2.append(this.LJII);
        LIZ2.append(", Reason: ");
        LIZ2.append(th);
        LIZ2.append(")");
        C37238EjS.LIZLLL(4, X1D.LIZIZ(LIZ2), th);
        this.LJIJJ = EnumC37570Eoo.Terminate;
        Tracing.Event LJII = LJII(EventName.WorkerScriptRequestEnd);
        LJII.args.put("url", this.LJII.toString());
        LJII.args.put("flag", "failed");
        LJII.args.put("mode", LiveWalletRechargeExchangeStrengthen.DEFAULT);
        LJII.args.put("f", 0);
        LJII.args.put("m", 0);
        LJII.LIZ();
        C37613EpV.LIZ().post(new ARunnableS9S0201000_6(0, this, th, 4));
    }

    public final void LJ(final BQ6<String> bq6) {
        this.LIZ.LIZJ(new BQ6() { // from class: X.Els
            @Override // X.BQ6
            public final void accept(Object obj) {
                C37558Eoc c37558Eoc = this;
                BQ6 bq62 = bq6;
                String str = (String) obj;
                c37558Eoc.getClass();
                StringBuilder LIZ = X1D.LIZ();
                YE1.LIZLLL(LIZ, c37558Eoc.LJI, "Handle error from worker(Error: ", str, ")");
                C37238EjS.LIZIZ(X1D.LIZIZ(LIZ));
                bq62.accept(str);
            }
        });
    }

    public final void LJI(m mVar) {
        if (!LIZ()) {
            return;
        }
        BQ6<m> bq6 = this.LJIIZILJ;
        if (bq6 != null) {
            bq6.accept(mVar);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJI);
        LIZ.append("PIA worker was terminated (URL: ");
        LIZ.append(this.LJIIIZ);
        LIZ.append(")");
        C37238EjS.LJFF(X1D.LIZIZ(LIZ));
        InterfaceC37489EnV interfaceC37489EnV = this.LJIJI;
        if (interfaceC37489EnV != null) {
            interfaceC37489EnV.release();
            this.LJIJI = null;
        }
        this.LJIJJ = EnumC37570Eoo.Terminate;
        C37449Emr c37449Emr = this.LJIILL;
        c37449Emr.getClass();
        C37613EpV.LIZJ(new ARunnableS9S0101000_5(3, c37449Emr, 13));
        this.LJIIL.terminate();
    }

    public final Tracing.Event LJII(EventName eventName) {
        Tracing.Event LIZ = this.LJIILLIIL.LJIILL.LIZ(eventName);
        LIZ.args.put("worker", this.LJIILLIIL.LIZIZ(this));
        return LIZ;
    }

    public final void LIZLLL(Boolean bool, String str) {
        String str2;
        String str3;
        this.LJIILLIIL.LJIILJJIL.LIZ(System.currentTimeMillis(), "pia_request_worker_end");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJI);
        LIZ.append("PIA worker fetches script successfully(URL: ");
        LIZ.append(this.LJII);
        LIZ.append(", Mode: ");
        if (bool.booleanValue()) {
            str2 = "Offline";
        } else {
            str2 = "Network";
        }
        LIZ.append(str2);
        LIZ.append(")");
        C37238EjS.LJFF(X1D.LIZIZ(LIZ));
        Tracing.Event LJII = LJII(EventName.WorkerScriptRequestEnd);
        LJII.args.put("url", this.LJII.toString());
        LJII.args.put("flag", "success");
        if (bool.booleanValue()) {
            str3 = "offline";
        } else {
            str3 = LiveWalletRechargeExchangeStrengthen.DEFAULT;
        }
        LJII.args.put("mode", str3);
        LJII.args.put("f", 1);
        LJII.args.put("m", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        LJII.LIZ();
        C37613EpV.LIZ().post(new ARunnableS9S0201000_6(1, this, str, 1));
    }
}
