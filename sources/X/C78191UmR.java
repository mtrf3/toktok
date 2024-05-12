package X;

import java.util.List;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UmR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78191UmR extends AbstractC38123Exj<JSONObject, Object> {
    public final InterfaceC78213Umn LJLIL;
    public InterfaceC32440CoG LJLILLLLZI;
    public final List<C32449CoP> LJLJI;

    @Override // X.AbstractC38123Exj, X.AbstractC38082Ex4
    public final String getName() {
        return "playGift";
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        C32257ClJ.LJIIIIZZ(new AqS163S0100000_13(this, 600));
    }

    public C78191UmR(InterfaceC78213Umn renderView, C32449CoP request) {
        List<C32449CoP> list;
        o.LJIIIZ(renderView, "renderView");
        o.LJIIIZ(request, "request");
        this.LJLIL = renderView;
        InterfaceC78172Um8 interfaceC78172Um8 = (InterfaceC78172Um8) request.LIZ(InterfaceC78172Um8.class);
        if (interfaceC78172Um8 != null) {
            list = interfaceC78172Um8.LIZ();
        } else {
            list = null;
        }
        this.LJLJI = list;
    }

    public static void LJJI(long j, C78163Ulz c78163Ulz) {
        JSONObject LIZLLL = Q7K.LIZLLL("unique_id", j);
        if (c78163Ulz == null) {
            LIZLLL.put("status", 0);
        } else {
            LIZLLL.put("status", 1);
            LIZLLL.put("error_code", c78163Ulz.LIZ);
            LIZLLL.put("error_msg", c78163Ulz.LIZIZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Bridge: playGift sendPlayResult, eventName = ");
        LIZ.append("native_gift_play_finish");
        LIZ.append(", param = ");
        LIZ.append(LIZLLL);
        C32444CoK.LIZ(null, X1D.LIZIZ(LIZ));
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78529Urt(LIZLLL), "native_gift_play_finish"));
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr context) {
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        C32257ClJ.LJIIIIZZ(new AqS160S0200000_13(params, this, 106));
    }
}
