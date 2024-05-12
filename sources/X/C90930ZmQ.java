package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmQ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90930ZmQ extends AbstractC90875ZlX {
    public final /* synthetic */ JSONObject LJIIZILJ = null;
    public final /* synthetic */ C90639Zhj LJIJ;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        C90827Zkl c90827Zkl = this.LJIJ.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        JSONObject jSONObject = this.LJIIZILJ;
        c90827Zkl.getClass();
        JSONObject jSONObject2 = new JSONObject();
        long LIZIZ = c90827Zkl.LIZIZ();
        try {
            jSONObject2.put("requestId", LIZIZ);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", c90827Zkl.LJIILLIIL());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        c90827Zkl.LIZJ(LIZIZ, jSONObject2.toString());
        c90827Zkl.LJIIJJI.LIZ(LIZIZ, LJIILJJIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90930ZmQ(C90639Zhj c90639Zhj) {
        super(c90639Zhj, false);
        this.LJIJ = c90639Zhj;
    }
}
