package X;

import android.accounts.Account;
import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.QJr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66803QJr implements InterfaceC66764QIe, InterfaceC66824QKm {
    public C66799QJn LIZ;
    public C66811QJz LIZIZ;
    public final InterfaceC66835QKx LIZJ;

    @Override // X.InterfaceC66764QIe
    public final void LIZ(Account account) {
    }

    @Override // X.InterfaceC66764QIe
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC66764QIe
    public final C48852JFg LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC66764QIe
    public final void LJFF(Context context, java.util.Map map, boolean z) {
    }

    @Override // X.InterfaceC66764QIe
    public final void LJI(C48852JFg c48852JFg, long j, InterfaceC66818QKg interfaceC66818QKg) {
    }

    @Override // X.InterfaceC66764QIe
    public final void LJII(java.util.Map map) {
    }

    @Override // X.InterfaceC66764QIe
    public final boolean LJIIIZ(JSONObject jSONObject) {
        return false;
    }

    @Override // X.InterfaceC66764QIe
    public final void LJIIJ(C48852JFg c48852JFg) {
    }

    @Override // X.InterfaceC66764QIe
    public final void start() {
    }

    @Override // X.InterfaceC66764QIe
    public final C66799QJn LJ() {
        C66799QJn c66799QJn = this.LIZ;
        if (c66799QJn == null) {
            return null;
        }
        return c66799QJn.clone();
    }

    @Override // X.InterfaceC66764QIe
    public final String getDid() {
        C66799QJn c66799QJn = this.LIZ;
        if (c66799QJn == null) {
            return null;
        }
        return c66799QJn.LJLIL;
    }

    public C66803QJr(C66765QIf c66765QIf) {
        this.LIZJ = c66765QIf;
    }

    @Override // X.InterfaceC66764QIe
    public final void LJIIIIZZ(C66799QJn c66799QJn) {
        this.LIZ = c66799QJn;
    }

    @Override // X.InterfaceC66764QIe
    public final void LIZJ(QIF qif, C48852JFg c48852JFg) {
        Context context = qif.LIZJ;
        C66797QJl c66797QJl = new C66797QJl(context);
        c66797QJl.LIZIZ = qif;
        JG8.LIZ(context).LIZIZ(c66797QJl.LIZIZ.LIZ(), "install_info", new C66802QJq(this));
        JGC.LIZIZ(qif);
        JFZ.LIZIZ(JGH.class, String.valueOf(qif.LIZ), new JGF(qif));
    }
}
