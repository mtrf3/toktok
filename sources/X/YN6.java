package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YN6 extends AbstractC65781Prl implements InterfaceC88474Ynu<String, YNA, JSONObject, java.util.Map<String, String>, C76800UCe> {
    public static final YN6 LJLIL = new YN6();

    public YN6() {
        super(4);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(String str, YNA yna, JSONObject jSONObject, java.util.Map<String, String> map) {
        String eventName = str;
        YNA commonParams = yna;
        JSONObject jSONObject2 = jSONObject;
        java.util.Map<String, String> map2 = map;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(commonParams, "commonParams");
        YN0 yn0 = commonParams.LIZJ;
        if (yn0 != null) {
            int i = YND.LIZ[yn0.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C87265YMr.LIZ.getClass();
                            C87265YMr.LIZIZ(jSONObject2, eventName, map2);
                        }
                    } else {
                        C87265YMr.LIZ.getClass();
                        C87265YMr.LIZIZ(jSONObject2, eventName, map2);
                    }
                } else {
                    C87265YMr.LIZ.getClass();
                    C87265YMr.LIZIZ(jSONObject2, eventName, map2);
                }
            } else {
                C87265YMr.LIZ.getClass();
                C87265YMr.LIZIZ(jSONObject2, eventName, map2);
            }
        }
        return C76800UCe.LIZ;
    }
}
