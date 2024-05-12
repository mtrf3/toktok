package X;

import com.google.android.gms.cast.MediaLoadRequestData;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmN, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90927ZmN extends AbstractC90875ZlX {
    public final /* synthetic */ MediaLoadRequestData LJIIZILJ;
    public final /* synthetic */ C90639Zhj LJIJ;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        C90827Zkl c90827Zkl = this.LJIJ.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        MediaLoadRequestData mediaLoadRequestData = this.LJIIZILJ;
        c90827Zkl.getClass();
        if (mediaLoadRequestData.zzc != null || mediaLoadRequestData.zzd != null) {
            JSONObject LJJIII = mediaLoadRequestData.LJJIII();
            long LIZIZ = c90827Zkl.LIZIZ();
            try {
                LJJIII.put("requestId", LIZIZ);
                LJJIII.put("type", "LOAD");
            } catch (JSONException unused) {
            }
            c90827Zkl.LIZJ(LIZIZ, LJJIII.toString());
            c90827Zkl.LJIIIZ.LIZ(LIZIZ, LJIILJJIL);
            return;
        }
        throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90927ZmN(C90639Zhj c90639Zhj, MediaLoadRequestData mediaLoadRequestData) {
        super(c90639Zhj, false);
        this.LJIJ = c90639Zhj;
        this.LJIIZILJ = mediaLoadRequestData;
    }
}
