package X;

import com.google.android.gms.cast.MediaStatus;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmC, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90916ZmC extends AbstractC90875ZlX {
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
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = c90827Zkl.LJFF;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.zzb);
            }
        } catch (JSONException unused) {
        }
        c90827Zkl.LIZJ(LIZIZ, jSONObject.toString());
        c90827Zkl.LJIILLIIL.LIZ(LIZIZ, LJIILJJIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90916ZmC(C90639Zhj c90639Zhj) {
        super(c90639Zhj, false);
        this.LJIIZILJ = c90639Zhj;
    }
}
