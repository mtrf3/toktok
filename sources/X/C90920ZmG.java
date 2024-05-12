package X;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmG, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90920ZmG extends AbstractC90875ZlX {
    public final /* synthetic */ int[] LJIIZILJ;
    public final /* synthetic */ JSONObject LJIJ;
    public final /* synthetic */ C90639Zhj LJIJI;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        C90827Zkl c90827Zkl = this.LJIJI.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        int[] iArr = this.LJIIZILJ;
        JSONObject jSONObject = this.LJIJ;
        c90827Zkl.getClass();
        if (iArr != null && iArr.length != 0) {
            JSONObject jSONObject2 = new JSONObject();
            long LIZIZ = c90827Zkl.LIZIZ();
            try {
                jSONObject2.put("requestId", LIZIZ);
                jSONObject2.put("type", "QUEUE_REMOVE");
                jSONObject2.put("mediaSessionId", c90827Zkl.LJIILLIIL());
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < iArr.length; i++) {
                    jSONArray.put(i, iArr[i]);
                }
                jSONObject2.put("itemIds", jSONArray);
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
                int i2 = c90827Zkl.LJIIIIZZ;
                if (i2 != -1) {
                    jSONObject2.put("sequenceNumber", i2);
                }
            } catch (JSONException unused) {
            }
            c90827Zkl.LIZJ(LIZIZ, jSONObject2.toString());
            c90827Zkl.LJIJJ.LIZ(LIZIZ, new C90826Zkk(c90827Zkl, LJIILJJIL));
            return;
        }
        throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90920ZmG(C90639Zhj c90639Zhj, int[] iArr, JSONObject jSONObject) {
        super(c90639Zhj, false);
        this.LJIJI = c90639Zhj;
        this.LJIIZILJ = iArr;
        this.LJIJ = jSONObject;
    }
}
