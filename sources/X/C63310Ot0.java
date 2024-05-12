package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.Ot0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63310Ot0 implements Application.ActivityLifecycleCallbacks {
    public static InterfaceC63341OtV LJLILLLLZI;
    public static int LJLJI;
    public static boolean LJLJJI;
    public static Context LJLJJL;
    public static long LJLJJLL;
    public static final C63310Ot0 LJLIL = new C63310Ot0();
    public static boolean LJLJL = true;

    public static void LJ() {
        LJLJJI = true;
        C63322OtC.LJI("ImSDKMonitorHelper", "switchToBackground", null);
        if (C63314Ot4.LJII()) {
            if (C63308Osy.LJI().LIZLLL().LJLJJL) {
                C63315Ot5.LIZ.getClass();
                C63315Ot5.LIZ();
            } else {
                C63319Ot9.LIZ();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    public final void LIZLLL() {
        Application application;
        C63322OtC.LJI("ImSDKMonitorHelper", "Start monitor", null);
        Context context = LJLJJL;
        if (context == null) {
            if (C63308Osy.LJI().LJIILJJIL != null) {
                context = C16880lQ.LLLLL(EF7.LIZIZ());
            } else {
                context = null;
            }
        }
        if ((context instanceof Application) && (application = (Application) context) != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
        if (C63314Ot4.LIZLLL() > 0) {
            C63333OtN.LIZ.postDelayed(C63333OtN.LIZIZ, C63314Ot4.LIZLLL() * 1000);
        }
    }

    public static void LJFF() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchToForeground isWsConnected ");
        LIZ.append(C63308Osy.LJI().LIZIZ().isWsConnected());
        C63322OtC.LJI("ImSDKMonitorHelper", X1D.LIZIZ(LIZ), null);
        C63308Osy.LJI().LIZLLL().getClass();
        if ("1".equals(C63314Ot4.LIZJ("is_switch_to_foreground_pull_msg")) && C63308Osy.LJI().LJ && LJLJJI && SystemClock.uptimeMillis() - LJLJJLL > 5000) {
            if (C63308Osy.LJI().LIZLLL().LJJLIIIIJ) {
                RunnableC63345OtZ.LJ(new InterfaceC63352Otg() { // from class: X.4ZY
                    @Override // X.InterfaceC63352Otg
                    public final Object LIZIZ() {
                        C63308Osy.LJI().LJIILIIL(10, null);
                        return C76800UCe.LIZ;
                    }
                }, null, false);
            } else {
                C63308Osy.LJI().LJIILIIL(10, null);
            }
            LJLJJLL = SystemClock.uptimeMillis();
        }
        LJLJJI = false;
        if (C63314Ot4.LJII() && !C63308Osy.LJI().LIZIZ().isWsConnected()) {
            if (C63308Osy.LJI().LIZLLL().LJLJJL) {
                C63315Ot5.LIZ.getClass();
                C63315Ot5.LJFF();
            } else {
                C63319Ot9.LIZLLL();
            }
            C63308Osy.LJI().LIZIZ().LJJI(EnumC114894f7.TRIGGER_MSG_POLLING);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
        int i = LJLJI + 1;
        LJLJI = i;
        if (i == 1) {
            LJFF();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        int i = LJLJI;
        if (i > 0) {
            int i2 = i - 1;
            LJLJI = i2;
            if (i2 == 0) {
                LJ();
            }
        }
    }

    public static void LIZ(String tag, String msg, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        InterfaceC63341OtV interfaceC63341OtV = LJLILLLLZI;
        if (interfaceC63341OtV != null) {
            interfaceC63341OtV.LIZ(tag, msg, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if (r7 < r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(org.json.JSONObject r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.String r3 = "imsdk"
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            if (r11 != 0) goto L55
            double r7 = java.lang.Math.random()
            java.lang.String r0 = "app_log_rate"
            java.lang.String r1 = X.C63314Ot4.LIZJ(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L29
            X.Osy r0 = X.C63308Osy.LJI()     // Catch: java.lang.Exception -> L41
            X.4eO r0 = r0.LIZLLL()     // Catch: java.lang.Exception -> L41
            double r1 = r0.LJJJLL     // Catch: java.lang.Exception -> L41
            goto L51
        L29:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L41
            r6.<init>(r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = "default_rate"
            r4 = 0
            double r1 = r6.optDouble(r0, r4)     // Catch: java.lang.Exception -> L41
            boolean r0 = r6.has(r10)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L51
            double r1 = r6.optDouble(r10, r4)     // Catch: java.lang.Exception -> L41
            goto L51
        L41:
            r1 = move-exception
            java.lang.String r0 = "getEvenSample err "
            X.C63322OtC.LJ(r0, r1)
            X.Osy r0 = X.C63308Osy.LJI()
            X.4eO r0 = r0.LIZLLL()
            double r1 = r0.LJJJLL
        L51:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5c
        L55:
            X.OtV r0 = X.C63310Ot0.LJLILLLLZI
            if (r0 == 0) goto L5c
            r0.LIZIZ(r10, r9)
        L5c:
            X.Osy r0 = X.C63308Osy.LJI()
            X.4eO r0 = r0.LIZLLL()
            boolean r0 = r0.LJJJLIIL
            if (r0 != 0) goto L77
            java.lang.String r0 = "applog_2_alog"
            java.lang.String r1 = X.C63314Ot4.LIZJ(r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L99
        L77:
            r2 = 0
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.util.ConcurrentModificationException -> L94
            java.lang.String r0 = "monitorTeaEvent() called with: event = "
            r1.append(r0)     // Catch: java.util.ConcurrentModificationException -> L94
            r1.append(r10)     // Catch: java.util.ConcurrentModificationException -> L94
            java.lang.String r0 = ", data = "
            r1.append(r0)     // Catch: java.util.ConcurrentModificationException -> L94
            r1.append(r9)     // Catch: java.util.ConcurrentModificationException -> L94
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.util.ConcurrentModificationException -> L94
            LIZ(r3, r0, r2)     // Catch: java.util.ConcurrentModificationException -> L94
            goto L99
        L94:
            java.lang.String r0 = "monitorTeaEvent() ConcurrentModificationException with JSONObject.toString()"
            LIZ(r3, r0, r2)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63310Ot0.LIZJ(org.json.JSONObject, java.lang.String, boolean):void");
    }
}
