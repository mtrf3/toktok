package X;

import Y.IDRunnableS85S0100000;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: X.00g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C005000g extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks {
    public final InterfaceC005100h LJLJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public final boolean LJLIL = true;
    public final Class[] LJLILLLLZI = null;
    public final Handler LJLJJI = new Handler();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void LIZ(Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && "homekey".equals(C16880lQ.LLJJIJIIJIL(intent, "reason"))) {
            ((C278117h) this.LJLJI).LIZ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.LJLJJLL--;
        this.LJLJJI.postDelayed(new IDRunnableS85S0100000(this, 0), 300L);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResumed(android.app.Activity r7) {
        /*
            r6 = this;
            int r0 = r6.LJLJJLL
            r5 = 1
            int r0 = r0 + 1
            r6.LJLJJLL = r0
            java.lang.Class[] r4 = r6.LJLILLLLZI
            r3 = 0
            if (r4 != 0) goto L18
        Lc:
            X.00h r0 = r6.LJLJI
            r0.getClass()
        L11:
            boolean r0 = r6.LJLJL
            if (r0 == 0) goto L17
            r6.LJLJL = r3
        L17:
            return
        L18:
            int r2 = r4.length
            r1 = 0
        L1a:
            if (r1 >= r2) goto L2c
            r0 = r4[r1]
            boolean r0 = r0.isInstance(r7)
            if (r0 == 0) goto L29
            boolean r5 = r6.LJLIL
        L26:
            if (r5 == 0) goto L30
            goto Lc
        L29:
            int r1 = r1 + 1
            goto L1a
        L2c:
            boolean r0 = r6.LJLIL
            r5 = r5 ^ r0
            goto L26
        L30:
            X.00h r0 = r6.LJLJI
            r0.getClass()
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005000g.onActivityResumed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.LJLJJL++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.LJLJJL - 1;
        this.LJLJJL = i;
        if (i == 0) {
            ((C278117h) this.LJLJI).LIZ();
        }
    }

    public C005000g(Context context, C278117h c278117h) {
        this.LJLJI = c278117h;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        if (Build.VERSION.SDK_INT <= 30) {
            C16880lQ.LJJLIIIJILLIZJL(this, context, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
