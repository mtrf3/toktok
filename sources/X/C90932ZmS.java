package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmS, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90932ZmS extends AbstractC90875ZlX {
    public final /* synthetic */ double LJIIZILJ;
    public final /* synthetic */ JSONObject LJIJ = null;
    public final /* synthetic */ C90639Zhj LJIJI;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        C90827Zkl c90827Zkl = this.LJIJI.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        double d = this.LJIIZILJ;
        JSONObject jSONObject = this.LJIJ;
        if (c90827Zkl.LJFF != null) {
            JSONObject jSONObject2 = new JSONObject();
            long LIZIZ = c90827Zkl.LIZIZ();
            try {
                jSONObject2.put("requestId", LIZIZ);
                jSONObject2.put("type", "SET_PLAYBACK_RATE");
                jSONObject2.put("playbackRate", d);
                QH7.LJIIIZ(c90827Zkl.LJFF, "mediaStatus should not be null");
                jSONObject2.put("mediaSessionId", c90827Zkl.LJFF.zzb);
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException unused) {
            }
            c90827Zkl.LIZJ(LIZIZ, jSONObject2.toString());
            c90827Zkl.LJJI.LIZ(LIZIZ, LJIILJJIL);
            return;
        }
        throw new C90478Zf8();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90932ZmS(C90639Zhj c90639Zhj, double d) {
        super(c90639Zhj, false);
        this.LJIJI = c90639Zhj;
        this.LJIIZILJ = d;
    }
}
