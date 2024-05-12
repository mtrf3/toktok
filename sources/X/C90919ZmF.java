package X;

import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmF, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90919ZmF extends AbstractC90875ZlX {
    public final /* synthetic */ MediaQueueItem[] LJIIZILJ;
    public final /* synthetic */ int LJIJ;
    public final /* synthetic */ JSONObject LJIJI;
    public final /* synthetic */ C90639Zhj LJIJJ;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        C90827Zkl c90827Zkl = this.LJIJJ.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        MediaQueueItem[] mediaQueueItemArr = this.LJIIZILJ;
        int i = this.LJIJ;
        JSONObject jSONObject = this.LJIJI;
        c90827Zkl.getClass();
        if (mediaQueueItemArr != null && mediaQueueItemArr.length != 0) {
            JSONObject jSONObject2 = new JSONObject();
            long LIZIZ = c90827Zkl.LIZIZ();
            try {
                jSONObject2.put("requestId", LIZIZ);
                jSONObject2.put("type", "QUEUE_INSERT");
                jSONObject2.put("mediaSessionId", c90827Zkl.LJIILLIIL());
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < mediaQueueItemArr.length; i2++) {
                    jSONArray.put(i2, mediaQueueItemArr[i2].LJJIII());
                }
                jSONObject2.put("items", jSONArray);
                if (i != 0) {
                    jSONObject2.put("insertBefore", i);
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
                int i3 = c90827Zkl.LJIIIIZZ;
                if (i3 != -1) {
                    jSONObject2.put("sequenceNumber", i3);
                }
            } catch (JSONException unused) {
            }
            c90827Zkl.LIZJ(LIZIZ, jSONObject2.toString());
            c90827Zkl.LJIJ.LIZ(LIZIZ, new C90826Zkk(c90827Zkl, LJIILJJIL));
            return;
        }
        throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90919ZmF(C90639Zhj c90639Zhj, MediaQueueItem[] mediaQueueItemArr, int i, JSONObject jSONObject) {
        super(c90639Zhj, false);
        this.LJIJJ = c90639Zhj;
        this.LJIIZILJ = mediaQueueItemArr;
        this.LJIJ = i;
        this.LJIJI = jSONObject;
    }
}
