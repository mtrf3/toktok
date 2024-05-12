package X;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import java.util.HashMap;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.P8l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63963P8l implements VERecorder.IVEFrameShotScreenCallback {
    public final /* synthetic */ C63965P8n LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ VERecorder.IVEFrameShotScreenCallback LIZJ;

    @Override // com.ss.android.vesdk.VERecorder.IVEFrameShotScreenCallback
    public final void onShotScreen(VEFrame vEFrame, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            VESize vESize = this.LIZ.LIZ;
            if (vESize != null) {
                jSONObject.put("width", vESize.width);
                jSONObject.put("height", this.LIZ.LIZ.height);
            }
            jSONObject.put("resultCode", i);
            this.LIZ.getClass();
            jSONObject.put("is_effect", this.LIZ.LIZIZ);
            jSONObject.put("duration", System.currentTimeMillis() - this.LIZIZ);
            c.LIZ("vesdk_event_recorder_shot_screen", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        HashMap hashMap = new HashMap();
        this.LIZ.getClass();
        hashMap.put("capture_mode", String.valueOf(false));
        hashMap.put("enable_effect", String.valueOf(this.LIZ.LIZIZ));
        hashMap.put("camera_photo_size", this.LIZ.LIZ.toString());
        hashMap.put("total_cost", String.valueOf(System.currentTimeMillis() - this.LIZIZ));
        hashMap.put("error_code", String.valueOf(i));
        VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback = this.LIZJ;
        if (iVEFrameShotScreenCallback != null) {
            iVEFrameShotScreenCallback.onShotScreen(vEFrame, i);
        }
        this.LIZ.getClass();
    }

    public C63963P8l(C63965P8n c63965P8n, long j, VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback) {
        this.LIZ = c63965P8n;
        this.LIZIZ = j;
        this.LIZJ = iVEFrameShotScreenCallback;
    }
}
