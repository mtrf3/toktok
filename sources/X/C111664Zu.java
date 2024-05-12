package X;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.4Zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111664Zu {
    public static C111664Zu LJ;
    public final Object LIZ = new Object();
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ(), new Handler.Callback() { // from class: X.4Zv
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C111664Zu c111664Zu = C111664Zu.this;
            C111644Zs c111644Zs = (C111644Zs) message.obj;
            synchronized (c111664Zu.LIZ) {
                if (c111664Zu.LIZJ == c111644Zs || c111664Zu.LIZLLL == c111644Zs) {
                    c111664Zu.LIZ(c111644Zs, 2);
                }
            }
            return true;
        }
    });
    public C111644Zs LIZJ;
    public C111644Zs LIZLLL;

    public static C111664Zu LIZIZ() {
        if (LJ == null) {
            LJ = new C111664Zu();
        }
        return LJ;
    }

    public final boolean LIZJ(InterfaceC111654Zt interfaceC111654Zt) {
        C111644Zs c111644Zs = this.LIZJ;
        if (c111644Zs == null || interfaceC111654Zt == null || c111644Zs.LIZ.get() != interfaceC111654Zt) {
            return false;
        }
        return true;
    }

    public final void LIZLLL(InterfaceC111654Zt interfaceC111654Zt) {
        synchronized (this.LIZ) {
            if (LIZJ(interfaceC111654Zt)) {
                C111644Zs c111644Zs = this.LIZJ;
                if (!c111644Zs.LIZJ) {
                    c111644Zs.LIZJ = true;
                    this.LIZIZ.removeCallbacksAndMessages(c111644Zs);
                }
            }
        }
    }

    public final void LJ(InterfaceC111654Zt interfaceC111654Zt) {
        synchronized (this.LIZ) {
            if (LIZJ(interfaceC111654Zt)) {
                C111644Zs c111644Zs = this.LIZJ;
                if (c111644Zs.LIZJ) {
                    c111644Zs.LIZJ = false;
                    LJFF(c111644Zs);
                }
            }
        }
    }

    public final void LJFF(C111644Zs c111644Zs) {
        int i = c111644Zs.LIZIZ;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            if (i == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            } else {
                i = 2750;
            }
        }
        this.LIZIZ.removeCallbacksAndMessages(c111644Zs);
        Handler handler = this.LIZIZ;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c111644Zs), i);
    }

    public final boolean LIZ(C111644Zs c111644Zs, int i) {
        InterfaceC111654Zt interfaceC111654Zt = c111644Zs.LIZ.get();
        if (interfaceC111654Zt != null) {
            this.LIZIZ.removeCallbacksAndMessages(c111644Zs);
            interfaceC111654Zt.LIZ(i);
            return true;
        }
        return false;
    }
}
