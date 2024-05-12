package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R8f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69053R8f extends QQE<C68922R3e> {
    public final /* synthetic */ C45R<C68922R3e> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.QQE
    public final void onResponse(C68922R3e c68922R3e) {
        C68922R3e response = c68922R3e;
        o.LJIIIZ(response, "response");
        if (response.LIZIZ) {
            ((C73516StE) this.LIZ).onSuccess(response);
            return;
        }
        C45R<C68922R3e> c45r = this.LIZ;
        InterfaceC69056R8i interfaceC69056R8i = this.LIZIZ;
        int i = response.LIZLLL;
        String str = response.LJFF;
        EnumC69116RAq scene = interfaceC69056R8i.scene();
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        JSONObject jSONObject = response.LJIILJJIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("detail errorCode=");
        LIZ.append(response.LJ);
        LIZ.append(", detail errorMsg=");
        LIZ.append(response.LJI);
        ((C73516StE) c45r).onError(new C69084R9k(i, str, scene, LJLLLL, jSONObject, X1D.LIZIZ(LIZ)));
    }

    public C69053R8f(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }
}
