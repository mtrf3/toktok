package androidx.work.impl.background.systemalarm;

import X.C0VW;
import X.C16880lQ;
import X.C1D9;
import X.C20550rL;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.InterfaceC03580Cc;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService implements InterfaceC03580Cc {
    public C1D9 LJLIL;
    public boolean LJLILLLLZI;

    public final void LIZ() {
        this.LJLILLLLZI = true;
        C0VW.LIZ().getClass();
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = C20550rL.LIZ;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C16880lQ.LLLZ("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)});
                C0VW.LIZ().getClass();
            }
        }
        stopSelf();
    }

    static {
        C0VW.LIZIZ("SystemAlarmService");
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1D9 c1d9 = new C1D9(this);
        this.LJLIL = c1d9;
        if (c1d9.LJLL != null) {
            C0VW.LIZ().getClass();
        } else {
            c1d9.LJLL = this;
        }
        this.LJLILLLLZI = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.LJLILLLLZI = true;
        this.LJLIL.LIZLLL();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        super.onStartCommand(intent, i, i2);
        if (this.LJLILLLLZI) {
            C0VW.LIZ().getClass();
            this.LJLIL.LIZLLL();
            C1D9 c1d9 = new C1D9(this);
            this.LJLIL = c1d9;
            if (c1d9.LJLL != null) {
                C0VW.LIZ().getClass();
            } else {
                c1d9.LJLL = this;
            }
            this.LJLILLLLZI = false;
        }
        if (intent != null) {
            this.LJLIL.LIZ(i2, intent);
            return 3;
        }
        return 3;
    }
}
