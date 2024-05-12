package androidx.work.impl.foreground;

import X.AbstractRunnableC20450rB;
import X.C0VW;
import X.C16880lQ;
import X.C1DA;
import X.C1OU;
import X.C35532Dx2;
import X.C35591aV;
import X.C38413F5t;
import X.C38891fp;
import X.C66163Pxv;
import X.C84763XOl;
import X.InterfaceC03600Ce;
import Y.IDRunnableS0S1200000;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements InterfaceC03600Ce {
    public Handler LJLIL;
    public boolean LJLILLLLZI;
    public C1DA LJLJI;
    public NotificationManager LJLJJI;

    static {
        C0VW.LIZIZ("SystemFgService");
    }

    public final void LIZ() {
        this.LJLIL = new Handler(C16880lQ.LLJJJJ());
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        this.LJLJJI = (NotificationManager) C16880lQ.LLILL(applicationContext, "notification");
        Context applicationContext2 = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext2 == null) {
            applicationContext2 = C38891fp.LJLILLLLZI;
        }
        C1DA c1da = new C1DA(applicationContext2);
        this.LJLJI = c1da;
        if (c1da.LJLJLLL != null) {
            C0VW.LIZ().getClass();
        } else {
            c1da.LJLJLLL = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        LIZ();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C1DA c1da = this.LJLJI;
        c1da.LJLJLLL = null;
        synchronized (c1da.LJLJI) {
            c1da.LJLJLJ.LIZLLL();
        }
        c1da.LJLIL.LJFF.LJFF(c1da);
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
            C1DA c1da = this.LJLJI;
            c1da.LJLJLLL = null;
            synchronized (c1da.LJLJI) {
                c1da.LJLJLJ.LIZLLL();
            }
            c1da.LJLIL.LJFF.LJFF(c1da);
            LIZ();
            this.LJLILLLLZI = false;
        }
        if (intent != null) {
            C1DA c1da2 = this.LJLJI;
            c1da2.getClass();
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Started foreground service %s", new Object[]{intent});
                LIZ.getClass();
                ((C35591aV) c1da2.LJLILLLLZI).LIZ(new IDRunnableS0S1200000(c1da2, C16880lQ.LLJJIJIIJIL(intent, "KEY_WORKSPEC_ID"), c1da2.LJLIL.LIZJ, 13));
                c1da2.LIZJ(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                c1da2.LIZJ(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                C0VW LIZ2 = C0VW.LIZ();
                C16880lQ.LLLZ("Stopping foreground work for %s", new Object[]{intent});
                LIZ2.getClass();
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "KEY_WORKSPEC_ID");
                if (LLJJIJIIJIL == null || TextUtils.isEmpty(LLJJIJIIJIL)) {
                    return 3;
                }
                final C1OU c1ou = c1da2.LJLIL;
                final UUID fromString = UUID.fromString(LLJJIJIIJIL);
                c1ou.getClass();
                ((C35591aV) c1ou.LIZLLL).LIZ(new AbstractRunnableC20450rB() { // from class: X.1Yc
                    @Override // X.AbstractRunnableC20450rB
                    public final void LIZIZ() {
                        WorkDatabase workDatabase = C1OU.this.LIZJ;
                        workDatabase.LIZJ();
                        try {
                            AbstractRunnableC20450rB.LIZ(C1OU.this, fromString.toString());
                            workDatabase.LJIILLIIL();
                            workDatabase.LJIIJJI();
                            C1OU c1ou2 = C1OU.this;
                            C09020Xa.LIZ(c1ou2.LIZIZ, c1ou2.LIZJ, c1ou2.LJ);
                        } catch (Throwable th) {
                            workDatabase.LJIIJJI();
                            throw th;
                        }
                    }
                });
                return 3;
            }
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            C0VW.LIZ().getClass();
            InterfaceC03600Ce interfaceC03600Ce = c1da2.LJLJLLL;
            if (interfaceC03600Ce == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC03600Ce;
            systemForegroundService.LJLILLLLZI = true;
            C0VW.LIZ().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        return 3;
    }
}
