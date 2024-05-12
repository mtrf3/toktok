package X;

import J.N;
import Y.ARunnableS44S0100000_8;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ttnet.org.chromium.base.PowerMonitor;

/* renamed from: X.IvV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48177IvV implements Application.ActivityLifecycleCallbacks {
    public static boolean LJLJJI;
    public static final HandlerC46523INr LJLJJL;
    public int LJLIL;
    public PowerMonitor LJLILLLLZI;
    public final ARunnableS44S0100000_8 LJLJI = new ARunnableS44S0100000_8(this, 71);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    static {
        C16880lQ.LJLLJ(C48177IvV.class);
        LJLJJL = new HandlerC46523INr(C16880lQ.LLJJJJ(), new C46525INt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r0 = r1.getDeclaredField("activity");
        r0.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (((android.app.Activity) r0.get(r2)) == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        X.C48177IvV.LJLJJI = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C48177IvV() {
        /*
            r11 = this;
            java.lang.String r5 = "activity"
            java.lang.String r6 = "mActivities"
            java.lang.String r9 = "currentActivityThread"
            java.lang.String r10 = "android.app.ActivityThread"
            r11.<init>()
            Y.ARunnableS44S0100000_8 r1 = new Y.ARunnableS44S0100000_8
            r0 = 71
            r1.<init>(r11, r0)
            r11.LJLJI = r1
            r7 = 0
            r4 = 1
            r8 = 0
            java.lang.Class r2 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L6d
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L6d
            java.lang.reflect.Method r1 = r2.getMethod(r9, r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r1.invoke(r7, r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.reflect.Field r0 = r2.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L6d
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6d
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L37
            goto L6d
        L37:
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
        L3f:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6d
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "paused"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L6d
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L6d
            boolean r0 = r0.getBoolean(r2)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L3f
            java.lang.reflect.Field r0 = r1.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L6d
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L6d
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6d
            X.C48177IvV.LJLJJI = r4
        L6d:
            r11.LJLIL = r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Class r2 = java.lang.Class.forName(r10)     // Catch: java.lang.Exception -> Lc4
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> Lc4
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r9, r0)     // Catch: java.lang.Exception -> Lc4
            r1.setAccessible(r4)     // Catch: java.lang.Exception -> Lc4
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> Lc4
            java.lang.Object r1 = r1.invoke(r7, r0)     // Catch: java.lang.Exception -> Lc4
            java.lang.reflect.Field r0 = r2.getDeclaredField(r6)     // Catch: java.lang.Exception -> Lc4
            r0.setAccessible(r4)     // Catch: java.lang.Exception -> Lc4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lc4
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> Lc4
            if (r0 != 0) goto L97
            goto Lcf
        L97:
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> Lc4
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> Lc4
        L9f:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> Lc4
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> Lc4
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> Lc4
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Exception -> Lc4
            java.lang.reflect.Field r0 = r0.getDeclaredField(r5)     // Catch: java.lang.Exception -> Lc4
            r0.setAccessible(r4)     // Catch: java.lang.Exception -> Lc4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lc4
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> Lc4
            r3.add(r0)     // Catch: java.lang.Exception -> Lc4
            goto L9f
        Lc4:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto Lcf
        Lc9:
            int r0 = r3.size()
            r11.LJLIL = r0
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48177IvV.<init>():void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (LJLJJI) {
            LJLJJL.postDelayed(this.LJLJI, 30000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!LJLJJI) {
            LJLJJI = true;
            if (this.LJLILLLLZI != null) {
                Context context = O6T.LIZ;
                if (C36838Ed0.LIZ(context)) {
                    Intent intent = new Intent();
                    intent.setAction(PowerMonitor.LJ);
                    if (!TextUtils.isEmpty(PowerMonitor.LJIIIIZZ)) {
                        intent.setPackage(PowerMonitor.LJIIIIZZ);
                    }
                    try {
                        context.sendBroadcast(intent);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                N.MyS7kauI();
            }
        }
        LJLJJL.removeCallbacks(this.LJLJI);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.LJLIL == 0 && this.LJLILLLLZI != null) {
            N.MELAwTDU();
        }
        this.LJLIL++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.LJLIL - 1;
        this.LJLIL = i;
        if (i == 0 && this.LJLILLLLZI != null) {
            N.MolcG1Wq();
        }
    }
}
