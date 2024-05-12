package com.bytedance.pia.core.worker.binding;

import X.BQ6;
import X.C37238EjS;
import X.C37499Enf;
import X.C37558Eoc;
import X.C37577Eov;
import X.C37607EpP;
import X.C37697Eqr;
import X.C85693Xx;
import X.EnumC37644Eq0;
import X.InterfaceC37580Eoy;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.pia.core.worker.binding.BaseModule;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes7.dex */
public class BaseModule extends JSModule {
    public static final String NAME = "BaseModule";
    public final ConcurrentLinkedQueue<JavaOnlyMap> localBridgeMessages;
    public final ConcurrentLinkedQueue<JavaOnlyMap> localMessages;
    public final C37607EpP<ReadableMap> remoteBridgeMessages;
    public final C37607EpP<ReadableMap> remoteMessages;
    public final C37558Eoc worker;

    @InterfaceC37580Eoy
    public WritableMap getBridgeMessage() {
        return this.localBridgeMessages.poll();
    }

    @InterfaceC37580Eoy
    public WritableMap getGlobalProps() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("settings", new JavaOnlyMap());
        Map<String, ?> map = this.worker.LJIILJJIL;
        if (map != null) {
            javaOnlyMap.put("businessProps", C37697Eqr.LIZIZ(GsonProtectorUtils.toJsonTree(GsonUtils.LIZIZ(), map).LJIIZILJ()));
        } else {
            javaOnlyMap.put("businessProps", new JavaOnlyMap());
        }
        return javaOnlyMap;
    }

    @InterfaceC37580Eoy
    public String getHref() {
        return this.worker.LJIIIZ.toString();
    }

    @InterfaceC37580Eoy
    public WritableMap getMessage() {
        return this.localMessages.poll();
    }

    @InterfaceC37580Eoy
    public String getUserAgent() {
        return this.worker.LJIIJJI;
    }

    @InterfaceC37580Eoy
    public String getWorkerName() {
        return this.worker.LJFF;
    }

    @InterfaceC37580Eoy
    public void terminate() {
        this.worker.LJI(null);
    }

    @InterfaceC37580Eoy
    public void postBridgeMessage(ReadableMap readableMap) {
        if (readableMap != null) {
            this.remoteBridgeMessages.LIZ(readableMap);
        }
    }

    @InterfaceC37580Eoy
    public void postMessage(ReadableMap readableMap) {
        if (readableMap != null) {
            this.remoteMessages.LIZ(readableMap);
            return;
        }
        throw new NullPointerException("message can not be null!");
    }

    public void sendWorkerBridgeMessage(JavaOnlyMap javaOnlyMap) {
        this.localBridgeMessages.offer(javaOnlyMap);
        this.worker.LIZIZ("globalThis.__PIA_NATIVE__.onWorkerBridgeMessage();");
    }

    public void sendWorkerMessage(JavaOnlyMap javaOnlyMap) {
        this.localMessages.offer(javaOnlyMap);
        this.worker.LIZIZ("globalThis.__PIA_NATIVE__.onWorkerMessage();");
    }

    public void setBridgeMessageHandle(BQ6<ReadableMap> bq6) {
        this.remoteBridgeMessages.LIZJ(bq6);
    }

    public void setMessageHandle(BQ6<ReadableMap> bq6) {
        this.remoteMessages.LIZJ(bq6);
    }

    @InterfaceC37580Eoy
    public void terminateWithResult(ReadableMap readableMap) {
        if (readableMap == null) {
            this.worker.LJI(null);
        } else {
            this.worker.LJI(C37697Eqr.LIZLLL(readableMap));
        }
    }

    public BaseModule(Context context, Object obj) {
        super(context, obj);
        this.remoteMessages = new C37607EpP<>();
        this.localMessages = new ConcurrentLinkedQueue<>();
        this.remoteBridgeMessages = new C37607EpP<>();
        this.localBridgeMessages = new ConcurrentLinkedQueue<>();
        this.worker = (C37558Eoc) obj;
    }

    public static /* synthetic */ void lambda$importScriptsAsync$0(Callback callback, String str) {
        if (callback != null) {
            callback.invoke(str);
        }
    }

    public static /* synthetic */ void lambda$importScriptsAsync$1(Callback callback, String str) {
        if (callback != null) {
            callback.invoke(str);
        }
    }

    @InterfaceC37580Eoy
    public void log(String str, int i) {
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(this.worker.LJI);
                            LIZ.append(str);
                            C37238EjS.LIZIZ(X1D.LIZIZ(LIZ));
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(this.worker.LJI);
                            LIZ2.append(str);
                            C37238EjS.LJII(X1D.LIZIZ(LIZ2));
                        }
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(this.worker.LJI);
                        LIZ3.append(str);
                        C37238EjS.LJIIIIZZ(6, X1D.LIZIZ(LIZ3), null);
                    }
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(this.worker.LJI);
                    LIZ4.append(str);
                    C37238EjS.LJFF(X1D.LIZIZ(LIZ4));
                }
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(this.worker.LJI);
                LIZ5.append(str);
                C37238EjS.LIZ(X1D.LIZIZ(LIZ5));
            }
            ((C37499Enf) this.worker.LJIILLIIL).LJIIJJI("event-on-worker-log", str, Integer.valueOf(i));
        } catch (Throwable th) {
            C37238EjS.LJIIIIZZ(4, "Worker invoke log error:", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.Eou] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.Eot] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.Elt, X.BQ6] */
    @InterfaceC37580Eoy
    public void importScriptsAsync(final String str, final Callback callback, final Callback callback2) {
        final C37558Eoc c37558Eoc = this.worker;
        final ?? r10 = new BQ6() { // from class: X.Eot
            @Override // X.BQ6
            public final void accept(Object obj) {
                BaseModule.lambda$importScriptsAsync$0(Callback.this, (String) obj);
            }
        };
        final ?? r0 = new BQ6() { // from class: X.Eou
            @Override // X.BQ6
            public final void accept(Object obj) {
                BaseModule.lambda$importScriptsAsync$1(Callback.this, (String) obj);
            }
        };
        c37558Eoc.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final ?? r12 = new BQ6() { // from class: X.Elt
            @Override // X.BQ6
            public final void accept(Object obj) {
                String str2;
                C37558Eoc c37558Eoc2 = c37558Eoc;
                BQ6 bq6 = r0;
                Throwable th = (Throwable) obj;
                c37558Eoc2.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(c37558Eoc2.LJI);
                LIZ.append("load script async error:");
                C37238EjS.LIZJ(X1D.LIZIZ(LIZ), th);
                if (th != null) {
                    str2 = th.toString();
                } else {
                    str2 = "";
                }
                bq6.accept(str2);
            }
        };
        BQ6 bq6 = new BQ6() { // from class: X.Eod
            @Override // X.BQ6
            public final void accept(Object obj) {
                C37558Eoc c37558Eoc2 = C37558Eoc.this;
                long j = currentTimeMillis;
                BQ6 bq62 = r10;
                String str2 = str;
                BQ6 bq63 = r12;
                InterfaceC37464En6 interfaceC37464En6 = (InterfaceC37464En6) obj;
                c37558Eoc2.getClass();
                try {
                    String LIZ = C37467En9.LIZ(interfaceC37464En6);
                    long currentTimeMillis2 = System.currentTimeMillis() - j;
                    c37558Eoc2.LJIIL.evaluateJavaScript(LIZ);
                    bq62.accept(String.valueOf(currentTimeMillis2));
                } catch (Throwable th) {
                    C37477EnJ c37477EnJ = c37558Eoc2.LJIILLIIL.LJII;
                    StringBuilder LIZIZ = C25620zW.LIZIZ("url=", str2, ", error=");
                    LIZIZ.append(android.util.Log.getStackTraceString(th));
                    c37477EnJ.LIZIZ("worker", -6, X1D.LIZIZ(LIZIZ));
                    bq63.accept(th);
                }
            }
        };
        if (TextUtils.isEmpty(str)) {
            c37558Eoc.LJIILLIIL.LJII.LIZIZ("worker", -2, "script url is empty.");
            r12.accept(new RuntimeException("invalid url"));
        }
        Uri parse = UriProtector.parse(str);
        if (!C85693Xx.LIZIZ(parse)) {
            c37558Eoc.LJIILLIIL.LJII.LIZIZ("worker", -2, parse.toString());
            r12.accept(new RuntimeException("invalid url"));
        }
        c37558Eoc.LJIIJ.LIZ(EnumC37644Eq0.Auto, new C37577Eov(parse), bq6, r12);
    }
}
