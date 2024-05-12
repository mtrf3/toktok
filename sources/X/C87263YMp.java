package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YMp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87263YMp extends AbstractC65781Prl implements InterfaceC88474Ynu<String, YNA, JSONObject, java.util.Map<String, String>, C76800UCe> {
    public static final C87263YMp LJLIL = new C87263YMp();

    public C87263YMp() {
        super(4);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(String eventName, YNA yna, JSONObject jSONObject, java.util.Map<String, String> map) {
        String LIZ;
        boolean z;
        YNA commonParams = yna;
        JSONObject jSONObject2 = jSONObject;
        java.util.Map<String, String> map2 = map;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(commonParams, "commonParams");
        YN0 yn0 = commonParams.LIZJ;
        if (yn0 != null && YNG.LIZ[yn0.ordinal()] == 1) {
            YMX.LIZ.getClass();
            if (o.LJ(eventName, "video_play")) {
                if (jSONObject2 == null || (LIZ = C87260YMm.LIZIZ(jSONObject2)) == null) {
                    if (map2 != null && (LIZ = C87260YMm.LIZ(map2)) != null) {
                        if (jSONObject2 == null) {
                            if (map2 != null) {
                                z = C87260YMm.LJIIJJI(map2);
                            } else {
                                z = false;
                            }
                            C17N.LJJJJLL().j4(new JIR(z, LIZ));
                        }
                    }
                }
                z = o.LJ(jSONObject2.optString("is_fullscreen"), "1");
                C17N.LJJJJLL().j4(new JIR(z, LIZ));
            }
        }
        return C76800UCe.LIZ;
    }
}
