package com.ss.bduploader.net;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C39745Fin;
import X.C64587PWl;
import X.C64598PWw;
import X.C64600PWy;
import X.C64601PWz;
import X.C64618PXq;
import X.C65300Pk0;
import X.InterfaceC48133Iun;
import X.PVM;
import X.PVP;
import X.PX8;
import com.ss.bduploader.net.BDVNetClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class BDHTTPNetwork extends BDVNetClient {
    public static final C39745Fin JSON = C39745Fin.LIZJ("application/json");
    public static C64600PWy mClient;
    public InterfaceC48133Iun mCall;

    public static void com_ss_bduploader_net_BDHTTPNetwork_okhttp3_Call_enqueue(InterfaceC48133Iun interfaceC48133Iun, PX8 px8) {
        if (new C03880Dg(2).LIZJ(400103, "okhttp3/Call", "enqueue", interfaceC48133Iun, new Object[]{px8}, "void", new C65300Pk0(false, "(Lokhttp3/Callback;)V", "-2394953478115593420")).LIZ) {
            return;
        }
        interfaceC48133Iun.LLIZLLLIL(px8);
    }

    public static C64600PWy com_ss_bduploader_net_BDHTTPNetwork_okhttp3_OkHttpClient$Builder_build(C64601PWz c64601PWz) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-2394953478115593420"));
        return LIZJ.LIZ ? (C64600PWy) LIZJ.LIZIZ : c64601PWz.build();
    }

    @Override // com.ss.bduploader.net.BDVNetClient
    public void cancel() {
        InterfaceC48133Iun interfaceC48133Iun = this.mCall;
        if (interfaceC48133Iun != null && !interfaceC48133Iun.isCanceled()) {
            this.mCall.cancel();
        }
    }

    @Override // com.ss.bduploader.net.BDVNetClient
    public void startTask(String str, Map<String, String> map, final BDVNetClient.CompletionListener completionListener) {
        synchronized (BDHTTPNetwork.class) {
            if (mClient == null) {
                C64601PWz c64601PWz = new C64601PWz(new C64600PWy());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                c64601PWz.connectTimeout(10L, timeUnit);
                c64601PWz.writeTimeout(10L, timeUnit);
                c64601PWz.readTimeout(10L, timeUnit);
                mClient = com_ss_bduploader_net_BDHTTPNetwork_okhttp3_OkHttpClient$Builder_build(c64601PWz);
            }
        }
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                c64618PXq.LIZLLL(str2, map.get(str2));
            }
        }
        Request LIZIZ = c64618PXq.LIZIZ();
        C64600PWy c64600PWy = mClient;
        c64600PWy.getClass();
        C64587PWl LIZJ = C64587PWl.LIZJ(c64600PWy, LIZIZ, false);
        this.mCall = LIZJ;
        com_ss_bduploader_net_BDHTTPNetwork_okhttp3_Call_enqueue(LIZJ, new PX8() { // from class: com.ss.bduploader.net.BDHTTPNetwork.1
            @Override // X.PX8
            public void onFailure(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // X.PX8
            public void onResponse(InterfaceC48133Iun interfaceC48133Iun, C64598PWw c64598PWw) {
                JSONObject jSONObject;
                try {
                    PVM pvm = c64598PWw.LJLJL;
                    try {
                        try {
                            jSONObject = new JSONObject(pvm.string());
                            e = null;
                            if (!c64598PWw.LIZIZ()) {
                                e = new Exception("http fail");
                            }
                        } catch (Throwable th) {
                            if (pvm != null) {
                                try {
                                    pvm.close();
                                    throw th;
                                } catch (Exception unused) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        C16880lQ.LLLLIIL(e);
                        jSONObject = null;
                    }
                    if (pvm != null) {
                        try {
                            pvm.close();
                        } catch (Exception unused2) {
                        }
                    }
                    if (e == null) {
                        completionListener.onCompletion(jSONObject, null);
                    } else {
                        completionListener.onCompletion(jSONObject, new Error(0, null, null, e.toString()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        });
    }

    @Override // com.ss.bduploader.net.BDVNetClient
    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, final BDVNetClient.CompletionListener completionListener) {
        synchronized (BDHTTPNetwork.class) {
            if (mClient == null) {
                C64601PWz c64601PWz = new C64601PWz(new C64600PWy());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                c64601PWz.connectTimeout(10L, timeUnit);
                c64601PWz.writeTimeout(10L, timeUnit);
                c64601PWz.readTimeout(10L, timeUnit);
                mClient = com_ss_bduploader_net_BDHTTPNetwork_okhttp3_OkHttpClient$Builder_build(c64601PWz);
            }
        }
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                c64618PXq.LIZ(str2, map.get(str2));
            }
        }
        if (i == 1) {
            c64618PXq.LJ("POST", PVP.LIZJ(JSON, String.valueOf(jSONObject)));
        }
        C64600PWy c64600PWy = mClient;
        Request LIZIZ = c64618PXq.LIZIZ();
        c64600PWy.getClass();
        C64587PWl LIZJ = C64587PWl.LIZJ(c64600PWy, LIZIZ, false);
        this.mCall = LIZJ;
        com_ss_bduploader_net_BDHTTPNetwork_okhttp3_Call_enqueue(LIZJ, new PX8() { // from class: com.ss.bduploader.net.BDHTTPNetwork.2
            @Override // X.PX8
            public void onFailure(InterfaceC48133Iun interfaceC48133Iun, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            @Override // X.PX8
            public void onResponse(InterfaceC48133Iun interfaceC48133Iun, C64598PWw c64598PWw) {
                String th;
                JSONObject jSONObject2;
                try {
                    PVM pvm = c64598PWw.LJLJL;
                    try {
                        try {
                            jSONObject2 = new JSONObject(pvm.string());
                            th = null;
                        } catch (Exception e) {
                            th = e.toString();
                            C16880lQ.LLLLIIL(e);
                            jSONObject2 = null;
                        }
                        if (!c64598PWw.LIZIZ()) {
                            th = c64598PWw.LJLJJI;
                        }
                        if (pvm != null) {
                            try {
                                pvm.close();
                            } catch (Exception unused) {
                            }
                        }
                        if (th == null) {
                            completionListener.onCompletion(jSONObject2, null);
                        } else {
                            completionListener.onCompletion(jSONObject2, new Error(0, null, null, th));
                        }
                    } catch (Throwable th2) {
                        if (pvm != null) {
                            try {
                                pvm.close();
                            } catch (Exception unused2) {
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        });
    }
}
