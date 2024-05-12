package X;

import kotlin.jvm.internal.o;
import okhttp3.Request;

/* renamed from: X.Ixb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48307Ixb<T> implements InterfaceC66992k3<PVM> {
    public final /* synthetic */ C48308Ixc LJLIL;
    public final /* synthetic */ Request LJLILLLLZI;

    public C48307Ixb(C48308Ixc c48308Ixc, Request request) {
        this.LJLIL = c48308Ixc;
        this.LJLILLLLZI = request;
    }

    public static C64598PWw LIZ(C64587PWl c64587PWl) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", c64587PWl, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "-358357555563955934"));
        return LIZJ.LIZ ? (C64598PWw) LIZJ.LIZIZ : c64587PWl.execute();
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<PVM> interfaceC65052gv) {
        try {
            C64600PWy c64600PWy = (C64600PWy) this.LJLIL.LIZ.getValue();
            Request request = this.LJLILLLLZI;
            c64600PWy.getClass();
            C64598PWw response = LIZ(C64587PWl.LIZJ(c64600PWy, request, false));
            o.LJIIIIZZ(response, "response");
            if (response.LIZIZ()) {
                PVM pvm = response.LJLJL;
                if (pvm != null) {
                    ((C73578SuE) interfaceC65052gv).onSuccess(pvm);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("response body null, status code is: ");
                    LIZ.append(response.LJLJI);
                    ((C73578SuE) interfaceC65052gv).onError(new Exception(X1D.LIZIZ(LIZ)));
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("status code error, status code is: ");
                LIZ2.append(response.LJLJI);
                ((C73578SuE) interfaceC65052gv).onError(new Exception(X1D.LIZIZ(LIZ2)));
            }
        } catch (Exception e) {
            ((C73578SuE) interfaceC65052gv).onError(e);
        }
    }
}
