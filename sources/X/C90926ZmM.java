package X;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmM, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90926ZmM extends AbstractC90875ZlX {
    public final /* synthetic */ int[] LJIIZILJ;
    public final /* synthetic */ C90639Zhj LJIJ;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        C90827Zkl c90827Zkl = this.LJIJ.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        int[] iArr = this.LJIIZILJ;
        c90827Zkl.getClass();
        JSONObject jSONObject = new JSONObject();
        long LIZIZ = c90827Zkl.LIZIZ();
        try {
            jSONObject.put("requestId", LIZIZ);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", c90827Zkl.LJIILLIIL());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        c90827Zkl.LIZJ(LIZIZ, jSONObject.toString());
        c90827Zkl.LJIL.LIZ(LIZIZ, LJIILJJIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90926ZmM(C90639Zhj c90639Zhj, int[] iArr) {
        super(c90639Zhj, true);
        this.LJIJ = c90639Zhj;
        this.LJIIZILJ = iArr;
    }
}
