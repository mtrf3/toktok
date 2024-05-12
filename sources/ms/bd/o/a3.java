package ms.bd.o;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.XC5;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public class a3 implements Application.ActivityLifecycleCallbacks {
    public static volatile a3 LJLL = null;
    public static int LJLLI = 200;
    public Application LJLJLJ;
    public boolean LJLIL = false;
    public boolean LJLILLLLZI = false;
    public boolean LJLJJI = false;
    public boolean LJLJL = false;
    public long LJLJLLL = 0;
    public final Lock LJLJJLL = new ReentrantLock();
    public final LinkedList<y2> LJLJJL = new LinkedList<>();
    public final d LJLJI = new d();

    /* loaded from: classes7.dex */
    public class a implements Runnable {
        public final /* synthetic */ Application LJLIL;

        public a(Application application) {
            this.LJLIL = application;
        }

        public final void LIZ() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction((String) k.a(16777217, 0, 0L, "6fd613", new byte[]{4, 75, 58, 12, 62, 10, 6, 9, 16, 72, 19, 65, 37, 125, 58, 12, 28, 117, 17, 89, 4, 75, 57, 118, 47, XC5.LJFF, 27, 98, 7}));
            intentFilter.addAction((String) k.a(16777217, 0, 0L, "445d6e", new byte[]{6, 25, 107, 94, 57, 92, 4, 91, 72, 17, 4, 0, 99, 47, 61, 90, 30, 39, 64, 11, 6, 25, 104, 36, 40, 91, 25, 48, 86}));
            C16880lQ.LJJLIIIJ(this.LJLIL, a3.this.LJLJI, intentFilter);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                LIZ();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public class b implements Runnable {
        public final /* synthetic */ Application LJLIL;

        public b(Application application) {
            this.LJLIL = application;
        }

        public final void LIZ() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction((String) k.a(16777217, 0, 0L, "e2b616", new byte[]{87, 31, 60, 12, 62, 15, 85, 93, 22, 72, 64, 21, 35, 125, 58, 9, 79, 33, 23, 89, 87, 31, 63, 118, 47, 8, 72, 54, 1}));
            intentFilter.addAction((String) k.a(16777217, 0, 0L, "cd9fc9", new byte[]{81, 73, 103, 92, 108, 0, 83, 11, 68, 19, 83, 80, 111, 45, 104, 6, 73, 119, 76, 9, 81, 73, 100, 38, 125, 7, 78, 96, 90}));
            C16880lQ.LJJLIIIJ(this.LJLIL, a3.this.LJLJI, intentFilter);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                LIZ();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                a3 a3Var = a3.this;
                Application application = a3Var.LJLJLJ;
                d dVar = a3Var.LJLJI;
                ReceiverRegisterLancet.loge(dVar, false);
                application.unregisterReceiver(dVar);
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public static a3 LIZ() {
        if (LJLL == null) {
            synchronized (a3.class) {
                if (LJLL == null) {
                    LJLL = new a3();
                }
            }
        }
        return LJLL;
    }

    public final Object[] LIZJ() {
        ArrayList arrayList = new ArrayList(16);
        if (this.LJLJJL.size() > 0) {
            StringBuilder sb = new StringBuilder();
            Locale locale = Locale.ENGLISH;
            Iterator<y2> it = this.LJLJJL.iterator();
            int i = 0;
            while (it.hasNext()) {
                y2 next = it.next();
                i++;
                if (i > LJLLI) {
                    break;
                }
                if (next != null) {
                    sb.append(next.LIZLLL);
                    sb.append(',');
                    sb.append(next.LIZ);
                    sb.append(',');
                    sb.append(C16880lQ.LLLZI(locale, (String) k.a(16777217, 0, 0L, "057deb", new byte[]{100, 121, 22, 22}), new Object[]{Double.valueOf(next.LIZIZ)}));
                    sb.append(',');
                    sb.append(C16880lQ.LLLZI(locale, (String) k.a(16777217, 0, 0L, "847d69", new byte[]{108, 120, 22, 22}), new Object[]{Double.valueOf(next.LIZJ)}));
                    sb.append(',');
                    if (z2.c.a() == next.LIZ) {
                        sb.append(next.LJ);
                    }
                    if (z2.e.a() == next.LIZ) {
                        arrayList.add(sb.toString());
                        sb.delete(0, sb.length());
                    } else {
                        sb.append(';');
                    }
                }
            }
        }
        return arrayList.toArray();
    }

    public final void LIZLLL() {
        synchronized (this) {
            this.LJLJJI = false;
        }
    }

    public final void LJ() {
        Application application;
        if (!this.LJLIL || this.LJLJLJ == null) {
            return;
        }
        synchronized (this) {
            if (this.LJLIL && (application = this.LJLJLJ) != null) {
                this.LJLIL = false;
                if (this.LJLILLLLZI) {
                    application.unregisterActivityLifecycleCallbacks(this);
                    new Handler(C16880lQ.LLJJJJ()).post(new c());
                    this.LJLILLLLZI = false;
                }
            }
        }
    }

    public final void LJFF() {
        try {
            ((ReentrantLock) this.LJLJJLL).unlock();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Window.Callback callback = activity.getWindow().getCallback();
        if (callback == null || this.LJLJL) {
            return;
        }
        activity.getWindow().setCallback(new x2(callback, activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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

    /* loaded from: classes7.dex */
    public class d extends BroadcastReceiver {
        public d() {
        }

        public final void LIZ(Intent intent) {
            String action = intent.getAction();
            if (action.equals(k.a(16777217, 0, 0L, "92b91d", new byte[]{11, 31, 60, 3, 62, 93, 9, 93, 22, 71, 28, 21, 35, 114, 58, 91, 19, 33, 23, 86, 11, 31, 63, 121, 47, 90, 20, 54, 1}))) {
                a3 a3Var = a3.this;
                synchronized (a3Var) {
                    a3Var.LJLJJI = true;
                }
            } else if (action.equals(k.a(16777217, 0, 0L, "84d59d", new byte[]{10, 25, 58, 15, 54, 93, 8, 91, 25, 64, 8, 0, 50, 126, 50, 91, 18, 39, 17, 90, 10, 25, 57, 117, 39, 90, 21, 48, 7}))) {
                a3.this.LIZLLL();
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
}
