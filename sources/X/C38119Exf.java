package X;

import org.json.JSONObject;

/* renamed from: X.Exf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38119Exf extends AbstractC38134Exu {
    public final InterfaceC38012Evw LJLILLLLZI;

    public C38119Exf(InterfaceC38012Evw interfaceC38012Evw) {
        this.LJLILLLLZI = interfaceC38012Evw;
    }

    @Override // X.AbstractC38134Exu
    public final void LJJI(C38117Exd c38117Exd, C38132Exs c38132Exs) {
        C38048EwW c38048EwW = new C38048EwW();
        c38048EwW.LIZJ = c38117Exd.LIZLLL;
        c38048EwW.LIZLLL = new JSONObject(c38117Exd.LJ);
        c38048EwW.LIZIZ = c38117Exd.LJFF;
        c38048EwW.LIZ = c38117Exd.LIZJ;
        c38048EwW.LJ = 0;
        c38048EwW.LJFF = c38117Exd.LJI;
        c38048EwW.LJI = c38117Exd.LJII;
        c38048EwW.LJIIJ = true;
        EnumC38078Ex0 enumC38078Ex0 = c38132Exs.LIZIZ;
        if (enumC38078Ex0 != null) {
            c38048EwW.LJIIIZ = enumC38078Ex0.toString();
        }
        JSONObject jSONObject = new JSONObject();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Invoking legacy method with: ");
        LIZ.append(c38048EwW.toString());
        X1D.LIZIZ(LIZ);
        try {
            this.LJLILLLLZI.call(c38048EwW, jSONObject);
        } catch (Exception unused) {
        }
        if (!c38048EwW.LJIIJ) {
            c38048EwW.toString();
            return;
        }
        String jSONObject2 = jSONObject.toString();
        if (!c38132Exs.LIZLLL) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Jsb async call already finished: ");
            LIZ2.append(c38132Exs.LIZ);
            LIZ2.append(", stub: ");
            LIZ2.append(c38132Exs.hashCode());
            IllegalStateException illegalStateException = new IllegalStateException(X1D.LIZIZ(LIZ2));
            if (C1A7.LJLIL) {
                throw illegalStateException;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Jsb async call about to finish with response: ");
        LIZ3.append(c38132Exs.LIZ);
        LIZ3.append(", stub: ");
        LIZ3.append(c38132Exs.hashCode());
        X1D.LIZIZ(LIZ3);
        C38139Exz c38139Exz = (C38139Exz) c38132Exs.LIZJ;
        if (jSONObject2 != null) {
            AbstractC38114Exa abstractC38114Exa = c38139Exz.LIZIZ.LJIIIZ;
            if (abstractC38114Exa != null) {
                abstractC38114Exa.LIZJ(jSONObject2, c38139Exz.LIZ);
            }
        } else {
            c38139Exz.getClass();
        }
        c38132Exs.LIZLLL = false;
        if (!C1A7.LJLIL) {
            return;
        }
        if (jSONObject.optInt("code", 0) == 1) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Method succeed with: ");
            LIZ4.append(c38048EwW.toString());
            X1D.LIZIZ(LIZ4);
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("No need for callback, but error occurred: ");
        LIZ5.append(c38048EwW.toString());
        X1D.LIZIZ(LIZ5);
    }
}
