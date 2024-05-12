package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EyT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38169EyT implements InterfaceC37862EtW {
    public final C38176Eya LJLIL = new C38176Eya();
    public final /* synthetic */ C38150EyA LJLILLLLZI;

    public C38169EyT(C38150EyA c38150EyA) {
        this.LJLILLLLZI = c38150EyA;
    }

    @Override // X.InterfaceC37862EtW
    public final void LIZIZ(C37955Ev1 call, C37863EtX c37863EtX) {
        o.LJIIIZ(call, "call");
        C38176Eya c38176Eya = this.LJLIL;
        C38113ExZ c38113ExZ = this.LJLILLLLZI.LJII;
        c38176Eya.LIZ = c38113ExZ;
        C38174EyY c38174EyY = new C38174EyY(this, c37863EtX);
        C38175EyZ c38175EyZ = c38176Eya.LIZIZ;
        if (c38175EyZ != null) {
            c38113ExZ.LIZJ.LJIIIZ.remove(c38175EyZ);
        }
        C38175EyZ c38175EyZ2 = new C38175EyZ(c38174EyY);
        c38176Eya.LIZIZ = c38175EyZ2;
        c38176Eya.LIZ.LIZJ.LJIIIZ.add(c38175EyZ2);
        JSONObject jSONObject = new JSONObject(call.LJIIJJI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bridgesdk");
        LIZ.append(jSONObject.opt("__callback_id"));
        jSONObject.put("__callback_id", X1D.LIZIZ(LIZ));
        jSONObject.put("shouldHook", true);
        C38176Eya c38176Eya2 = this.LJLIL;
        c38176Eya2.LIZ.LIZ.invokeMethod(jSONObject.toString());
        C38049EwX c38049EwX = this.LJLILLLLZI.LJ;
        if (c38049EwX != null) {
            c38049EwX.LJIIIIZZ = new C38172EyW(this, c37863EtX);
        }
    }
}
