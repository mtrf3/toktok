package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.FCk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38586FCk {
    public static boolean LIZIZ() {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAppHot();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[Catch: UnsupportedEncodingException -> 0x00b1, TryCatch #2 {UnsupportedEncodingException -> 0x00b1, blocks: (B:6:0x000b, B:8:0x0023, B:13:0x0053, B:15:0x0059, B:16:0x005b, B:25:0x007e, B:27:0x0084, B:20:0x0086, B:32:0x0077, B:38:0x004c, B:43:0x008c, B:45:0x0096, B:46:0x0098, B:48:0x009e), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[Catch: UnsupportedEncodingException -> 0x00b1, TryCatch #2 {UnsupportedEncodingException -> 0x00b1, blocks: (B:6:0x000b, B:8:0x0023, B:13:0x0053, B:15:0x0059, B:16:0x005b, B:25:0x007e, B:27:0x0084, B:20:0x0086, B:32:0x0077, B:38:0x004c, B:43:0x008c, B:45:0x0096, B:46:0x0098, B:48:0x009e), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap LIZ(java.lang.String r13) {
        /*
            java.lang.String r10 = "UTF-8"
            java.lang.String r12 = ""
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r13 == 0) goto Lb8
            java.lang.String r0 = "&"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.io.UnsupportedEncodingException -> Lb1
            r9 = 6
            r8 = 0
            java.util.List r1 = ujb.s.LJLJJL(r13, r0, r8, r9)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.lang.Object[] r11 = r1.toArray(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch: java.io.UnsupportedEncodingException -> Lb1
            int r7 = r11.length     // Catch: java.io.UnsupportedEncodingException -> Lb1
            r6 = 0
        L21:
            if (r6 >= r7) goto L8c
            r1 = r11[r6]     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.lang.String r0 = "="
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.util.List r1 = ujb.s.LJLJJL(r1, r0, r8, r9)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.io.UnsupportedEncodingException -> Lb1
            r0 = r5[r8]     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = java.net.URLDecoder.decode(r0, r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = "decode(pair[0], \"UTF-8\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)     // Catch: java.lang.Throwable -> L4a
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L48
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L48
            goto L53
        L48:
            r0 = move-exception
            goto L4c
        L4a:
            r0 = move-exception
            r4 = r12
        L4c:
            X.3C4 r0 = X.C141335gf.LIZ(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            X.C3C5.m7constructorimpl(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
        L53:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            if (r0 == 0) goto L5b
            r4 = r5[r8]     // Catch: java.io.UnsupportedEncodingException -> Lb1
        L5b:
            int r0 = r5.length     // Catch: java.io.UnsupportedEncodingException -> Lb1
            r2 = 1
            if (r0 <= r2) goto L75
            r0 = r5[r2]     // Catch: java.lang.Throwable -> L72
            java.lang.String r1 = java.net.URLDecoder.decode(r0, r10)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = "decode(pair[1], \"UTF-8\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L72
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L70
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L70
            goto L7e
        L70:
            r0 = move-exception
            goto L77
        L72:
            r0 = move-exception
            r1 = r12
            goto L77
        L75:
            r1 = r12
            goto L86
        L77:
            X.3C4 r0 = X.C141335gf.LIZ(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            X.C3C5.m7constructorimpl(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
        L7e:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            if (r0 == 0) goto L86
            r1 = r5[r2]     // Catch: java.io.UnsupportedEncodingException -> Lb1
        L86:
            r3.put(r4, r1)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            int r6 = r6 + 1
            goto L21
        L8c:
            java.lang.String r0 = "params_url"
            java.lang.Object r1 = r3.get(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lb1
            if (r0 == 0) goto Lae
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.UnsupportedEncodingException -> Lb1
        L98:
            boolean r0 = X.C78685UuP.LJJJZ(r1)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            if (r0 == 0) goto Lb0
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.lang.String r0 = r0.getQuery()     // Catch: java.io.UnsupportedEncodingException -> Lb1
            java.util.HashMap r0 = LIZ(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            r3.putAll(r0)     // Catch: java.io.UnsupportedEncodingException -> Lb1
            goto Lb0
        Lae:
            r1 = 0
            goto L98
        Lb0:
            return r3
        Lb1:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        Lb8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38586FCk.LIZ(java.lang.String):java.util.HashMap");
    }

    public static boolean LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null && queryParameterNames.contains("_t")) {
            return !TextUtils.isEmpty(UriProtector.getQueryParameter(uri, "_t"));
        }
        return false;
    }

    public static void LIZLLL(android.net.Uri uri, final String clazz) {
        final String queryParameter;
        AwemeHostApplication LIZ;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(clazz, "clazz");
        if (TextUtils.equals(UriProtector.getQueryParameter(uri, "gd_label"), "retarget") && (queryParameter = UriProtector.getQueryParameter(uri, "toast")) != null && (LIZ = FKM.LIZ()) != null) {
            LIZ.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(clazz, queryParameter) { // from class: X.35A
                public int LJLIL;
                public final String LJLILLLLZI;
                public final String LJLJI;

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

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    o.LJIIIZ(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    o.LJIIIZ(activity, "activity");
                }

                {
                    o.LJIIIZ(clazz, "className");
                    this.LJLILLLLZI = clazz;
                    this.LJLJI = queryParameter;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    AwemeHostApplication LIZ2;
                    o.LJIIIZ(activity, "activity");
                    if (TextUtils.equals(activity.getClass().getName(), this.LJLILLLLZI)) {
                        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                        c5s1.LIZLLL(this.LJLJI);
                        c5s1.LJ();
                        AwemeHostApplication LIZ3 = FKM.LIZ();
                        if (LIZ3 != null) {
                            LIZ3.unregisterActivityLifecycleCallbacks(this);
                            return;
                        }
                        return;
                    }
                    int i = this.LJLIL + 1;
                    this.LJLIL = i;
                    if (i <= 5 || (LIZ2 = FKM.LIZ()) == null) {
                        return;
                    }
                    LIZ2.unregisterActivityLifecycleCallbacks(this);
                }
            });
        }
    }
}
