package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NLf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59199NLf extends NM4 {
    public final /* synthetic */ C59201NLh LJLIL;

    public C59199NLf(C59201NLh c59201NLh) {
        this.LJLIL = c59201NLh;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadUriSuccess, uri: ");
        LIZ.append(view);
        FDL.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        C59201NLh c59201NLh = this.LJLIL;
        c59201NLh.LJIIIZ = str;
        c59201NLh.LJIIJ = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFail error:");
        LIZ.append(str);
        LIZ.append(", uri: ");
        LIZ.append(url);
        FDL.LIZ(X1D.LIZIZ(LIZ));
    }
}
