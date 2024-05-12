package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EyU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38170EyU implements InterfaceC37862EtW {
    public final C38176Eya LJLIL = new C38176Eya();
    public final /* synthetic */ C60238NkY LJLILLLLZI;

    public C38170EyU(C60238NkY c60238NkY) {
        this.LJLILLLLZI = c60238NkY;
    }

    @Override // X.InterfaceC37862EtW
    public final void LIZIZ(C37955Ev1 call, C37863EtX c37863EtX) {
        o.LJIIJ(call, "call");
        C38176Eya c38176Eya = this.LJLIL;
        C38182Eyg c38182Eyg = this.LJLILLLLZI.LLILII;
        if (c38182Eyg != null) {
            C38113ExZ c38113ExZ = c38182Eyg.LJIILIIL;
            c38176Eya.LIZ = c38113ExZ;
            C38173EyX c38173EyX = new C38173EyX(this, c37863EtX);
            C38175EyZ c38175EyZ = c38176Eya.LIZIZ;
            if (c38175EyZ != null) {
                c38113ExZ.LIZJ.LJIIIZ.remove(c38175EyZ);
            }
            C38175EyZ c38175EyZ2 = new C38175EyZ(c38173EyX);
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
            C38182Eyg c38182Eyg2 = this.LJLILLLLZI.LLILII;
            if (c38182Eyg2 != null) {
                C38049EwX c38049EwX = c38182Eyg2.LJIIJJI;
                if (c38049EwX != null) {
                    c38049EwX.LJIIIIZZ = new C38171EyV(this, c37863EtX);
                    return;
                }
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }
}
