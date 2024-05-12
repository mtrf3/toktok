package X;

import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class P8V implements InterfaceC63961P8j {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ boolean LIZJ = false;
    public final /* synthetic */ boolean LIZLLL = true;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ InterfaceC63961P8j LJFF;

    @Override // X.InterfaceC63961P8j
    public final void LIZ(int i) {
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
        this.LJFF.LIZ(i);
    }

    public P8V(int i, int i2, long j, P8Y p8y) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LJ = j;
        this.LJFF = p8y;
    }
}
