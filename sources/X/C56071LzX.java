package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LzX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56071LzX implements InterfaceC56094Lzu {
    @Override // X.InterfaceC56094Lzu
    public final void LIZIZ() {
        FCG fcg = FCH.LIZIZ;
        EnumC56072LzY state = EnumC56072LzY.STOP;
        o.LJIIIZ(state, "state");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", state.getValue());
        fcg.getClass();
        FCG.LIZ("ec_mall_scroll_state_change", jSONObject);
    }

    @Override // X.InterfaceC56094Lzu
    public final void LIZJ() {
        FCG fcg = FCH.LIZIZ;
        EnumC56072LzY state = EnumC56072LzY.DRAG;
        o.LJIIIZ(state, "state");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", state.getValue());
        fcg.getClass();
        FCG.LIZ("ec_mall_scroll_state_change", jSONObject);
    }

    @Override // X.InterfaceC56094Lzu
    public final void LIZ(boolean z) {
        FCG fcg = FCH.LIZIZ;
        EnumC56072LzY state = EnumC56072LzY.FLING;
        o.LJIIIZ(state, "state");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", state.getValue());
        jSONObject.put("is_down", z);
        fcg.getClass();
        FCG.LIZ("ec_mall_scroll_state_change", jSONObject);
    }
}
