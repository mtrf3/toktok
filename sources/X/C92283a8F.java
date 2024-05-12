package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a8F, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92283a8F extends C92048a4S {
    public String LIZLLL;

    public final void LJFF() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("obj_id", EnumC92042a4M.Change.getObjId());
        LJ(jSONObject);
    }

    public final void LJIIIZ() {
        LJIIIIZZ(EnumC92041a4L.Select);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92283a8F(String pageID) {
        super(pageID);
        o.LJIIIZ(pageID, "pageID");
        this.LIZLLL = "";
    }

    public final void LJ(JSONObject jSONObject) {
        LIZ(EnumC92044a4O.CheckoutPageClick.getEventName(), jSONObject);
    }

    public final void LJIIIIZZ(EnumC92041a4L enumC92041a4L) {
        LIZIZ(EnumC92044a4O.CheckoutPageFinish.getEventName(), enumC92041a4L);
    }

    public final void LJIIJ(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("obj_id", str);
        jSONObject.put("popup_id", str2);
        LIZJ(EnumC92044a4O.CheckoutPopupClick.getEventName(), jSONObject);
    }

    public final void LJIIJJI(String str, List list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("obj_id", C92047a4R.LIZJ(list));
        jSONObject.put("popup_id", str);
        LIZJ(EnumC92044a4O.CheckoutPopupShow.getEventName(), jSONObject);
    }

    public final void LJIIL(List<? extends List<? extends Object>> list, boolean z) {
        if (list == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("payment_method_array_1", C92047a4R.LJ(list));
        } else {
            jSONObject.put("payment_method_array_2", C92047a4R.LJ(list));
        }
        LIZLLL(EnumC92044a4O.CheckoutPageShow.getEventName(), jSONObject);
    }

    public final void LJII(String str, boolean z, boolean z2) {
        String objId;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            objId = EnumC92042a4M.Pay.getObjId();
        } else {
            objId = EnumC92042a4M.ContinueWith.getObjId();
        }
        jSONObject.put("obj_id", objId);
        jSONObject.put("pay_payment_method", str);
        jSONObject.put("is_default", C92047a4R.LIZLLL(z2));
        LJ(jSONObject);
    }

    public final void LJIILIIL(String paymentMethod, List list, boolean z) {
        o.LJIIIZ(paymentMethod, "paymentMethod");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_default", C92047a4R.LIZLLL(z));
        jSONObject.put("payment_method", paymentMethod);
        if (!((ArrayList) list).isEmpty()) {
            jSONObject.put("fillin_scenario", C92047a4R.LIZJ(list));
        }
        LIZLLL(EnumC92044a4O.CheckoutPageShow.getEventName(), jSONObject);
    }

    public final void LJI(String paymentMethod, String str, String str2, boolean z) {
        o.LJIIIZ(paymentMethod, "paymentMethod");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("obj_id", EnumC92042a4M.PiChoose.getObjId());
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(paymentMethod, str, str2);
        o.LJIIIZ(LJJIJIIJI, "<this>");
        String LLD = ORZ.LLD(LJJIJIIJI, ", ", null, null, null, 62);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{ ");
        LIZ.append(LLD);
        LIZ.append(" }");
        jSONObject.put("click_payment_method", X1D.LIZIZ(LIZ));
        jSONObject.put("is_saved_pi", C92047a4R.LIZLLL(z));
        LJ(jSONObject);
    }
}
