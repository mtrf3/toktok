package X;

import Y.ACallableS3S1000000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Axk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27932Axk {
    public static boolean LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C27934Axm.LJLIL);

    public static void LIZIZ() {
        if (!((Boolean) C27935Axn.LIZ.getValue()).booleanValue() || LIZ) {
            return;
        }
        C72818Shy.LIZLLL("music_ttm_attribution_af_info", (C27933Axl) LIZIZ.getValue());
        LIZ = true;
    }

    public static String LIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove("af_ua");
            jSONObject.remove("advertising_id");
            jSONObject.remove("af_ref");
            jSONObject.remove("af_android_url");
            jSONObject.remove("gaid");
            jSONObject.remove("event_time");
            jSONObject.put("event_time", System.currentTimeMillis());
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "{\n            val jsonOb…ject.toString()\n        }");
            return jSONObject2;
        } catch (Exception unused) {
            return str;
        }
    }

    public static void LIZJ(String afMap) {
        o.LJIIIZ(afMap, "afMap");
        if (!((Boolean) C27935Axn.LIZ.getValue()).booleanValue()) {
            return;
        }
        AbstractC73672Svk.LJJIIJZLJL(new ACallableS3S1000000_4(afMap, 1)).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9EM
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9EN
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
