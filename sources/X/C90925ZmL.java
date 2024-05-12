package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmL, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90925ZmL extends AbstractC90875ZlX {
    public final /* synthetic */ C90639Zhj LJIIZILJ;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        C90827Zkl c90827Zkl = this.LJIIZILJ.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        c90827Zkl.getClass();
        JSONObject jSONObject = new JSONObject();
        long LIZIZ = c90827Zkl.LIZIZ();
        try {
            jSONObject.put("requestId", LIZIZ);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", c90827Zkl.LJIILLIIL());
        } catch (JSONException unused) {
        }
        c90827Zkl.LIZJ(LIZIZ, jSONObject.toString());
        c90827Zkl.LJIJJLI.LIZ(LIZIZ, LJIILJJIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90925ZmL(C90639Zhj c90639Zhj) {
        super(c90639Zhj, true);
        this.LJIIZILJ = c90639Zhj;
    }
}
