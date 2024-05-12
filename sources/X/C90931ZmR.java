package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmR, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90931ZmR extends AbstractC90875ZlX {
    public final /* synthetic */ ZWY LJIIZILJ;
    public final /* synthetic */ C90639Zhj LJIJ;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        long j;
        C90827Zkl c90827Zkl = this.LJIJ.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        ZWY zwy = this.LJIIZILJ;
        c90827Zkl.getClass();
        JSONObject jSONObject = new JSONObject();
        long LIZIZ = c90827Zkl.LIZIZ();
        if (zwy.LIZJ) {
            j = 4294967296000L;
        } else {
            j = zwy.LIZ;
        }
        try {
            jSONObject.put("requestId", LIZIZ);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", c90827Zkl.LJIILLIIL());
            jSONObject.put("currentTime", C90468Zey.LIZ(j));
            int i = zwy.LIZIZ;
            if (i != 1) {
                if (i == 2) {
                    jSONObject.put("resumeState", "PLAYBACK_PAUSE");
                }
            } else {
                jSONObject.put("resumeState", "PLAYBACK_START");
            }
            JSONObject jSONObject2 = zwy.LIZLLL;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        c90827Zkl.LIZJ(LIZIZ, jSONObject.toString());
        c90827Zkl.LJI = Long.valueOf(j);
        c90827Zkl.LJIILIIL.LIZ(LIZIZ, new C90824Zki(c90827Zkl, LJIILJJIL));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90931ZmR(C90639Zhj c90639Zhj, ZWY zwy) {
        super(c90639Zhj, false);
        this.LJIJ = c90639Zhj;
        this.LJIIZILJ = zwy;
    }
}
