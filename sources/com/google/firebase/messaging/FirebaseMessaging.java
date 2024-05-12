package com.google.firebase.messaging;

import X.AbstractC67638Qgc;
import X.C0BU;
import X.C16880lQ;
import X.C67187QYl;
import X.C67195QYt;
import X.C67637Qgb;
import X.C6Y7;
import X.InterfaceC67643Qgh;
import X.InterfaceC67660Qgy;
import X.InterfaceC67677QhF;
import X.QH2;
import X.QH3;
import X.QH7;
import X.QSK;
import X.QY5;
import X.QY6;
import X.QY8;
import X.QYK;
import X.QYN;
import X.QYQ;
import X.QYR;
import X.QYS;
import X.QZL;
import X.RunnableC48214Iw6;
import X.ThreadFactoryC39014FSw;
import Y.IDRunnableS6S0101000;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class FirebaseMessaging {
    public static final long LJIIL = TimeUnit.HOURS.toSeconds(8);
    public static QH2 LJIILIIL;
    public static QZL LJIILJJIL;
    public static PThreadScheduledThreadPoolExecutor LJIILL;
    public final C67195QYt LIZ;
    public final QSK LIZIZ;
    public final QYQ LIZJ;
    public final Context LIZLLL;
    public final QY8 LJ;
    public final QYN LJFF;
    public final QY6 LJI;
    public final Executor LJII;
    public final Executor LJIIIIZZ;
    public final Executor LJIIIZ;
    public final QY5 LJIIJ;
    public boolean LJIIJJI;

    public FirebaseMessaging() {
        throw null;
    }

    public static synchronized FirebaseMessaging LIZJ() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C67195QYt.LIZIZ());
        }
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LIZ() {
        AbstractC67638Qgc abstractC67638Qgc;
        QSK qsk = this.LIZIZ;
        if (qsk != null) {
            try {
                return (String) C67637Qgb.LIZ(qsk.LIZIZ());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final QH3 LJ = LJ();
        if (!LJIIIZ(LJ)) {
            return LJ.LIZ;
        }
        final String LIZJ = QY5.LIZJ(this.LIZ);
        final QYN qyn = this.LJFF;
        synchronized (qyn) {
            abstractC67638Qgc = (AbstractC67638Qgc) qyn.LIZIZ.getOrDefault(LIZJ, null);
            if (abstractC67638Qgc == null) {
                QY8 qy8 = this.LJ;
                abstractC67638Qgc = qy8.LIZ(qy8.LIZJ(QY5.LIZJ(qy8.LIZ), "*", new Bundle())).LJIILL(this.LJIIIZ, new InterfaceC67643Qgh() { // from class: X.QY4
                    @Override // X.InterfaceC67643Qgh
                    public final C67646Qgk LIZ(Object obj) {
                        String LIZJ2;
                        String jSONObject;
                        FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                        String str = LIZJ;
                        QH3 qh3 = LJ;
                        String str2 = (String) obj;
                        QH2 LIZLLL = FirebaseMessaging.LIZLLL(firebaseMessaging.LIZLLL);
                        C67195QYt c67195QYt = firebaseMessaging.LIZ;
                        c67195QYt.LIZ();
                        if ("[DEFAULT]".equals(c67195QYt.LIZIZ)) {
                            LIZJ2 = "";
                        } else {
                            LIZJ2 = firebaseMessaging.LIZ.LIZJ();
                        }
                        String LIZ = firebaseMessaging.LJIIJ.LIZ();
                        synchronized (LIZLLL) {
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("token", str2);
                                jSONObject2.put("appVersion", LIZ);
                                jSONObject2.put("timestamp", currentTimeMillis);
                                jSONObject = jSONObject2.toString();
                            } catch (JSONException unused) {
                            }
                            if (jSONObject != null) {
                                SharedPreferences.Editor edit = LIZLLL.LIZ.edit();
                                edit.putString(QH2.LIZ(LIZJ2, str), jSONObject);
                                edit.commit();
                            }
                        }
                        if (qh3 == null || !str2.equals(qh3.LIZ)) {
                            C67195QYt c67195QYt2 = firebaseMessaging.LIZ;
                            c67195QYt2.LIZ();
                            if ("[DEFAULT]".equals(c67195QYt2.LIZIZ)) {
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new C67164QXo(firebaseMessaging.LIZLLL).LIZJ(intent);
                            }
                        }
                        return C67637Qgb.LJ(str2);
                    }
                }).LJII(qyn.LIZ, new InterfaceC67660Qgy() { // from class: X.QYL
                    @Override // X.InterfaceC67660Qgy
                    public final Object LIZJ(AbstractC67638Qgc abstractC67638Qgc2) {
                        QYN qyn2 = QYN.this;
                        String str = LIZJ;
                        synchronized (qyn2) {
                            qyn2.LIZIZ.remove(str);
                        }
                        return abstractC67638Qgc2;
                    }
                });
                qyn.LIZIZ.put(LIZJ, abstractC67638Qgc);
            }
        }
        try {
            return (String) C67637Qgb.LIZ(abstractC67638Qgc);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final QH3 LJ() {
        String LIZJ;
        QH3 LIZ;
        QH2 LIZLLL = LIZLLL(this.LIZLLL);
        C67195QYt c67195QYt = this.LIZ;
        c67195QYt.LIZ();
        if ("[DEFAULT]".equals(c67195QYt.LIZIZ)) {
            LIZJ = "";
        } else {
            LIZJ = this.LIZ.LIZJ();
        }
        String LIZJ2 = QY5.LIZJ(this.LIZ);
        synchronized (LIZLLL) {
            LIZ = QH3.LIZ(LIZLLL.LIZ.getString(QH2.LIZ(LIZJ, LIZJ2), null));
        }
        return LIZ;
    }

    public final boolean LJFF() {
        boolean LJI;
        QY6 qy6 = this.LJI;
        synchronized (qy6) {
            qy6.LIZ();
            Boolean bool = qy6.LIZJ;
            if (bool != null) {
                LJI = bool.booleanValue();
            } else {
                LJI = qy6.LIZLLL.LIZ.LJI();
            }
        }
        return LJI;
    }

    public final void LJII() {
        QSK qsk = this.LIZIZ;
        if (qsk != null) {
            qsk.getToken();
        } else if (LJIIIZ(LJ())) {
            synchronized (this) {
                if (!this.LJIIJJI) {
                    LJIIIIZZ(0L);
                }
            }
        }
    }

    public static synchronized QH2 LIZLLL(Context context) {
        QH2 qh2;
        synchronized (FirebaseMessaging.class) {
            if (LJIILIIL == null) {
                LJIILIIL = new QH2(context);
            }
            qh2 = LJIILIIL;
        }
        return qh2;
    }

    public static synchronized FirebaseMessaging getInstance(C67195QYt c67195QYt) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            c67195QYt.LIZ();
            firebaseMessaging = (FirebaseMessaging) c67195QYt.LIZLLL.LIZ(FirebaseMessaging.class);
            QH7.LJIIIZ(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final synchronized void LJI(boolean z) {
        this.LJIIJJI = z;
    }

    public final synchronized void LJIIIIZZ(long j) {
        LIZIZ(j, new RunnableC48214Iw6(this, Math.min(Math.max(30L, 2 * j), LJIIL)));
        this.LJIIJJI = true;
    }

    public final boolean LJIIIZ(QH3 qh3) {
        if (qh3 == null) {
            return true;
        }
        String LIZ = this.LJIIJ.LIZ();
        if (System.currentTimeMillis() > qh3.LIZJ + QH3.LIZLLL || !LIZ.equals(qh3.LIZIZ)) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(long j, RunnableC48214Iw6 runnableC48214Iw6) {
        synchronized (FirebaseMessaging.class) {
            if (LJIILL == null) {
                LJIILL = new PThreadScheduledThreadPoolExecutor(1, new ThreadFactoryC39014FSw("TAG"));
            }
            LJIILL.schedule(runnableC48214Iw6, j, TimeUnit.SECONDS);
        }
    }

    public FirebaseMessaging(C67195QYt c67195QYt, QSK qsk, C6Y7<QYS> c6y7, C6Y7<QYR> c6y72, QYQ qyq, QZL qzl, QYK qyk) {
        c67195QYt.LIZ();
        final QY5 qy5 = new QY5(c67195QYt.LIZ);
        final QY8 qy8 = new QY8(c67195QYt, qy5, c6y7, c6y72, qyq);
        ExecutorService LLLLZLLLI = C16880lQ.LLLLZLLLI(new ThreadFactoryC39014FSw("Firebase-Messaging-Task"));
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = new PThreadScheduledThreadPoolExecutor(1, new ThreadFactoryC39014FSw("Firebase-Messaging-Init"));
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC39014FSw("Firebase-Messaging-File-Io"));
        LJIILJJIL = qzl;
        this.LIZ = c67195QYt;
        this.LIZIZ = qsk;
        this.LIZJ = qyq;
        this.LJI = new QY6(this, qyk);
        c67195QYt.LIZ();
        final Context context = c67195QYt.LIZ;
        this.LIZLLL = context;
        C67187QYl c67187QYl = new C67187QYl();
        this.LJIIJ = qy5;
        this.LJIIIIZZ = LLLLZLLLI;
        this.LJ = qy8;
        this.LJFF = new QYN(LLLLZLLLI);
        this.LJII = pThreadScheduledThreadPoolExecutor;
        this.LJIIIZ = pThreadPoolExecutor;
        c67195QYt.LIZ();
        Context context2 = c67195QYt.LIZ;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(c67187QYl);
        }
        if (qsk != null) {
            qsk.LIZ();
        }
        pThreadScheduledThreadPoolExecutor.execute(new IDRunnableS6S0101000(2, this, 11));
        final PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor2 = new PThreadScheduledThreadPoolExecutor(1, new ThreadFactoryC39014FSw("Firebase-Messaging-Topics-Io"));
        C67637Qgb.LIZJ(new Callable() { // from class: X.Iuf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C48124Iue c48124Iue;
                Context context3 = context;
                ScheduledExecutorService scheduledExecutorService = pThreadScheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                QY5 qy52 = qy5;
                QY8 qy82 = qy8;
                synchronized (C48124Iue.class) {
                    WeakReference<C48124Iue> weakReference = C48124Iue.LIZLLL;
                    if (weakReference == null || (c48124Iue = weakReference.get()) == null) {
                        c48124Iue = new C48124Iue(F9J.LIZIZ(context3, 0, "com.google.android.gms.appid"), scheduledExecutorService);
                        c48124Iue.LIZIZ();
                        C48124Iue.LIZLLL = new WeakReference<>(c48124Iue);
                    }
                }
                return new C48127Iuh(firebaseMessaging, qy52, c48124Iue, qy82, context3, scheduledExecutorService);
            }
        }, pThreadScheduledThreadPoolExecutor2).LJFF(pThreadScheduledThreadPoolExecutor, new InterfaceC67677QhF() { // from class: X.Iug
            @Override // X.InterfaceC67677QhF
            public final void onSuccess(Object obj) {
                boolean z;
                C48127Iuh c48127Iuh = (C48127Iuh) obj;
                if (FirebaseMessaging.this.LJFF() && c48127Iuh.LJII.LIZ() != null) {
                    synchronized (c48127Iuh) {
                        z = c48127Iuh.LJI;
                    }
                    if (!z) {
                        c48127Iuh.LJI(0L);
                    }
                }
            }
        });
        pThreadScheduledThreadPoolExecutor.execute(new C0BU(6, this));
    }
}
