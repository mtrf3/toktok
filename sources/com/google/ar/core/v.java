package com.google.ar.core;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C93527aSJ;
import X.C93538aSU;
import X.C93547aSd;
import X.C94365afp;
import X.InterfaceC93523aSF;
import X.InterfaceC93986aZi;
import X.RunnableC93525aSH;
import X.RunnableC93545aSb;
import X.ServiceConnectionC93542aSY;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* loaded from: classes34.dex */
public final class v {
    public final Queue a;
    public Context b;
    public InterfaceC93986aZi c;
    public final ServiceConnection d;
    public BroadcastReceiver e;
    public Context f;
    public PackageInstaller g;
    public PackageInstaller.SessionCallback h;
    public volatile int i;

    public v() {
    }

    public static List com_google_ar_core_v_android_content_pm_PackageManager_queryIntentActivities(PackageManager packageManager, Intent intent, int i) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, Integer.valueOf(i)}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "478672166160365596"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, i);
    }

    public static /* synthetic */ void i(v vVar, Activity activity, C93538aSU c93538aSU) {
        o(activity, c93538aSU);
    }

    public static /* synthetic */ void j(v vVar, Activity activity, Bundle bundle, C93538aSU c93538aSU) {
        p(activity, bundle, c93538aSU);
    }

    public static /* synthetic */ Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m() {
        this.i = 1;
        this.c = null;
    }

    public synchronized void b() {
        int i = this.i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1 || i2 == 2) {
                this.b.unbindService(this.d);
                this.b = null;
                this.i = 1;
            }
            BroadcastReceiver broadcastReceiver = this.e;
            if (broadcastReceiver != null) {
                C16880lQ.LJJLIIIJL(this.f, broadcastReceiver);
            }
            PackageInstaller.SessionCallback sessionCallback = this.h;
            if (sessionCallback != null) {
                this.g.unregisterSessionCallback(sessionCallback);
                this.h = null;
                return;
            }
            return;
        }
        throw null;
    }

    public v(byte[] bArr) {
        this();
        this.a = new ArrayDeque();
        this.i = 1;
        this.d = new ServiceConnectionC93542aSY(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(IBinder iBinder) {
        InterfaceC93986aZi c94365afp;
        if (iBinder == null) {
            c94365afp = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
            if (queryLocalInterface instanceof InterfaceC93986aZi) {
                c94365afp = (InterfaceC93986aZi) queryLocalInterface;
            } else {
                c94365afp = new C94365afp(iBinder);
            }
        }
        this.c = c94365afp;
        this.i = 3;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    private synchronized void n(Runnable runnable) {
        int i = this.i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                    runnable.run();
                    return;
                }
                this.a.offer(runnable);
                return;
            }
            throw new C93527aSJ();
        }
        throw null;
    }

    public synchronized void a(Context context) {
        this.b = context;
        if (C16880lQ.LLLJL(context, new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.d, 1)) {
            this.i = 2;
            return;
        }
        this.i = 1;
        this.b = null;
        context.unbindService(this.d);
    }

    public static void o(Activity activity, C93538aSU c93538aSU) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse("market://details?id=com.google.ar.core"));
            k a = k.a();
            Iterator it = com_google_ar_core_v_android_content_pm_PackageManager_queryIntentActivities(activity.getPackageManager(), intent, 65536).iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                    if (activityInfo != null && activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            a.b = !z;
            C16880lQ.LIZIZ(activity, intent);
        } catch (ActivityNotFoundException e) {
            c93538aSU.LIZIZ(new FatalException("Failed to launch installer.", e));
        }
    }

    public synchronized void c(Context context, InterfaceC93523aSF interfaceC93523aSF) {
        try {
            n(new RunnableC93545aSb(this, context, interfaceC93523aSF));
        } catch (C93527aSJ unused) {
            interfaceC93523aSF.LIZ(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    public void d(Activity activity, C93538aSU c93538aSU) {
        if (this.h == null) {
            this.g = activity.getPackageManager().getPackageInstaller();
            C93547aSd c93547aSd = new C93547aSd(this, c93538aSU);
            this.h = c93547aSd;
            this.g.registerSessionCallback(c93547aSd);
        }
        if (this.e == null) {
            aa aaVar = new aa(c93538aSU);
            this.e = aaVar;
            this.f = activity;
            C16880lQ.LJJLIIIJILLIZJL(aaVar, activity, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
        }
        try {
            n(new RunnableC93525aSH(this, activity, c93538aSU));
        } catch (C93527aSJ unused) {
            o(activity, c93538aSU);
        }
    }

    public static void p(Activity activity, Bundle bundle, C93538aSU c93538aSU) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent != null) {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                c93538aSU.LIZIZ(new FatalException("Installation Intent failed", e));
                return;
            }
        }
        c93538aSU.LIZIZ(new FatalException("Installation intent failed to unparcel."));
    }
}
