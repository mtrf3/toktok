package com.bytedance.sync;

import X.C16880lQ;
import X.C38016Ew0;
import X.C47261Igj;
import X.C66629QCz;
import X.C67031QSl;
import X.C67032QSm;
import X.C67040QSu;
import X.C67041QSv;
import X.C67058QTm;
import X.C67060QTo;
import X.C67061QTp;
import X.C67062QTq;
import X.InterfaceC67030QSk;
import X.InterfaceC67059QTn;
import X.InterfaceC67063QTr;
import X.InterfaceC67064QTs;
import X.InterfaceC67066QTu;
import X.InterfaceC67067QTv;
import X.InterfaceC67072QUa;
import X.J8W;
import X.PNM;
import X.PV6;
import X.QD0;
import X.QPA;
import X.QPG;
import X.QTB;
import X.QU0;
import X.QU5;
import X.QU6;
import X.QU8;
import X.QUA;
import X.QUJ;
import X.QUW;
import X.X1D;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.crash.Npth;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.sync.model.Topic;
import com.bytedance.sync.v2.WsMonitor;
import com.ss.android.agilelogger.ALog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Observer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class SyncSDK {
    public static Context application;
    public static C67040QSu configuration;
    public static volatile InterfaceC67067QTv service;
    public static final AtomicBoolean sInited = new AtomicBoolean(false);
    public static final C67062QTq sCaches = new C67062QTq();
    public static final QD0 executor = new QD0();
    public static final PNM sInitObservable = new PNM();

    static {
        try {
            Npth.registerSdk("4119", "1.1.0-alpha.11");
        } catch (Throwable unused) {
        }
    }

    public static boolean hasInit() {
        if (sInited.get() && service != null) {
            return true;
        }
        return false;
    }

    public static void registerSyncBusiness() {
        C67031QSl c67031QSl = new C67031QSl(1L);
        ((ArrayList) c67031QSl.LIZIZ).add(QUW.LIZJ(application));
        ((QU6) service).LIZ(c67031QSl.LIZ());
        for (Long l : C67060QTo.LIZ) {
            InterfaceC67067QTv interfaceC67067QTv = service;
            C67031QSl c67031QSl2 = new C67031QSl(l.longValue());
            ((ArrayList) c67031QSl2.LIZIZ).add(new QTB());
            ((QU6) interfaceC67067QTv).LIZ(c67031QSl2.LIZ());
        }
    }

    public static Collection<QU8> getRegisteredBusinesses() {
        if (!hasInit()) {
            return null;
        }
        QUA qua = ((QU6) service).LIZIZ;
        qua.getClass();
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) qua.LJLILLLLZI).values());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            QU8 qu8 = (QU8) it.next();
            if (qu8 != null && qu8.LIZ.LIZ == 1) {
                it.remove();
            }
        }
        return arrayList;
    }

    public static void addInitObserver(Observer observer) {
        synchronized (SyncSDK.class) {
            if (hasInit()) {
                observer.update(sInitObservable, null);
            } else {
                sInitObservable.addObserver(observer);
            }
        }
    }

    public static void onReceiveWsEvent(WsChannelMsg wsChannelMsg) {
        C66629QCz.LIZJ("onReceiveWsEvent");
        if (wsChannelMsg == null || wsChannelMsg.service != 20032) {
            C66629QCz.LIZJ("onReceiveWsEvent not process. serviceId isn't 20032");
        } else {
            executor.LIZIZ(new ARunnableS47S0100000_11(wsChannelMsg, 29));
        }
    }

    public static InterfaceC67030QSk registerBusiness(C67032QSm c67032QSm) {
        if (c67032QSm.LIZ == 1) {
            C66629QCz.LIZIZ("inner business,not allow to register");
            return null;
        }
        if (!hasInit()) {
            C67062QTq c67062QTq = sCaches;
            c67062QTq.getClass();
            C67061QTp c67061QTp = new C67061QTp();
            c67062QTq.LIZ.LIZIZ(new ARunnableS30S0200000_11(c67032QSm, c67061QTp, 71));
            return c67061QTp;
        }
        return ((QU6) service).LIZ(c67032QSm);
    }

    public static void removeInitObserver(Observer observer) {
        try {
            sInitObservable.deleteObserver(observer);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void runAfterStart(Runnable runnable) {
        executor.LIZIZ(runnable);
    }

    public static void init(Context context, C67040QSu c67040QSu) {
        synchronized (SyncSDK.class) {
            if (hasInit()) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init ");
            LIZ.append(c67040QSu);
            LIZ.append(", sdk version = ");
            LIZ.append("1.1.0-alpha.11");
            C66629QCz.LIZ(X1D.LIZIZ(LIZ));
            application = context;
            c67040QSu.getClass();
            configuration = c67040QSu;
            service = new QU6(context, c67040QSu);
            sInited.set(true);
            PNM pnm = sInitObservable;
            pnm.LIZ();
            pnm.deleteObservers();
            C67062QTq c67062QTq = sCaches;
            if (((LinkedList) c67062QTq.LIZ.LIZ).size() > 0) {
                C38016Ew0.LIZIZ.submit(new ARunnableS47S0100000_11(c67062QTq, 135));
            }
        }
    }

    public static InterfaceC67030QSk registerBusiness(int i, InterfaceC67072QUa interfaceC67072QUa) {
        C67031QSl c67031QSl = new C67031QSl(i);
        ((ArrayList) c67031QSl.LIZIZ).add(interfaceC67072QUa);
        return registerBusiness(c67031QSl.LIZ());
    }

    public static void start(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("#start, did = ");
        LIZ.append(str);
        LIZ.append(", iid = ");
        LIZ.append(str2);
        C66629QCz.LIZJ(X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (C66629QCz.LIZ != null) {
                try {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("SyncSDKLog", "#start#ignore, did or iid is null");
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (hasInit()) {
            C66629QCz.LIZ("#start");
            Context context = application;
            C67040QSu configuration2 = configuration;
            o.LJIIJ(configuration2, "configuration");
            if (!TextUtils.isEmpty(configuration2.LJII)) {
                PV6.LIZIZ = true;
                try {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("device_id", str);
                        jSONObject.put("host_aid", configuration2.LIZ);
                        jSONObject.put("sdk_version", "1.1.0-alpha.11");
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    SDKMonitorUtils.LJ("4119", C47261Igj.LJJIJ(configuration2.LJII + "/monitor/collect/"));
                    SDKMonitorUtils.LIZLLL("4119", C47261Igj.LJJIJ(configuration2.LJII + "/monitor/appmonitor/v2/settings"));
                    if (context != null) {
                        SDKMonitorUtils.LIZJ(context, "4119", jSONObject, new C67041QSv(configuration2));
                        PV6.LIZ = SDKMonitorUtils.LIZIZ("4119");
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                    PV6.LIZIZ = false;
                }
            }
            QU6 qu6 = (QU6) service;
            synchronized (qu6) {
                InterfaceC67059QTn interfaceC67059QTn = (InterfaceC67059QTn) QPG.LIZ(InterfaceC67059QTn.class);
                interfaceC67059QTn.LJJJJ(str);
                if (qu6.LJII.compareAndSet(false, true)) {
                    interfaceC67059QTn.LJJIL();
                    WsMonitor wsMonitor = new WsMonitor();
                    wsMonitor.LJLIL = SystemClock.elapsedRealtime();
                    InterfaceC67063QTr interfaceC67063QTr = (InterfaceC67063QTr) QPG.LIZ(InterfaceC67063QTr.class);
                    if (interfaceC67063QTr.LJFF()) {
                        wsMonitor.LIZ(0L);
                    } else {
                        interfaceC67063QTr.LJJIJIIJI(new QU5(wsMonitor, interfaceC67063QTr));
                        ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(wsMonitor, 9);
                        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                            aRunnableS47S0100000_11.run();
                        } else {
                            new Handler(C16880lQ.LLJJJJ()).post(aRunnableS47S0100000_11);
                        }
                    }
                }
                QU0 qu0 = qu6.LJI;
                if (qu0 != null) {
                    if (qu0.LJLJI != null) {
                        ((InterfaceC67059QTn) QPG.LIZ(InterfaceC67059QTn.class)).LJJLIIIJJI(qu0.LJLJI);
                    }
                    qu0.LJLILLLLZI.removeCallbacksAndMessages(null);
                }
                QU0 qu02 = new QU0(qu6.LIZ);
                qu6.LJI = qu02;
                qu02.LIZIZ();
                ((InterfaceC67064QTs) QPG.LIZ(InterfaceC67064QTs.class)).LJJLI();
                ((Handler) qu6.LJIIIIZZ.LIZLLL(new Object[0])).postDelayed(new ARunnableS47S0100000_11(qu6, 136), TimeUnit.MINUTES.toMillis(2L));
            }
            executor.LIZ();
            registerSyncBusiness();
            return;
        }
        throw new IllegalStateException("please init first");
    }

    public static void subscribeTopic(Topic topic, InterfaceC67066QTu<Void> interfaceC67066QTu) {
        J8W j8w = ((QU6) service).LJFF;
        C67058QTm c67058QTm = new C67058QTm(topic, "subscribe", interfaceC67066QTu);
        j8w.getClass();
        o.LJIIJ(topic, "topic");
        QPA LIZ = QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(LIZ, "UgBusFramework.getServic…ter::class.java\n        )");
        QUJ LIZJ = ((InterfaceC67059QTn) LIZ).LIZJ();
        String str = topic.did;
        if (str == null || str.length() == 0) {
            topic.did = LIZJ.LIZ;
        }
        String str2 = topic.uid;
        if (str2 == null || str2.length() == 0) {
            topic.uid = LIZJ.LIZIZ;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("do subscribeTopic. topic = ");
        LIZ2.append(topic);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ2));
        C38016Ew0.LIZJ.submit(new ARunnableS30S0200000_11(c67058QTm, topic, 59));
    }

    public static void unsubscribeTopic(Topic topic, InterfaceC67066QTu<Void> interfaceC67066QTu) {
        J8W j8w = ((QU6) service).LJFF;
        C67058QTm c67058QTm = new C67058QTm(topic, "unsubscribe", interfaceC67066QTu);
        j8w.getClass();
        o.LJIIJ(topic, "topic");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("do unsubscribeTopic. topic = ");
        LIZ.append(topic);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        QPA LIZ2 = QPG.LIZ(InterfaceC67059QTn.class);
        o.LJFF(LIZ2, "UgBusFramework.getServic…ter::class.java\n        )");
        QUJ LIZJ = ((InterfaceC67059QTn) LIZ2).LIZJ();
        String str = topic.did;
        if (str == null || str.length() == 0) {
            topic.did = LIZJ.LIZ;
        }
        String str2 = topic.uid;
        if (str2 == null || str2.length() == 0) {
            topic.uid = LIZJ.LIZIZ;
        }
        C38016Ew0.LIZJ.submit(new ARunnableS30S0200000_11(c67058QTm, topic, 62));
    }
}
