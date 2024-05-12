package X;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes29.dex */
public final class ZYS {
    public static final C90469Zez LIZJ = new C90469Zez("SessionManager");
    public final InterfaceC90111ZYd LIZ;
    public final Context LIZIZ;

    public ZYS(InterfaceC90111ZYd interfaceC90111ZYd, Context context) {
        this.LIZ = interfaceC90111ZYd;
        this.LIZIZ = context;
    }

    public final C90613ZhJ LIZJ() {
        QH7.LJ("Must be called from the main thread.");
        ZYQ LIZLLL = LIZLLL();
        if (LIZLLL != null && (LIZLLL instanceof C90613ZhJ)) {
            return (C90613ZhJ) LIZLLL;
        }
        return null;
    }

    public final ZYQ LIZLLL() {
        QH7.LJ("Must be called from the main thread.");
        try {
            return (ZYQ) BinderC68153Qov.LLJJIII(this.LIZ.LJIIIIZZ());
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = LIZJ;
            C16880lQ.LJLLJ(InterfaceC90111ZYd.class);
            c90469Zez.getClass();
            return null;
        }
    }

    public final void LIZIZ(boolean z) {
        QH7.LJ("Must be called from the main thread.");
        try {
            C90469Zez c90469Zez = LIZJ;
            this.LIZIZ.getPackageName();
            c90469Zez.getClass();
            this.LIZ.LJLJLLL(z);
        } catch (RemoteException unused) {
            C90469Zez c90469Zez2 = LIZJ;
            C16880lQ.LJLLJ(InterfaceC90111ZYd.class);
            c90469Zez2.getClass();
        }
    }

    public final <T extends ZYQ> void LIZ(ZYU<T> zyu, Class<T> cls) {
        if (zyu != null) {
            QH7.LJ("Must be called from the main thread.");
            try {
                this.LIZ.P(new BinderC90869ZlR(zyu, cls));
                return;
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = LIZJ;
                C16880lQ.LJLLJ(InterfaceC90111ZYd.class);
                c90469Zez.getClass();
                return;
            }
        }
        throw new NullPointerException("SessionManagerListener can't be null");
    }

    public final <T extends ZYQ> void LJ(ZYU<T> zyu, Class cls) {
        QH7.LJ("Must be called from the main thread.");
        if (zyu == null) {
            return;
        }
        try {
            this.LIZ.s0(new BinderC90869ZlR(zyu, cls));
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = LIZJ;
            C16880lQ.LJLLJ(InterfaceC90111ZYd.class);
            c90469Zez.getClass();
        }
    }
}
