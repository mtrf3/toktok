package X;

import Y.ARunnableS8S0201000_5;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.Collections;
import java.util.WeakHashMap;

/* renamed from: X.QYl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67187QYl implements Application.ActivityLifecycleCallbacks {
    public final java.util.Set<Intent> LJLIL = Collections.newSetFromMap(new WeakHashMap());

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Intent r5) {
        /*
            android.os.Bundle r1 = X.C16880lQ.LLJJIJI(r5)     // Catch: java.lang.RuntimeException -> Ld
            if (r1 == 0) goto Ld
            java.lang.String r0 = "gcm.n.analytics_data"
            android.os.Bundle r5 = r1.getBundle(r0)     // Catch: java.lang.RuntimeException -> Ld
            goto Le
        Ld:
            r5 = 0
        Le:
            java.lang.String r1 = "1"
            if (r5 != 0) goto L13
        L12:
            return
        L13:
            java.lang.String r0 = "google.c.a.e"
            java.lang.String r0 = r5.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            if (r5 != 0) goto L27
        L21:
            java.lang.String r0 = "_no"
            X.QZF.LIZ(r5, r0)
            goto L12
        L27:
            java.lang.String r0 = "google.c.a.tc"
            java.lang.String r0 = r5.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L21
            X.QYt r0 = X.C67195QYt.LIZIZ()
            java.lang.Class<X.QYm> r1 = X.InterfaceC67188QYm.class
            r0.LIZ()
            X.QYy r0 = r0.LIZLLL
            java.lang.Object r4 = r0.LIZ(r1)
            X.QYm r4 = (X.InterfaceC67188QYm) r4
            if (r4 == 0) goto L21
            java.lang.String r0 = "google.c.a.c_id"
            java.lang.String r3 = r5.getString(r0)
            r4.LIZ(r3)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = "source"
            java.lang.String r0 = "Firebase"
            r2.putString(r1, r0)
            java.lang.String r1 = "medium"
            java.lang.String r0 = "notification"
            r2.putString(r1, r0)
            java.lang.String r0 = "campaign"
            r2.putString(r0, r3)
            java.lang.String r0 = "_cmp"
            r4.LIZIZ(r0, r2)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67187QYl.LIZ(android.content.Intent):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.LJLIL.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null || !this.LJLIL.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS8S0201000_5(2, this, intent, 4));
        } else {
            LIZ(intent);
        }
    }
}
