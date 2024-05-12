package com.facebook;

import X.C10760bY;
import X.C16880lQ;
import X.C65803Ps7;
import X.C66373Q3d;
import X.Q5A;
import Y.IDBReceiverS6S0100000_6;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CustomTabMainActivity extends Activity {
    public static final String LJLJI = o.LJIILLIIL(".extra_action", C16880lQ.LJLLJ(CustomTabMainActivity.class));
    public static final String LJLJJI = o.LJIILLIIL(".extra_params", C16880lQ.LJLLJ(CustomTabMainActivity.class));
    public static final String LJLJJL = o.LJIILLIIL(".extra_chromePackage", C16880lQ.LJLLJ(CustomTabMainActivity.class));
    public static final String LJLJJLL = o.LJIILLIIL(".extra_url", C16880lQ.LJLLJ(CustomTabMainActivity.class));
    public static final String LJLJL = o.LJIILLIIL(".extra_targetApp", C16880lQ.LJLLJ(CustomTabMainActivity.class));
    public static final String LJLJLJ = o.LJIILLIIL(".action_refresh", C16880lQ.LJLLJ(CustomTabMainActivity.class));
    public static final String LJLJLLL = o.LJIILLIIL(".no_activity_exception", C16880lQ.LJLLJ(CustomTabMainActivity.class));
    public boolean LJLIL = true;
    public IDBReceiverS6S0100000_6 LJLILLLLZI;

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
        if (this.LJLIL) {
            LIZ(0, null);
        }
        this.LJLIL = true;
    }

    @Override // android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            X.C65803Ps7.LIZ(r10, r11)
            super.onCreate(r11)
            java.lang.String r1 = com.facebook.CustomTabActivity.LJLILLLLZI
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r0 = r0.getAction()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r4 = 0
            if (r0 == 0) goto L1e
            r10.setResult(r4)
            r10.finish()
            return
        L1e:
            if (r11 != 0) goto Ld3
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = com.facebook.CustomTabMainActivity.LJLJI
            java.lang.String r8 = X.C16880lQ.LLJJIJIIJIL(r1, r0)
            if (r8 != 0) goto L2d
            return
        L2d:
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = com.facebook.CustomTabMainActivity.LJLJJI
            android.os.Bundle r7 = X.C16880lQ.LJJLIIIIJ(r1, r0)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = com.facebook.CustomTabMainActivity.LJLJJL
            java.lang.String r6 = X.C16880lQ.LLJJIJIIJIL(r1, r0)
            X.Q5y r2 = X.Q5I.Companion
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = com.facebook.CustomTabMainActivity.LJLJL
            java.lang.String r9 = X.C16880lQ.LLJJIJIIJIL(r1, r0)
            r2.getClass()
            X.Q5I[] r5 = X.Q5I.valuesCustom()
            int r3 = r5.length
            r1 = 0
        L56:
            if (r1 >= r3) goto Lba
            r2 = r5[r1]
            int r1 = r1 + 1
            java.lang.String r0 = r2.toString()
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r9)
            if (r0 == 0) goto L56
        L66:
            int[] r1 = X.C66425Q5d.LIZ
            int r0 = r2.ordinal()
            r0 = r1[r0]
            r5 = 1
            if (r0 != r5) goto Lb4
            X.Q4b r3 = new X.Q4b
            r3.<init>(r8, r7)
        L76:
            boolean r0 = X.C40700FyC.LIZ(r3)
            if (r0 == 0) goto L92
        L7c:
            r0 = 0
        L7d:
            r10.LJLIL = r4
            if (r0 != 0) goto Lbd
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = com.facebook.CustomTabMainActivity.LJLJLLL
            android.content.Intent r0 = r1.putExtra(r0, r5)
            r10.setResult(r4, r0)
            r10.finish()
            return
        L92:
            java.util.concurrent.locks.ReentrantLock r2 = X.Q5N.LJLJI     // Catch: java.lang.Throwable -> L7c
            r2.lock()     // Catch: java.lang.Throwable -> L7c
            X.008 r1 = X.Q5N.LJLILLLLZI     // Catch: java.lang.Throwable -> L7c
            r0 = 0
            X.Q5N.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L7c
            r2.unlock()     // Catch: java.lang.Throwable -> L7c
            X.004 r0 = new X.004     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7c
            X.005 r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L7c
            android.content.Intent r0 = r1.LIZ     // Catch: java.lang.Throwable -> L7c
            r0.setPackage(r6)     // Catch: java.lang.Throwable -> L7c
            android.net.Uri r0 = r3.LIZ
            r1.LIZ(r10, r0)
            r0 = 1
            goto L7d
        Lb4:
            X.Q4c r3 = new X.Q4c
            r3.<init>(r8, r7)
            goto L76
        Lba:
            X.Q5I r2 = X.Q5I.FACEBOOK
            goto L66
        Lbd:
            Y.IDBReceiverS6S0100000_6 r3 = new Y.IDBReceiverS6S0100000_6
            r0 = 4
            r3.<init>(r10, r0)
            r10.LJLILLLLZI = r3
            X.0bY r2 = X.C10760bY.LIZ(r10)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r0 = com.facebook.CustomTabActivity.LJLILLLLZI
            r1.<init>(r0)
            r2.LIZIZ(r3, r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.CustomTabMainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        o.LJIIIZ(intent, "intent");
        super.onNewIntent(intent);
        if (o.LJ(LJLJLJ, intent.getAction())) {
            C10760bY.LIZ(this).LIZJ(new Intent(CustomTabActivity.LJLJI));
            LIZ(-1, intent);
        } else {
            if (!o.LJ(CustomTabActivity.LJLILLLLZI, intent.getAction())) {
                return;
            }
            LIZ(-1, intent);
        }
    }

    public final void LIZ(int i, Intent intent) {
        Bundle bundle;
        IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6 = this.LJLILLLLZI;
        if (iDBReceiverS6S0100000_6 != null) {
            C10760bY.LIZ(this).LIZLLL(iDBReceiverS6S0100000_6);
        }
        if (intent != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, LJLJJLL);
            if (LLJJIJIIJIL != null) {
                Uri parse = Uri.parse(LLJJIJIIJIL);
                bundle = C66373Q3d.LJJI(parse.getQuery());
                bundle.putAll(C66373Q3d.LJJI(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intent2 = getIntent();
            o.LJIIIIZZ(intent2, "intent");
            Intent LJI = Q5A.LJI(intent2, bundle, null);
            if (LJI != null) {
                intent = LJI;
            }
            setResult(i, intent);
        } else {
            Intent intent3 = getIntent();
            o.LJIIIIZZ(intent3, "intent");
            setResult(i, Q5A.LJI(intent3, null, null));
        }
        finish();
    }
}
