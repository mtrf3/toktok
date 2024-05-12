package X;

import android.graphics.Bitmap;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class P8W implements InterfaceC63955P8d {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ boolean LIZJ = false;
    public final /* synthetic */ boolean LIZLLL = true;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ InterfaceC63955P8d LJFF;

    @Override // X.InterfaceC63955P8d
    public final void LIZ(int i, Bitmap bitmap) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = "vesdk_event_recorder_shot_screen";
            jSONObject.put("width", this.LIZ);
            jSONObject.put("height", this.LIZIZ);
            jSONObject.put("resultCode", i);
            if (this.LIZJ) {
                str = "vesdk_event_recorder_take_picture";
            }
            jSONObject.put("is_effect", this.LIZLLL);
            jSONObject.put("duration", System.currentTimeMillis() - this.LJ);
            c.LIZ(str, "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LJFF.LIZ(i, bitmap);
    }

    public P8W(int i, int i2, long j, InterfaceC63955P8d interfaceC63955P8d) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LJ = j;
        this.LJFF = interfaceC63955P8d;
    }
}
