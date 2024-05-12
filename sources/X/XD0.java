package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XD0 implements XDR<HashMap<String, String>> {
    public final /* synthetic */ C84465XCz LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ XDR LIZLLL;

    @Override // X.XDR
    public final void onSuccess(HashMap<String, String> hashMap) {
        HashMap<String, String> response = hashMap;
        o.LJIIJ(response, "response");
        C0FT c0ft = this.LIZ.LIZ;
        if (c0ft.LIZ == null) {
            C78685UuP.LJJLJ(c0ft, new C40601ia(true));
        }
        C40601ia c40601ia = (C40601ia) this.LIZ.LIZ.LIZ;
        if (c40601ia != null) {
            c40601ia.putAll(response);
        }
        this.LIZ.LIZ(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.XDR
    public final void preProcess(HashMap<String, String> hashMap) {
    }

    @Override // X.XDR
    public final void onFail(HashMap<String, String> hashMap, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        C0FT c0ft = this.LIZ.LIZ;
        if (c0ft.LIZ == null) {
            C78685UuP.LJJLJ(c0ft, new C40601ia(true));
        }
        XDR xdr = this.LIZLLL;
        if (xdr != null) {
            xdr.onSuccess(Boolean.TRUE);
        }
    }

    public XD0(C84465XCz c84465XCz, String str, String str2, XDR xdr) {
        this.LIZ = c84465XCz;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = xdr;
    }
}
