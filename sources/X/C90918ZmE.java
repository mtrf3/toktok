package X;

import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZmE, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90918ZmE extends AbstractC90875ZlX {
    public final /* synthetic */ MediaQueueItem[] LJIIZILJ;
    public final /* synthetic */ int LJIJ;
    public final /* synthetic */ int LJIJI = 0;
    public final /* synthetic */ long LJIJJ = -1;
    public final /* synthetic */ JSONObject LJIJJLI;
    public final /* synthetic */ C90639Zhj LJIL;

    @Override // X.AbstractC90875ZlX
    public final void LJIILIIL() {
        int length;
        String LIZIZ;
        C90827Zkl c90827Zkl = this.LJIL.LIZJ;
        InterfaceC90481ZfB LJIILJJIL = LJIILJJIL();
        MediaQueueItem[] mediaQueueItemArr = this.LJIIZILJ;
        int i = this.LJIJ;
        int i2 = this.LJIJI;
        long j = this.LJIJJ;
        JSONObject jSONObject = this.LJIJJLI;
        c90827Zkl.getClass();
        if (mediaQueueItemArr != null && (length = mediaQueueItemArr.length) != 0) {
            if (i >= 0 && i < length) {
                if (j == -1 || j >= 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    long LIZIZ2 = c90827Zkl.LIZIZ();
                    c90827Zkl.LJIIIZ.LIZ(LIZIZ2, LJIILJJIL);
                    try {
                        jSONObject2.put("requestId", LIZIZ2);
                        jSONObject2.put("type", "QUEUE_LOAD");
                        JSONArray jSONArray = new JSONArray();
                        for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                            jSONArray.put(i3, mediaQueueItemArr[i3].LJJIII());
                        }
                        jSONObject2.put("items", jSONArray);
                        LIZIZ = C90496ZfQ.LIZIZ(Integer.valueOf(i2));
                    } catch (JSONException unused) {
                    }
                    if (LIZIZ != null) {
                        jSONObject2.put("repeatMode", LIZIZ);
                        jSONObject2.put("startIndex", i);
                        if (j != -1) {
                            jSONObject2.put("currentTime", C90468Zey.LIZ(j));
                        }
                        if (jSONObject != null) {
                            jSONObject2.put("customData", jSONObject);
                        }
                        int i4 = c90827Zkl.LJIIIIZZ;
                        if (i4 != -1) {
                            jSONObject2.put("sequenceNumber", i4);
                        }
                        c90827Zkl.LIZJ(LIZIZ2, jSONObject2.toString());
                        return;
                    }
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Invalid repeat mode: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder(54);
                sb2.append("playPosition can not be negative: ");
                sb2.append(j);
                throw new IllegalArgumentException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid startIndex: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString());
        }
        throw new IllegalArgumentException("items must not be null or empty.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90918ZmE(C90639Zhj c90639Zhj, MediaQueueItem[] mediaQueueItemArr, int i, JSONObject jSONObject) {
        super(c90639Zhj, false);
        this.LJIL = c90639Zhj;
        this.LJIIZILJ = mediaQueueItemArr;
        this.LJIJ = i;
        this.LJIJJLI = jSONObject;
    }
}
