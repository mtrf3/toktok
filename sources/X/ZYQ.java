package X;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes29.dex */
public abstract class ZYQ {
    public static final C90469Zez LIZIZ = new C90469Zez("Session");
    public final InterfaceC90109ZYb LIZ;

    public abstract void LIZ(boolean z);

    public void LIZLLL(Bundle bundle) {
    }

    public void LJ(Bundle bundle) {
    }

    public abstract void LJFF(Bundle bundle);

    public abstract void LJI(Bundle bundle);

    public void LJII(Bundle bundle) {
    }

    public long LIZIZ() {
        QH7.LJ("Must be called from the main thread.");
        return 0L;
    }

    public final boolean LIZJ() {
        QH7.LJ("Must be called from the main thread.");
        InterfaceC90109ZYb interfaceC90109ZYb = this.LIZ;
        if (interfaceC90109ZYb != null) {
            try {
                return interfaceC90109ZYb.LJJIII();
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = LIZIZ;
                C16880lQ.LJLLJ(InterfaceC90109ZYb.class);
                c90469Zez.getClass();
            }
        }
        return false;
    }

    public ZYQ(Context context, String str, String str2) {
        InterfaceC90109ZYb interfaceC90109ZYb;
        try {
            interfaceC90109ZYb = C90282Zby.LIZ(context).LJJLJ(str, str2, new BinderC90871ZlT(this));
        } catch (C90113ZYf | RemoteException unused) {
            C90469Zez c90469Zez = C90282Zby.LIZ;
            C16880lQ.LJLLJ(InterfaceC90294ZcA.class);
            c90469Zez.getClass();
            interfaceC90109ZYb = null;
        }
        this.LIZ = interfaceC90109ZYb;
    }
}
