package X;

import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Qnp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68085Qnp implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C68082Qnm LJLIL;

    public /* synthetic */ C68085Qnp(C68082Qnm c68082Qnm) {
        this.LJLIL = c68082Qnm;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C68084Qno LJIJI = this.LJLIL.LIZ.LJIJI();
        synchronized (LJIJI.LJIIJJI) {
            if (activity == LJIJI.LJI) {
                LJIJI.LJI = null;
            }
        }
        if (!LJIJI.LIZ.LJI.LJIILL()) {
            return;
        }
        ((ConcurrentHashMap) LJIJI.LJFF).remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C68084Qno LJIJI = this.LJLIL.LIZ.LJIJI();
        synchronized (LJIJI.LJIIJJI) {
            LJIJI.LJIIJ = false;
            LJIJI.LJII = true;
        }
        LJIJI.LIZ.LJIILIIL.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!LJIJI.LIZ.LJI.LJIILL()) {
            LJIJI.LIZJ = null;
            LJIJI.LIZ.LIZIZ().LJIILIIL(new RunnableC68122QoQ(LJIJI, elapsedRealtime));
        } else {
            C68132Qoa LJIILLIIL = LJIJI.LJIILLIIL(activity);
            LJIJI.LIZLLL = LJIJI.LIZJ;
            LJIJI.LIZJ = null;
            LJIJI.LIZ.LIZIZ().LJIILIIL(new RunnableC68114QoI(LJIJI, LJIILLIIL, elapsedRealtime));
        }
        C68110QoE LJIJJLI = this.LJLIL.LIZ.LJIJJLI();
        LJIJJLI.LIZ.LJIILIIL.getClass();
        LJIJJLI.LIZ.LIZIZ().LJIILIIL(new RunnableC68092Qnw(LJIJJLI, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C68110QoE LJIJJLI = this.LJLIL.LIZ.LJIJJLI();
        LJIJJLI.LIZ.LJIILIIL.getClass();
        LJIJJLI.LIZ.LIZIZ().LJIILIIL(new RunnableC68091Qnv(LJIJJLI, SystemClock.elapsedRealtime()));
        C68084Qno LJIJI = this.LJLIL.LIZ.LJIJI();
        synchronized (LJIJI.LJIIJJI) {
            LJIJI.LJIIJ = true;
            if (activity != LJIJI.LJI) {
                synchronized (LJIJI.LJIIJJI) {
                    LJIJI.LJI = activity;
                    LJIJI.LJII = false;
                }
                if (LJIJI.LIZ.LJI.LJIILL()) {
                    LJIJI.LJIIIIZZ = null;
                    LJIJI.LIZ.LIZIZ().LJIILIIL(new IDRunnableS6S0101000(1, LJIJI, 22));
                }
            }
        }
        if (!LJIJI.LIZ.LJI.LJIILL()) {
            LJIJI.LIZJ = LJIJI.LJIIIIZZ;
            LJIJI.LIZ.LIZIZ().LJIILIIL(new RunnableC68127QoV(LJIJI));
            return;
        }
        LJIJI.LJIIIZ(activity, LJIJI.LJIILLIIL(activity), false);
        C68089Qnt LJIIL = LJIJI.LIZ.LJIIL();
        LJIIL.LIZ.LJIILIIL.getClass();
        LJIIL.LIZ.LIZIZ().LJIILIIL(new RunnableC68134Qoc(LJIIL, SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r3 = r8
            X.Qnm r0 = r3.LJLIL     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            X.Qmz r0 = r0.LIZ     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            X.Qaq r0 = r0.LIZJ()     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            X.Qar r1 = r0.LJIILIIL     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            java.lang.String r0 = "onActivityCreated"
            r1.LIZ(r0)     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            android.content.Intent r1 = r9.getIntent()     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            if (r1 != 0) goto L17
            goto L8a
        L17:
            android.net.Uri r5 = r1.getData()     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            if (r5 == 0) goto L70
            boolean r0 = r5.isHierarchical()     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            if (r0 != 0) goto L24
            goto L70
        L24:
            X.Qnm r0 = r3.LJLIL     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            X.Qmz r0 = r0.LIZ     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            r0.LJIL()     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r1, r0)     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            java.lang.String r0 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            r4 = 1
            if (r0 != 0) goto L4e
            java.lang.String r0 = "https://www.google.com"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            if (r0 != 0) goto L4e
            java.lang.String r0 = "android-app://com.google.appcrawler"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            if (r0 == 0) goto L4b
            goto L4e
        L4b:
            java.lang.String r6 = "auto"
            goto L50
        L4e:
            java.lang.String r6 = "gs"
        L50:
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            if (r10 != 0) goto L69
        L58:
            X.Qnm r0 = r3.LJLIL     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            X.Qmz r0 = r0.LIZ     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            X.Qau r0 = r0.LIZIZ()     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            X.Qnr r2 = new X.Qnr     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            r0.LJIILIIL(r2)     // Catch: java.lang.RuntimeException -> L75 java.lang.Throwable -> L96
            goto L6b
        L69:
            r4 = 0
            goto L58
        L6b:
            X.Qnm r0 = r3.LJLIL
            X.Qmz r0 = r0.LIZ
            goto L8e
        L70:
            X.Qnm r0 = r3.LJLIL
            X.Qmz r0 = r0.LIZ
            goto L8e
        L75:
            r2 = move-exception
            X.Qnm r0 = r3.LJLIL     // Catch: java.lang.Throwable -> L96
            X.Qmz r0 = r0.LIZ     // Catch: java.lang.Throwable -> L96
            X.Qaq r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L96
            X.Qar r1 = r0.LJFF     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = "Throwable caught in onActivityCreated"
            r1.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> L96
            X.Qnm r0 = r3.LJLIL
            X.Qmz r0 = r0.LIZ
            goto L8e
        L8a:
            X.Qnm r0 = r3.LJLIL
            X.Qmz r0 = r0.LIZ
        L8e:
            X.Qno r0 = r0.LJIJI()
            r0.LJIILJJIL(r9, r10)
            return
        L96:
            r1 = move-exception
            X.Qnm r0 = r3.LJLIL
            X.Qmz r0 = r0.LIZ
            X.Qno r0 = r0.LJIJI()
            r0.LJIILJJIL(r9, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68085Qnp.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C68132Qoa c68132Qoa;
        C68084Qno LJIJI = this.LJLIL.LIZ.LJIJI();
        if (!LJIJI.LIZ.LJI.LJIILL() || bundle == null || (c68132Qoa = (C68132Qoa) ((ConcurrentHashMap) LJIJI.LJFF).get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c68132Qoa.LIZJ);
        bundle2.putString("name", c68132Qoa.LIZ);
        bundle2.putString("referrer_name", c68132Qoa.LIZIZ);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }
}
