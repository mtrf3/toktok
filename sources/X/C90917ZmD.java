package X;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmD, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90917ZmD extends AbstractC90875ZlX {
    public final /* synthetic */ long[] LJIIZILJ;
    public final /* synthetic */ C90639Zhj LJIJ;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        C90827Zkl c90827Zkl = this.LJIJ.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        long[] jArr = this.LJIIZILJ;
        c90827Zkl.getClass();
        if (jArr != null) {
            JSONObject jSONObject = new JSONObject();
            long LIZIZ = c90827Zkl.LIZIZ();
            try {
                jSONObject.put("requestId", LIZIZ);
                jSONObject.put("type", "EDIT_TRACKS_INFO");
                jSONObject.put("mediaSessionId", c90827Zkl.LJIILLIIL());
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jArr.length; i++) {
                    jSONArray.put(i, jArr[i]);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            } catch (JSONException unused) {
            }
            c90827Zkl.LIZJ(LIZIZ, jSONObject.toString());
            c90827Zkl.LJIIZILJ.LIZ(LIZIZ, LJIILJJIL);
            return;
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90917ZmD(C90639Zhj c90639Zhj, long[] jArr) {
        super(c90639Zhj, false);
        this.LJIJ = c90639Zhj;
        this.LJIIZILJ = jArr;
    }
}
