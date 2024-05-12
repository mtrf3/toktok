package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.QJq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66802QJq implements JGB {
    public final /* synthetic */ InterfaceC66824QKm LIZ;

    public C66802QJq(InterfaceC66824QKm interfaceC66824QKm) {
        this.LIZ = interfaceC66824QKm;
    }

    @Override // X.JGB
    public final void LIZIZ(String str, String str2) {
        C1JX.LJIIIIZZ("install_info onUpdate ", str);
        C66799QJn LIZIZ = C66799QJn.LIZIZ(str);
        if (LIZIZ == null || TextUtils.isEmpty(LIZIZ.LJLIL) || TextUtils.isEmpty(LIZIZ.LJLILLLLZI)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("install_info onUpdate invalid value ");
            LIZ.append(LIZIZ);
            X1D.LIZIZ(LIZ);
            return;
        }
        InterfaceC66824QKm interfaceC66824QKm = this.LIZ;
        if (interfaceC66824QKm != null) {
            C66803QJr c66803QJr = (C66803QJr) interfaceC66824QKm;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("install info changed : ");
            LIZ2.append(LIZIZ);
            X1D.LIZIZ(LIZ2);
            C66765QIf c66765QIf = (C66765QIf) c66803QJr.LIZJ;
            Context LIZLLL = c66765QIf.LIZLLL();
            if (LIZLLL != null) {
                c66765QIf.LIZLLL.LIZIZ(LIZLLL).LJIIIIZZ(LIZIZ);
            }
            C66811QJz c66811QJz = c66803QJr.LIZIZ;
            if (c66811QJz != null) {
                c66811QJz.LIZ(new QJV(LIZIZ));
            }
        }
    }
}
