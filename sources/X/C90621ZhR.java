package X;

import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.ZhR, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90621ZhR extends C90218Zaw {
    public final /* synthetic */ C90613ZhJ LIZ;

    public /* synthetic */ C90621ZhR(C90613ZhJ c90613ZhJ) {
        this.LIZ = c90613ZhJ;
    }

    @Override // X.C90218Zaw
    public final void LIZLLL() {
        Iterator it = new HashSet(this.LIZ.LIZLLL).iterator();
        while (it.hasNext()) {
            ((C90218Zaw) it.next()).LIZLLL();
        }
    }

    @Override // X.C90218Zaw
    public final void LJFF() {
        Iterator it = new HashSet(this.LIZ.LIZLLL).iterator();
        while (it.hasNext()) {
            ((C90218Zaw) it.next()).LJFF();
        }
    }

    @Override // X.C90218Zaw
    public final void LIZ(int i) {
        Iterator it = new HashSet(this.LIZ.LIZLLL).iterator();
        while (it.hasNext()) {
            ((C90218Zaw) it.next()).LIZ(i);
        }
    }

    @Override // X.C90218Zaw
    public final void LIZIZ(int i) {
        C90613ZhJ.LJIIL(this.LIZ, i);
        InterfaceC90109ZYb interfaceC90109ZYb = this.LIZ.LIZ;
        if (interfaceC90109ZYb != null) {
            try {
                interfaceC90109ZYb.LJLLILLLL(i);
            } catch (RemoteException unused) {
                C90469Zez c90469Zez = ZYQ.LIZIZ;
                C16880lQ.LJLLJ(InterfaceC90109ZYb.class);
                c90469Zez.getClass();
            }
        }
        Iterator it = new HashSet(this.LIZ.LIZLLL).iterator();
        while (it.hasNext()) {
            ((C90218Zaw) it.next()).LIZIZ(i);
        }
    }

    @Override // X.C90218Zaw
    public final void LIZJ(ApplicationMetadata applicationMetadata) {
        Iterator it = new HashSet(this.LIZ.LIZLLL).iterator();
        while (it.hasNext()) {
            ((C90218Zaw) it.next()).LIZJ(applicationMetadata);
        }
    }

    @Override // X.C90218Zaw
    public final void LJ(int i) {
        Iterator it = new HashSet(this.LIZ.LIZLLL).iterator();
        while (it.hasNext()) {
            ((C90218Zaw) it.next()).LJ(i);
        }
    }
}
