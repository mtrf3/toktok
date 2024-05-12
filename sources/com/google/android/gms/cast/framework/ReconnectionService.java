package com.google.android.gms.cast.framework;

import X.BinderC68153Qov;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C66163Pxv;
import X.C84763XOl;
import X.C90113ZYf;
import X.C90282Zby;
import X.C90469Zez;
import X.InterfaceC68163Qp5;
import X.InterfaceC90108ZYa;
import X.InterfaceC90111ZYd;
import X.InterfaceC90294ZcA;
import X.QH7;
import X.ZYJ;
import X.ZYS;
import X.ZYY;
import X.ZYZ;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes29.dex */
public class ReconnectionService extends Service {
    public static final C90469Zez LJLILLLLZI = new C90469Zez("ReconnectionService");
    public InterfaceC90108ZYa LJLIL;

    @Override // android.app.Service
    public final void onDestroy() {
        InterfaceC90108ZYa interfaceC90108ZYa = this.LJLIL;
        if (interfaceC90108ZYa != null) {
            try {
                interfaceC90108ZYa.LJI();
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = LJLILLLLZI;
                C16880lQ.LJLLJ(InterfaceC90108ZYa.class);
                c90469Zez.getClass();
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        InterfaceC68163Qp5 interfaceC68163Qp5;
        InterfaceC68163Qp5 interfaceC68163Qp52;
        ZYJ LIZIZ = ZYJ.LIZIZ(this);
        ZYS LIZ = LIZIZ.LIZ();
        LIZ.getClass();
        InterfaceC90108ZYa interfaceC90108ZYa = null;
        try {
            interfaceC68163Qp5 = LIZ.LIZ.LIZJ();
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = ZYS.LIZJ;
            C16880lQ.LJLLJ(InterfaceC90111ZYd.class);
            c90469Zez.getClass();
            interfaceC68163Qp5 = null;
        }
        QH7.LJ("Must be called from the main thread.");
        ZYZ zyz = LIZIZ.LIZLLL;
        zyz.getClass();
        try {
            interfaceC68163Qp52 = zyz.LIZ.LJ();
        } catch (RemoteException unused2) {
            C90469Zez c90469Zez2 = ZYZ.LIZIZ;
            C16880lQ.LJLLJ(ZYY.class);
            c90469Zez2.getClass();
            interfaceC68163Qp52 = null;
        }
        if (interfaceC68163Qp5 != null && interfaceC68163Qp52 != null) {
            try {
                Context applicationContext = getApplicationContext();
                if (C38891fp.LJLJI && applicationContext == null) {
                    applicationContext = C38891fp.LJLILLLLZI;
                }
                interfaceC90108ZYa = C90282Zby.LIZ(applicationContext).LLILIL(new BinderC68153Qov(this), interfaceC68163Qp5, interfaceC68163Qp52);
            } catch (C90113ZYf | RemoteException unused3) {
                C90469Zez c90469Zez3 = C90282Zby.LIZ;
                C16880lQ.LJLLJ(InterfaceC90294ZcA.class);
                c90469Zez3.getClass();
            }
        }
        this.LJLIL = interfaceC90108ZYa;
        if (interfaceC90108ZYa != null) {
            try {
                interfaceC90108ZYa.LIZJ();
            } catch (RemoteException unused4) {
                C90469Zez c90469Zez4 = LJLILLLLZI;
                C16880lQ.LJLLJ(InterfaceC90108ZYa.class);
                c90469Zez4.getClass();
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        InterfaceC90108ZYa interfaceC90108ZYa = this.LJLIL;
        if (interfaceC90108ZYa != null) {
            try {
                return interfaceC90108ZYa.LLLIIL(intent);
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = LJLILLLLZI;
                C16880lQ.LJLLJ(InterfaceC90108ZYa.class);
                c90469Zez.getClass();
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        InterfaceC90108ZYa interfaceC90108ZYa = this.LJLIL;
        if (interfaceC90108ZYa != null) {
            try {
                return interfaceC90108ZYa.T(i, i2, intent);
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = LJLILLLLZI;
                C16880lQ.LJLLJ(InterfaceC90108ZYa.class);
                c90469Zez.getClass();
            }
        }
        return 2;
    }
}
